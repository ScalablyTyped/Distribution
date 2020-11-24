package typings.nats.mod

import typings.node.BufferEncoding
import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOpts extends js.Object {
  
  var encoding: js.UndefOr[BufferEncoding] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
  
  var maxPingOut: js.UndefOr[Double] = js.native
  
  var maxReconnectAttempts: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nkey: js.UndefOr[String] = js.native
  
  var noEcho: js.UndefOr[Boolean] = js.native
  
  var noRandomize: js.UndefOr[Boolean] = js.native
  
  var nonceSigner: js.UndefOr[js.Function] = js.native
  
  var pass: js.UndefOr[String] = js.native
  
  var pedantic: js.UndefOr[Boolean] = js.native
  
  var pingInterval: js.UndefOr[Double] = js.native
  
  var preserveBuffers: js.UndefOr[Boolean] = js.native
  
  var reconnect: js.UndefOr[Boolean] = js.native
  
  var reconnectDelayHandler: js.UndefOr[js.Function0[Double]] = js.native
  
  var reconnectJitter: js.UndefOr[Double] = js.native
  
  var reconnectJitterTLS: js.UndefOr[Double] = js.native
  
  var reconnectTimeWait: js.UndefOr[Double] = js.native
  
  var servers: js.UndefOr[js.Array[String]] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var tls: js.UndefOr[Boolean | TlsOptions] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var tokenHandler: js.UndefOr[js.Function0[String]] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var useOldRequestStyle: js.UndefOr[Boolean] = js.native
  
  var user: js.UndefOr[String] = js.native
  
  var userCreds: js.UndefOr[String] = js.native
  
  var userJWT: js.UndefOr[js.Function0[String]] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
  
  var waitOnFirstConnect: js.UndefOr[Boolean] = js.native
  
  var yieldTime: js.UndefOr[Double] = js.native
}
object ClientOpts {
  
  @scala.inline
  def apply(): ClientOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOpts]
  }
  
  @scala.inline
  implicit class ClientOptsOps[Self <: ClientOpts] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setMaxPingOut(value: Double): Self = this.set("maxPingOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPingOut: Self = this.set("maxPingOut", js.undefined)
    
    @scala.inline
    def setMaxReconnectAttempts(value: Double): Self = this.set("maxReconnectAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReconnectAttempts: Self = this.set("maxReconnectAttempts", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNkey(value: String): Self = this.set("nkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNkey: Self = this.set("nkey", js.undefined)
    
    @scala.inline
    def setNoEcho(value: Boolean): Self = this.set("noEcho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEcho: Self = this.set("noEcho", js.undefined)
    
    @scala.inline
    def setNoRandomize(value: Boolean): Self = this.set("noRandomize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRandomize: Self = this.set("noRandomize", js.undefined)
    
    @scala.inline
    def setNonceSigner(value: js.Function): Self = this.set("nonceSigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonceSigner: Self = this.set("nonceSigner", js.undefined)
    
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    
    @scala.inline
    def setPedantic(value: Boolean): Self = this.set("pedantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePedantic: Self = this.set("pedantic", js.undefined)
    
    @scala.inline
    def setPingInterval(value: Double): Self = this.set("pingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingInterval: Self = this.set("pingInterval", js.undefined)
    
    @scala.inline
    def setPreserveBuffers(value: Boolean): Self = this.set("preserveBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveBuffers: Self = this.set("preserveBuffers", js.undefined)
    
    @scala.inline
    def setReconnect(value: Boolean): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    
    @scala.inline
    def setReconnectDelayHandler(value: () => Double): Self = this.set("reconnectDelayHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReconnectDelayHandler: Self = this.set("reconnectDelayHandler", js.undefined)
    
    @scala.inline
    def setReconnectJitter(value: Double): Self = this.set("reconnectJitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectJitter: Self = this.set("reconnectJitter", js.undefined)
    
    @scala.inline
    def setReconnectJitterTLS(value: Double): Self = this.set("reconnectJitterTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectJitterTLS: Self = this.set("reconnectJitterTLS", js.undefined)
    
    @scala.inline
    def setReconnectTimeWait(value: Double): Self = this.set("reconnectTimeWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectTimeWait: Self = this.set("reconnectTimeWait", js.undefined)
    
    @scala.inline
    def setServersVarargs(value: String*): Self = this.set("servers", js.Array(value :_*))
    
    @scala.inline
    def setServers(value: js.Array[String]): Self = this.set("servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServers: Self = this.set("servers", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTls(value: Boolean | TlsOptions): Self = this.set("tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setTokenHandler(value: () => String): Self = this.set("tokenHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTokenHandler: Self = this.set("tokenHandler", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseOldRequestStyle(value: Boolean): Self = this.set("useOldRequestStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOldRequestStyle: Self = this.set("useOldRequestStyle", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setUserCreds(value: String): Self = this.set("userCreds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserCreds: Self = this.set("userCreds", js.undefined)
    
    @scala.inline
    def setUserJWT(value: () => String): Self = this.set("userJWT", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUserJWT: Self = this.set("userJWT", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setWaitOnFirstConnect(value: Boolean): Self = this.set("waitOnFirstConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitOnFirstConnect: Self = this.set("waitOnFirstConnect", js.undefined)
    
    @scala.inline
    def setYieldTime(value: Double): Self = this.set("yieldTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYieldTime: Self = this.set("yieldTime", js.undefined)
  }
}
