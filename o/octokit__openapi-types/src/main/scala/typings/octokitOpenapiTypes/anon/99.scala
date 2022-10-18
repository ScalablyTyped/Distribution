package typings.octokitOpenapiTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Partial[ConclusionStatus] & Partial[DictkeyStatus] & Externalid
}
object `99` {
  
  inline def apply(applicationSlashjson: Partial[ConclusionStatus] & Partial[DictkeyStatus] & Externalid): `99` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`99`]
  }
  
  extension [Self <: `99`](x: Self) {
    
    inline def setApplicationSlashjson(value: Partial[ConclusionStatus] & Partial[DictkeyStatus] & Externalid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
