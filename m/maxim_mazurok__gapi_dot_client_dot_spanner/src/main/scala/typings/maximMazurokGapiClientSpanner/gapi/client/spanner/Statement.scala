package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statement extends StObject {
  
  /**
    * It is not always possible for Cloud Spanner to infer the right SQL type from a JSON value. For example, values of type `BYTES` and values of type `STRING` both appear in params as
    * JSON strings. In these cases, `param_types` can be used to specify the exact SQL type for some or all of the SQL statement parameters. See the definition of Type for more
    * information about SQL types.
    */
  var paramTypes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.Type}
    */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.Statement & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Parameter names and values that bind to placeholders in the DML string. A parameter placeholder consists of the `@` character followed by the parameter name (for example,
    * `@firstName`). Parameter names can contain letters, numbers, and underscores. Parameters can appear anywhere that a literal value is expected. The same parameter name can be used
    * more than once, for example: `"WHERE id > @msg_id AND id < @msg_id + 100"` It is an error to execute a SQL statement with unbound parameters.
    */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.Statement & TopLevel[js.Any]
  ] = js.undefined
  
  /** Required. The DML string. */
  var sql: js.UndefOr[String] = js.undefined
}
object Statement {
  
  @scala.inline
  def apply(): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  implicit class StatementMutableBuilder[Self <: Statement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamTypes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.Type}
      */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.Statement & TopLevel[js.Any]
    ): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.Statement & TopLevel[js.Any]
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
