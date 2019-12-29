package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcryptoConstants extends js.Object {
  val ALPN_ENABLED: Double
  val DH_CHECK_P_NOT_PRIME: Double
  val DH_CHECK_P_NOT_SAFE_PRIME: Double
  val DH_NOT_SUITABLE_GENERATOR: Double
  val DH_UNABLE_TO_CHECK_GENERATOR: Double
  val ENGINE_METHOD_ALL: Double
  val ENGINE_METHOD_CIPHERS: Double
  val ENGINE_METHOD_DH: Double
  val ENGINE_METHOD_DIGESTS: Double
  val ENGINE_METHOD_DSA: Double
  val ENGINE_METHOD_EC: Double
  val ENGINE_METHOD_NONE: Double
  val ENGINE_METHOD_PKEY_ASN1_METHS: Double
  val ENGINE_METHOD_PKEY_METHS: Double
  val ENGINE_METHOD_RAND: Double
  val ENGINE_METHOD_RSA: Double
  // https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
  val OPENSSL_VERSION_NUMBER: Double
  val POINT_CONVERSION_COMPRESSED: Double
  val POINT_CONVERSION_HYBRID: Double
  val POINT_CONVERSION_UNCOMPRESSED: Double
  val RSA_NO_PADDING: Double
  val RSA_PKCS1_OAEP_PADDING: Double
  val RSA_PKCS1_PADDING: Double
  val RSA_PKCS1_PSS_PADDING: Double
  /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
  val RSA_PSS_SALTLEN_AUTO: Double
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
  val RSA_PSS_SALTLEN_DIGEST: Double
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
  val RSA_PSS_SALTLEN_MAX_SIGN: Double
  val RSA_SSLV23_PADDING: Double
  val RSA_X931_PADDING: Double
  /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
  val SSL_OP_ALL: Double
  /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double
  /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  val SSL_OP_CIPHER_SERVER_PREFERENCE: Double
  /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
  val SSL_OP_CISCO_ANYCONNECT: Double
  /** Instructs OpenSSL to turn on cookie exchange. */
  val SSL_OP_COOKIE_EXCHANGE: Double
  /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
  val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double
  /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
  val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double
  /** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
  val SSL_OP_EPHEMERAL_RSA: Double
  /** Allows initial connection to servers that do not support RI. */
  val SSL_OP_LEGACY_SERVER_CONNECT: Double
  val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Double
  val SSL_OP_MICROSOFT_SESS_ID_BUG: Double
  /** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
  val SSL_OP_MSIE_SSLV2_RSA_PADDING: Double
  val SSL_OP_NETSCAPE_CA_DN_BUG: Double
  val SSL_OP_NETSCAPE_CHALLENGE_BUG: Double
  val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Double
  val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Double
  /** Instructs OpenSSL to disable support for SSL/TLS compression. */
  val SSL_OP_NO_COMPRESSION: Double
  val SSL_OP_NO_QUERY_MTU: Double
  /** Instructs OpenSSL to always start a new session when performing renegotiation. */
  val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double
  val SSL_OP_NO_SSLv2: Double
  val SSL_OP_NO_SSLv3: Double
  val SSL_OP_NO_TICKET: Double
  val SSL_OP_NO_TLSv1: Double
  val SSL_OP_NO_TLSv1_1: Double
  val SSL_OP_NO_TLSv1_2: Double
  val SSL_OP_PKCS1_CHECK_1: Double
  val SSL_OP_PKCS1_CHECK_2: Double
  /** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
  val SSL_OP_SINGLE_DH_USE: Double
  /** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
  val SSL_OP_SINGLE_ECDH_USE: Double
  val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Double
  val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Double
  val SSL_OP_TLS_BLOCK_PADDING_BUG: Double
  val SSL_OP_TLS_D5_BUG: Double
  /** Instructs OpenSSL to disable version rollback attack detection. */
  val SSL_OP_TLS_ROLLBACK_BUG: Double
  /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
  val defaultCipherList: java.lang.String
  /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
  val defaultCoreCipherList: java.lang.String
}

