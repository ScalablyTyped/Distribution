package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422Content549` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonNamePath
  
  var `422`: Content549
}
object `422Content549` {
  
  inline def apply(`200`: ContentApplicationjsonNamePath, `422`: Content549): `422Content549` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422Content549`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `422Content549`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonNamePath): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content549): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
