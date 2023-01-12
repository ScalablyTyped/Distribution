package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactGroupResponse extends StObject {
  
  /** The contact group. */
  var contactGroup: js.UndefOr[ContactGroup] = js.undefined
  
  /** The original requested resource name. */
  var requestedResourceName: js.UndefOr[String] = js.undefined
  
  /** The status of the response. */
  var status: js.UndefOr[Status] = js.undefined
}
object ContactGroupResponse {
  
  inline def apply(): ContactGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
    
    inline def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
    
    inline def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
