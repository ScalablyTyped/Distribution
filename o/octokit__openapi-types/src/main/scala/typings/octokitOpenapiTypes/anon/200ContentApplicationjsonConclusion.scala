package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonConclusion` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonConclusion
}
object `200ContentApplicationjsonConclusion` {
  
  inline def apply(`200`: ContentApplicationjsonConclusion): `200ContentApplicationjsonConclusion` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonConclusion`]
  }
  
  extension [Self <: `200ContentApplicationjsonConclusion`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonConclusion): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
