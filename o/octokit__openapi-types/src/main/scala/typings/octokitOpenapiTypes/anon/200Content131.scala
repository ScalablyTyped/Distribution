package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content131` extends StObject {
  
  /** Response */
  var `200`: Content131
  
  var `404`: Content6
}
object `200Content131` {
  
  inline def apply(`200`: Content131, `404`: Content6): `200Content131` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content131`]
  }
  
  extension [Self <: `200Content131`](x: Self) {
    
    inline def set200(value: Content131): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
