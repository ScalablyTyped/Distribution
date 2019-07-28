package typings.nodeDashForge.nodeDashForgeMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashForge.Anon_Bytes
import typings.nodeDashForge.Anon_Current
import typings.nodeDashForge.nodeDashForgeMod.mdNs.MessageDigest
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.CAStore
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.Certificate
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.PEM
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.Alert
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Level
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.BulkCipherAlgorithm
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.CertificateRequest
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.CipherSuite
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.CipherType
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.CompressionMethod
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.Connection
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.ConnectionEnd
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.ContentType
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.HeartbeatMessageType
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.MACAlgorithm
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.PRFAlgorithm
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.ProtocolVersion
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.Record
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.Session
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.SessionCache
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.TLSError
import typings.nodeDashForge.nodeDashForgeMod.tlsNs.Verified
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteBuffer
import typings.nodeDashForge.nodeDashForgeStrings.client
import typings.nodeDashForge.nodeDashForgeStrings.server
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "tls")
@js.native
object tlsNs extends js.Object {
  trait Alert extends js.Object {
    var description: Description
    var level: Level
  }
  
  @js.native
  sealed trait BulkCipherAlgorithm extends js.Object
  
  trait CertificateRequest extends js.Object {
    var certificate_authorities: ByteBuffer
    var certificate_types: ByteBuffer
  }
  
  trait CipherSuite extends js.Object {
    var id: js.Tuple2[Byte, Byte]
    var name: String
  }
  
  @js.native
  sealed trait CipherType extends js.Object
  
  @js.native
  sealed trait CompressionMethod extends js.Object
  
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
  
  @js.native
  sealed trait ConnectionEnd extends js.Object
  
  @js.native
  sealed trait ContentType extends js.Object
  
  @js.native
  sealed trait HandshakeType extends js.Object
  
  @js.native
  sealed trait HeartbeatMessageType extends js.Object
  
  @js.native
  sealed trait MACAlgorithm extends js.Object
  
  @js.native
  sealed trait PRFAlgorithm extends js.Object
  
  trait ProtocolVersion extends js.Object {
    var major: Byte
    var minor: Byte
  }
  
  trait Record extends js.Object {
    var fragment: ByteBuffer
    var length: Double
    var ready: js.UndefOr[Boolean] = js.undefined
    var `type`: ContentType
    var version: ProtocolVersion
  }
  
  trait Session extends js.Object {
    var cipherSuite: CipherSuite | Null
    var clientCertificate: Certificate | Null
    var compressionMethod: CompressionMethod | Null
    var extensions: StringDictionary[js.Object]
    var md5: MessageDigest
    var serverCertificate: Certificate | Null
    var sha1: MessageDigest
    var version: ProtocolVersion | Null
  }
  
  trait SessionCache extends js.Object {
    var cache: StringDictionary[Session]
    var capacity: Double
    var order: js.Array[Hex]
    def getSession(sessionId: Bytes): Session
    def setSession(sessionId: Bytes, session: Session): Unit
  }
  
  trait TLSError extends Error {
    var alert: Alert
    var origin: server | client
    var send: Boolean
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashForge.nodeDashForgeNumbers.`true`
    - typings.nodeDashForge.Anon_Alert
  */
  trait Verified extends js.Object
  
