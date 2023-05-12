package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content628` extends StObject {
  
  /** @description Response */
  var `200`: Content628
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `404`: Content36
}
object `200Content628` {
  
  inline def apply(`200`: Content628, `400`: ContentApplicationjsonApplicationscimjson, `404`: Content36): `200Content628` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content628`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content628`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content628): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
