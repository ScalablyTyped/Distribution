package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonDeletedat` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonDeletedat
}
object `200ContentApplicationjsonDeletedat` {
  
  inline def apply(`200`: ContentApplicationjsonDeletedat): `200ContentApplicationjsonDeletedat` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonDeletedat`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonDeletedat`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonDeletedat): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
