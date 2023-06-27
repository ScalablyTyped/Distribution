package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content62` extends StObject {
  
  /** @description A JSON serialized template for OIDC subject claim customization */
  var `200`: Content62
}
object `200Content62` {
  
  inline def apply(`200`: Content62): `200Content62` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content62`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content62`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content62): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
