package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactGroupRequest extends StObject {
  
  /** Required. The contact group to update. */
  var contactGroup: js.UndefOr[ContactGroup] = js.undefined
  
  /**
    * Optional. A field mask to restrict which fields on the group are returned. Defaults to `metadata`, `groupType`, and `name` if not set or set to empty. Valid fields are: * clientData
    * * groupType * memberCount * metadata * name
    */
  var readGroupFields: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A field mask to restrict which fields on the group are updated. Multiple fields can be specified by separating them with commas. Defaults to `name` if not set or set to
    * empty. Updated fields are replaced. Valid values are: * clientData * name
    */
  var updateGroupFields: js.UndefOr[String] = js.undefined
}
object UpdateContactGroupRequest {
  
  inline def apply(): UpdateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContactGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContactGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
    
    inline def setReadGroupFields(value: String): Self = StObject.set(x, "readGroupFields", value.asInstanceOf[js.Any])
    
    inline def setReadGroupFieldsUndefined: Self = StObject.set(x, "readGroupFields", js.undefined)
    
    inline def setUpdateGroupFields(value: String): Self = StObject.set(x, "updateGroupFields", value.asInstanceOf[js.Any])
    
    inline def setUpdateGroupFieldsUndefined: Self = StObject.set(x, "updateGroupFields", js.undefined)
  }
}
