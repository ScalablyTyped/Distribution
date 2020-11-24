package typings.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrafficStatsResponse extends js.Object {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of TrafficStats. */
  var trafficStats: js.UndefOr[js.Array[TrafficStats]] = js.native
}
object ListTrafficStatsResponse {
  
  @scala.inline
  def apply(): ListTrafficStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrafficStatsResponse]
  }
  
  @scala.inline
  implicit class ListTrafficStatsResponseOps[Self <: ListTrafficStatsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTrafficStatsVarargs(value: TrafficStats*): Self = this.set("trafficStats", js.Array(value :_*))
    
    @scala.inline
    def setTrafficStats(value: js.Array[TrafficStats]): Self = this.set("trafficStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficStats: Self = this.set("trafficStats", js.undefined)
  }
}
