package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400401403` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonDevcontainers
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `401`: Content36
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `500`: Content36
}
object `400401403` {
  
  inline def apply(
    `200`: ContentApplicationjsonDevcontainers,
    `400`: ContentApplicationjsonApplicationscimjson,
    `401`: Content36,
    `403`: Content36,
    `404`: Content36,
    `500`: Content36
  ): `400401403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400401403`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `400401403`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonDevcontainers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content36): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content36): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
