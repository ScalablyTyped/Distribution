package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSetStats extends StObject {
  
  /** QueryPlan for the query associated with this result. */
  var queryPlan: js.UndefOr[QueryPlan] = js.undefined
  
  /**
    * Aggregated statistics from the execution of the query. Only present when the query is profiled. For example, a query could return the statistics as follows: { "rows_returned": "3",
    * "elapsed_time": "1.22 secs", "cpu_time": "1.19 secs" }
    */
  var queryStats: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.ResultSetStats & TopLevel[Any]
  ] = js.undefined
  
  /** Standard DML returns an exact count of rows that were modified. */
  var rowCountExact: js.UndefOr[String] = js.undefined
  
  /** Partitioned DML does not offer exactly-once semantics, so it returns a lower bound of the rows modified. */
  var rowCountLowerBound: js.UndefOr[String] = js.undefined
}
object ResultSetStats {
  
  inline def apply(): ResultSetStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetStats]
  }
  
  extension [Self <: ResultSetStats](x: Self) {
    
    inline def setQueryPlan(value: QueryPlan): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    inline def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    inline def setQueryStats(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.ResultSetStats & TopLevel[Any]
    ): Self = StObject.set(x, "queryStats", value.asInstanceOf[js.Any])
    
    inline def setQueryStatsUndefined: Self = StObject.set(x, "queryStats", js.undefined)
    
    inline def setRowCountExact(value: String): Self = StObject.set(x, "rowCountExact", value.asInstanceOf[js.Any])
    
    inline def setRowCountExactUndefined: Self = StObject.set(x, "rowCountExact", js.undefined)
    
    inline def setRowCountLowerBound(value: String): Self = StObject.set(x, "rowCountLowerBound", value.asInstanceOf[js.Any])
    
    inline def setRowCountLowerBoundUndefined: Self = StObject.set(x, "rowCountLowerBound", js.undefined)
  }
}
