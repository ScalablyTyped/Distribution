package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content576404Content48` extends StObject {
  
  /** Response */
  var `200`: Content576
  
  var `404`: Content48
}
object `200Content576404Content48` {
  
  inline def apply(`200`: Content576, `404`: Content48): `200Content576404Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content576404Content48`]
  }
  
  extension [Self <: `200Content576404Content48`](x: Self) {
    
    inline def set200(value: Content576): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
