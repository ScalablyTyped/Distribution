package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200HeadersLinkString` extends StObject {
  
  /** @description Response */
  var `200`: HeadersLinkString
}
object `200HeadersLinkString` {
  
  inline def apply(`200`: HeadersLinkString): `200HeadersLinkString` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200HeadersLinkString`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200HeadersLinkString`] (val x: Self) extends AnyVal {
    
    inline def set200(value: HeadersLinkString): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
