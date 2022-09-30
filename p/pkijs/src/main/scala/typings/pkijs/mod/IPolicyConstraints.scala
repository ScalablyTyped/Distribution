package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolicyConstraints extends StObject {
  
  var inhibitPolicyMapping: js.UndefOr[Double] = js.undefined
  
  var requireExplicitPolicy: js.UndefOr[Double] = js.undefined
}
object IPolicyConstraints {
  
  inline def apply(): IPolicyConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicyConstraints]
  }
  
  extension [Self <: IPolicyConstraints](x: Self) {
    
    inline def setInhibitPolicyMapping(value: Double): Self = StObject.set(x, "inhibitPolicyMapping", value.asInstanceOf[js.Any])
    
    inline def setInhibitPolicyMappingUndefined: Self = StObject.set(x, "inhibitPolicyMapping", js.undefined)
    
    inline def setRequireExplicitPolicy(value: Double): Self = StObject.set(x, "requireExplicitPolicy", value.asInstanceOf[js.Any])
    
    inline def setRequireExplicitPolicyUndefined: Self = StObject.set(x, "requireExplicitPolicy", js.undefined)
  }
}
