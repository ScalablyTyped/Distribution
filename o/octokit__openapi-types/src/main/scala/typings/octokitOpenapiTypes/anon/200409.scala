package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200409` extends StObject {
  
  /** Response */
  var `200`: Content87
  
  /** Response */
  var `409`: Any
}
object `200409` {
  
  inline def apply(`200`: Content87, `409`: Any): `200409` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200409`]
  }
  
  extension [Self <: `200409`](x: Self) {
    
    inline def set200(value: Content87): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
  }
}
