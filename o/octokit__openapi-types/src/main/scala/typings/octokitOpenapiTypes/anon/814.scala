package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `814` extends StObject {
  
  /** @description Response */
  var `200`: Content580HeadersLinkString
}
object `814` {
  
  inline def apply(`200`: Content580HeadersLinkString): `814` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`814`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `814`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content580HeadersLinkString): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
