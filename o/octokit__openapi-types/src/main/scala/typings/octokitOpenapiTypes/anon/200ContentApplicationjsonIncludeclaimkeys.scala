package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonIncludeclaimkeys` extends StObject {
  
  /** @description Status response */
  var `200`: ContentApplicationjsonIncludeclaimkeys
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `404`: Content41
}
object `200ContentApplicationjsonIncludeclaimkeys` {
  
  inline def apply(
    `200`: ContentApplicationjsonIncludeclaimkeys,
    `400`: ContentApplicationjsonApplicationscimjson,
    `404`: Content41
  ): `200ContentApplicationjsonIncludeclaimkeys` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonIncludeclaimkeys`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonIncludeclaimkeys`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonIncludeclaimkeys): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
