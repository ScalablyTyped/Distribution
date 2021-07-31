package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSpanner.anon.Accesstoken
import typings.maximMazurokGapiClientSpanner.anon.AccesstokenAlt
import typings.maximMazurokGapiClientSpanner.anon.AltCallback
import typings.maximMazurokGapiClientSpanner.anon.CallbackFields
import typings.maximMazurokGapiClientSpanner.anon.FieldsKey
import typings.maximMazurokGapiClientSpanner.anon.Filter
import typings.maximMazurokGapiClientSpanner.anon.KeyOauthtoken
import typings.maximMazurokGapiClientSpanner.anon.QuotaUser
import typings.maximMazurokGapiClientSpanner.anon.Resource
import typings.maximMazurokGapiClientSpanner.anon.UploadType
import typings.maximMazurokGapiClientSpanner.anon.Uploadprotocol
import typings.maximMazurokGapiClientSpanner.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionsResource extends StObject {
  
  /** Creates multiple new sessions. This API can be used to initialize a session cache on the clients. See https://goo.gl/TgSFN2 for best practices on session cache management. */
  def batchCreate(request: typings.maximMazurokGapiClientSpanner.anon.Database): Request[BatchCreateSessionsResponse] = js.native
  def batchCreate(request: QuotaUser, body: BatchCreateSessionsRequest): Request[BatchCreateSessionsResponse] = js.native
  
  /** Begins a new transaction. This step can often be skipped: Read, ExecuteSql and Commit can begin a new transaction as a side-effect. */
  def beginTransaction(request: Resource): Request[Transaction] = js.native
  def beginTransaction(request: typings.maximMazurokGapiClientSpanner.anon.Session, body: BeginTransactionRequest): Request[Transaction] = js.native
  
  def commit(request: typings.maximMazurokGapiClientSpanner.anon.Session, body: CommitRequest): Request[CommitResponse] = js.native
  /**
    * Commits a transaction. The request includes the mutations to be applied to rows in the database. `Commit` might return an `ABORTED` error. This can occur at any time; commonly, the
    * cause is conflicts with concurrent transactions. However, it can also happen for a variety of other reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the
    * transaction from the beginning, re-using the same session. On very rare occasions, `Commit` might return `UNKNOWN`. This can happen, for example, if the client job experiences a 1+
    * hour networking failure. At that point, Cloud Spanner has lost track of the transaction outcome and we recommend that you perform another read from the database to see the state of
    * things as they are now.
    */
  def commit(request: UploadType): Request[CommitResponse] = js.native
  
  def create(request: QuotaUser, body: CreateSessionRequest): Request[Session] = js.native
  /**
    * Creates a new session. A session can be used to perform transactions that read and/or modify data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive
    * transactions. Sessions can only execute one transaction at a time. To execute multiple concurrent read-write/write-only transactions, create multiple sessions. Note that standalone
    * reads and queries use a transaction internally, and count toward the one transaction limit. Active sessions use additional server resources, so it is a good idea to delete idle and
    * unneeded sessions. Aside from explicit deletes, Cloud Spanner may delete sessions for which no operations are sent for more than an hour. If a session is deleted, requests to it
    * return `NOT_FOUND`. Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `"SELECT 1"`.
    */
  def create(request: Uploadprotocol): Request[Session] = js.native
  
  /** Ends a session, releasing server resources associated with it. This will asynchronously trigger cancellation of any operations that are running with this session. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  def executeBatchDml(request: typings.maximMazurokGapiClientSpanner.anon.Session, body: ExecuteBatchDmlRequest): Request[ExecuteBatchDmlResponse] = js.native
  /**
    * Executes a batch of SQL DML statements. This method allows many statements to be run with lower latency than submitting them sequentially with ExecuteSql. Statements are executed in
    * sequential order. A request can succeed even if a statement fails. The ExecuteBatchDmlResponse.status field in the response provides information about the statement that failed.
    * Clients must inspect this field to determine whether an error occurred. Execution stops after the first failed statement; the remaining statements are not executed.
    */
  def executeBatchDml(request: Xgafv): Request[ExecuteBatchDmlResponse] = js.native
  
  /**
    * Executes an SQL statement, returning all results in a single reply. This method cannot be used to return a result set larger than 10 MiB; if the query yields more data than that,
    * the query fails with a `FAILED_PRECONDITION` error. Operations inside read-write transactions might return `ABORTED`. If this occurs, the application should restart the transaction
    * from the beginning. See Transaction for more details. Larger result sets can be fetched in streaming fashion by calling ExecuteStreamingSql instead.
    */
  def executeSql(request: AccesstokenAlt): Request[ResultSet] = js.native
  def executeSql(request: typings.maximMazurokGapiClientSpanner.anon.Session, body: ExecuteSqlRequest): Request[ResultSet] = js.native
  
  /**
    * Like ExecuteSql, except returns the result set as a stream. Unlike ExecuteSql, there is no limit on the size of the returned result set. However, no individual row in the result set
    * can exceed 100 MiB, and no column value can exceed 10 MiB.
    */
  def executeStreamingSql(request: AccesstokenAlt): Request[PartialResultSet] = js.native
  def executeStreamingSql(request: typings.maximMazurokGapiClientSpanner.anon.Session, body: ExecuteSqlRequest): Request[PartialResultSet] = js.native
  
  /** Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for determining whether a session is still alive. */
  def get(): Request[Session] = js.native
  def get(request: Accesstoken): Request[Session] = js.native
  
  /** Lists all sessions in a given database. */
  def list(): Request[ListSessionsResponse] = js.native
  def list(request: Filter): Request[ListSessionsResponse] = js.native
  
  /**
    * Creates a set of partition tokens that can be used to execute a query operation in parallel. Each of the returned partition tokens can be used by ExecuteStreamingSql to specify a
    * subset of the query result to read. The same session and read-only transaction must be used by the PartitionQueryRequest used to create the partition tokens and the
    * ExecuteSqlRequests that use the partition tokens. Partition tokens become invalid when the session used to create them is deleted, is idle for too long, begins a new transaction, or
    * becomes too old. When any of these happen, it is not possible to resume the query, and the whole operation must be restarted from the beginning.
    */
  def partitionQuery(request: AltCallback): Request[PartitionResponse] = js.native
  def partitionQuery(request: typings.maximMazurokGapiClientSpanner.anon.Session, body: PartitionQueryRequest): Request[PartitionResponse] = js.native
  
  /**
    * Creates a set of partition tokens that can be used to execute a read operation in parallel. Each of the returned partition tokens can be used by StreamingRead to specify a subset of
    * the read result to read. The same session and read-only transaction must be used by the PartitionReadRequest used to create the partition tokens and the ReadRequests that use the
    * partition tokens. There are no ordering guarantees on rows returned among the returned partition tokens, or even within each individual StreamingRead call issued with a
    * partition_token. Partition tokens become invalid when the session used to create them is deleted, is idle for too long, begins a new transaction, or becomes too old. When any of
    * these happen, it is not possible to resume the read, and the whole operation must be restarted from the beginning.
    */
  def partitionRead(request: CallbackFields): Request[PartitionResponse] = js.native
  def partitionRead(request: typings.maximMazurokGapiClientSpanner.anon.Session, body: PartitionReadRequest): Request[PartitionResponse] = js.native
  
  /**
    * Reads rows from the database using key lookups and scans, as a simple key/value style alternative to ExecuteSql. This method cannot be used to return a result set larger than 10
    * MiB; if the read matches more data than that, the read fails with a `FAILED_PRECONDITION` error. Reads inside read-write transactions might return `ABORTED`. If this occurs, the
    * application should restart the transaction from the beginning. See Transaction for more details. Larger result sets can be yielded in streaming fashion by calling StreamingRead
    * instead.
    */
  def read(request: FieldsKey): Request[ResultSet] = js.native
  def read(request: typings.maximMazurokGapiClientSpanner.anon.Session, body: ReadRequest): Request[ResultSet] = js.native
  
  /**
    * Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any transaction that includes one or more Read or ExecuteSql requests and ultimately
    * decides not to commit. `Rollback` returns `OK` if it successfully aborts the transaction, the transaction was already aborted, or the transaction is not found. `Rollback` never
    * returns `ABORTED`.
    */
  def rollback(request: KeyOauthtoken): Request[js.Object] = js.native
  def rollback(request: typings.maximMazurokGapiClientSpanner.anon.Session, body: RollbackRequest): Request[js.Object] = js.native
  
  /**
    * Like Read, except returns the result set as a stream. Unlike Read, there is no limit on the size of the returned result set. However, no individual row in the result set can exceed
    * 100 MiB, and no column value can exceed 10 MiB.
    */
  def streamingRead(request: FieldsKey): Request[PartialResultSet] = js.native
  def streamingRead(request: typings.maximMazurokGapiClientSpanner.anon.Session, body: ReadRequest): Request[PartialResultSet] = js.native
}
