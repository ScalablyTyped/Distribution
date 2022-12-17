package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content41404Content48422Content397` extends StObject {
  
  /** Response */
  var `200`: Content41
  
  var `404`: Content48
  
  var `422`: Content397
}
object `200Content41404Content48422Content397` {
  
  inline def apply(`200`: Content41, `404`: Content48, `422`: Content397): `200Content41404Content48422Content397` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content41404Content48422Content397`]
  }
  
  extension [Self <: `200Content41404Content48422Content397`](x: Self) {
    
    inline def set200(value: Content41): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