  val MaxFragment: Double = js.native
  val SupportedVersions: js.Array[ProtocolVersion] = js.native
  val Version: ProtocolVersion = js.native
  val Versions: js.Array[ProtocolVersion] = js.native
  def createConnection(options: Anon_Bytes): Connection = js.native
  def createSessionCache(): SessionCache = js.native
  def createSessionCache(cache: StringDictionary[Session]): SessionCache = js.native
  def createSessionCache(cache: StringDictionary[Session], capacity: Double): SessionCache = js.native
  def createSessionCache(cache: SessionCache): SessionCache = js.native
  def createSessionCache(cache: SessionCache, capacity: Double): SessionCache = js.native
  def hmac_sha1(key: String, seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
  def hmac_sha1(key: js.Array[Byte], seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
  def hmac_sha1(key: ByteBuffer, seqNum: js.Tuple2[Double, Double], record: Record): Bytes = js.native
  def prf_tls1(secret: String, label: String, seed: String, length: Double): ByteBuffer = js.native
  @JSName("Alert")
  @js.native
  object AlertNs extends js.Object {
    @js.native
    sealed trait Description extends js.Object
    
    @js.native
    sealed trait Level extends js.Object
    
    @js.native
    object Description extends js.Object {
      @js.native
      sealed trait access_denied extends Description
      
      @js.native
      sealed trait bad_certificate extends Description
      
      @js.native
      sealed trait bad_record_mac extends Description
      
      @js.native
      sealed trait certificate_expired extends Description
      
      @js.native
      sealed trait certificate_revoked extends Description
      
      @js.native
      sealed trait certificate_unknown extends Description
      
      @js.native
      sealed trait close_notify extends Description
      
      @js.native
      sealed trait decode_error extends Description
      
      @js.native
      sealed trait decompression_failure extends Description
      
      @js.native
      sealed trait decrypt_error extends Description
      
      @js.native
      sealed trait decryption_failed extends Description
      
      @js.native
      sealed trait export_restriction extends Description
      
      @js.native
      sealed trait handshake_failure extends Description
      
      @js.native
      sealed trait illegal_parameter extends Description
      
      @js.native
      sealed trait insufficient_security extends Description
      
      @js.native
      sealed trait internal_error extends Description
      
      @js.native
      sealed trait no_renegotiation extends Description
      
      @js.native
      sealed trait protocol_version extends Description
      
      @js.native
      sealed trait record_overflow extends Description
      
      @js.native
      sealed trait unexpected_message extends Description
      
      @js.native
      sealed trait unknown_ca extends Description
      
      @js.native
      sealed trait unsupported_certificate extends Description
      
      @js.native
      sealed trait user_canceled extends Description
      
      /* 49 */ val access_denied: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.access_denied with Double = js.native
      /* 42 */ val bad_certificate: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.bad_certificate with Double = js.native
      /* 20 */ val bad_record_mac: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.bad_record_mac with Double = js.native
      /* 45 */ val certificate_expired: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.certificate_expired with Double = js.native
      /* 44 */ val certificate_revoked: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.certificate_revoked with Double = js.native
      /* 46 */ val certificate_unknown: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.certificate_unknown with Double = js.native
      /* 0 */ val close_notify: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.close_notify with Double = js.native
      /* 50 */ val decode_error: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.decode_error with Double = js.native
      /* 30 */ val decompression_failure: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.decompression_failure with Double = js.native
      /* 51 */ val decrypt_error: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.decrypt_error with Double = js.native
      /* 21 */ val decryption_failed: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.decryption_failed with Double = js.native
      /* 60 */ val export_restriction: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.export_restriction with Double = js.native
      /* 40 */ val handshake_failure: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.handshake_failure with Double = js.native
      /* 47 */ val illegal_parameter: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.illegal_parameter with Double = js.native
      /* 71 */ val insufficient_security: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.insufficient_security with Double = js.native
      /* 80 */ val internal_error: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.internal_error with Double = js.native
      /* 100 */ val no_renegotiation: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.no_renegotiation with Double = js.native
      /* 70 */ val protocol_version: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.protocol_version with Double = js.native
      /* 22 */ val record_overflow: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.record_overflow with Double = js.native
      /* 10 */ val unexpected_message: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.unexpected_message with Double = js.native
      /* 48 */ val unknown_ca: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.unknown_ca with Double = js.native
      /* 43 */ val unsupported_certificate: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.unsupported_certificate with Double = js.native
      /* 90 */ val user_canceled: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Description.user_canceled with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Description with Double] = js.native
    }
    
    @js.native
    object Level extends js.Object {
      @js.native
      sealed trait fatal extends Level
      
      @js.native
      sealed trait warning extends Level
      
      /* 2 */ val fatal: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Level.fatal with Double = js.native
      /* 1 */ val warning: typings.nodeDashForge.nodeDashForgeMod.tlsNs.AlertNs.Level.warning with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Level with Double] = js.native
    }
    
  }
  
