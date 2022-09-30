package typings.mongodb.mod

import typings.mongodb.mongodbStrings.LessthansignmonitorGreaterthansign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Extract<'host' | 'port' | 'path' | 'socket' | 'checkServerIdentity' | 'servername' | 'session' | 'minDHSize' | 'lookup' | 'timeout' | 'pskCallback', 'ALPNProtocols' | 'ca' | 'cert' | 'checkServerIdentity' | 'ciphers' | 'crl' | 'ecdhCurve' | 'key' | 'minDHSize' | 'passphrase' | 'pfx' | 'rejectUnauthorized' | 'secureContext' | 'secureProtocol' | 'servername' | 'session'> ]: node.tls.ConnectionOptions[P]}
- Dropped {[ P in std.Extract<'isServer' | 'server' | 'session' | 'requestOCSP', 'ALPNProtocols' | 'ca' | 'cert' | 'checkServerIdentity' | 'ciphers' | 'crl' | 'ecdhCurve' | 'key' | 'minDHSize' | 'passphrase' | 'pfx' | 'rejectUnauthorized' | 'secureContext' | 'secureProtocol' | 'servername' | 'session'> ]: node.tls.TLSSocketOptions[P]}
- Dropped {[ P in 'family' | 'hints' | 'localAddress' | 'localPort' | 'lookup' ]: node.net.TcpNetConnectOpts[P]} */ trait ConnectionOptions
  extends StObject
     with StreamDescriptionOptions
     with ProxyOptions {
  
  var autoEncrypter: js.UndefOr[AutoEncrypter] = js.undefined
  
  var cancellationToken: js.UndefOr[CancellationToken] = js.undefined
  
  var connectTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  
  /* Excluded from this release type: connectionType */
  var credentials: js.UndefOr[MongoCredentials] = js.undefined
  
  var generation: scala.Double
  
  var hostAddress: HostAddress
  
  var id: scala.Double | LessthansignmonitorGreaterthansign
  
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  var keepAliveInitialDelay: js.UndefOr[scala.Double] = js.undefined
  
  var metadata: ClientMetadata
  
  var monitorCommands: Boolean
  
  var noDelay: js.UndefOr[Boolean] = js.undefined
  
  var serverApi: js.UndefOr[ServerApi] = js.undefined
  
  var socketTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  
  var tls: Boolean
}
object ConnectionOptions {
  
  inline def apply(
    generation: scala.Double,
    hostAddress: HostAddress,
    id: scala.Double | LessthansignmonitorGreaterthansign,
    loadBalanced: Boolean,
    metadata: ClientMetadata,
    monitorCommands: Boolean,
    tls: Boolean
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal(generation = generation.asInstanceOf[js.Any], hostAddress = hostAddress.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadBalanced = loadBalanced.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], monitorCommands = monitorCommands.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  extension [Self <: ConnectionOptions](x: Self) {
    
    inline def setAutoEncrypter(value: AutoEncrypter): Self = StObject.set(x, "autoEncrypter", value.asInstanceOf[js.Any])
    
    inline def setAutoEncrypterUndefined: Self = StObject.set(x, "autoEncrypter", js.undefined)
    
    inline def setCancellationToken(value: CancellationToken): Self = StObject.set(x, "cancellationToken", value.asInstanceOf[js.Any])
    
    inline def setCancellationTokenUndefined: Self = StObject.set(x, "cancellationToken", js.undefined)
    
    inline def setConnectTimeoutMS(value: scala.Double): Self = StObject.set(x, "connectTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def setConnectTimeoutMSUndefined: Self = StObject.set(x, "connectTimeoutMS", js.undefined)
    
    inline def setCredentials(value: MongoCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setGeneration(value: scala.Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setHostAddress(value: HostAddress): Self = StObject.set(x, "hostAddress", value.asInstanceOf[js.Any])
    
    inline def setId(value: scala.Double | LessthansignmonitorGreaterthansign): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveInitialDelay(value: scala.Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setMetadata(value: ClientMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMonitorCommands(value: Boolean): Self = StObject.set(x, "monitorCommands", value.asInstanceOf[js.Any])
    
    inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
    
    inline def setServerApi(value: ServerApi): Self = StObject.set(x, "serverApi", value.asInstanceOf[js.Any])
    
    inline def setServerApiUndefined: Self = StObject.set(x, "serverApi", js.undefined)
    
    inline def setSocketTimeoutMS(value: scala.Double): Self = StObject.set(x, "socketTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def setSocketTimeoutMSUndefined: Self = StObject.set(x, "socketTimeoutMS", js.undefined)
    
    inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
  }
}
