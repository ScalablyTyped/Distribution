package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonSecretsTotalcount` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonSecretsTotalcount
}
object `200ContentApplicationjsonSecretsTotalcount` {
  
  inline def apply(`200`: ContentApplicationjsonSecretsTotalcount): `200ContentApplicationjsonSecretsTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonSecretsTotalcount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonSecretsTotalcount`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonSecretsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
