package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactGroupRequest extends StObject {
  
  /** Required. The contact group to update. */
  var contactGroup: js.UndefOr[ContactGroup] = js.undefined
}
object UpdateContactGroupRequest {
  
  inline def apply(): UpdateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContactGroupRequest]
  }
  
  extension [Self <: UpdateContactGroupRequest](x: Self) {
    
    inline def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
  }
}
