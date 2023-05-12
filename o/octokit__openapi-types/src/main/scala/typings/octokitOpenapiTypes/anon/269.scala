package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maintain
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.triage
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `269` extends StObject {
  
  /**
    * @description The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`, `triage`, and `admin`.
    * @enum {string}
    */
  var permissions: js.UndefOr[read | write | maintain | triage | admin] = js.undefined
}
object `269` {
  
  inline def apply(): `269` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`269`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `269`] (val x: Self) extends AnyVal {
    
    inline def setPermissions(value: read | write | maintain | triage | admin): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
  }
}
