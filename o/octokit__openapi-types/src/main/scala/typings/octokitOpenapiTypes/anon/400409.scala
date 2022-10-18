package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400409` extends StObject {
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `409`: Content6
  
  var `422`: Content8
}
object `400409` {
  
  inline def apply(`400`: ContentApplicationjsonApplicationscimjson, `409`: Content6, `422`: Content8): `400409` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400409`]
  }
  
  extension [Self <: `400409`](x: Self) {
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content6): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
