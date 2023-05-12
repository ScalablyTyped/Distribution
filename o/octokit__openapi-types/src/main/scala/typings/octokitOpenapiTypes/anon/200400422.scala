package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200400422` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonDuration
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `422`: Content346
}
object `200400422` {
  
  inline def apply(
    `200`: ContentApplicationjsonDuration,
    `400`: ContentApplicationjsonApplicationscimjson,
    `422`: Content346
  ): `200400422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200400422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200400422`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonDuration): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
