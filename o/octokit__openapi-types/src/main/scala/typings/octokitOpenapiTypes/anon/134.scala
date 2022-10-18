package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAuthorscount
}
object `134` {
  
  inline def apply(`200`: ContentApplicationjsonAuthorscount): `134` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`134`]
  }
  
  extension [Self <: `134`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAuthorscount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
