package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallRoute extends js.Object {
  
  // The identity that was resolved to in the call.
  var `final`: js.UndefOr[IdentitySet] = js.native
  
  // The identity that was originally used in the call.
  var original: js.UndefOr[IdentitySet] = js.native
  
  // Possible values are: forwarded, lookup, selfFork.
  var routingType: js.UndefOr[RoutingType] = js.native
}
object CallRoute {
  
  @scala.inline
  def apply(): CallRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallRoute]
  }
  
  @scala.inline
  implicit class CallRouteOps[Self <: CallRoute] (val x: Self) extends AnyVal {
    
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
    def setFinal(value: IdentitySet): Self = this.set("final", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinal: Self = this.set("final", js.undefined)
    
    @scala.inline
    def setOriginal(value: IdentitySet): Self = this.set("original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginal: Self = this.set("original", js.undefined)
    
    @scala.inline
    def setRoutingType(value: RoutingType): Self = this.set("routingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingType: Self = this.set("routingType", js.undefined)
  }
}
