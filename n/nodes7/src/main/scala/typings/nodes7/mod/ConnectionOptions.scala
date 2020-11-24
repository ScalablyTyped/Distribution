package typings.nodes7.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends js.Object {
  
  var host: js.UndefOr[String] = js.native
  
  var localTSAP: js.UndefOr[Double] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var rack: js.UndefOr[Double] = js.native
  
  var remoteTSAP: js.UndefOr[Double] = js.native
  
  var slot: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setLocalTSAP(value: Double): Self = this.set("localTSAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalTSAP: Self = this.set("localTSAP", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRack(value: Double): Self = this.set("rack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRack: Self = this.set("rack", js.undefined)
    
    @scala.inline
    def setRemoteTSAP(value: Double): Self = this.set("remoteTSAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteTSAP: Self = this.set("remoteTSAP", js.undefined)
    
    @scala.inline
    def setSlot(value: Double): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
