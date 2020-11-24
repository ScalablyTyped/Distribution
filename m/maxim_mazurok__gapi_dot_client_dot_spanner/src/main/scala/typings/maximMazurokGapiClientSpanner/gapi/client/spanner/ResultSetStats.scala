package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSetStats extends js.Object {
  
  /** QueryPlan for the query associated with this result. */
  var queryPlan: js.UndefOr[QueryPlan] = js.native
  
  /**
    * Aggregated statistics from the execution of the query. Only present when the query is profiled. For example, a query could return the statistics as follows: { "rows_returned": "3",
    * "elapsed_time": "1.22 secs", "cpu_time": "1.19 secs" }
    */
  var queryStats: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.ResultSetStats with TopLevel[js.Any]
  ] = js.native
  
  /** Standard DML returns an exact count of rows that were modified. */
  var rowCountExact: js.UndefOr[String] = js.native
  
  /** Partitioned DML does not offer exactly-once semantics, so it returns a lower bound of the rows modified. */
  var rowCountLowerBound: js.UndefOr[String] = js.native
}
object ResultSetStats {
  
  @scala.inline
  def apply(): ResultSetStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetStats]
  }
  
  @scala.inline
  implicit class ResultSetStatsOps[Self <: ResultSetStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQueryPlan(value: QueryPlan): Self = this.set("queryPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryPlan: Self = this.set("queryPlan", js.undefined)
    
    @scala.inline
    def setQueryStats(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.ResultSetStats with TopLevel[js.Any]
    ): Self = this.set("queryStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryStats: Self = this.set("queryStats", js.undefined)
    
    @scala.inline
    def setRowCountExact(value: String): Self = this.set("rowCountExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCountExact: Self = this.set("rowCountExact", js.undefined)
    
    @scala.inline
    def setRowCountLowerBound(value: String): Self = this.set("rowCountLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCountLowerBound: Self = this.set("rowCountLowerBound", js.undefined)
  }
}
