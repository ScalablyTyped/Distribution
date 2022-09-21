package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content66` extends StObject {
  
  /** A JSON serialized template for OIDC subject claim customization */
  var `200`: Content66
}
object `200Content66` {
  
  inline def apply(`200`: Content66): `200Content66` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content66`]
  }
  
  extension [Self <: `200Content66`](x: Self) {
    
    inline def set200(value: Content66): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
