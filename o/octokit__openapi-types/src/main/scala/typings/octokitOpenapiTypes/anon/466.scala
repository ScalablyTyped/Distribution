package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `466` extends StObject {
  
  /** Response */
  var `200`: Content441
}
object `466` {
  
  inline def apply(`200`: Content441): `466` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`466`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `466`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content441): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
