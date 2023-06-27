package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400409422` extends StObject {
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `409`: Content41
  
  var `422`: Content414
}
object `400409422` {
  
  inline def apply(`400`: ContentApplicationjsonApplicationscimjson, `409`: Content41, `422`: Content414): `400409422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400409422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `400409422`] (val x: Self) extends AnyVal {
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content41): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
