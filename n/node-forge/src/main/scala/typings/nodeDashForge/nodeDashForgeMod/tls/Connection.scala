package typings.nodeDashForge.nodeDashForgeMod.tls

import typings.nodeDashForge.Anon_Current
import typings.nodeDashForge.nodeDashForgeMod.Bytes
import typings.nodeDashForge.nodeDashForgeMod.pki.CAStore
import typings.nodeDashForge.nodeDashForgeMod.pki.Certificate
import typings.nodeDashForge.nodeDashForgeMod.pki.PEM
import typings.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var caStore: CAStore = js.native
  var cipherSuites: js.Array[CipherSuite] = js.native
  var data: ByteBuffer = js.native
  var deflate: (js.Function1[/* inBytes */ Bytes, Bytes]) | Null = js.native
  var entity: ConnectionEnd = js.native
  var expect: Double = js.native
  var fail: Boolean = js.native
  var fragmented: Record | Null = js.native
  var getCertificate: (js.Function2[
    /* conn */ this.type, 
    /* hint */ CertificateRequest | js.Array[String], 
    PEM | js.Array[PEM]
  ]) | Null = js.native
  var getPrivateKey: (js.Function2[/* conn */ this.type, /* certificate */ Certificate, PEM]) | Null = js.native
  var getSignature: (js.Function3[
    /* conn */ this.type, 
    /* bytes */ Bytes, 
    /* callback */ js.Function2[/* conn */ this.type, /* bytes */ Bytes, Unit], 
    Unit
  ]) | Null = js.native
  var handshakes: Double = js.native
  var handshaking: Boolean = js.native
  var heartbeatReceived: js.UndefOr[js.Function2[/* conn */ this.type, /* payload */ ByteBuffer, Unit]] = js.native
  var inflate: (js.Function1[/* inBytes */ Bytes, Bytes]) | Null = js.native
  var input: ByteBuffer = js.native
  var isConnected: Boolean = js.native
  var open: Boolean = js.native
  var peerCertificate: Certificate | Null = js.native
  var record: Record | Null = js.native
  var records: js.Array[Record] = js.native
  var session: Session | Null = js.native
  var sessionCache: SessionCache | Null = js.native
  var sessionId: Bytes | Null = js.native
  var state: Anon_Current = js.native
  var tlsData: ByteBuffer = js.native
  var verifyClient: Boolean = js.native
  var version: ProtocolVersion = js.native
  var virtualHost: String | Null = js.native
  def close(): Connection = js.native
  def close(clearFail: Boolean): Connection = js.native
  def closed(conn: Connection): Unit = js.native
  def connected(conn: Connection): Unit = js.native
  def dataReady(conn: Connection): Unit = js.native
  def error(conn: Connection, error: TLSError): Unit = js.native
  def handshake(): Unit = js.native
  def handshake(sessionId: Bytes): Unit = js.native
  def prepare(data: Bytes): Boolean = js.native
  def prepareHeartbeatRequest(payload: Bytes): Boolean = js.native
  def prepareHeartbeatRequest(payload: Bytes, payloadLength: Double): Boolean = js.native
  def prepareHeartbeatRequest(payload: ByteBuffer): Boolean = js.native
  def prepareHeartbeatRequest(payload: ByteBuffer, payloadLength: Double): Boolean = js.native
  def process(data: Bytes): Double = js.native
  def reset(): Unit = js.native
  def reset(clearFail: Boolean): Unit = js.native
  def tlsDataReady(conn: Connection): Unit = js.native
  def verify(conn: Connection, verified: Verified, depth: Double, certs: js.Array[Certificate]): Verified = js.native
}

