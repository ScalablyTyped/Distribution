package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAuthorscount503Content36` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonAuthorscount
  
  var `503`: Content36
}
object `200ContentApplicationjsonAuthorscount503Content36` {
  
  inline def apply(`200`: ContentApplicationjsonAuthorscount, `503`: Content36): `200ContentApplicationjsonAuthorscount503Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAuthorscount503Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonAuthorscount503Content36`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAuthorscount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set503(value: Content36): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
