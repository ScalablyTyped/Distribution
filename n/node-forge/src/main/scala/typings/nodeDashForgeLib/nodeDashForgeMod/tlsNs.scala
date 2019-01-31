package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "tls")
@js.native
object tlsNs extends js.Object {
  trait Alert extends js.Object {
    var description: nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
    var level: nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Level
  }
  
  @js.native
  sealed trait BulkCipherAlgorithm extends js.Object
  
  trait CertificateRequest extends js.Object {
    var certificate_authorities: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer
    var certificate_types: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer
  }
  
  trait CipherSuite extends js.Object {
    var id: js.Tuple2[nodeDashForgeLib.nodeDashForgeMod.Byte, nodeDashForgeLib.nodeDashForgeMod.Byte]
    var name: java.lang.String
  }
  
  @js.native
  sealed trait CipherType extends js.Object
  
  @js.native
  sealed trait CompressionMethod extends js.Object
  
  @js.native
  trait Connection extends js.Object {
    var caStore: nodeDashForgeLib.nodeDashForgeMod.pkiNs.CAStore = js.native
    var cipherSuites: js.Array[CipherSuite] = js.native
    var data: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
    var deflate: (js.Function1[
        /* inBytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, 
        nodeDashForgeLib.nodeDashForgeMod.Bytes
      ]) | scala.Null = js.native
    var entity: ConnectionEnd = js.native
    var expect: scala.Double = js.native
    var fail: scala.Boolean = js.native
    var fragmented: Record | scala.Null = js.native
    var getCertificate: (js.Function2[
        /* conn */ this.type, 
        /* hint */ CertificateRequest | js.Array[java.lang.String], 
        nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM | js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM]
      ]) | scala.Null = js.native
    var getPrivateKey: (js.Function2[
        /* conn */ this.type, 
        /* certificate */ nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate, 
        nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM
      ]) | scala.Null = js.native
    var getSignature: (js.Function3[
        /* conn */ this.type, 
        /* bytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, 
        /* callback */ js.Function2[
          /* conn */ this.type, 
          /* bytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, 
          scala.Unit
        ], 
        scala.Unit
      ]) | scala.Null = js.native
    var handshakes: scala.Double = js.native
    var handshaking: scala.Boolean = js.native
    var heartbeatReceived: js.UndefOr[
        js.Function2[
          /* conn */ this.type, 
          /* payload */ nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer, 
          scala.Unit
        ]
      ] = js.native
    var inflate: (js.Function1[
        /* inBytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, 
        nodeDashForgeLib.nodeDashForgeMod.Bytes
      ]) | scala.Null = js.native
    var input: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
    var isConnected: scala.Boolean = js.native
    var open: scala.Boolean = js.native
    var peerCertificate: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate | scala.Null = js.native
    var record: Record | scala.Null = js.native
    var records: js.Array[Record] = js.native
    var session: Session | scala.Null = js.native
    var sessionCache: SessionCache | scala.Null = js.native
    var sessionId: nodeDashForgeLib.nodeDashForgeMod.Bytes | scala.Null = js.native
    var state: nodeDashForgeLib.Anon_Current = js.native
    var tlsData: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
    var verifyClient: scala.Boolean = js.native
    var version: ProtocolVersion = js.native
    var virtualHost: java.lang.String | scala.Null = js.native
    def close(): Connection = js.native
    def close(clearFail: scala.Boolean): Connection = js.native
    def closed(conn: Connection): scala.Unit = js.native
    def connected(conn: Connection): scala.Unit = js.native
    def dataReady(conn: Connection): scala.Unit = js.native
    def error(conn: Connection, error: TLSError): scala.Unit = js.native
    def handshake(): scala.Unit = js.native
    def handshake(sessionId: nodeDashForgeLib.nodeDashForgeMod.Bytes): scala.Unit = js.native
    def prepare(data: nodeDashForgeLib.nodeDashForgeMod.Bytes): scala.Boolean = js.native
    def prepareHeartbeatRequest(payload: nodeDashForgeLib.nodeDashForgeMod.Bytes): scala.Boolean = js.native
    def prepareHeartbeatRequest(payload: nodeDashForgeLib.nodeDashForgeMod.Bytes, payloadLength: scala.Double): scala.Boolean = js.native
    def prepareHeartbeatRequest(payload: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer): scala.Boolean = js.native
    def prepareHeartbeatRequest(payload: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer, payloadLength: scala.Double): scala.Boolean = js.native
    def process(data: nodeDashForgeLib.nodeDashForgeMod.Bytes): scala.Double = js.native
    def reset(): scala.Unit = js.native
    def reset(clearFail: scala.Boolean): scala.Unit = js.native
    def tlsDataReady(conn: Connection): scala.Unit = js.native
    def verify(
      conn: Connection,
      verified: Verified,
      depth: scala.Double,
      certs: js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate]
    ): Verified = js.native
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
    var major: nodeDashForgeLib.nodeDashForgeMod.Byte
    var minor: nodeDashForgeLib.nodeDashForgeMod.Byte
  }
  
  trait Record extends js.Object {
    var fragment: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer
    var length: scala.Double
    var ready: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: ContentType
    var version: ProtocolVersion
  }
  
  trait Session extends js.Object {
    var cipherSuite: CipherSuite | scala.Null
    var clientCertificate: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate | scala.Null
    var compressionMethod: CompressionMethod | scala.Null
    var extensions: org.scalablytyped.runtime.StringDictionary[js.Object]
    var md5: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest
    var serverCertificate: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate | scala.Null
    var sha1: nodeDashForgeLib.nodeDashForgeMod.mdNs.MessageDigest
    var version: ProtocolVersion | scala.Null
  }
  
  trait SessionCache extends js.Object {
    var cache: org.scalablytyped.runtime.StringDictionary[Session]
    var capacity: scala.Double
    var order: js.Array[nodeDashForgeLib.nodeDashForgeMod.Hex]
    def getSession(sessionId: nodeDashForgeLib.nodeDashForgeMod.Bytes): Session
    def setSession(sessionId: nodeDashForgeLib.nodeDashForgeMod.Bytes, session: Session): scala.Unit
  }
  
  trait TLSError
    extends nodeLib.Error {
    var alert: Alert
    var message: java.lang.String
    var origin: nodeDashForgeLib.nodeDashForgeLibStrings.server | nodeDashForgeLib.nodeDashForgeLibStrings.client
    var send: scala.Boolean
  }
  
  val MaxFragment: scala.Double = js.native
  val SupportedVersions: js.Array[ProtocolVersion] = js.native
  val Version: ProtocolVersion = js.native
  val Versions: js.Array[ProtocolVersion] = js.native
  def createConnection(options: nodeDashForgeLib.Anon_Bytes): Connection = js.native
  def createSessionCache(): SessionCache = js.native
  def createSessionCache(cache: SessionCache): SessionCache = js.native
  def createSessionCache(cache: SessionCache, capacity: scala.Double): SessionCache = js.native
  def createSessionCache(cache: org.scalablytyped.runtime.StringDictionary[Session]): SessionCache = js.native
  def createSessionCache(cache: org.scalablytyped.runtime.StringDictionary[Session], capacity: scala.Double): SessionCache = js.native
  def hmac_sha1(key: java.lang.String, seqNum: js.Tuple2[scala.Double, scala.Double], record: Record): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
  def hmac_sha1(
    key: js.Array[nodeDashForgeLib.nodeDashForgeMod.Byte],
    seqNum: js.Tuple2[scala.Double, scala.Double],
    record: Record
  ): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
  def hmac_sha1(
    key: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer,
    seqNum: js.Tuple2[scala.Double, scala.Double],
    record: Record
  ): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
  def prf_tls1(secret: java.lang.String, label: java.lang.String, seed: java.lang.String, length: scala.Double): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
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
      sealed trait access_denied
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait bad_certificate
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait bad_record_mac
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait certificate_expired
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait certificate_revoked
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait certificate_unknown
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait close_notify
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait decode_error
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait decompression_failure
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait decrypt_error
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait decryption_failed
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait export_restriction
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait handshake_failure
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait illegal_parameter
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait insufficient_security
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait internal_error
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait no_renegotiation
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait protocol_version
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait record_overflow
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait unexpected_message
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait unknown_ca
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait unsupported_certificate
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      @js.native
      sealed trait user_canceled
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description
      
      /* 49 */ val access_denied: access_denied with scala.Double = js.native
      /* 42 */ val bad_certificate: bad_certificate with scala.Double = js.native
      /* 20 */ val bad_record_mac: bad_record_mac with scala.Double = js.native
      /* 45 */ val certificate_expired: certificate_expired with scala.Double = js.native
      /* 44 */ val certificate_revoked: certificate_revoked with scala.Double = js.native
      /* 46 */ val certificate_unknown: certificate_unknown with scala.Double = js.native
      /* 0 */ val close_notify: close_notify with scala.Double = js.native
      /* 50 */ val decode_error: decode_error with scala.Double = js.native
      /* 30 */ val decompression_failure: decompression_failure with scala.Double = js.native
      /* 51 */ val decrypt_error: decrypt_error with scala.Double = js.native
      /* 21 */ val decryption_failed: decryption_failed with scala.Double = js.native
      /* 60 */ val export_restriction: export_restriction with scala.Double = js.native
      /* 40 */ val handshake_failure: handshake_failure with scala.Double = js.native
      /* 47 */ val illegal_parameter: illegal_parameter with scala.Double = js.native
      /* 71 */ val insufficient_security: insufficient_security with scala.Double = js.native
      /* 80 */ val internal_error: internal_error with scala.Double = js.native
      /* 100 */ val no_renegotiation: no_renegotiation with scala.Double = js.native
      /* 70 */ val protocol_version: protocol_version with scala.Double = js.native
      /* 22 */ val record_overflow: record_overflow with scala.Double = js.native
      /* 10 */ val unexpected_message: unexpected_message with scala.Double = js.native
      /* 48 */ val unknown_ca: unknown_ca with scala.Double = js.native
      /* 43 */ val unsupported_certificate: unsupported_certificate with scala.Double = js.native
      /* 90 */ val user_canceled: user_canceled with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Description with scala.Double] = js.native
    }
    
    @js.native
    object Level extends js.Object {
      @js.native
      sealed trait fatal
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Level
      
      @js.native
      sealed trait warning
        extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Level
      
      /* 2 */ val fatal: fatal with scala.Double = js.native
      /* 1 */ val warning: warning with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.AlertNs.Level with scala.Double] = js.native
    }
    
  }
  
  @js.native
  object BulkCipherAlgorithm extends js.Object {
    @js.native
    sealed trait aes
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.BulkCipherAlgorithm
    
    @js.native
    sealed trait des3
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.BulkCipherAlgorithm
    
    @js.native
    sealed trait rc4
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.BulkCipherAlgorithm
    
    /* 2 */ val aes: aes with scala.Double = js.native
    /* 1 */ val des3: des3 with scala.Double = js.native
    /* 0 */ val rc4: rc4 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.BulkCipherAlgorithm with scala.Double] = js.native
  }
  
  @js.native
  object CipherSuites
    extends /* name */ org.scalablytyped.runtime.StringDictionary[CipherSuite]
  
  @js.native
  object CipherType extends js.Object {
    @js.native
    sealed trait aead
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.CipherType
    
    @js.native
    sealed trait block
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.CipherType
    
    @js.native
    sealed trait stream
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.CipherType
    
    /* 2 */ val aead: aead with scala.Double = js.native
    /* 1 */ val block: block with scala.Double = js.native
    /* 0 */ val stream: stream with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.CipherType with scala.Double] = js.native
  }
  
  @js.native
  object CompressionMethod extends js.Object {
    @js.native
    sealed trait deflate
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.CompressionMethod
    
    @js.native
    sealed trait none
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.CompressionMethod
    
    /* 1 */ val deflate: deflate with scala.Double = js.native
    /* 0 */ val none: none with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.CompressionMethod with scala.Double] = js.native
  }
  
  @js.native
  object ConnectionEnd extends js.Object {
    @js.native
    sealed trait client
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.ConnectionEnd
    
    @js.native
    sealed trait server
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.ConnectionEnd
    
    /* 1 */ val client: client with scala.Double = js.native
    /* 0 */ val server: server with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.ConnectionEnd with scala.Double] = js.native
  }
  
  @js.native
  object ContentType extends js.Object {
    @js.native
    sealed trait alert
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.ContentType
    
    @js.native
    sealed trait application_data
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.ContentType
    
    @js.native
    sealed trait change_cipher_spec
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.ContentType
    
    @js.native
    sealed trait handshake
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.ContentType
    
    @js.native
    sealed trait heartbeat
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.ContentType
    
    /* 21 */ val alert: alert with scala.Double = js.native
    /* 23 */ val application_data: application_data with scala.Double = js.native
    /* 20 */ val change_cipher_spec: change_cipher_spec with scala.Double = js.native
    /* 22 */ val handshake: handshake with scala.Double = js.native
    /* 24 */ val heartbeat: heartbeat with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.ContentType with scala.Double] = js.native
  }
  
  @js.native
  object HandshakeType extends js.Object {
    @js.native
    sealed trait certificate
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType
    
    @js.native
    sealed trait certificate_request
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType
    
    @js.native
    sealed trait certificate_verify
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType
    
    @js.native
    sealed trait client_hello
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType
    
    @js.native
    sealed trait client_key_exchange
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType
    
    @js.native
    sealed trait finished
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType
    
    @js.native
    sealed trait hello_request
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType
    
    @js.native
    sealed trait server_hello
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType
    
    @js.native
    sealed trait server_hello_done
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType
    
    @js.native
    sealed trait server_key_exchange
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType
    
    /* 11 */ val certificate: certificate with scala.Double = js.native
    /* 13 */ val certificate_request: certificate_request with scala.Double = js.native
    /* 15 */ val certificate_verify: certificate_verify with scala.Double = js.native
    /* 1 */ val client_hello: client_hello with scala.Double = js.native
    /* 16 */ val client_key_exchange: client_key_exchange with scala.Double = js.native
    /* 20 */ val finished: finished with scala.Double = js.native
    /* 0 */ val hello_request: hello_request with scala.Double = js.native
    /* 2 */ val server_hello: server_hello with scala.Double = js.native
    /* 14 */ val server_hello_done: server_hello_done with scala.Double = js.native
    /* 12 */ val server_key_exchange: server_key_exchange with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.HandshakeType with scala.Double] = js.native
  }
  
  @js.native
  object HeartbeatMessageType extends js.Object {
    @js.native
    sealed trait heartbeat_request
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HeartbeatMessageType
    
    @js.native
    sealed trait heartbeat_response
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.HeartbeatMessageType
    
    /* 1 */ val heartbeat_request: heartbeat_request with scala.Double = js.native
    /* 2 */ val heartbeat_response: heartbeat_response with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.HeartbeatMessageType with scala.Double] = js.native
  }
  
  @js.native
  object MACAlgorithm extends js.Object {
    @js.native
    sealed trait hmac_md5
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.MACAlgorithm
    
    @js.native
    sealed trait hmac_sha1
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.MACAlgorithm
    
    @js.native
    sealed trait hmac_sha256
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.MACAlgorithm
    
    @js.native
    sealed trait hmac_sha384
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.MACAlgorithm
    
    @js.native
    sealed trait hmac_sha512
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.MACAlgorithm
    
    /* 0 */ val hmac_md5: hmac_md5 with scala.Double = js.native
    /* 1 */ val hmac_sha1: hmac_sha1 with scala.Double = js.native
    /* 2 */ val hmac_sha256: hmac_sha256 with scala.Double = js.native
    /* 3 */ val hmac_sha384: hmac_sha384 with scala.Double = js.native
    /* 4 */ val hmac_sha512: hmac_sha512 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.MACAlgorithm with scala.Double] = js.native
  }
  
  @js.native
  object PRFAlgorithm extends js.Object {
    @js.native
    sealed trait tls_prf_sha256
      extends nodeDashForgeLib.nodeDashForgeMod.tlsNs.PRFAlgorithm
    
    /* 0 */ val tls_prf_sha256: tls_prf_sha256 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.tlsNs.PRFAlgorithm with scala.Double] = js.native
  }
  
  type ConnectionState = js.Any
  type Verified = nodeDashForgeLib.nodeDashForgeLibNumbers.`true` | nodeDashForgeLib.Anon_Alert
}

