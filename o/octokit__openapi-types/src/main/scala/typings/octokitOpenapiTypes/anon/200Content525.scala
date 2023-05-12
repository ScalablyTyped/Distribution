package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content525` extends StObject {
  
  /** @description Response */
  var `200`: Content525
  
  var `422`: Content471
}
object `200Content525` {
  
  inline def apply(`200`: Content525, `422`: Content471): `200Content525` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content525`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content525`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content525): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content471): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
