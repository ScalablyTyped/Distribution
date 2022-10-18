package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonKeyid` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonKeyid
}
object `200ContentApplicationjsonKeyid` {
  
  inline def apply(`200`: ContentApplicationjsonKeyid): `200ContentApplicationjsonKeyid` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonKeyid`]
  }
  
  extension [Self <: `200ContentApplicationjsonKeyid`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonKeyid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
