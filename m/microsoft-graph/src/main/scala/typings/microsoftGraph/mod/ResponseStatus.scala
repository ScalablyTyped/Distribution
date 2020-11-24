package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseStatus extends js.Object {
  
  // The response type. The possible values are: None, Organizer, TentativelyAccepted, Accepted, Declined, NotResponded.
  var response: js.UndefOr[NullableOption[ResponseType]] = js.native
  
  /**
    * The date and time that the response was returned. It uses ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var time: js.UndefOr[NullableOption[String]] = js.native
}
object ResponseStatus {
  
  @scala.inline
  def apply(): ResponseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseStatus]
  }
  
  @scala.inline
  implicit class ResponseStatusOps[Self <: ResponseStatus] (val x: Self) extends AnyVal {
    
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
    def setResponse(value: NullableOption[ResponseType]): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    
    @scala.inline
    def setResponseNull: Self = this.set("response", null)
    
    @scala.inline
    def setTime(value: NullableOption[String]): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setTimeNull: Self = this.set("time", null)
  }
}
