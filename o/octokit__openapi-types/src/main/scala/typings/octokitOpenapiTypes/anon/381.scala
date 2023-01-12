package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `381` extends StObject {
  
  /** Response */
  var `200`: Content360
}
object `381` {
  
  inline def apply(`200`: Content360): `381` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`381`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `381`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content360): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
