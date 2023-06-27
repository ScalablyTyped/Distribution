package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.push
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `441` extends StObject {
  
  /**
    * @description The permission to grant the team on this repository. If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
    * @enum {string}
    */
  var permission: js.UndefOr[pull | push | admin] = js.undefined
}
object `441` {
  
  inline def apply(): `441` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`441`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `441`] (val x: Self) extends AnyVal {
    
    inline def setPermission(value: pull | push | admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
