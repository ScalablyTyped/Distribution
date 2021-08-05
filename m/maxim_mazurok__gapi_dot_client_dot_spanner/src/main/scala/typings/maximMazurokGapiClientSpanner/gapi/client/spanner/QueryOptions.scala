package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions extends StObject {
  
  /**
    * An option to control the selection of optimizer version. This parameter allows individual queries to pick different query optimizer versions. Specifying "latest" as a value
    * instructs Cloud Spanner to use the latest supported query optimizer version. If not specified, Cloud Spanner uses optimizer version set at the database level options. Any other
    * positive integer (from the list of supported optimizer versions) overrides the default optimizer version for query execution. The list of supported optimizer versions can be queried
    * from SPANNER_SYS.SUPPORTED_OPTIMIZER_VERSIONS. Executing a SQL statement with an invalid optimizer version will fail with a syntax error (`INVALID_ARGUMENT`) status. See
    * https://cloud.google.com/spanner/docs/query-optimizer/manage-query-optimizer for more information on managing the query optimizer. The `optimizer_version` statement hint has
    * precedence over this setting.
    */
  var optimizerVersion: js.UndefOr[String] = js.undefined
}
object QueryOptions {
  
  inline def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  extension [Self <: QueryOptions](x: Self) {
    
    inline def setOptimizerVersion(value: String): Self = StObject.set(x, "optimizerVersion", value.asInstanceOf[js.Any])
    
    inline def setOptimizerVersionUndefined: Self = StObject.set(x, "optimizerVersion", js.undefined)
  }
}
