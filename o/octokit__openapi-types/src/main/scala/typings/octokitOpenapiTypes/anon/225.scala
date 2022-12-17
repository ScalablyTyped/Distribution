package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `225` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Deploymentbranchpolicy | Null
}
object `225` {
  
  inline def apply(): `225` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`225`]
  }
  
  extension [Self <: `225`](x: Self) {
    
    inline def setApplicationSlashjson(value: Deploymentbranchpolicy): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
