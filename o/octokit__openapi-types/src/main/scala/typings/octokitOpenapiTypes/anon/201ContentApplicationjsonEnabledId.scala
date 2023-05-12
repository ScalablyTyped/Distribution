package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonEnabledId` extends StObject {
  
  /** @description The enabled custom deployment protection rule */
  var `201`: ContentApplicationjsonEnabledId
}
object `201ContentApplicationjsonEnabledId` {
  
  inline def apply(`201`: ContentApplicationjsonEnabledId): `201ContentApplicationjsonEnabledId` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonEnabledId`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonEnabledId`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonEnabledId): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
