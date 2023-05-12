package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonEnvironmentsTotalcount` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonEnvironmentsTotalcount
}
object `200ContentApplicationjsonEnvironmentsTotalcount` {
  
  inline def apply(`200`: ContentApplicationjsonEnvironmentsTotalcount): `200ContentApplicationjsonEnvironmentsTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonEnvironmentsTotalcount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonEnvironmentsTotalcount`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonEnvironmentsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
