package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRunnersTotalcount` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonRunnersTotalcount
}
object `200ContentApplicationjsonRunnersTotalcount` {
  
  inline def apply(`200`: ContentApplicationjsonRunnersTotalcount): `200ContentApplicationjsonRunnersTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRunnersTotalcount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRunnersTotalcount`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRunnersTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
