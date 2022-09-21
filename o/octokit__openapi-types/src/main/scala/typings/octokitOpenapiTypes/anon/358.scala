package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.push
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `358` extends StObject {
  
  /**
    * @description The permission to grant the team on this repository. If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
    * @enum {string}
    */
  var permission: js.UndefOr[pull | push | admin] = js.undefined
}
object `358` {
  
  inline def apply(): `358` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`358`]
  }
  
  extension [Self <: `358`](x: Self) {
    
    inline def setPermission(value: pull | push | admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
