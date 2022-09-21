package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityUserFlow
  extends StObject
     with Entity {
  
  var userFlowType: js.UndefOr[UserFlowType] = js.undefined
  
  var userFlowTypeVersion: js.UndefOr[Double] = js.undefined
}
object IdentityUserFlow {
  
  inline def apply(): IdentityUserFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityUserFlow]
  }
  
  extension [Self <: IdentityUserFlow](x: Self) {
    
    inline def setUserFlowType(value: UserFlowType): Self = StObject.set(x, "userFlowType", value.asInstanceOf[js.Any])
    
    inline def setUserFlowTypeUndefined: Self = StObject.set(x, "userFlowType", js.undefined)
    
    inline def setUserFlowTypeVersion(value: Double): Self = StObject.set(x, "userFlowTypeVersion", value.asInstanceOf[js.Any])
    
    inline def setUserFlowTypeVersionUndefined: Self = StObject.set(x, "userFlowTypeVersion", js.undefined)
  }
}
