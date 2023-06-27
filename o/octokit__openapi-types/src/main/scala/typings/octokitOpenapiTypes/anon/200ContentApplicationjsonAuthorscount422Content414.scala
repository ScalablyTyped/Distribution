package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAuthorscount422Content414` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonAuthorscount
  
  var `422`: Content414
  
  var `503`: Content41
}
object `200ContentApplicationjsonAuthorscount422Content414` {
  
  inline def apply(`200`: ContentApplicationjsonAuthorscount, `422`: Content414, `503`: Content41): `200ContentApplicationjsonAuthorscount422Content414` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAuthorscount422Content414`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonAuthorscount422Content414`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAuthorscount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: Content41): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
