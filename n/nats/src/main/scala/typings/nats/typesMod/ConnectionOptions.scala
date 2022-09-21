package typings.nats.typesMod

import typings.nats.authenticatorMod.Auth
import typings.nats.authenticatorMod.Authenticator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionOptions extends StObject {
  
  var authenticator: js.UndefOr[Authenticator] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var ignoreClusterUpdates: js.UndefOr[Boolean] = js.undefined
  
  var inboxPrefix: js.UndefOr[String] = js.undefined
  
  var maxPingOut: js.UndefOr[Double] = js.undefined
  
  var maxReconnectAttempts: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noEcho: js.UndefOr[Boolean] = js.undefined
  
  var noRandomize: js.UndefOr[Boolean] = js.undefined
  
  var pass: js.UndefOr[String] = js.undefined
  
  var pedantic: js.UndefOr[Boolean] = js.undefined
  
  var pingInterval: js.UndefOr[Double] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var reconnect: js.UndefOr[Boolean] = js.undefined
  
  var reconnectDelayHandler: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var reconnectJitter: js.UndefOr[Double] = js.undefined
  
  var reconnectJitterTLS: js.UndefOr[Double] = js.undefined
  
  var reconnectTimeWait: js.UndefOr[Double] = js.undefined
  
  var servers: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var tls: js.UndefOr[TlsOptions] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  var waitOnFirstConnect: js.UndefOr[Boolean] = js.undefined
}
object ConnectionOptions {
  
  inline def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  extension [Self <: ConnectionOptions](x: Self) {
    
    inline def setAuthenticator(value: /* nonce */ js.UndefOr[String] => Auth): Self = StObject.set(x, "authenticator", js.Any.fromFunction1(value))
    
    inline def setAuthenticatorUndefined: Self = StObject.set(x, "authenticator", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setIgnoreClusterUpdates(value: Boolean): Self = StObject.set(x, "ignoreClusterUpdates", value.asInstanceOf[js.Any])
    
    inline def setIgnoreClusterUpdatesUndefined: Self = StObject.set(x, "ignoreClusterUpdates", js.undefined)
    
    inline def setInboxPrefix(value: String): Self = StObject.set(x, "inboxPrefix", value.asInstanceOf[js.Any])
    
    inline def setInboxPrefixUndefined: Self = StObject.set(x, "inboxPrefix", js.undefined)
    
    inline def setMaxPingOut(value: Double): Self = StObject.set(x, "maxPingOut", value.asInstanceOf[js.Any])
    
    inline def setMaxPingOutUndefined: Self = StObject.set(x, "maxPingOut", js.undefined)
    
    inline def setMaxReconnectAttempts(value: Double): Self = StObject.set(x, "maxReconnectAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaxReconnectAttemptsUndefined: Self = StObject.set(x, "maxReconnectAttempts", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoEcho(value: Boolean): Self = StObject.set(x, "noEcho", value.asInstanceOf[js.Any])
    
    inline def setNoEchoUndefined: Self = StObject.set(x, "noEcho", js.undefined)
    
    inline def setNoRandomize(value: Boolean): Self = StObject.set(x, "noRandomize", value.asInstanceOf[js.Any])
    
    inline def setNoRandomizeUndefined: Self = StObject.set(x, "noRandomize", js.undefined)
    
    inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
    
    inline def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
    
    inline def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
    
    inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
    
    inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
    
    inline def setReconnectDelayHandler(value: () => Double): Self = StObject.set(x, "reconnectDelayHandler", js.Any.fromFunction0(value))
    
    inline def setReconnectDelayHandlerUndefined: Self = StObject.set(x, "reconnectDelayHandler", js.undefined)
    
    inline def setReconnectJitter(value: Double): Self = StObject.set(x, "reconnectJitter", value.asInstanceOf[js.Any])
    
    inline def setReconnectJitterTLS(value: Double): Self = StObject.set(x, "reconnectJitterTLS", value.asInstanceOf[js.Any])
    
    inline def setReconnectJitterTLSUndefined: Self = StObject.set(x, "reconnectJitterTLS", js.undefined)
    
    inline def setReconnectJitterUndefined: Self = StObject.set(x, "reconnectJitter", js.undefined)
    
    inline def setReconnectTimeWait(value: Double): Self = StObject.set(x, "reconnectTimeWait", value.asInstanceOf[js.Any])
    
    inline def setReconnectTimeWaitUndefined: Self = StObject.set(x, "reconnectTimeWait", js.undefined)
    
    inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
    
    inline def setServers(value: js.Array[String] | String): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    inline def setServersVarargs(value: String*): Self = StObject.set(x, "servers", js.Array(value*))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTls(value: TlsOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWaitOnFirstConnect(value: Boolean): Self = StObject.set(x, "waitOnFirstConnect", value.asInstanceOf[js.Any])
    
    inline def setWaitOnFirstConnectUndefined: Self = StObject.set(x, "waitOnFirstConnect", js.undefined)
  }
}
