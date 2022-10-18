package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409` extends StObject {
  
  var `404`: Content6
  
  /** Conflict when visibility type not set to selected */
  var `409`: Any
}
object `409` {
  
  inline def apply(`404`: Content6, `409`: Any): `409` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`409`]
  }
  
  extension [Self <: `409`](x: Self) {
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
  }
}
