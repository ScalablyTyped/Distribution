package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400422` extends StObject {
  
  /** @description Response */
  var `200`: Content472
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `422`: Content346
}
object `400422` {
  
  inline def apply(`200`: Content472, `400`: ContentApplicationjsonApplicationscimjson, `422`: Content346): `400422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `400422`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content472): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
