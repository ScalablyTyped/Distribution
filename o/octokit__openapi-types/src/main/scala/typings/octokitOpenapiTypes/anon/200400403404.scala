package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200400403404` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonSecurityadvisory
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `409`: Content41
  
  var `422`: Content549
}
object `200400403404` {
  
  inline def apply(
    `200`: ContentApplicationjsonSecurityadvisory,
    `400`: ContentApplicationjsonApplicationscimjson,
    `403`: Content41,
    `404`: Content41,
    `409`: Content41,
    `422`: Content549
  ): `200400403404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200400403404`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200400403404`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonSecurityadvisory): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content41): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content549): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
