package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonDefault` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonDefault
}
object `200ContentApplicationjsonDefault` {
  
  inline def apply(`200`: ContentApplicationjsonDefault): `200ContentApplicationjsonDefault` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonDefault`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonDefault`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonDefault): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
