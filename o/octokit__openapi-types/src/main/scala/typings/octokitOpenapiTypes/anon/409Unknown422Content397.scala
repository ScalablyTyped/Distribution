package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409Unknown422Content397` extends StObject {
  
  var `404`: Content48
  
  /** Conflict when visibility type not set to selected */
  var `409`: Any
  
  var `422`: Content397
}
object `409Unknown422Content397` {
  
  inline def apply(`404`: Content48, `409`: Any, `422`: Content397): `409Unknown422Content397` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`409Unknown422Content397`]
  }
  
  extension [Self <: `409Unknown422Content397`](x: Self) {
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
