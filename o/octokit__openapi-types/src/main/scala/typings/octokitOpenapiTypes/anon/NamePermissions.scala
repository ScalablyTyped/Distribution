package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maintain
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.triage
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamePermissions extends StObject {
  
  /**
    * @description The system role from which this role inherits permissions.
    * @enum {string}
    */
  var base_role: js.UndefOr[read | triage | write | maintain] = js.undefined
  
  /** @description A short description about who this role is for or what permissions it grants. */
  var description: js.UndefOr[String] = js.undefined
  
  /** @description The name of the custom role. */
  var name: js.UndefOr[String] = js.undefined
  
  /** @description A list of additional permissions included in this role. If specified, these permissions will replace any currently set on the role. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object NamePermissions {
  
  inline def apply(): NamePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamePermissions]
  }
  
  extension [Self <: NamePermissions](x: Self) {
    
    inline def setBase_role(value: read | triage | write | maintain): Self = StObject.set(x, "base_role", value.asInstanceOf[js.Any])
    
    inline def setBase_roleUndefined: Self = StObject.set(x, "base_role", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
