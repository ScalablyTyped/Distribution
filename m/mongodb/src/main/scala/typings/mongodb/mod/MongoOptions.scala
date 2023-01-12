package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof mongodb.anon.PickMongoClientOptionsaut ]: -? mongodb.anon.PickMongoClientOptionsaut[P]}
- Dropped {[ P in std.Extract<'host' | 'port' | 'path' | 'socket' | 'checkServerIdentity' | 'servername' | 'session' | 'minDHSize' | 'lookup' | 'timeout' | 'pskCallback', 'ALPNProtocols' | 'ca' | 'cert' | 'checkServerIdentity' | 'ciphers' | 'crl' | 'ecdhCurve' | 'key' | 'minDHSize' | 'passphrase' | 'pfx' | 'rejectUnauthorized' | 'secureContext' | 'secureProtocol' | 'servername' | 'session'> ]: node.tls.ConnectionOptions[P]}
- Dropped {[ P in std.Extract<'isServer' | 'server' | 'session' | 'requestOCSP', 'ALPNProtocols' | 'ca' | 'cert' | 'checkServerIdentity' | 'ciphers' | 'crl' | 'ecdhCurve' | 'key' | 'minDHSize' | 'passphrase' | 'pfx' | 'rejectUnauthorized' | 'secureContext' | 'secureProtocol' | 'servername' | 'session'> ]: node.tls.TLSSocketOptions[P]}
- Dropped {[ P in 'family' | 'hints' | 'localAddress' | 'localPort' | 'lookup' ]: node.net.TcpNetConnectOpts[P]} */ trait MongoOptions extends StObject {
  
  var autoEncrypter: js.UndefOr[AutoEncrypter] = js.undefined
  
  var compressors: js.Array[CompressorName]
  
  var credentials: js.UndefOr[MongoCredentials] = js.undefined
  
  var dbName: String
  
  var hosts: js.Array[HostAddress]
  
  var loadBalanced: Boolean
  
  var metadata: ClientMetadata
  
  var proxyHost: js.UndefOr[String] = js.undefined
  
  var proxyPassword: js.UndefOr[String] = js.undefined
  
  var proxyPort: js.UndefOr[scala.Double] = js.undefined
  
  var proxyUsername: js.UndefOr[String] = js.undefined
  
  var readConcern: ReadConcern
  
  var readPreference: ReadPreference
  
  var serverApi: ServerApi
  
  var srvHost: js.UndefOr[String] = js.undefined
  
  /* Excluded from this release type: connectionType */
  /* Excluded from this release type: encrypter */
  /* Excluded from this release type: userSpecifiedAuthSource */
  /* Excluded from this release type: userSpecifiedReplicaSet */
  /**
    * # NOTE ABOUT TLS Options
    *
    * If set TLS enabled, equivalent to setting the ssl option.
    *
    * ### Additional options:
    *
    * |    nodejs option     | MongoDB equivalent                                       | type                                   |
    * |:---------------------|--------------------------------------------------------- |:---------------------------------------|
    * | `ca`                 | `sslCA`, `tlsCAFile`                                     | `string \| Buffer \| Buffer[]`         |
    * | `crl`                | `sslCRL`                                                 | `string \| Buffer \| Buffer[]`         |
    * | `cert`               | `sslCert`, `tlsCertificateFile`, `tlsCertificateKeyFile` | `string \| Buffer \| Buffer[]`         |
    * | `key`                | `sslKey`, `tlsCertificateKeyFile`                        | `string \| Buffer \| KeyObject[]`      |
    * | `passphrase`         | `sslPass`, `tlsCertificateKeyFilePassword`               | `string`                               |
    * | `rejectUnauthorized` | `sslValidate`                                            | `boolean`                              |
    *
    */
  var tls: Boolean
  
  var writeConcern: WriteConcern
}
object MongoOptions {
  
  inline def apply(
    compressors: js.Array[CompressorName],
    dbName: String,
    hosts: js.Array[HostAddress],
    loadBalanced: Boolean,
    metadata: ClientMetadata,
    readConcern: ReadConcern,
    readPreference: ReadPreference,
    serverApi: ServerApi,
    tls: Boolean,
    writeConcern: WriteConcern
  ): MongoOptions = {
    val __obj = js.Dynamic.literal(compressors = compressors.asInstanceOf[js.Any], dbName = dbName.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], loadBalanced = loadBalanced.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], readConcern = readConcern.asInstanceOf[js.Any], readPreference = readPreference.asInstanceOf[js.Any], serverApi = serverApi.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any], writeConcern = writeConcern.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MongoOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoEncrypter(value: AutoEncrypter): Self = StObject.set(x, "autoEncrypter", value.asInstanceOf[js.Any])
    
    inline def setAutoEncrypterUndefined: Self = StObject.set(x, "autoEncrypter", js.undefined)
    
    inline def setCompressors(value: js.Array[CompressorName]): Self = StObject.set(x, "compressors", value.asInstanceOf[js.Any])
    
    inline def setCompressorsVarargs(value: CompressorName*): Self = StObject.set(x, "compressors", js.Array(value*))
    
    inline def setCredentials(value: MongoCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setHosts(value: js.Array[HostAddress]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsVarargs(value: HostAddress*): Self = StObject.set(x, "hosts", js.Array(value*))
    
    inline def setLoadBalanced(value: Boolean): Self = StObject.set(x, "loadBalanced", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ClientMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setProxyHost(value: String): Self = StObject.set(x, "proxyHost", value.asInstanceOf[js.Any])
    
    inline def setProxyHostUndefined: Self = StObject.set(x, "proxyHost", js.undefined)
    
    inline def setProxyPassword(value: String): Self = StObject.set(x, "proxyPassword", value.asInstanceOf[js.Any])
    
    inline def setProxyPasswordUndefined: Self = StObject.set(x, "proxyPassword", js.undefined)
    
    inline def setProxyPort(value: scala.Double): Self = StObject.set(x, "proxyPort", value.asInstanceOf[js.Any])
    
    inline def setProxyPortUndefined: Self = StObject.set(x, "proxyPort", js.undefined)
    
    inline def setProxyUsername(value: String): Self = StObject.set(x, "proxyUsername", value.asInstanceOf[js.Any])
    
    inline def setProxyUsernameUndefined: Self = StObject.set(x, "proxyUsername", js.undefined)
    
    inline def setReadConcern(value: ReadConcern): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    inline def setReadPreference(value: ReadPreference): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setServerApi(value: ServerApi): Self = StObject.set(x, "serverApi", value.asInstanceOf[js.Any])
    
    inline def setSrvHost(value: String): Self = StObject.set(x, "srvHost", value.asInstanceOf[js.Any])
    
    inline def setSrvHostUndefined: Self = StObject.set(x, "srvHost", js.undefined)
    
    inline def setTls(value: Boolean): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setWriteConcern(value: WriteConcern): Self = StObject.set(x, "writeConcern", value.asInstanceOf[js.Any])
  }
}
