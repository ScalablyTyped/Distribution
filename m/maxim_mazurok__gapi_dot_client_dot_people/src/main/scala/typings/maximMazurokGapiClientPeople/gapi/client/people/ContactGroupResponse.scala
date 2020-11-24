package typings.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactGroupResponse extends js.Object {
  
  /** The contact group. */
  var contactGroup: js.UndefOr[ContactGroup] = js.native
  
  /** The original requested resource name. */
  var requestedResourceName: js.UndefOr[String] = js.native
  
  /** The status of the response. */
  var status: js.UndefOr[Status] = js.native
}
object ContactGroupResponse {
  
  @scala.inline
  def apply(): ContactGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroupResponse]
  }
  
  @scala.inline
  implicit class ContactGroupResponseOps[Self <: ContactGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setContactGroup(value: ContactGroup): Self = this.set("contactGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactGroup: Self = this.set("contactGroup", js.undefined)
    
    @scala.inline
    def setRequestedResourceName(value: String): Self = this.set("requestedResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedResourceName: Self = this.set("requestedResourceName", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
