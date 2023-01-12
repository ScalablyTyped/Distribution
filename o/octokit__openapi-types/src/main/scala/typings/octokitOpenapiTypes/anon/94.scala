package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  /** Response */
  var `200`: Content69Headers
}
object `94` {
  
  inline def apply(`200`: Content69Headers): `94` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`94`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `94`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content69Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
