package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202Content40` extends StObject {
  
  /** Response */
  var `202`: Content40
  
  var `409`: Content48
}
object `202Content40` {
  
  inline def apply(`202`: Content40, `409`: Content48): `202Content40` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202Content40`]
  }
  
  extension [Self <: `202Content40`](x: Self) {
    
    inline def set202(value: Content40): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content48): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
  }
}
