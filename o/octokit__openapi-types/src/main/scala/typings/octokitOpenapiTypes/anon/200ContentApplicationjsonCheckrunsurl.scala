package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCheckrunsurl` extends StObject {
  
  /** Response when the suite already exists */
  var `200`: ContentApplicationjsonCheckrunsurl
  
  /** Response when the suite was created */
  var `201`: ContentApplicationjsonCheckrunsurl
}
object `200ContentApplicationjsonCheckrunsurl` {
  
  inline def apply(`200`: ContentApplicationjsonCheckrunsurl, `201`: ContentApplicationjsonCheckrunsurl): `200ContentApplicationjsonCheckrunsurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCheckrunsurl`]
  }
  
  extension [Self <: `200ContentApplicationjsonCheckrunsurl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCheckrunsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: ContentApplicationjsonCheckrunsurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
