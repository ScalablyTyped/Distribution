package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content114` extends StObject {
  
  /** Response */
  var `200`: Content114
  
  var `301`: Content6
}
object `200Content114` {
  
  inline def apply(`200`: Content114, `301`: Content6): `200Content114` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content114`]
  }
  
  extension [Self <: `200Content114`](x: Self) {
    
    inline def set200(value: Content114): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content6): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
  }
}
