package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHistoriesResponse extends js.Object {
  
  /** Histories. */
  var histories: js.UndefOr[js.Array[History]] = js.native
  
  /**
    * A continuation token to resume the query at the next item. Will only be set if there are more histories to fetch. Tokens are valid for up to one hour from the time of the first list
    * request. For instance, if you make a list request at 1PM and use the token from this first request 10 minutes later, the token from this second response will only be valid for 50
    * minutes.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListHistoriesResponse {
  
  @scala.inline
  def apply(): ListHistoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHistoriesResponse]
  }
  
  @scala.inline
  implicit class ListHistoriesResponseOps[Self <: ListHistoriesResponse] (val x: Self) extends AnyVal {
    
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
    def setHistoriesVarargs(value: History*): Self = this.set("histories", js.Array(value :_*))
    
    @scala.inline
    def setHistories(value: js.Array[History]): Self = this.set("histories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistories: Self = this.set("histories", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
