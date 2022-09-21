package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupidGroupname extends StObject {
  
  /**
    * @description The internal ID of the group
    * @example 1
    */
  var group_id: Double
  
  /**
    * @description The display name of the group
    * @example group-azuread-test
    */
  var group_name: String
  
  /**
    * @description The time of the last update for this group
    * @example 2019-06-03 22:27:15:000 -700
    */
  var updated_at: String
}
object GroupidGroupname {
  
  inline def apply(group_id: Double, group_name: String, updated_at: String): GroupidGroupname = {
    val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any], group_name = group_name.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupidGroupname]
  }
  
  extension [Self <: GroupidGroupname](x: Self) {
    
    inline def setGroup_id(value: Double): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