  @js.native
  object BulkCipherAlgorithm extends js.Object {
    @js.native
    sealed trait aes extends BulkCipherAlgorithm
    
    @js.native
    sealed trait des3 extends BulkCipherAlgorithm
    
    @js.native
    sealed trait rc4 extends BulkCipherAlgorithm
    
    /* 2 */ val aes: typings.nodeDashForge.nodeDashForgeMod.tlsNs.BulkCipherAlgorithm.aes with Double = js.native
    /* 1 */ val des3: typings.nodeDashForge.nodeDashForgeMod.tlsNs.BulkCipherAlgorithm.des3 with Double = js.native
    /* 0 */ val rc4: typings.nodeDashForge.nodeDashForgeMod.tlsNs.BulkCipherAlgorithm.rc4 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BulkCipherAlgorithm with Double] = js.native
  }
  
  @js.native
  object CipherSuites extends /* name */ StringDictionary[CipherSuite]
  
  @js.native
  object CipherType extends js.Object {
    @js.native
    sealed trait aead extends CipherType
    
    @js.native
    sealed trait block extends CipherType
    
    @js.native
    sealed trait stream extends CipherType
    
    /* 2 */ val aead: typings.nodeDashForge.nodeDashForgeMod.tlsNs.CipherType.aead with Double = js.native
    /* 1 */ val block: typings.nodeDashForge.nodeDashForgeMod.tlsNs.CipherType.block with Double = js.native
    /* 0 */ val stream: typings.nodeDashForge.nodeDashForgeMod.tlsNs.CipherType.stream with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CipherType with Double] = js.native
  }
  
  @js.native
  object CompressionMethod extends js.Object {
    @js.native
    sealed trait deflate extends CompressionMethod
    
    @js.native
    sealed trait none extends CompressionMethod
    
    /* 1 */ val deflate: typings.nodeDashForge.nodeDashForgeMod.tlsNs.CompressionMethod.deflate with Double = js.native
    /* 0 */ val none: typings.nodeDashForge.nodeDashForgeMod.tlsNs.CompressionMethod.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompressionMethod with Double] = js.native
  }
  
  @js.native
  object ConnectionEnd extends js.Object {
    @js.native
    sealed trait client extends ConnectionEnd
    
    @js.native
    sealed trait server extends ConnectionEnd
    
    /* 1 */ val client: typings.nodeDashForge.nodeDashForgeMod.tlsNs.ConnectionEnd.client with Double = js.native
    /* 0 */ val server: typings.nodeDashForge.nodeDashForgeMod.tlsNs.ConnectionEnd.server with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConnectionEnd with Double] = js.native
  }
  
  @js.native
  object ContentType extends js.Object {
    @js.native
    sealed trait alert extends ContentType
    
    @js.native
    sealed trait application_data extends ContentType
    
    @js.native
    sealed trait change_cipher_spec extends ContentType
    
    @js.native
    sealed trait handshake extends ContentType
    
    @js.native
    sealed trait heartbeat extends ContentType
    
    /* 21 */ val alert: typings.nodeDashForge.nodeDashForgeMod.tlsNs.ContentType.alert with Double = js.native
    /* 23 */ val application_data: typings.nodeDashForge.nodeDashForgeMod.tlsNs.ContentType.application_data with Double = js.native
    /* 20 */ val change_cipher_spec: typings.nodeDashForge.nodeDashForgeMod.tlsNs.ContentType.change_cipher_spec with Double = js.native
    /* 22 */ val handshake: typings.nodeDashForge.nodeDashForgeMod.tlsNs.ContentType.handshake with Double = js.native
    /* 24 */ val heartbeat: typings.nodeDashForge.nodeDashForgeMod.tlsNs.ContentType.heartbeat with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
  }
  
  @js.native
  object HandshakeType extends js.Object {
    @js.native
    sealed trait certificate extends HandshakeType
    
    @js.native
    sealed trait certificate_request extends HandshakeType
    
    @js.native
    sealed trait certificate_verify extends HandshakeType
    
    @js.native
    sealed trait client_hello extends HandshakeType
    
    @js.native
    sealed trait client_key_exchange extends HandshakeType
    
    @js.native
    sealed trait finished extends HandshakeType
    
    @js.native
    sealed trait hello_request extends HandshakeType
    
    @js.native
    sealed trait server_hello extends HandshakeType
    
    @js.native
    sealed trait server_hello_done extends HandshakeType
    
    @js.native
    sealed trait server_key_exchange extends HandshakeType
    
    /* 11 */ val certificate: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType.certificate with Double = js.native
    /* 13 */ val certificate_request: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType.certificate_request with Double = js.native
    /* 15 */ val certificate_verify: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType.certificate_verify with Double = js.native
    /* 1 */ val client_hello: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType.client_hello with Double = js.native
    /* 16 */ val client_key_exchange: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType.client_key_exchange with Double = js.native
    /* 20 */ val finished: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType.finished with Double = js.native
    /* 0 */ val hello_request: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType.hello_request with Double = js.native
    /* 2 */ val server_hello: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType.server_hello with Double = js.native
    /* 14 */ val server_hello_done: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType.server_hello_done with Double = js.native
    /* 12 */ val server_key_exchange: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HandshakeType.server_key_exchange with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HandshakeType with Double] = js.native
  }
  
  @js.native
  object HeartbeatMessageType extends js.Object {
    @js.native
    sealed trait heartbeat_request extends HeartbeatMessageType
    
    @js.native
    sealed trait heartbeat_response extends HeartbeatMessageType
    
    /* 1 */ val heartbeat_request: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HeartbeatMessageType.heartbeat_request with Double = js.native
    /* 2 */ val heartbeat_response: typings.nodeDashForge.nodeDashForgeMod.tlsNs.HeartbeatMessageType.heartbeat_response with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HeartbeatMessageType with Double] = js.native
  }
  
  @js.native
  object MACAlgorithm extends js.Object {
    @js.native
    sealed trait hmac_md5 extends MACAlgorithm
    
    @js.native
    sealed trait hmac_sha1 extends MACAlgorithm
    
    @js.native
    sealed trait hmac_sha256 extends MACAlgorithm
    
    @js.native
    sealed trait hmac_sha384 extends MACAlgorithm
    
    @js.native
    sealed trait hmac_sha512 extends MACAlgorithm
    
    /* 0 */ val hmac_md5: typings.nodeDashForge.nodeDashForgeMod.tlsNs.MACAlgorithm.hmac_md5 with Double = js.native
    /* 1 */ val hmac_sha1: typings.nodeDashForge.nodeDashForgeMod.tlsNs.MACAlgorithm.hmac_sha1 with Double = js.native
    /* 2 */ val hmac_sha256: typings.nodeDashForge.nodeDashForgeMod.tlsNs.MACAlgorithm.hmac_sha256 with Double = js.native
    /* 3 */ val hmac_sha384: typings.nodeDashForge.nodeDashForgeMod.tlsNs.MACAlgorithm.hmac_sha384 with Double = js.native
    /* 4 */ val hmac_sha512: typings.nodeDashForge.nodeDashForgeMod.tlsNs.MACAlgorithm.hmac_sha512 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MACAlgorithm with Double] = js.native
  }
  
  @js.native
  object PRFAlgorithm extends js.Object {
    @js.native
    sealed trait tls_prf_sha256 extends PRFAlgorithm
    
    /* 0 */ val tls_prf_sha256: typings.nodeDashForge.nodeDashForgeMod.tlsNs.PRFAlgorithm.tls_prf_sha256 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PRFAlgorithm with Double] = js.native
  }
  
  type ConnectionState = js.Any
}

