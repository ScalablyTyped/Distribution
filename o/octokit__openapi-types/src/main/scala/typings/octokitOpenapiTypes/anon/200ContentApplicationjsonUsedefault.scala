package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonUsedefault` extends StObject {
  
  /** Status response */
  var `200`: ContentApplicationjsonUsedefault
  
  var `400`: Content420
  
  var `404`: Content55
}
object `200ContentApplicationjsonUsedefault` {
  
  inline def apply(`200`: ContentApplicationjsonUsedefault, `400`: Content420, `404`: Content55): `200ContentApplicationjsonUsedefault` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonUsedefault`]
  }
  
  extension [Self <: `200ContentApplicationjsonUsedefault`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonUsedefault): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: Content420): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
