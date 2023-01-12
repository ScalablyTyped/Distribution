package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400ContentApplicationjsonApplicationscimjson` extends StObject {
  
  /** Response */
  var `200`: Content451
  
  var `400`: ContentApplicationjsonApplicationscimjson
}
object `400ContentApplicationjsonApplicationscimjson` {
  
  inline def apply(`200`: Content451, `400`: ContentApplicationjsonApplicationscimjson): `400ContentApplicationjsonApplicationscimjson` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400ContentApplicationjsonApplicationscimjson`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `400ContentApplicationjsonApplicationscimjson`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content451): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
  }
}
