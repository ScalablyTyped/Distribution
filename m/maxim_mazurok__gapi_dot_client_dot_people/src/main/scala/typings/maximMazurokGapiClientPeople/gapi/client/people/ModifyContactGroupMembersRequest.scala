package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyContactGroupMembersRequest extends StObject {
  
  /**
    * Optional. The resource names of the contact people to add in the form of `people/{person_id}`. The total number of resource names in `resource_names_to_add` and
    * `resource_names_to_remove` must be less than or equal to 1000.
    */
  var resourceNamesToAdd: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The resource names of the contact people to remove in the form of `people/{person_id}`. The total number of resource names in `resource_names_to_add` and
    * `resource_names_to_remove` must be less than or equal to 1000.
    */
  var resourceNamesToRemove: js.UndefOr[js.Array[String]] = js.undefined
}
object ModifyContactGroupMembersRequest {
  
  inline def apply(): ModifyContactGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyContactGroupMembersRequest]
  }
  
  extension [Self <: ModifyContactGroupMembersRequest](x: Self) {
    
    inline def setResourceNamesToAdd(value: js.Array[String]): Self = StObject.set(x, "resourceNamesToAdd", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesToAddUndefined: Self = StObject.set(x, "resourceNamesToAdd", js.undefined)
    
    inline def setResourceNamesToAddVarargs(value: String*): Self = StObject.set(x, "resourceNamesToAdd", js.Array(value :_*))
    
    inline def setResourceNamesToRemove(value: js.Array[String]): Self = StObject.set(x, "resourceNamesToRemove", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesToRemoveUndefined: Self = StObject.set(x, "resourceNamesToRemove", js.undefined)
    
    inline def setResourceNamesToRemoveVarargs(value: String*): Self = StObject.set(x, "resourceNamesToRemove", js.Array(value :_*))
  }
}
