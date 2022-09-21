package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content504Headers` extends StObject {
  
  /** Response */
  var `200`: Content504Headers
}
object `200Content504Headers` {
  
  inline def apply(`200`: Content504Headers): `200Content504Headers` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content504Headers`]
  }
  
  extension [Self <: `200Content504Headers`](x: Self) {
    
    inline def set200(value: Content504Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
