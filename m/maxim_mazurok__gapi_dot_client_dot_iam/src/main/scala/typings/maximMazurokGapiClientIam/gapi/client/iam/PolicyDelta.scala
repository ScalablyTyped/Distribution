package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyDelta extends StObject {
  
  /** The delta for Bindings between two policies. */
  var bindingDeltas: js.UndefOr[js.Array[BindingDelta]] = js.native
}
object PolicyDelta {
  
  @scala.inline
  def apply(): PolicyDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDelta]
  }
  
  @scala.inline
  implicit class PolicyDeltaMutableBuilder[Self <: PolicyDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingDeltas(value: js.Array[BindingDelta]): Self = StObject.set(x, "bindingDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingDeltasUndefined: Self = StObject.set(x, "bindingDeltas", js.undefined)
    
    @scala.inline
    def setBindingDeltasVarargs(value: BindingDelta*): Self = StObject.set(x, "bindingDeltas", js.Array(value :_*))
  }
}
