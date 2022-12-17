package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content520` extends StObject {
  
  /** Response */
  var `200`: Content520
  
  var `404`: Content48
}
object `200Content520` {
  
  inline def apply(`200`: Content520, `404`: Content48): `200Content520` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content520`]
  }
  
  extension [Self <: `200Content520`](x: Self) {
    
    inline def set200(value: Content520): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
