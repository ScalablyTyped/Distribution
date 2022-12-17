package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200444` extends StObject {
  
  /** Response */
  var `200`: `444`
  
  var `404`: Content48
}
object `200444` {
  
  inline def apply(`200`: `444`, `404`: Content48): `200444` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200444`]
  }
  
  extension [Self <: `200444`](x: Self) {
    
    inline def set200(value: `444`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
