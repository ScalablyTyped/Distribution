package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content120` extends StObject {
  
  /** Response */
  var `200`: Content120
  
  /** Not Found if project is not managed by this team */
  var `404`: Any
}
object `200Content120` {
  
  inline def apply(`200`: Content120, `404`: Any): `200Content120` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content120`]
  }
  
  extension [Self <: `200Content120`](x: Self) {
    
    inline def set200(value: Content120): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
