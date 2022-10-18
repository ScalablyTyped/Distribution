package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content460` extends StObject {
  
  /** Response */
  var `200`: Content460
  
  /** Resource not found */
  var `404`: Any
}
object `200Content460` {
  
  inline def apply(`200`: Content460, `404`: Any): `200Content460` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content460`]
  }
  
  extension [Self <: `200Content460`](x: Self) {
    
    inline def set200(value: Content460): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
