package typings
package mzLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "constants")
@js.native
object constantsNs extends js.Object {
  val ALPN_ENABLED: scala.Double = js.native
  val DH_CHECK_P_NOT_PRIME: scala.Double = js.native
  val DH_CHECK_P_NOT_SAFE_PRIME: scala.Double = js.native
  val DH_NOT_SUITABLE_GENERATOR: scala.Double = js.native
  val DH_UNABLE_TO_CHECK_GENERATOR: scala.Double = js.native
  val ENGINE_METHOD_ALL: scala.Double = js.native
  val ENGINE_METHOD_CIPHERS: scala.Double = js.native
  val ENGINE_METHOD_DH: scala.Double = js.native
  val ENGINE_METHOD_DIGESTS: scala.Double = js.native
  val ENGINE_METHOD_DSA: scala.Double = js.native
  val ENGINE_METHOD_EC: scala.Double = js.native
  val ENGINE_METHOD_NONE: scala.Double = js.native
  val ENGINE_METHOD_PKEY_ASN1_METHS: scala.Double = js.native
  val ENGINE_METHOD_PKEY_METHS: scala.Double = js.native
  val ENGINE_METHOD_RAND: scala.Double = js.native
  val ENGINE_METHOD_RSA: scala.Double = js.native
  // https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
  val OPENSSL_VERSION_NUMBER: scala.Double = js.native
  val POINT_CONVERSION_COMPRESSED: scala.Double = js.native
  val POINT_CONVERSION_HYBRID: scala.Double = js.native
  val POINT_CONVERSION_UNCOMPRESSED: scala.Double = js.native
  val RSA_NO_PADDING: scala.Double = js.native
  val RSA_PKCS1_OAEP_PADDING: scala.Double = js.native
  val RSA_PKCS1_PADDING: scala.Double = js.native
  val RSA_PKCS1_PSS_PADDING: scala.Double = js.native
  /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
  val RSA_PSS_SALTLEN_AUTO: scala.Double = js.native
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
  val RSA_PSS_SALTLEN_DIGEST: scala.Double = js.native
  /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
  val RSA_PSS_SALTLEN_MAX_SIGN: scala.Double = js.native
  val RSA_SSLV23_PADDING: scala.Double = js.native
  val RSA_X931_PADDING: scala.Double = js.native
  /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
  val SSL_OP_ALL: scala.Double = js.native
  /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: scala.Double = js.native
  /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
  val SSL_OP_CIPHER_SERVER_PREFERENCE: scala.Double = js.native
  /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
  val SSL_OP_CISCO_ANYCONNECT: scala.Double = js.native
  /** Instructs OpenSSL to turn on cookie exchange. */
  val SSL_OP_COOKIE_EXCHANGE: scala.Double = js.native
  /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
  val SSL_OP_CRYPTOPRO_TLSEXT_BUG: scala.Double = js.native
  /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
  val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: scala.Double = js.native
  /** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
  val SSL_OP_EPHEMERAL_RSA: scala.Double = js.native
  /** Allows initial connection to servers that do not support RI. */
  val SSL_OP_LEGACY_SERVER_CONNECT: scala.Double = js.native
  val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: scala.Double = js.native
  val SSL_OP_MICROSOFT_SESS_ID_BUG: scala.Double = js.native
  /** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
  val SSL_OP_MSIE_SSLV2_RSA_PADDING: scala.Double = js.native
  val SSL_OP_NETSCAPE_CA_DN_BUG: scala.Double = js.native
  val SSL_OP_NETSCAPE_CHALLENGE_BUG: scala.Double = js.native
  val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: scala.Double = js.native
  val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: scala.Double = js.native
  /** Instructs OpenSSL to disable support for SSL/TLS compression. */
  val SSL_OP_NO_COMPRESSION: scala.Double = js.native
  val SSL_OP_NO_QUERY_MTU: scala.Double = js.native
  /** Instructs OpenSSL to always start a new session when performing renegotiation. */
  val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: scala.Double = js.native
  val SSL_OP_NO_SSLv2: scala.Double = js.native
  val SSL_OP_NO_SSLv3: scala.Double = js.native
  val SSL_OP_NO_TICKET: scala.Double = js.native
  val SSL_OP_NO_TLSv1: scala.Double = js.native
  val SSL_OP_NO_TLSv1_1: scala.Double = js.native
  val SSL_OP_NO_TLSv1_2: scala.Double = js.native
  val SSL_OP_PKCS1_CHECK_1: scala.Double = js.native
  val SSL_OP_PKCS1_CHECK_2: scala.Double = js.native
  /** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
  val SSL_OP_SINGLE_DH_USE: scala.Double = js.native
  /** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
  val SSL_OP_SINGLE_ECDH_USE: scala.Double = js.native
  val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: scala.Double = js.native
  val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: scala.Double = js.native
  val SSL_OP_TLS_BLOCK_PADDING_BUG: scala.Double = js.native
  val SSL_OP_TLS_D5_BUG: scala.Double = js.native
  /** Instructs OpenSSL to disable version rollback attack detection. */
  val SSL_OP_TLS_ROLLBACK_BUG: scala.Double = js.native
  /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
  val defaultCipherList: java.lang.String = js.native
  /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
  val defaultCoreCipherList: java.lang.String = js.native
}

