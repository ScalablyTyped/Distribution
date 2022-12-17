package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content504` extends StObject {
  
  /** Response */
  var `200`: Content504
  
  var `301`: Content48
}
object `200Content504` {
  
  inline def apply(`200`: Content504, `301`: Content48): `200Content504` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content504`]
  }
  
  extension [Self <: `200Content504`](x: Self) {
    
    inline def set200(value: Content504): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content48): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
  }
}
