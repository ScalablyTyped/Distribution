package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `670` extends StObject {
  
  /** @description Response */
  var `200`: Content494HeadersLinkString
}
object `670` {
  
  inline def apply(`200`: Content494HeadersLinkString): `670` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`670`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `670`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content494HeadersLinkString): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
