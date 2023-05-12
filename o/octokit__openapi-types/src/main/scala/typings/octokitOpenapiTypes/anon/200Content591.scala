package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content591` extends StObject {
  
  /** @description Response */
  var `200`: Content591
  
  var `503`: Content36
}
object `200Content591` {
  
  inline def apply(`200`: Content591, `503`: Content36): `200Content591` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content591`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content591`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content591): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set503(value: Content36): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
