package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyConstraintsJson extends StObject {
  
  var inhibitPolicyMapping: js.UndefOr[Double] = js.undefined
  
  var requireExplicitPolicy: js.UndefOr[Double] = js.undefined
}
object PolicyConstraintsJson {
  
  inline def apply(): PolicyConstraintsJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyConstraintsJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyConstraintsJson] (val x: Self) extends AnyVal {
    
    inline def setInhibitPolicyMapping(value: Double): Self = StObject.set(x, "inhibitPolicyMapping", value.asInstanceOf[js.Any])
    
    inline def setInhibitPolicyMappingUndefined: Self = StObject.set(x, "inhibitPolicyMapping", js.undefined)
    
    inline def setRequireExplicitPolicy(value: Double): Self = StObject.set(x, "requireExplicitPolicy", value.asInstanceOf[js.Any])
    
    inline def setRequireExplicitPolicyUndefined: Self = StObject.set(x, "requireExplicitPolicy", js.undefined)
  }
}
