package typings.nodeForge.anon

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.pki.CAStore
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.pki.PEM
import typings.nodeForge.mod.tls.CertificateRequest
import typings.nodeForge.mod.tls.CipherSuite
import typings.nodeForge.mod.tls.Connection
import typings.nodeForge.mod.tls.Session
import typings.nodeForge.mod.tls.SessionCache
import typings.nodeForge.mod.tls.TLSError
import typings.nodeForge.mod.tls.Verified
import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaStore extends StObject {
  
  var caStore: js.UndefOr[CAStore | js.Array[Certificate]] = js.undefined
  
  var cipherSuites: js.UndefOr[js.Array[CipherSuite]] = js.undefined
  
  def closed(conn: Connection): Unit
  
  def connected(conn: Connection): Unit
  
  def dataReady(conn: Connection): Unit
  
  var deflate: js.UndefOr[js.Function1[/* inBytes */ Bytes, Bytes]] = js.undefined
  
  def error(conn: Connection, error: TLSError): Unit
  
  var getCertificate: js.UndefOr[
    js.Function2[
      /* conn */ Connection, 
      /* hint */ CertificateRequest | js.Array[String], 
      PEM | js.Array[PEM]
    ]
  ] = js.undefined
  
  var getPrivateKey: js.UndefOr[js.Function2[/* conn */ Connection, /* certificate */ Certificate, PEM]] = js.undefined
  
  var getSignature: js.UndefOr[
    js.Function3[
      /* conn */ Connection, 
      /* bytes */ Bytes, 
      /* callback */ js.Function2[/* conn */ Connection, /* bytes */ Bytes, Unit], 
      Unit
    ]
  ] = js.undefined
  
  var heartbeatReceived: js.UndefOr[js.Function2[/* conn */ Connection, /* payload */ ByteBuffer, Unit]] = js.undefined
  
  var inflate: js.UndefOr[js.Function1[/* inBytes */ Bytes, Bytes]] = js.undefined
  
  var server: js.UndefOr[Boolean] = js.undefined
  
  var sessionCache: js.UndefOr[SessionCache | StringDictionary[Session]] = js.undefined
  
  var sessionId: js.UndefOr[Bytes | Null] = js.undefined
  
  def tlsDataReady(conn: Connection): Unit
  
  var verify: js.UndefOr[
    js.Function4[
      /* conn */ Connection, 
      /* verified */ Verified, 
      /* depth */ Double, 
      /* certs */ js.Array[Certificate], 
      Verified
    ]
  ] = js.undefined
  
  var verifyClient: js.UndefOr[Boolean] = js.undefined
  
  var virtualHost: js.UndefOr[String] = js.undefined
}
object CaStore {
  
  inline def apply(
    closed: Connection => Unit,
    connected: Connection => Unit,
    dataReady: Connection => Unit,
    error: (Connection, TLSError) => Unit,
    tlsDataReady: Connection => Unit
  ): CaStore = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction1(closed), connected = js.Any.fromFunction1(connected), dataReady = js.Any.fromFunction1(dataReady), error = js.Any.fromFunction2(error), tlsDataReady = js.Any.fromFunction1(tlsDataReady))
    __obj.asInstanceOf[CaStore]
  }
  
  extension [Self <: CaStore](x: Self) {
    
    inline def setCaStore(value: CAStore | js.Array[Certificate]): Self = StObject.set(x, "caStore", value.asInstanceOf[js.Any])
    
    inline def setCaStoreUndefined: Self = StObject.set(x, "caStore", js.undefined)
    
    inline def setCaStoreVarargs(value: Certificate*): Self = StObject.set(x, "caStore", js.Array(value*))
    
    inline def setCipherSuites(value: js.Array[CipherSuite]): Self = StObject.set(x, "cipherSuites", value.asInstanceOf[js.Any])
    
    inline def setCipherSuitesUndefined: Self = StObject.set(x, "cipherSuites", js.undefined)
    
    inline def setCipherSuitesVarargs(value: CipherSuite*): Self = StObject.set(x, "cipherSuites", js.Array(value*))
    
    inline def setClosed(value: Connection => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
    
    inline def setConnected(value: Connection => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
    
    inline def setDataReady(value: Connection => Unit): Self = StObject.set(x, "dataReady", js.Any.fromFunction1(value))
    
    inline def setDeflate(value: /* inBytes */ Bytes => Bytes): Self = StObject.set(x, "deflate", js.Any.fromFunction1(value))
    
    inline def setDeflateUndefined: Self = StObject.set(x, "deflate", js.undefined)
    
    inline def setError(value: (Connection, TLSError) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    inline def setGetCertificate(
      value: (/* conn */ Connection, /* hint */ CertificateRequest | js.Array[String]) => PEM | js.Array[PEM]
    ): Self = StObject.set(x, "getCertificate", js.Any.fromFunction2(value))
    
    inline def setGetCertificateUndefined: Self = StObject.set(x, "getCertificate", js.undefined)
    
    inline def setGetPrivateKey(value: (/* conn */ Connection, /* certificate */ Certificate) => PEM): Self = StObject.set(x, "getPrivateKey", js.Any.fromFunction2(value))
    
    inline def setGetPrivateKeyUndefined: Self = StObject.set(x, "getPrivateKey", js.undefined)
    
    inline def setGetSignature(
      value: (/* conn */ Connection, /* bytes */ Bytes, /* callback */ js.Function2[/* conn */ Connection, /* bytes */ Bytes, Unit]) => Unit
    ): Self = StObject.set(x, "getSignature", js.Any.fromFunction3(value))
    
    inline def setGetSignatureUndefined: Self = StObject.set(x, "getSignature", js.undefined)
    
    inline def setHeartbeatReceived(value: (/* conn */ Connection, /* payload */ ByteBuffer) => Unit): Self = StObject.set(x, "heartbeatReceived", js.Any.fromFunction2(value))
    
    inline def setHeartbeatReceivedUndefined: Self = StObject.set(x, "heartbeatReceived", js.undefined)
    
    inline def setInflate(value: /* inBytes */ Bytes => Bytes): Self = StObject.set(x, "inflate", js.Any.fromFunction1(value))
    
    inline def setInflateUndefined: Self = StObject.set(x, "inflate", js.undefined)
    
    inline def setServer(value: Boolean): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setSessionCache(value: SessionCache | StringDictionary[Session]): Self = StObject.set(x, "sessionCache", value.asInstanceOf[js.Any])
    
    inline def setSessionCacheUndefined: Self = StObject.set(x, "sessionCache", js.undefined)
    
    inline def setSessionId(value: Bytes): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setTlsDataReady(value: Connection => Unit): Self = StObject.set(x, "tlsDataReady", js.Any.fromFunction1(value))
    
    inline def setVerify(
      value: (/* conn */ Connection, /* verified */ Verified, /* depth */ Double, /* certs */ js.Array[Certificate]) => Verified
    ): Self = StObject.set(x, "verify", js.Any.fromFunction4(value))
    
    inline def setVerifyClient(value: Boolean): Self = StObject.set(x, "verifyClient", value.asInstanceOf[js.Any])
    
    inline def setVerifyClientUndefined: Self = StObject.set(x, "verifyClient", js.undefined)
    
    inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    
    inline def setVirtualHost(value: String): Self = StObject.set(x, "virtualHost", value.asInstanceOf[js.Any])
    
    inline def setVirtualHostUndefined: Self = StObject.set(x, "virtualHost", js.undefined)
  }
}
