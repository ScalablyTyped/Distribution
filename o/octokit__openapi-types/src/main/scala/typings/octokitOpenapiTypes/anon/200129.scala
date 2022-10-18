package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200129` extends StObject {
  
  /** Response */
  var `200`: `129`
  
  var `404`: Content6
}
object `200129` {
  
  inline def apply(`200`: `129`, `404`: Content6): `200129` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200129`]
  }
  
  extension [Self <: `200129`](x: Self) {
    
    inline def set200(value: `129`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
