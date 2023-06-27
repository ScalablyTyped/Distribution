package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `493` extends StObject {
  
  /** @description Response */
  var `200`: Content478
}
object `493` {
  
  inline def apply(`200`: Content478): `493` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`493`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `493`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content478): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
