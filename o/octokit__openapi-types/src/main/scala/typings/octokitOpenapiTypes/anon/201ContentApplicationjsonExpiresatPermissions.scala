package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonExpiresatPermissions` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonExpiresatPermissions
}
object `201ContentApplicationjsonExpiresatPermissions` {
  
  inline def apply(`201`: ContentApplicationjsonExpiresatPermissions): `201ContentApplicationjsonExpiresatPermissions` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonExpiresatPermissions`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonExpiresatPermissions`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonExpiresatPermissions): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
