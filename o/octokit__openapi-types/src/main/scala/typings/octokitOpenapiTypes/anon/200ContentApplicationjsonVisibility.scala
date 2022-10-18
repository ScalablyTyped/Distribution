package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonVisibility` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonVisibility
}
object `200ContentApplicationjsonVisibility` {
  
  inline def apply(`200`: ContentApplicationjsonVisibility): `200ContentApplicationjsonVisibility` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonVisibility`]
  }
  
  extension [Self <: `200ContentApplicationjsonVisibility`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonVisibility): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
