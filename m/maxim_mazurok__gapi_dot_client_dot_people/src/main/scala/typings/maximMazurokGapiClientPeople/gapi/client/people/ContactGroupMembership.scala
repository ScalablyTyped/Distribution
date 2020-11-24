package typings.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactGroupMembership extends js.Object {
  
  /** Output only. The contact group ID for the contact group membership. */
  var contactGroupId: js.UndefOr[String] = js.native
  
  /**
    * The resource name for the contact group, assigned by the server. An ASCII string, in the form of `contactGroups/{contact_group_id}`. Only contact_group_resource_name can be used for
    * modifying memberships. Any contact group membership can be removed, but only user group or "myContacts" or "starred" system groups memberships can be added. A contact must always
    * have at least one contact group membership.
    */
  var contactGroupResourceName: js.UndefOr[String] = js.native
}
object ContactGroupMembership {
  
  @scala.inline
  def apply(): ContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroupMembership]
  }
  
  @scala.inline
  implicit class ContactGroupMembershipOps[Self <: ContactGroupMembership] (val x: Self) extends AnyVal {
    
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
    def setContactGroupId(value: String): Self = this.set("contactGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactGroupId: Self = this.set("contactGroupId", js.undefined)
    
    @scala.inline
    def setContactGroupResourceName(value: String): Self = this.set("contactGroupResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactGroupResourceName: Self = this.set("contactGroupResourceName", js.undefined)
  }
}
