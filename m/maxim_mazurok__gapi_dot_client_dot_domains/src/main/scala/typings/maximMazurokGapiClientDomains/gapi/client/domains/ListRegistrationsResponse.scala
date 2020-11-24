package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRegistrationsResponse extends js.Object {
  
  /** When present, there are more results to retrieve. Set `page_token` to this value on a subsequent call to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of `Registration`s. */
  var registrations: js.UndefOr[js.Array[Registration]] = js.native
}
object ListRegistrationsResponse {
  
  @scala.inline
  def apply(): ListRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegistrationsResponse]
  }
  
  @scala.inline
  implicit class ListRegistrationsResponseOps[Self <: ListRegistrationsResponse] (val x: Self) extends AnyVal {
    
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
    def setRegistrationsVarargs(value: Registration*): Self = this.set("registrations", js.Array(value :_*))
    
    @scala.inline
    def setRegistrations(value: js.Array[Registration]): Self = this.set("registrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrations: Self = this.set("registrations", js.undefined)
  }
}
