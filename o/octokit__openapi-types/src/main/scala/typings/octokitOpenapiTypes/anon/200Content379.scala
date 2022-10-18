package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content379` extends StObject {
  
  /** Response */
  var `200`: Content379
  
  /** if user has no team membership */
  var `404`: Any
}
object `200Content379` {
  
  inline def apply(`200`: Content379, `404`: Any): `200Content379` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content379`]
  }
  
  extension [Self <: `200Content379`](x: Self) {
    
    inline def set200(value: Content379): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
