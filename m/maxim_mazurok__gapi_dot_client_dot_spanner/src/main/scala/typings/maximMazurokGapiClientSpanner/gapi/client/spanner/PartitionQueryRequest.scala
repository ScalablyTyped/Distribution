package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionQueryRequest extends StObject {
  
  /**
    * It is not always possible for Cloud Spanner to infer the right SQL type from a JSON value. For example, values of type `BYTES` and values of type `STRING` both appear in params as
    * JSON strings. In these cases, `param_types` can be used to specify the exact SQL type for some or all of the SQL query parameters. See the definition of Type for more information
    * about SQL types.
    */
  var paramTypes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.Type}
    */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.PartitionQueryRequest with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Parameter names and values that bind to placeholders in the SQL string. A parameter placeholder consists of the `@` character followed by the parameter name (for example,
    * `@firstName`). Parameter names can contain letters, numbers, and underscores. Parameters can appear anywhere that a literal value is expected. The same parameter name can be used
    * more than once, for example: `"WHERE id > @msg_id AND id < @msg_id + 100"` It is an error to execute a SQL statement with unbound parameters.
    */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.PartitionQueryRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Additional options that affect how many partitions are created. */
  var partitionOptions: js.UndefOr[PartitionOptions] = js.native
  
  /**
    * Required. The query request to generate partitions for. The request will fail if the query is not root partitionable. The query plan of a root partitionable query has a single
    * distributed union operator. A distributed union operator conceptually divides one or more tables into multiple splits, remotely evaluates a subquery independently on each split, and
    * then unions all results. This must not contain DML commands, such as INSERT, UPDATE, or DELETE. Use ExecuteStreamingSql with a PartitionedDml transaction for large,
    * partition-friendly DML operations.
    */
  var sql: js.UndefOr[String] = js.native
  
  /** Read only snapshot transactions are supported, read/write and single use transactions are not. */
  var transaction: js.UndefOr[TransactionSelector] = js.native
}
object PartitionQueryRequest {
  
  @scala.inline
  def apply(): PartitionQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionQueryRequest]
  }
  
  @scala.inline
  implicit class PartitionQueryRequestMutableBuilder[Self <: PartitionQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamTypes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.Type}
      */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.PartitionQueryRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.PartitionQueryRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setPartitionOptions(value: PartitionOptions): Self = StObject.set(x, "partitionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionOptionsUndefined: Self = StObject.set(x, "partitionOptions", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    
    @scala.inline
    def setTransaction(value: TransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
