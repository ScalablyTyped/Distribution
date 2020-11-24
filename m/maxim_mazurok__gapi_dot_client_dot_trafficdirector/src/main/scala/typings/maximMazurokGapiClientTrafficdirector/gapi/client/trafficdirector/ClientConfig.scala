package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConfig extends js.Object {
  
  /** Node for a particular client. */
  var node: js.UndefOr[Node] = js.native
  
  var xdsConfig: js.UndefOr[js.Array[PerXdsConfig]] = js.native
}
object ClientConfig {
  
  @scala.inline
  def apply(): ClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfig]
  }
  
  @scala.inline
  implicit class ClientConfigOps[Self <: ClientConfig] (val x: Self) extends AnyVal {
    
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
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setXdsConfigVarargs(value: PerXdsConfig*): Self = this.set("xdsConfig", js.Array(value :_*))
    
    @scala.inline
    def setXdsConfig(value: js.Array[PerXdsConfig]): Self = this.set("xdsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXdsConfig: Self = this.set("xdsConfig", js.undefined)
  }
}
