package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `521` extends StObject {
  
  /** @description Response */
  var `200`: Content508HeadersLinkString
}
object `521` {
  
  inline def apply(`200`: Content508HeadersLinkString): `521` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`521`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `521`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content508HeadersLinkString): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
