package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  /**
    * @description The permission to grant the collaborator. **Only valid on organization-owned repositories.** We accept the following permissions to be set: `pull`, `triage`, `push`, `maintain`, `admin` and you can also specify a custom repository role name, if the owning organization has defined any.
    * @default push
    */
  var permission: js.UndefOr[String] = js.undefined
}
object `151` {
  
  inline def apply(): `151` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`151`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `151`] (val x: Self) extends AnyVal {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
