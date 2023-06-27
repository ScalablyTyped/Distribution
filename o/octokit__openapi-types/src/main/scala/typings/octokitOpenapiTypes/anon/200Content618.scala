package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content618` extends StObject {
  
  /** @description Response */
  var `200`: Content618
  
  var `422`: Content549
}
object `200Content618` {
  
  inline def apply(`200`: Content618, `422`: Content549): `200Content618` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content618`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content618`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content618): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content549): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
