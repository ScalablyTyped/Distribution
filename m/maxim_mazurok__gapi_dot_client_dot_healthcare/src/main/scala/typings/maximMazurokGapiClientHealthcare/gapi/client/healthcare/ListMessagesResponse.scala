package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMessagesResponse extends js.Object {
  
  /** The returned Messages. Won't be more Messages than the value of page_size in the request. See view for populated fields. */
  var hl7V2Messages: js.UndefOr[js.Array[Message]] = js.native
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListMessagesResponse {
  
  @scala.inline
  def apply(): ListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMessagesResponse]
  }
  
  @scala.inline
  implicit class ListMessagesResponseOps[Self <: ListMessagesResponse] (val x: Self) extends AnyVal {
    
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
    def setHl7V2MessagesVarargs(value: Message*): Self = this.set("hl7V2Messages", js.Array(value :_*))
    
    @scala.inline
    def setHl7V2Messages(value: js.Array[Message]): Self = this.set("hl7V2Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHl7V2Messages: Self = this.set("hl7V2Messages", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
