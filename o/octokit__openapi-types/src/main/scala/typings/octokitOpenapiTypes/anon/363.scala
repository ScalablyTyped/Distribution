package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `363` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Machine | Pullrequest
}
object `363` {
  
  inline def apply(applicationSlashjson: Machine | Pullrequest): `363` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`363`]
  }
  
  extension [Self <: `363`](x: Self) {
    
    inline def setApplicationSlashjson(value: Machine | Pullrequest): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
