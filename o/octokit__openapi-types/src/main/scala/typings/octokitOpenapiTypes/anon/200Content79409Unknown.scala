package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content79409Unknown` extends StObject {
  
  /** Response */
  var `200`: Content79
  
  /** Response */
  var `409`: Any
}
object `200Content79409Unknown` {
  
  inline def apply(`200`: Content79, `409`: Any): `200Content79409Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content79409Unknown`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content79409Unknown`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content79): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
  }
}
