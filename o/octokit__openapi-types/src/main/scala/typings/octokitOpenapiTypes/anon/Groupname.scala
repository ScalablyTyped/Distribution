package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groupname extends StObject {
  
  /** @example "moar cheese pleese" */
  var description: js.UndefOr[String] = js.undefined
  
  /** @description Description of the IdP group. */
  var group_description: String
  
  /** @description ID of the IdP group. */
  var group_id: String
  
  /** @description Name of the IdP group. */
  var group_name: String
  
  /** @example "caceab43fc9ffa20081c" */
  var id: js.UndefOr[String] = js.undefined
  
  /** @example "external-team-6c13e7288ef7" */
  var name: js.UndefOr[String] = js.undefined
}
object Groupname {
  
  inline def apply(group_description: String, group_id: String, group_name: String): Groupname = {
    val __obj = js.Dynamic.literal(group_description = group_description.asInstanceOf[js.Any], group_id = group_id.asInstanceOf[js.Any], group_name = group_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groupname]
  }
  
  extension [Self <: Groupname](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroup_description(value: String): Self = StObject.set(x, "group_description", value.asInstanceOf[js.Any])
    
    inline def setGroup_id(value: String): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_name(value: String): Self = StObject.set(x, "group_name", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
