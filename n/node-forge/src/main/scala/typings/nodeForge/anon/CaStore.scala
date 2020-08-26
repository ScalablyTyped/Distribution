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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaStore extends js.Object {
  var caStore: js.UndefOr[CAStore | js.Array[Certificate]] = js.native
  var cipherSuites: js.UndefOr[js.Array[CipherSuite]] = js.native
  var deflate: js.UndefOr[js.Function1[/* inBytes */ Bytes, Bytes]] = js.native
  var getCertificate: js.UndefOr[
    js.Function2[
      /* conn */ Connection, 
      /* hint */ CertificateRequest | js.Array[String], 
      PEM | js.Array[PEM]
    ]
  ] = js.native
  var getPrivateKey: js.UndefOr[js.Function2[/* conn */ Connection, /* certificate */ Certificate, PEM]] = js.native
  var getSignature: js.UndefOr[
    js.Function3[
      /* conn */ Connection, 
      /* bytes */ Bytes, 
      /* callback */ js.Function2[/* conn */ Connection, /* bytes */ Bytes, Unit], 
      Unit
    ]
  ] = js.native
  var heartbeatReceived: js.UndefOr[js.Function2[/* conn */ Connection, /* payload */ ByteBuffer, Unit]] = js.native
  var inflate: js.UndefOr[js.Function1[/* inBytes */ Bytes, Bytes]] = js.native
  var server: js.UndefOr[Boolean] = js.native
  var sessionCache: js.UndefOr[SessionCache | StringDictionary[Session]] = js.native
  var sessionId: js.UndefOr[Bytes | Null] = js.native
  var verify: js.UndefOr[
    js.Function4[
      /* conn */ Connection, 
      /* verified */ Verified, 
      /* depth */ Double, 
      /* certs */ js.Array[Certificate], 
      Verified
    ]
  ] = js.native
  var verifyClient: js.UndefOr[Boolean] = js.native
  var virtualHost: js.UndefOr[String] = js.native
  def closed(conn: Connection): Unit = js.native
  def connected(conn: Connection): Unit = js.native
  def dataReady(conn: Connection): Unit = js.native
  def error(conn: Connection, error: TLSError): Unit = js.native
  def tlsDataReady(conn: Connection): Unit = js.native
}

object CaStore {
  @scala.inline
  def apply(
    closed: Connection => Unit,
    connected: Connection => Unit,
    dataReady: Connection => Unit,
    error: (Connection, TLSError) => Unit,
    tlsDataReady: Connection => Unit
  ): CaStore = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction1(closed), connected = js.Any.fromFunction1(connected), dataReady = js.Any.fromFunction1(dataReady), error = js.Any.fromFunction2(error), tlsDataReady = js.Any.fromFunction1(tlsDataReady))
    __obj.asInstanceOf[CaStore]
  }
  @scala.inline
  implicit class CaStoreOps[Self <: CaStore] (val x: Self) extends AnyVal {
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
    def setClosed(value: Connection => Unit): Self = this.set("closed", js.Any.fromFunction1(value))
    @scala.inline
    def setConnected(value: Connection => Unit): Self = this.set("connected", js.Any.fromFunction1(value))
    @scala.inline
    def setDataReady(value: Connection => Unit): Self = this.set("dataReady", js.Any.fromFunction1(value))
    @scala.inline
    def setError(value: (Connection, TLSError) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def setTlsDataReady(value: Connection => Unit): Self = this.set("tlsDataReady", js.Any.fromFunction1(value))
    @scala.inline
    def setCaStoreVarargs(value: Certificate*): Self = this.set("caStore", js.Array(value :_*))
    @scala.inline
    def setCaStore(value: CAStore | js.Array[Certificate]): Self = this.set("caStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaStore: Self = this.set("caStore", js.undefined)
    @scala.inline
    def setCipherSuitesVarargs(value: CipherSuite*): Self = this.set("cipherSuites", js.Array(value :_*))
    @scala.inline
    def setCipherSuites(value: js.Array[CipherSuite]): Self = this.set("cipherSuites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCipherSuites: Self = this.set("cipherSuites", js.undefined)
    @scala.inline
    def setDeflate(value: /* inBytes */ Bytes => Bytes): Self = this.set("deflate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeflate: Self = this.set("deflate", js.undefined)
    @scala.inline
    def setGetCertificate(
      value: (/* conn */ Connection, /* hint */ CertificateRequest | js.Array[String]) => PEM | js.Array[PEM]
    ): Self = this.set("getCertificate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetCertificate: Self = this.set("getCertificate", js.undefined)
    @scala.inline
    def setGetPrivateKey(value: (/* conn */ Connection, /* certificate */ Certificate) => PEM): Self = this.set("getPrivateKey", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetPrivateKey: Self = this.set("getPrivateKey", js.undefined)
    @scala.inline
    def setGetSignature(
      value: (/* conn */ Connection, /* bytes */ Bytes, /* callback */ js.Function2[/* conn */ Connection, /* bytes */ Bytes, Unit]) => Unit
    ): Self = this.set("getSignature", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetSignature: Self = this.set("getSignature", js.undefined)
    @scala.inline
    def setHeartbeatReceived(value: (/* conn */ Connection, /* payload */ ByteBuffer) => Unit): Self = this.set("heartbeatReceived", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHeartbeatReceived: Self = this.set("heartbeatReceived", js.undefined)
    @scala.inline
    def setInflate(value: /* inBytes */ Bytes => Bytes): Self = this.set("inflate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInflate: Self = this.set("inflate", js.undefined)
    @scala.inline
    def setServer(value: Boolean): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    @scala.inline
    def setSessionCache(value: SessionCache | StringDictionary[Session]): Self = this.set("sessionCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionCache: Self = this.set("sessionCache", js.undefined)
    @scala.inline
    def setSessionId(value: Bytes): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    @scala.inline
    def setSessionIdNull: Self = this.set("sessionId", null)
    @scala.inline
    def setVerify(
      value: (/* conn */ Connection, /* verified */ Verified, /* depth */ Double, /* certs */ js.Array[Certificate]) => Verified
    ): Self = this.set("verify", js.Any.fromFunction4(value))
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
    @scala.inline
    def setVerifyClient(value: Boolean): Self = this.set("verifyClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifyClient: Self = this.set("verifyClient", js.undefined)
    @scala.inline
    def setVirtualHost(value: String): Self = this.set("virtualHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualHost: Self = this.set("virtualHost", js.undefined)
  }
  
}

