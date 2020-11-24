package typings.openfin.clientMod

import typings.openfin.shapesIdentityMod.ProviderIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingInfo extends ProviderIdentity {
  
  var endpointId: String = js.native
}
object RoutingInfo {
  
  @scala.inline
  def apply(endpointId: String, uuid: String): RoutingInfo = {
    val __obj = js.Dynamic.literal(endpointId = endpointId.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingInfo]
  }
  
  @scala.inline
  implicit class RoutingInfoOps[Self <: RoutingInfo] (val x: Self) extends AnyVal {
    
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
    def setEndpointId(value: String): Self = this.set("endpointId", value.asInstanceOf[js.Any])
  }
}
