package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonDocumentation` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonDocumentation
}
object `200ContentApplicationjsonDocumentation` {
  
  inline def apply(`200`: ContentApplicationjsonDocumentation): `200ContentApplicationjsonDocumentation` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonDocumentation`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonDocumentation`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonDocumentation): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
