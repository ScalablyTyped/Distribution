package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `489` extends StObject {
  
  /** @description Response */
  var `200`: Content53HeadersLink
}
object `489` {
  
  inline def apply(`200`: Content53HeadersLink): `489` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`489`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `489`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content53HeadersLink): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
