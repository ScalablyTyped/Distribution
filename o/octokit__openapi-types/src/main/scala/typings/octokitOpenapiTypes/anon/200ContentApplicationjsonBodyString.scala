package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBodyString` extends StObject {
  
  /** @description Name and body of generated release notes */
  var `200`: ContentApplicationjsonBodyString
  
  var `404`: Content41
}
object `200ContentApplicationjsonBodyString` {
  
  inline def apply(`200`: ContentApplicationjsonBodyString, `404`: Content41): `200ContentApplicationjsonBodyString` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBodyString`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonBodyString`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
