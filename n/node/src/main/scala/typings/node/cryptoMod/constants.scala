package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constants {
  
  @JSImport("crypto", "constants.ALPN_ENABLED")
  @js.native
  val ALPN_ENABLED: Double = js.native
  
  @JSImport("crypto", "constants.DH_CHECK_P_NOT_PRIME")
  @js.native
  val DH_CHECK_P_NOT_PRIME: Double = js.native
  
  @JSImport("crypto", "constants.DH_CHECK_P_NOT_SAFE_PRIME")
  @js.native
  val DH_CHECK_P_NOT_SAFE_PRIME: Double = js.native
  
  @JSImport("crypto", "constants.DH_NOT_SUITABLE_GENERATOR")
  @js.native
  val DH_NOT_SUITABLE_GENERATOR: Double = js.native
  
  @JSImport("crypto", "constants.DH_UNABLE_TO_CHECK_GENERATOR")
  @js.native
  val DH_UNABLE_TO_CHECK_GENERATOR: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_ALL")
  @js.native
  val ENGINE_METHOD_ALL: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_CIPHERS")
  @js.native
  val ENGINE_METHOD_CIPHERS: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_DH")
  @js.native
  val ENGINE_METHOD_DH: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_DIGESTS")
  @js.native
  val ENGINE_METHOD_DIGESTS: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_DSA")
  @js.native
  val ENGINE_METHOD_DSA: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_EC")
  @js.native
  val ENGINE_METHOD_EC: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_NONE")
  @js.native
  val ENGINE_METHOD_NONE: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_PKEY_ASN1_METHS")
  @js.native
  val ENGINE_METHOD_PKEY_ASN1_METHS: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_PKEY_METHS")
  @js.native
  val ENGINE_METHOD_PKEY_METHS: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_RAND")
  @js.native
  val ENGINE_METHOD_RAND: Double = js.native
  
  @JSImport("crypto", "constants.ENGINE_METHOD_RSA")
  @js.native
  val ENGINE_METHOD_RSA: Double = js.native
  
  // https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
  @JSImport("crypto", "constants.OPENSSL_VERSION_NUMBER")
  @js.native
  val OPENSSL_VERSION_NUMBER: Double = js.native
  
  @JSImport("crypto", "constants.POINT_CONVERSION_COMPRESSED")
  @js.native
  val POINT_CONVERSION_COMPRESSED: Double = js.native
  
  @JSImport("crypto", "constants.POINT_CONVERSION_HYBRID")
  @js.native
  val POINT_CONVERSION_HYBRID: Double = js.native
  
  @JSImport("crypto", "constants.POINT_CONVERSION_UNCOMPRESSED")
  @js.native
  val POINT_CONVERSION_UNCOMPRESSED: Double = js.native
  
  @JSImport("crypto", "constants.RSA_NO_PADDING")
  @js.native
  val RSA_NO_PADDING: Double = js.native
  
  @JSImport("crypto", "constants.RSA_PKCS1_OAEP_PADDING")
  @js.native
  val RSA_PKCS1_OAEP_PADDING: Double = js.native
  
  @JSImport("crypto", "constants.RSA_PKCS1_PADDING")
  @js.native
  val RSA_PKCS1_PADDING: Double = js.native
  
  @JSImport("crypto", "constants.RSA_PKCS1_PSS_PADDING")
  @js.native
  val RSA_PKCS1_PSS_PADDING: Double = js.native
  
  /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
  @JSImport("crypto", "constants.RSA_PSS_SALTLEN_AUTO")
  @js.native
  val RSA_PSS_SALTLEN_AUTO: Double = js.native
  
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
  @JSImport("crypto", "constants.RSA_PSS_SALTLEN_DIGEST")
  @js.native
  val RSA_PSS_SALTLEN_DIGEST: Double = js.native
  
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
  @JSImport("crypto", "constants.RSA_PSS_SALTLEN_MAX_SIGN")
  @js.native
  val RSA_PSS_SALTLEN_MAX_SIGN: Double = js.native
  
  @JSImport("crypto", "constants.RSA_SSLV23_PADDING")
  @js.native
  val RSA_SSLV23_PADDING: Double = js.native
  
  @JSImport("crypto", "constants.RSA_X931_PADDING")
  @js.native
  val RSA_X931_PADDING: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NO_SSLv2")
  @js.native
  val SSLOPNOSSLv2: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NO_SSLv3")
  @js.native
  val SSLOPNOSSLv3: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NO_TLSv1")
  @js.native
  val SSLOPNOTLSv1: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NO_TLSv1_1")
  @js.native
  val SSLOPNOTLSv11: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NO_TLSv1_2")
  @js.native
  val SSLOPNOTLSv12: Double = js.native
  
  /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
  @JSImport("crypto", "constants.SSL_OP_ALL")
  @js.native
  val SSL_OP_ALL: Double = js.native
  
  /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  @JSImport("crypto", "constants.SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION")
  @js.native
  val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double = js.native
  
  /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  @JSImport("crypto", "constants.SSL_OP_CIPHER_SERVER_PREFERENCE")
  @js.native
  val SSL_OP_CIPHER_SERVER_PREFERENCE: Double = js.native
  
  /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
  @JSImport("crypto", "constants.SSL_OP_CISCO_ANYCONNECT")
  @js.native
  val SSL_OP_CISCO_ANYCONNECT: Double = js.native
  
  /** Instructs OpenSSL to turn on cookie exchange. */
  @JSImport("crypto", "constants.SSL_OP_COOKIE_EXCHANGE")
  @js.native
  val SSL_OP_COOKIE_EXCHANGE: Double = js.native
  
  /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
  @JSImport("crypto", "constants.SSL_OP_CRYPTOPRO_TLSEXT_BUG")
  @js.native
  val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double = js.native
  
  /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
  @JSImport("crypto", "constants.SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS")
  @js.native
  val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double = js.native
  
  /** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
  @JSImport("crypto", "constants.SSL_OP_EPHEMERAL_RSA")
  @js.native
  val SSL_OP_EPHEMERAL_RSA: Double = js.native
  
  /** Allows initial connection to servers that do not support RI. */
  @JSImport("crypto", "constants.SSL_OP_LEGACY_SERVER_CONNECT")
  @js.native
  val SSL_OP_LEGACY_SERVER_CONNECT: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER")
  @js.native
  val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_MICROSOFT_SESS_ID_BUG")
  @js.native
  val SSL_OP_MICROSOFT_SESS_ID_BUG: Double = js.native
  
  /** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
  @JSImport("crypto", "constants.SSL_OP_MSIE_SSLV2_RSA_PADDING")
  @js.native
  val SSL_OP_MSIE_SSLV2_RSA_PADDING: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NETSCAPE_CA_DN_BUG")
  @js.native
  val SSL_OP_NETSCAPE_CA_DN_BUG: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NETSCAPE_CHALLENGE_BUG")
  @js.native
  val SSL_OP_NETSCAPE_CHALLENGE_BUG: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG")
  @js.native
  val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG")
  @js.native
  val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Double = js.native
  
  /** Instructs OpenSSL to disable support for SSL/TLS compression. */
  @JSImport("crypto", "constants.SSL_OP_NO_COMPRESSION")
  @js.native
  val SSL_OP_NO_COMPRESSION: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NO_QUERY_MTU")
  @js.native
  val SSL_OP_NO_QUERY_MTU: Double = js.native
  
  /** Instructs OpenSSL to always start a new session when performing renegotiation. */
  @JSImport("crypto", "constants.SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION")
  @js.native
  val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_NO_TICKET")
  @js.native
  val SSL_OP_NO_TICKET: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_PKCS1_CHECK_1")
  @js.native
  val SSL_OP_PKCS1_CHECK_1: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_PKCS1_CHECK_2")
  @js.native
  val SSL_OP_PKCS1_CHECK_2: Double = js.native
  
  /** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
  @JSImport("crypto", "constants.SSL_OP_SINGLE_DH_USE")
  @js.native
  val SSL_OP_SINGLE_DH_USE: Double = js.native
  
  /** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
  @JSImport("crypto", "constants.SSL_OP_SINGLE_ECDH_USE")
  @js.native
  val SSL_OP_SINGLE_ECDH_USE: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_SSLEAY_080_CLIENT_DH_BUG")
  @js.native
  val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG")
  @js.native
  val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_TLS_BLOCK_PADDING_BUG")
  @js.native
  val SSL_OP_TLS_BLOCK_PADDING_BUG: Double = js.native
  
  @JSImport("crypto", "constants.SSL_OP_TLS_D5_BUG")
  @js.native
  val SSL_OP_TLS_D5_BUG: Double = js.native
  
  /** Instructs OpenSSL to disable version rollback attack detection. */
  @JSImport("crypto", "constants.SSL_OP_TLS_ROLLBACK_BUG")
  @js.native
  val SSL_OP_TLS_ROLLBACK_BUG: Double = js.native
  
  /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
  @JSImport("crypto", "constants.defaultCipherList")
  @js.native
  val defaultCipherList: String = js.native
  
  /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
  @JSImport("crypto", "constants.defaultCoreCipherList")
  @js.native
  val defaultCoreCipherList: String = js.native
}
