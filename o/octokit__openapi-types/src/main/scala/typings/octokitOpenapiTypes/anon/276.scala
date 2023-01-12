package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `276` extends StObject {
  
  /** Response */
  var `200`: `275`
}
object `276` {
  
  inline def apply(`200`: `275`): `276` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`276`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `276`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `275`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
