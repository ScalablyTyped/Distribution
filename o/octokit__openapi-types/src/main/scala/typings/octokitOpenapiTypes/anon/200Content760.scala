package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content760` extends StObject {
  
  /** @description Response */
  var `200`: Content760
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `404`: Content41
}
object `200Content760` {
  
  inline def apply(`200`: Content760, `400`: ContentApplicationjsonApplicationscimjson, `404`: Content41): `200Content760` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content760`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content760`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content760): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
