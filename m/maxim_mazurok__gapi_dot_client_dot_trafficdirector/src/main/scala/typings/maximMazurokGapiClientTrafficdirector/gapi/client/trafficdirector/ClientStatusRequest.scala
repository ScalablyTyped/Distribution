package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientStatusRequest extends js.Object {
  
  /** Management server can use these match criteria to identify clients. The match follows OR semantics. */
  var nodeMatchers: js.UndefOr[js.Array[NodeMatcher]] = js.native
}
object ClientStatusRequest {
  
  @scala.inline
  def apply(): ClientStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientStatusRequest]
  }
  
  @scala.inline
  implicit class ClientStatusRequestOps[Self <: ClientStatusRequest] (val x: Self) extends AnyVal {
    
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
    def setNodeMatchersVarargs(value: NodeMatcher*): Self = this.set("nodeMatchers", js.Array(value :_*))
    
    @scala.inline
    def setNodeMatchers(value: js.Array[NodeMatcher]): Self = this.set("nodeMatchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeMatchers: Self = this.set("nodeMatchers", js.undefined)
  }
}
