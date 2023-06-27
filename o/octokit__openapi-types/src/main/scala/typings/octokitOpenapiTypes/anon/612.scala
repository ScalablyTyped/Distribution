package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `612` extends StObject {
  
  /** @description Response */
  var `200`: Content592HeadersLinkString
}
object `612` {
  
  inline def apply(`200`: Content592HeadersLinkString): `612` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`612`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `612`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content592HeadersLinkString): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
