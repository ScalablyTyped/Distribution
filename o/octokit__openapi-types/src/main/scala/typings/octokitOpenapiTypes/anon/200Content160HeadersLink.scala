package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content160HeadersLink` extends StObject {
  
  /** @description Response */
  var `200`: Content160HeadersLink
}
object `200Content160HeadersLink` {
  
  inline def apply(`200`: Content160HeadersLink): `200Content160HeadersLink` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content160HeadersLink`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content160HeadersLink`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content160HeadersLink): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
