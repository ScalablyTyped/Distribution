package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRunnergroups` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRunnergroups
}
object `200ContentApplicationjsonRunnergroups` {
  
  inline def apply(`200`: ContentApplicationjsonRunnergroups): `200ContentApplicationjsonRunnergroups` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRunnergroups`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRunnergroups`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRunnergroups): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
