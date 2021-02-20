package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirestore.anon.AccesstokenAlt
import typings.maximMazurokGapiClientFirestore.anon.AltCallback
import typings.maximMazurokGapiClientFirestore.anon.CallbackDatabase
import typings.maximMazurokGapiClientFirestore.anon.CollectionId
import typings.maximMazurokGapiClientFirestore.anon.CurrentDocumentexists
import typings.maximMazurokGapiClientFirestore.anon.CurrentDocumentupdateTime
import typings.maximMazurokGapiClientFirestore.anon.Database
import typings.maximMazurokGapiClientFirestore.anon.DocumentId
import typings.maximMazurokGapiClientFirestore.anon.MaskfieldPaths
import typings.maximMazurokGapiClientFirestore.anon.Name
import typings.maximMazurokGapiClientFirestore.anon.Oauthtoken
import typings.maximMazurokGapiClientFirestore.anon.OrderBy
import typings.maximMazurokGapiClientFirestore.anon.Parent
import typings.maximMazurokGapiClientFirestore.anon.PrettyPrint
import typings.maximMazurokGapiClientFirestore.anon.QuotaUser
import typings.maximMazurokGapiClientFirestore.anon.Resource
import typings.maximMazurokGapiClientFirestore.anon.UploadType
import typings.maximMazurokGapiClientFirestore.anon.Uploadprotocol
import typings.maximMazurokGapiClientFirestore.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentsResource extends StObject {
  
  /** Gets multiple documents. Documents returned by this method are not guaranteed to be returned in the same order that they were requested. */
  def batchGet(request: Database): Request[BatchGetDocumentsResponse] = js.native
  def batchGet(request: PrettyPrint, body: BatchGetDocumentsRequest): Request[BatchGetDocumentsResponse] = js.native
  
  def batchWrite(request: PrettyPrint, body: BatchWriteRequest): Request[BatchWriteResponse] = js.native
  /**
    * Applies a batch of write operations. The BatchWrite method does not apply the write operations atomically and can apply them out of order. Method does not allow more than one write
    * per document. Each write succeeds or fails independently. See the BatchWriteResponse for the success status of each write. If you require an atomically applied set of writes, use
    * Commit instead.
    */
  def batchWrite(request: QuotaUser): Request[BatchWriteResponse] = js.native
  
  def beginTransaction(request: PrettyPrint, body: BeginTransactionRequest): Request[BeginTransactionResponse] = js.native
  /** Starts a new transaction. */
  def beginTransaction(request: Resource): Request[BeginTransactionResponse] = js.native
  
  def commit(request: PrettyPrint, body: CommitRequest): Request[CommitResponse] = js.native
  /** Commits a transaction, while optionally updating documents. */
  def commit(request: UploadType): Request[CommitResponse] = js.native
  
  /** Creates a new document. */
  def createDocument(request: CollectionId): Request[Document] = js.native
  def createDocument(request: DocumentId, body: Document): Request[Document] = js.native
  
  /** Deletes a document. */
  def delete(): Request[js.Object] = js.native
  def delete(request: CurrentDocumentexists): Request[js.Object] = js.native
  
  /** Gets a single document. */
  def get(): Request[Document] = js.native
  def get(request: MaskfieldPaths): Request[Document] = js.native
  
  /** Lists documents. */
  def list(): Request[ListDocumentsResponse] = js.native
  def list(request: OrderBy): Request[ListDocumentsResponse] = js.native
  
  def listCollectionIds(request: Oauthtoken, body: ListCollectionIdsRequest): Request[ListCollectionIdsResponse] = js.native
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: Parent): Request[ListCollectionIdsResponse] = js.native
  
  def listen(request: PrettyPrint, body: ListenRequest): Request[ListenResponse] = js.native
  /** Listens to changes. */
  def listen(request: Uploadprotocol): Request[ListenResponse] = js.native
  
  def partitionQuery(request: Oauthtoken, body: PartitionQueryRequest): Request[PartitionQueryResponse] = js.native
  /**
    * Partitions a query by returning partition cursors that can be used to run the query in parallel. The returned partition cursors are split points that can be used by RunQuery as
    * starting/end points for the query results.
    */
  def partitionQuery(request: Xgafv): Request[PartitionQueryResponse] = js.native
  
  /** Updates or inserts a document. */
  def patch(request: CurrentDocumentupdateTime): Request[Document] = js.native
  def patch(request: Name, body: Document): Request[Document] = js.native
  
  /** Rolls back a transaction. */
  def rollback(request: AccesstokenAlt): Request[js.Object] = js.native
  def rollback(request: PrettyPrint, body: RollbackRequest): Request[js.Object] = js.native
  
  /** Runs a query. */
  def runQuery(request: AltCallback): Request[RunQueryResponse] = js.native
  def runQuery(request: Oauthtoken, body: RunQueryRequest): Request[RunQueryResponse] = js.native
  
  /** Streams batches of document updates and deletes, in order. */
  def write(request: CallbackDatabase): Request[WriteResponse] = js.native
  def write(request: PrettyPrint, body: WriteRequest): Request[WriteResponse] = js.native
}
