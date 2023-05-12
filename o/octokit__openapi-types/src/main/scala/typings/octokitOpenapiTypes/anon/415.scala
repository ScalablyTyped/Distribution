package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `415` extends StObject {
  
  /** @description Response */
  var `200`: Content45HeadersLink
}
object `415` {
  
  inline def apply(`200`: Content45HeadersLink): `415` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`415`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `415`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content45HeadersLink): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
