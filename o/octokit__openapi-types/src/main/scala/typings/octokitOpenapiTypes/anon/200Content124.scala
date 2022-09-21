package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content124` extends StObject {
  
  /** Response */
  var `200`: Content124
  
  /** if user has no team membership */
  var `404`: Any
}
object `200Content124` {
  
  inline def apply(`200`: Content124, `404`: Any): `200Content124` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content124`]
  }
  
  extension [Self <: `200Content124`](x: Self) {
    
    inline def set200(value: Content124): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
