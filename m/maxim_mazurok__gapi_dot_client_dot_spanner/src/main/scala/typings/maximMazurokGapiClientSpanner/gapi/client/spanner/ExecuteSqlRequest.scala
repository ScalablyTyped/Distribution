package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteSqlRequest extends StObject {
  
  /**
    * It is not always possible for Cloud Spanner to infer the right SQL type from a JSON value. For example, values of type `BYTES` and values of type `STRING` both appear in params as
    * JSON strings. In these cases, `param_types` can be used to specify the exact SQL type for some or all of the SQL statement parameters. See the definition of Type for more
    * information about SQL types.
    */
  var paramTypes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.Type} */ js.Any
  ] = js.undefined
  
  /**
    * Parameter names and values that bind to placeholders in the SQL string. A parameter placeholder consists of the `@` character followed by the parameter name (for example,
    * `@firstName`). Parameter names must conform to the naming requirements of identifiers as specified at https://cloud.google.com/spanner/docs/lexical#identifiers. Parameters can
    * appear anywhere that a literal value is expected. The same parameter name can be used more than once, for example: `"WHERE id > @msg_id AND id < @msg_id + 100"` It is an error to
    * execute a SQL statement with unbound parameters.
    */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * If present, results will be restricted to the specified partition previously created using PartitionQuery(). There must be an exact match for the values of fields common to this
    * message and the PartitionQueryRequest message used to create this partition_token.
    */
  var partitionToken: js.UndefOr[String] = js.undefined
  
  /** Used to control the amount of debugging information returned in ResultSetStats. If partition_token is set, query_mode can only be set to QueryMode.NORMAL. */
  var queryMode: js.UndefOr[String] = js.undefined
  
  /** Query optimizer configuration to use for the given query. */
  var queryOptions: js.UndefOr[QueryOptions] = js.undefined
  
  /** Common options for this request. */
  var requestOptions: js.UndefOr[RequestOptions] = js.undefined
  
  /**
    * If this request is resuming a previously interrupted SQL statement execution, `resume_token` should be copied from the last PartialResultSet yielded before the interruption. Doing
    * this enables the new SQL statement execution to resume where the last one left off. The rest of the request parameters must exactly match the request that yielded this token.
    */
  var resumeToken: js.UndefOr[String] = js.undefined
  
  /**
    * A per-transaction sequence number used to identify this request. This field makes each request idempotent such that if the request is received multiple times, at most one will
    * succeed. The sequence number must be monotonically increasing within the transaction. If a request arrives for the first time with an out-of-order sequence number, the transaction
    * may be aborted. Replays of previously handled requests will yield the same response as the first execution. Required for DML statements. Ignored for queries.
    */
  var seqno: js.UndefOr[String] = js.undefined
  
  /** Required. The SQL string. */
  var sql: js.UndefOr[String] = js.undefined
  
  /**
    * The transaction to use. For queries, if none is provided, the default is a temporary read-only transaction with strong concurrency. Standard DML statements require a read-write
    * transaction. To protect against replays, single-use transactions are not supported. The caller must either supply an existing transaction ID or begin a new transaction. Partitioned
    * DML requires an existing Partitioned DML transaction ID.
    */
  var transaction: js.UndefOr[TransactionSelector] = js.undefined
}
object ExecuteSqlRequest {
  
  inline def apply(): ExecuteSqlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteSqlRequest]
  }
  
  extension [Self <: ExecuteSqlRequest](x: Self) {
    
    inline def setParamTypes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.Type} */ js.Any
    ): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
    
    inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
    
    inline def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPartitionToken(value: String): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
    
    inline def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
    
    inline def setQueryMode(value: String): Self = StObject.set(x, "queryMode", value.asInstanceOf[js.Any])
    
    inline def setQueryModeUndefined: Self = StObject.set(x, "queryMode", js.undefined)
    
    inline def setQueryOptions(value: QueryOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
    
    inline def setQueryOptionsUndefined: Self = StObject.set(x, "queryOptions", js.undefined)
    
    inline def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setSeqno(value: String): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
    
    inline def setSeqnoUndefined: Self = StObject.set(x, "seqno", js.undefined)
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    
    inline def setTransaction(value: TransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
