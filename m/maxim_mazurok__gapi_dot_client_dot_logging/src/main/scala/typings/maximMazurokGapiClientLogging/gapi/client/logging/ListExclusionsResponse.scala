package typings.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExclusionsResponse extends js.Object {
  
  /** A list of exclusions. */
  var exclusions: js.UndefOr[js.Array[LogExclusion]] = js.native
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again using the value of
    * nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListExclusionsResponse {
  
  @scala.inline
  def apply(): ListExclusionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExclusionsResponse]
  }
  
  @scala.inline
  implicit class ListExclusionsResponseOps[Self <: ListExclusionsResponse] (val x: Self) extends AnyVal {
    
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
    def setExclusionsVarargs(value: LogExclusion*): Self = this.set("exclusions", js.Array(value :_*))
    
    @scala.inline
    def setExclusions(value: js.Array[LogExclusion]): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusions: Self = this.set("exclusions", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
