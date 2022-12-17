package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `228` extends StObject {
  
  /** Response */
  var `200`: Content226
}
object `228` {
  
  inline def apply(`200`: Content226): `228` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`228`]
  }
  
  extension [Self <: `228`](x: Self) {
    
    inline def set200(value: Content226): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
