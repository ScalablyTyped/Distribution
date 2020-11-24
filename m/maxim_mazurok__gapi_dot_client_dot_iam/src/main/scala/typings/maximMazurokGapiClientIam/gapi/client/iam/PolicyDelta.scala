package typings.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyDelta extends js.Object {
  
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
  implicit class PolicyDeltaOps[Self <: PolicyDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindingDeltasVarargs(value: BindingDelta*): Self = this.set("bindingDeltas", js.Array(value :_*))
    
    @scala.inline
    def setBindingDeltas(value: js.Array[BindingDelta]): Self = this.set("bindingDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingDeltas: Self = this.set("bindingDeltas", js.undefined)
  }
}
