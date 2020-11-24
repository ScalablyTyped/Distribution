package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RRSetRoutingPolicyWrrPolicy extends js.Object {
  
  var items: js.UndefOr[js.Array[RRSetRoutingPolicyWrrPolicyWrrPolicyItem]] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object RRSetRoutingPolicyWrrPolicy {
  
  @scala.inline
  def apply(): RRSetRoutingPolicyWrrPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RRSetRoutingPolicyWrrPolicy]
  }
  
  @scala.inline
  implicit class RRSetRoutingPolicyWrrPolicyOps[Self <: RRSetRoutingPolicyWrrPolicy] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: RRSetRoutingPolicyWrrPolicyWrrPolicyItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[RRSetRoutingPolicyWrrPolicyWrrPolicyItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
