package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions extends StObject {
  
  /**
    * An option to control the selection of optimizer statistics package. This parameter allows individual queries to use a different query optimizer statistics package. Specifying
    * `latest` as a value instructs Cloud Spanner to use the latest generated statistics package. If not specified, Cloud Spanner uses the statistics package set at the database level
    * options, or the latest package if the database option is not set. The statistics package requested by the query has to be exempt from garbage collection. This can be achieved with
    * the following DDL statement: ``` ALTER STATISTICS SET OPTIONS (allow_gc=false) ``` The list of available statistics packages can be queried from
    * `INFORMATION_SCHEMA.SPANNER_STATISTICS`. Executing a SQL statement with an invalid optimizer statistics package or with a statistics package that allows garbage collection fails
    * with an `INVALID_ARGUMENT` error.
    */
  var optimizerStatisticsPackage: js.UndefOr[String] = js.undefined
  
  /**
    * An option to control the selection of optimizer version. This parameter allows individual queries to pick different query optimizer versions. Specifying `latest` as a value
    * instructs Cloud Spanner to use the latest supported query optimizer version. If not specified, Cloud Spanner uses the optimizer version set at the database level options. Any other
    * positive integer (from the list of supported optimizer versions) overrides the default optimizer version for query execution. The list of supported optimizer versions can be queried
    * from SPANNER_SYS.SUPPORTED_OPTIMIZER_VERSIONS. Executing a SQL statement with an invalid optimizer version fails with an `INVALID_ARGUMENT` error. See
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
    
    inline def setOptimizerStatisticsPackage(value: String): Self = StObject.set(x, "optimizerStatisticsPackage", value.asInstanceOf[js.Any])
    
    inline def setOptimizerStatisticsPackageUndefined: Self = StObject.set(x, "optimizerStatisticsPackage", js.undefined)
    
    inline def setOptimizerVersion(value: String): Self = StObject.set(x, "optimizerVersion", value.asInstanceOf[js.Any])
    
    inline def setOptimizerVersionUndefined: Self = StObject.set(x, "optimizerVersion", js.undefined)
  }
}
