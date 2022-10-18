package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content41Headers` extends StObject {
  
  /** Response */
  var `200`: Content41Headers
  
  var `422`: Content8
}
object `200Content41Headers` {
  
  inline def apply(`200`: Content41Headers, `422`: Content8): `200Content41Headers` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content41Headers`]
  }
  
  extension [Self <: `200Content41Headers`](x: Self) {
    
    inline def set200(value: Content41Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
