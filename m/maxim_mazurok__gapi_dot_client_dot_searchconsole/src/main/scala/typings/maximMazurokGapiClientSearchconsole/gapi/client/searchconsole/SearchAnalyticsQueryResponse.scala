package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAnalyticsQueryResponse extends js.Object {
  
  /** How the results were aggregated. */
  var responseAggregationType: js.UndefOr[String] = js.native
  
  /** A list of rows grouped by the key values in the order given in the query. */
  var rows: js.UndefOr[js.Array[ApiDataRow]] = js.native
}
object SearchAnalyticsQueryResponse {
  
  @scala.inline
  def apply(): SearchAnalyticsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAnalyticsQueryResponse]
  }
  
  @scala.inline
  implicit class SearchAnalyticsQueryResponseOps[Self <: SearchAnalyticsQueryResponse] (val x: Self) extends AnyVal {
    
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
    def setResponseAggregationType(value: String): Self = this.set("responseAggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseAggregationType: Self = this.set("responseAggregationType", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: ApiDataRow*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[ApiDataRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
