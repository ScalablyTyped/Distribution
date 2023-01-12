package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content458` extends StObject {
  
  /** Response */
  var `200`: Content458
  
  var `422`: Content395
}
object `200Content458` {
  
  inline def apply(`200`: Content458, `422`: Content395): `200Content458` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content458`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content458`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content458): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content395): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
