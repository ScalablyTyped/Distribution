package typings.ndnJs.faceMod

import typings.ndnJs.transportMod.Transport
import typings.ndnJs.transportMod.TransportConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceCtorOptions extends js.Object {
  
  var connectionInfo: js.UndefOr[TransportConnectionInfo | Null] = js.native
  
  var getConnectionInfo: js.UndefOr[js.Function0[TransportConnectionInfo]] = js.native
  
  var getTransport: js.UndefOr[js.Function0[Transport]] = js.native
  
  var host: js.UndefOr[String | Null] = js.native
  
  var port: js.UndefOr[Double | Null] = js.native
}
object FaceCtorOptions {
  
  @scala.inline
  def apply(): FaceCtorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceCtorOptions]
  }
  
  @scala.inline
  implicit class FaceCtorOptionsOps[Self <: FaceCtorOptions] (val x: Self) extends AnyVal {
    
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
    def setConnectionInfo(value: TransportConnectionInfo): Self = this.set("connectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionInfo: Self = this.set("connectionInfo", js.undefined)
    
    @scala.inline
    def setConnectionInfoNull: Self = this.set("connectionInfo", null)
    
    @scala.inline
    def setGetConnectionInfo(value: () => TransportConnectionInfo): Self = this.set("getConnectionInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetConnectionInfo: Self = this.set("getConnectionInfo", js.undefined)
    
    @scala.inline
    def setGetTransport(value: () => Transport): Self = this.set("getTransport", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTransport: Self = this.set("getTransport", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostNull: Self = this.set("host", null)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPortNull: Self = this.set("port", null)
  }
}
