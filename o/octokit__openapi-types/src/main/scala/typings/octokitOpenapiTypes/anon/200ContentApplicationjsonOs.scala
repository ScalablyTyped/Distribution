package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonOs` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonOs
}
object `200ContentApplicationjsonOs` {
  
  inline def apply(`200`: ContentApplicationjsonOs): `200ContentApplicationjsonOs` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonOs`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonOs`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonOs): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
