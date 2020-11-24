package typings.nsqjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionConfigOptions extends js.Object {
  
  var authSecret: js.UndefOr[String] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var deflate: js.UndefOr[Boolean] = js.native
  
  var deflateLevel: js.UndefOr[Double] = js.native
  
  var heartbeatInterval: js.UndefOr[Double] = js.native
  
  var idleTimeout: js.UndefOr[Double] = js.native
  
  var maxInFlight: js.UndefOr[Double] = js.native
  
  var messageTimeout: js.UndefOr[Double] = js.native
  
  var outputBufferSize: js.UndefOr[Double] = js.native
  
  var outputBufferTimeout: js.UndefOr[Double] = js.native
  
  var requeueDelay: js.UndefOr[Double] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
  
  var snappy: js.UndefOr[Boolean] = js.native
  
  var tls: js.UndefOr[Boolean] = js.native
  
  var tlsVerification: js.UndefOr[Boolean] = js.native
}
object ConnectionConfigOptions {
  
  @scala.inline
  def apply(): ConnectionConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionConfigOptions]
  }
  
  @scala.inline
  implicit class ConnectionConfigOptionsOps[Self <: ConnectionConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthSecret(value: String): Self = this.set("authSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthSecret: Self = this.set("authSecret", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setDeflate(value: Boolean): Self = this.set("deflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeflate: Self = this.set("deflate", js.undefined)
    
    @scala.inline
    def setDeflateLevel(value: Double): Self = this.set("deflateLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeflateLevel: Self = this.set("deflateLevel", js.undefined)
    
    @scala.inline
    def setHeartbeatInterval(value: Double): Self = this.set("heartbeatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatInterval: Self = this.set("heartbeatInterval", js.undefined)
    
    @scala.inline
    def setIdleTimeout(value: Double): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    
    @scala.inline
    def setMaxInFlight(value: Double): Self = this.set("maxInFlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInFlight: Self = this.set("maxInFlight", js.undefined)
    
    @scala.inline
    def setMessageTimeout(value: Double): Self = this.set("messageTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageTimeout: Self = this.set("messageTimeout", js.undefined)
    
    @scala.inline
    def setOutputBufferSize(value: Double): Self = this.set("outputBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputBufferSize: Self = this.set("outputBufferSize", js.undefined)
    
    @scala.inline
    def setOutputBufferTimeout(value: Double): Self = this.set("outputBufferTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputBufferTimeout: Self = this.set("outputBufferTimeout", js.undefined)
    
    @scala.inline
    def setRequeueDelay(value: Double): Self = this.set("requeueDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequeueDelay: Self = this.set("requeueDelay", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setSnappy(value: Boolean): Self = this.set("snappy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnappy: Self = this.set("snappy", js.undefined)
    
    @scala.inline
    def setTls(value: Boolean): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    
    @scala.inline
    def setTlsVerification(value: Boolean): Self = this.set("tlsVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsVerification: Self = this.set("tlsVerification", js.undefined)
  }
}
