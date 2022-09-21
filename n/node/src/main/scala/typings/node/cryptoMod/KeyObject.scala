package typings.node.cryptoMod

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.webcrypto.CryptoKey
import typings.node.nodeStrings.der
import typings.node.nodeStrings.pem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node.js uses a `KeyObject` class to represent a symmetric or asymmetric key,
  * and each kind of key exposes different functions. The {@link createSecretKey}, {@link createPublicKey} and {@link createPrivateKey} methods are used to create `KeyObject`instances. `KeyObject`
  * objects are not to be created directly using the `new`keyword.
  *
  * Most applications should consider using the new `KeyObject` API instead of
  * passing keys as strings or `Buffer`s due to improved security features.
  *
  * `KeyObject` instances can be passed to other threads via `postMessage()`.
  * The receiver obtains a cloned `KeyObject`, and the `KeyObject` does not need to
  * be listed in the `transferList` argument.
  * @since v11.6.0
  */
@JSImport("crypto", "KeyObject")
@js.native
/* private */ open class KeyObject ()
  extends StObject
     with _KeyLike {
  
  /**
    * This property exists only on asymmetric keys. Depending on the type of the key,
    * this object contains information about the key. None of the information obtained
    * through this property can be used to uniquely identify a key or to compromise
    * the security of the key.
    *
    * For RSA-PSS keys, if the key material contains a `RSASSA-PSS-params` sequence,
    * the `hashAlgorithm`, `mgf1HashAlgorithm`, and `saltLength` properties will be
    * set.
    *
    * Other key details might be exposed via this API using additional attributes.
    * @since v15.7.0
    */
  var asymmetricKeyDetails: js.UndefOr[AsymmetricKeyDetails] = js.native
  
  /**
    * For asymmetric keys, this property represents the size of the embedded key in
    * bytes. This property is `undefined` for symmetric keys.
    */
  var asymmetricKeySize: js.UndefOr[Double] = js.native
  
  /**
    * For asymmetric keys, this property represents the type of the key. Supported key
    * types are:
    *
    * * `'rsa'` (OID 1.2.840.113549.1.1.1)
    * * `'rsa-pss'` (OID 1.2.840.113549.1.1.10)
    * * `'dsa'` (OID 1.2.840.10040.4.1)
    * * `'ec'` (OID 1.2.840.10045.2.1)
    * * `'x25519'` (OID 1.3.101.110)
    * * `'x448'` (OID 1.3.101.111)
    * * `'ed25519'` (OID 1.3.101.112)
    * * `'ed448'` (OID 1.3.101.113)
    * * `'dh'` (OID 1.2.840.113549.1.3.1)
    *
    * This property is `undefined` for unrecognized `KeyObject` types and symmetric
    * keys.
    * @since v11.6.0
    */
  var asymmetricKeyType: js.UndefOr[KeyType] = js.native
  
  def `export`(): JsonWebKey = js.native
  def `export`(options: JwkKeyExportOptions): JsonWebKey = js.native
  @JSName("export")
  def export_Buffer(): Buffer = js.native
  @JSName("export")
  def export_der(options: KeyExportOptions[der]): Buffer = js.native
  /**
    * For symmetric keys, the following encoding options can be used:
    *
    * For public keys, the following encoding options can be used:
    *
    * For private keys, the following encoding options can be used:
    *
    * The result type depends on the selected encoding format, when PEM the
    * result is a string, when DER it will be a buffer containing the data
    * encoded as DER, when [JWK](https://tools.ietf.org/html/rfc7517) it will be an object.
    *
    * When [JWK](https://tools.ietf.org/html/rfc7517) encoding format was selected, all other encoding options are
    * ignored.
    *
    * PKCS#1, SEC1, and PKCS#8 type keys can be encrypted by using a combination of
    * the `cipher` and `format` options. The PKCS#8 `type` can be used with any`format` to encrypt any key algorithm (RSA, EC, or DH) by specifying a`cipher`. PKCS#1 and SEC1 can only be
    * encrypted by specifying a `cipher`when the PEM `format` is used. For maximum compatibility, use PKCS#8 for
    * encrypted private keys. Since PKCS#8 defines its own
    * encryption mechanism, PEM-level encryption is not supported when encrypting
    * a PKCS#8 key. See [RFC 5208](https://www.rfc-editor.org/rfc/rfc5208.txt) for PKCS#8 encryption and [RFC 1421](https://www.rfc-editor.org/rfc/rfc1421.txt) for
    * PKCS#1 and SEC1 encryption.
    * @since v11.6.0
    */
  @JSName("export")
  def export_pem(options: KeyExportOptions[pem]): String | Buffer = js.native
  
  /**
    * For secret keys, this property represents the size of the key in bytes. This
    * property is `undefined` for asymmetric keys.
    * @since v11.6.0
    */
  var symmetricKeySize: js.UndefOr[Double] = js.native
  
  /**
    * Depending on the type of this `KeyObject`, this property is either`'secret'` for secret (symmetric) keys, `'public'` for public (asymmetric) keys
    * or `'private'` for private (asymmetric) keys.
    * @since v11.6.0
    */
  var `type`: KeyObjectType = js.native
}
object KeyObject {
  
  @JSImport("crypto", "KeyObject")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Example: Converting a `CryptoKey` instance to a `KeyObject`:
    *
    * ```js
    * const { webcrypto, KeyObject } = await import('crypto');
    * const { subtle } = webcrypto;
    *
    * const key = await subtle.generateKey({
    *   name: 'HMAC',
    *   hash: 'SHA-256',
    *   length: 256
    * }, true, ['sign', 'verify']);
    *
    * const keyObject = KeyObject.from(key);
    * console.log(keyObject.symmetricKeySize);
    * // Prints: 32 (symmetric key size in bytes)
    * ```
    * @since v15.0.0
    */
  /* static member */
  inline def from(key: CryptoKey): KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(key.asInstanceOf[js.Any]).asInstanceOf[KeyObject]
}
