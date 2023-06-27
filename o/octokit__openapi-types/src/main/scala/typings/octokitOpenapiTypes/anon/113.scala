package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  /** @description Response */
  var `200`: HeadersLink
}
object `113` {
  
  inline def apply(`200`: HeadersLink): `113` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`113`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `113`] (val x: Self) extends AnyVal {
    
    inline def set200(value: HeadersLink): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
