package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  /** Response */
  var `200`: Content73
}
object `115` {
  
  inline def apply(`200`: Content73): `115` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`115`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `115`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content73): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
