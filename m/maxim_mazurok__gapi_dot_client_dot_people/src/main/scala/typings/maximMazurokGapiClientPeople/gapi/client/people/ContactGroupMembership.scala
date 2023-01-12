package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactGroupMembership extends StObject {
  
  /** Output only. The contact group ID for the contact group membership. */
  var contactGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name for the contact group, assigned by the server. An ASCII string, in the form of `contactGroups/{contact_group_id}`. Only contact_group_resource_name can be used for
    * modifying memberships. Any contact group membership can be removed, but only user group or "myContacts" or "starred" system groups memberships can be added. A contact must always
    * have at least one contact group membership.
    */
  var contactGroupResourceName: js.UndefOr[String] = js.undefined
}
object ContactGroupMembership {
  
  inline def apply(): ContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroupMembership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactGroupMembership] (val x: Self) extends AnyVal {
    
    inline def setContactGroupId(value: String): Self = StObject.set(x, "contactGroupId", value.asInstanceOf[js.Any])
    
    inline def setContactGroupIdUndefined: Self = StObject.set(x, "contactGroupId", js.undefined)
    
    inline def setContactGroupResourceName(value: String): Self = StObject.set(x, "contactGroupResourceName", value.asInstanceOf[js.Any])
    
    inline def setContactGroupResourceNameUndefined: Self = StObject.set(x, "contactGroupResourceName", js.undefined)
  }
}
