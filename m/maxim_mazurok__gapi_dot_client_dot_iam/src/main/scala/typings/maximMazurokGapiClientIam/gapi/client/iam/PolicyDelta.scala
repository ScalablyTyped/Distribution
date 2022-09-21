package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDelta extends StObject {
  
  /** The delta for Bindings between two policies. */
  var bindingDeltas: js.UndefOr[js.Array[BindingDelta]] = js.undefined
}
object PolicyDelta {
  
  inline def apply(): PolicyDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDelta]
  }
  
  extension [Self <: PolicyDelta](x: Self) {
    
    inline def setBindingDeltas(value: js.Array[BindingDelta]): Self = StObject.set(x, "bindingDeltas", value.asInstanceOf[js.Any])
    
    inline def setBindingDeltasUndefined: Self = StObject.set(x, "bindingDeltas", js.undefined)
    
    inline def setBindingDeltasVarargs(value: BindingDelta*): Self = StObject.set(x, "bindingDeltas", js.Array(value*))
  }
}
