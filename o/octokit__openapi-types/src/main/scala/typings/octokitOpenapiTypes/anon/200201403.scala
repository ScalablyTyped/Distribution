package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200201403` extends StObject {
  
  /** Response when the updated information already exists */
  var `200`: ContentApplicationjsonReposcount
  
  /** Response */
  var `201`: ContentApplicationjsonReposcount
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `422`: Content421
}
object `200201403` {
  
  inline def apply(
    `200`: ContentApplicationjsonReposcount,
    `201`: ContentApplicationjsonReposcount,
    `403`: Content55,
    `404`: Content55,
    `422`: Content421
  ): `200201403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200201403`]
  }
  
  extension [Self <: `200201403`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonReposcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: ContentApplicationjsonReposcount): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
