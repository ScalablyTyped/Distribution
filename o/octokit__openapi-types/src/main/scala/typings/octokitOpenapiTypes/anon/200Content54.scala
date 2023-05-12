package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content54` extends StObject {
  
  /** @description A JSON serialized template for OIDC subject claim customization */
  var `200`: Content54
}
object `200Content54` {
  
  inline def apply(`200`: Content54): `200Content54` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content54`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content54`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content54): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
