package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupdescriptionGroupid extends StObject {
  
  /**
    * @description a description of the group
    * @example A group of Developers working on AzureAD SAML SSO
    */
  var group_description: String
  
  /**
    * @description The ID of the group
    * @example 111a1a11-aaa1-1aaa-11a1-a1a1a1a1a1aa
    */
  var group_id: String
  
  /**
    * @description The name of the group
    * @example saml-azuread-test
    */
  var group_name: String
  
  /**
    * @description synchronization status for this group mapping
    * @example unsynced
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * @description the time of the last sync for this group-mapping
    * @example 2019-06-03 22:27:15:000 -700
    */
  var synced_at: js.UndefOr[String | Null] = js.undefined
}
object GroupdescriptionGroupid {
  
  inline def apply(group_description: String, group_id: String, group_name: String): GroupdescriptionGroupid = {
    val __obj = js.Dynamic.literal(group_description = group_description.asInstanceOf[js.Any], group_id = group_id.asInstanceOf[js.Any], group_name = group_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupdescriptionGroupid]
  }
  
  extension [Self <: GroupdescriptionGroupid](x: Self) {
    
    inline def setGroup_description(value: String): Self = StObject.set(x, "group_description", value.asInstanceOf[js.Any])
    
    inline def setGroup_id(value: String): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSynced_at(value: String): Self = StObject.set(x, "synced_at", value.asInstanceOf[js.Any])
    
    inline def setSynced_atNull: Self = StObject.set(x, "synced_at", null)
    
    inline def setSynced_atUndefined: Self = StObject.set(x, "synced_at", js.undefined)
  }
}
