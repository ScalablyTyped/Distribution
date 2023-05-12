package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `634` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonCreatedatIgnored
}
object `634` {
  
  inline def apply(`200`: ContentApplicationjsonCreatedatIgnored): `634` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`634`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `634`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCreatedatIgnored): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
