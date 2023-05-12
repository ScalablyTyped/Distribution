package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  /** @description Response */
  var `200`: Content186
}
object `188` {
  
  inline def apply(`200`: Content186): `188` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`188`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `188`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content186): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
