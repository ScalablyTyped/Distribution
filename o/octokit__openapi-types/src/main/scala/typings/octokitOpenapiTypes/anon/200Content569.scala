package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content569` extends StObject {
  
  /** @description Response */
  var `200`: Content569
  
  var `422`: Content346
}
object `200Content569` {
  
  inline def apply(`200`: Content569, `422`: Content346): `200Content569` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content569`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content569`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content569): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