object TypeofcryptoConstants {
  @scala.inline
  def apply(
    ALPN_ENABLED: Double,
    DH_CHECK_P_NOT_PRIME: Double,
    DH_CHECK_P_NOT_SAFE_PRIME: Double,
    DH_NOT_SUITABLE_GENERATOR: Double,
    DH_UNABLE_TO_CHECK_GENERATOR: Double,
    ENGINE_METHOD_ALL: Double,
    ENGINE_METHOD_CIPHERS: Double,
    ENGINE_METHOD_DH: Double,
    ENGINE_METHOD_DIGESTS: Double,
    ENGINE_METHOD_DSA: Double,
    ENGINE_METHOD_EC: Double,
    ENGINE_METHOD_NONE: Double,
    ENGINE_METHOD_PKEY_ASN1_METHS: Double,
    ENGINE_METHOD_PKEY_METHS: Double,
    ENGINE_METHOD_RAND: Double,
    ENGINE_METHOD_RSA: Double,
    OPENSSL_VERSION_NUMBER: Double,
    POINT_CONVERSION_COMPRESSED: Double,
    POINT_CONVERSION_HYBRID: Double,
    POINT_CONVERSION_UNCOMPRESSED: Double,
    RSA_NO_PADDING: Double,
    RSA_PKCS1_OAEP_PADDING: Double,
    RSA_PKCS1_PADDING: Double,
    RSA_PKCS1_PSS_PADDING: Double,
    RSA_PSS_SALTLEN_AUTO: Double,
    RSA_PSS_SALTLEN_DIGEST: Double,
    RSA_PSS_SALTLEN_MAX_SIGN: Double,
    RSA_SSLV23_PADDING: Double,
    RSA_X931_PADDING: Double,
    SSL_OP_ALL: Double,
    SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double,
    SSL_OP_CIPHER_SERVER_PREFERENCE: Double,
    SSL_OP_CISCO_ANYCONNECT: Double,
    SSL_OP_COOKIE_EXCHANGE: Double,
    SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double,
    SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double,
    SSL_OP_EPHEMERAL_RSA: Double,
    SSL_OP_LEGACY_SERVER_CONNECT: Double,
    SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Double,
    SSL_OP_MICROSOFT_SESS_ID_BUG: Double,
    SSL_OP_MSIE_SSLV2_RSA_PADDING: Double,
    SSL_OP_NETSCAPE_CA_DN_BUG: Double,
    SSL_OP_NETSCAPE_CHALLENGE_BUG: Double,
    SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Double,
    SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Double,
    SSL_OP_NO_COMPRESSION: Double,
    SSL_OP_NO_QUERY_MTU: Double,
    SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double,
    SSL_OP_NO_SSLv2: Double,
    SSL_OP_NO_SSLv3: Double,
    SSL_OP_NO_TICKET: Double,
    SSL_OP_NO_TLSv1: Double,
    SSL_OP_NO_TLSv1_1: Double,
    SSL_OP_NO_TLSv1_2: Double,
    SSL_OP_PKCS1_CHECK_1: Double,
    SSL_OP_PKCS1_CHECK_2: Double,
    SSL_OP_SINGLE_DH_USE: Double,
    SSL_OP_SINGLE_ECDH_USE: Double,
    SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Double,
    SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Double,
    SSL_OP_TLS_BLOCK_PADDING_BUG: Double,
    SSL_OP_TLS_D5_BUG: Double,
    SSL_OP_TLS_ROLLBACK_BUG: Double,
    defaultCipherList: java.lang.String,
    defaultCoreCipherList: java.lang.String
  ): TypeofcryptoConstants = {
    val __obj = js.Dynamic.literal(ALPN_ENABLED = ALPN_ENABLED.asInstanceOf[js.Any], DH_CHECK_P_NOT_PRIME = DH_CHECK_P_NOT_PRIME.asInstanceOf[js.Any], DH_CHECK_P_NOT_SAFE_PRIME = DH_CHECK_P_NOT_SAFE_PRIME.asInstanceOf[js.Any], DH_NOT_SUITABLE_GENERATOR = DH_NOT_SUITABLE_GENERATOR.asInstanceOf[js.Any], DH_UNABLE_TO_CHECK_GENERATOR = DH_UNABLE_TO_CHECK_GENERATOR.asInstanceOf[js.Any], ENGINE_METHOD_ALL = ENGINE_METHOD_ALL.asInstanceOf[js.Any], ENGINE_METHOD_CIPHERS = ENGINE_METHOD_CIPHERS.asInstanceOf[js.Any], ENGINE_METHOD_DH = ENGINE_METHOD_DH.asInstanceOf[js.Any], ENGINE_METHOD_DIGESTS = ENGINE_METHOD_DIGESTS.asInstanceOf[js.Any], ENGINE_METHOD_DSA = ENGINE_METHOD_DSA.asInstanceOf[js.Any], ENGINE_METHOD_EC = ENGINE_METHOD_EC.asInstanceOf[js.Any], ENGINE_METHOD_NONE = ENGINE_METHOD_NONE.asInstanceOf[js.Any], ENGINE_METHOD_PKEY_ASN1_METHS = ENGINE_METHOD_PKEY_ASN1_METHS.asInstanceOf[js.Any], ENGINE_METHOD_PKEY_METHS = ENGINE_METHOD_PKEY_METHS.asInstanceOf[js.Any], ENGINE_METHOD_RAND = ENGINE_METHOD_RAND.asInstanceOf[js.Any], ENGINE_METHOD_RSA = ENGINE_METHOD_RSA.asInstanceOf[js.Any], OPENSSL_VERSION_NUMBER = OPENSSL_VERSION_NUMBER.asInstanceOf[js.Any], POINT_CONVERSION_COMPRESSED = POINT_CONVERSION_COMPRESSED.asInstanceOf[js.Any], POINT_CONVERSION_HYBRID = POINT_CONVERSION_HYBRID.asInstanceOf[js.Any], POINT_CONVERSION_UNCOMPRESSED = POINT_CONVERSION_UNCOMPRESSED.asInstanceOf[js.Any], RSA_NO_PADDING = RSA_NO_PADDING.asInstanceOf[js.Any], RSA_PKCS1_OAEP_PADDING = RSA_PKCS1_OAEP_PADDING.asInstanceOf[js.Any], RSA_PKCS1_PADDING = RSA_PKCS1_PADDING.asInstanceOf[js.Any], RSA_PKCS1_PSS_PADDING = RSA_PKCS1_PSS_PADDING.asInstanceOf[js.Any], RSA_PSS_SALTLEN_AUTO = RSA_PSS_SALTLEN_AUTO.asInstanceOf[js.Any], RSA_PSS_SALTLEN_DIGEST = RSA_PSS_SALTLEN_DIGEST.asInstanceOf[js.Any], RSA_PSS_SALTLEN_MAX_SIGN = RSA_PSS_SALTLEN_MAX_SIGN.asInstanceOf[js.Any], RSA_SSLV23_PADDING = RSA_SSLV23_PADDING.asInstanceOf[js.Any], RSA_X931_PADDING = RSA_X931_PADDING.asInstanceOf[js.Any], SSL_OP_ALL = SSL_OP_ALL.asInstanceOf[js.Any], SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION = SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION.asInstanceOf[js.Any], SSL_OP_CIPHER_SERVER_PREFERENCE = SSL_OP_CIPHER_SERVER_PREFERENCE.asInstanceOf[js.Any], SSL_OP_CISCO_ANYCONNECT = SSL_OP_CISCO_ANYCONNECT.asInstanceOf[js.Any], SSL_OP_COOKIE_EXCHANGE = SSL_OP_COOKIE_EXCHANGE.asInstanceOf[js.Any], SSL_OP_CRYPTOPRO_TLSEXT_BUG = SSL_OP_CRYPTOPRO_TLSEXT_BUG.asInstanceOf[js.Any], SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS = SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS.asInstanceOf[js.Any], SSL_OP_EPHEMERAL_RSA = SSL_OP_EPHEMERAL_RSA.asInstanceOf[js.Any], SSL_OP_LEGACY_SERVER_CONNECT = SSL_OP_LEGACY_SERVER_CONNECT.asInstanceOf[js.Any], SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER = SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER.asInstanceOf[js.Any], SSL_OP_MICROSOFT_SESS_ID_BUG = SSL_OP_MICROSOFT_SESS_ID_BUG.asInstanceOf[js.Any], SSL_OP_MSIE_SSLV2_RSA_PADDING = SSL_OP_MSIE_SSLV2_RSA_PADDING.asInstanceOf[js.Any], SSL_OP_NETSCAPE_CA_DN_BUG = SSL_OP_NETSCAPE_CA_DN_BUG.asInstanceOf[js.Any], SSL_OP_NETSCAPE_CHALLENGE_BUG = SSL_OP_NETSCAPE_CHALLENGE_BUG.asInstanceOf[js.Any], SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG = SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG.asInstanceOf[js.Any], SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG = SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG.asInstanceOf[js.Any], SSL_OP_NO_COMPRESSION = SSL_OP_NO_COMPRESSION.asInstanceOf[js.Any], SSL_OP_NO_QUERY_MTU = SSL_OP_NO_QUERY_MTU.asInstanceOf[js.Any], SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION = SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION.asInstanceOf[js.Any], SSL_OP_NO_SSLv2 = SSL_OP_NO_SSLv2.asInstanceOf[js.Any], SSL_OP_NO_SSLv3 = SSL_OP_NO_SSLv3.asInstanceOf[js.Any], SSL_OP_NO_TICKET = SSL_OP_NO_TICKET.asInstanceOf[js.Any], SSL_OP_NO_TLSv1 = SSL_OP_NO_TLSv1.asInstanceOf[js.Any], SSL_OP_NO_TLSv1_1 = SSL_OP_NO_TLSv1_1.asInstanceOf[js.Any], SSL_OP_NO_TLSv1_2 = SSL_OP_NO_TLSv1_2.asInstanceOf[js.Any], SSL_OP_PKCS1_CHECK_1 = SSL_OP_PKCS1_CHECK_1.asInstanceOf[js.Any], SSL_OP_PKCS1_CHECK_2 = SSL_OP_PKCS1_CHECK_2.asInstanceOf[js.Any], SSL_OP_SINGLE_DH_USE = SSL_OP_SINGLE_DH_USE.asInstanceOf[js.Any], SSL_OP_SINGLE_ECDH_USE = SSL_OP_SINGLE_ECDH_USE.asInstanceOf[js.Any], SSL_OP_SSLEAY_080_CLIENT_DH_BUG = SSL_OP_SSLEAY_080_CLIENT_DH_BUG.asInstanceOf[js.Any], SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG = SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG.asInstanceOf[js.Any], SSL_OP_TLS_BLOCK_PADDING_BUG = SSL_OP_TLS_BLOCK_PADDING_BUG.asInstanceOf[js.Any], SSL_OP_TLS_D5_BUG = SSL_OP_TLS_D5_BUG.asInstanceOf[js.Any], SSL_OP_TLS_ROLLBACK_BUG = SSL_OP_TLS_ROLLBACK_BUG.asInstanceOf[js.Any], defaultCipherList = defaultCipherList.asInstanceOf[js.Any], defaultCoreCipherList = defaultCoreCipherList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofcryptoConstants]
  }
}

