package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `406` extends StObject {
  
  /**
    * @description Array of groups to be mapped to this team
    * @example [
    *   {
    *     "group_id": "111a1a11-aaa1-1aaa-11a1-a1a1a1a1a1aa",
    *     "group_name": "saml-azuread-test",
    *     "group_description": "A group of Developers working on AzureAD SAML SSO"
    *   },
    *   {
    *     "group_id": "2bb2bb2b-bb22-22bb-2bb2-bb2bbb2bb2b2",
    *     "group_name": "saml-azuread-test2",
    *     "group_description": "Another group of Developers working on AzureAD SAML SSO"
    *   }
    * ]
    */
  var groups: js.UndefOr[js.Array[GroupdescriptionGroupid]] = js.undefined
}
object `406` {
  
  inline def apply(): `406` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`406`]
  }
  
  extension [Self <: `406`](x: Self) {
    
    inline def setGroups(value: js.Array[GroupdescriptionGroupid]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupdescriptionGroupid*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
