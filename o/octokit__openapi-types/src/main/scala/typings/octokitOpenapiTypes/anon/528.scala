package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `528` extends StObject {
  
  var permission: js.UndefOr[To] = js.undefined
}
object `528` {
  
  inline def apply(): `528` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`528`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `528`] (val x: Self) extends AnyVal {
    
    inline def setPermission(value: To): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
