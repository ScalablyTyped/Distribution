package typings.nodeDashJose.nodeDashJoseMod

import typings.node.Buffer
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.Key
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.KeyStore
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.KeyStoreGetFilter
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.KeyStoreGetOptions
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.KeyUse
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.RawKey
import typings.nodeDashJose.nodeDashJoseStrings.`private`
import typings.nodeDashJose.nodeDashJoseStrings.json
import typings.nodeDashJose.nodeDashJoseStrings.pem
import typings.nodeDashJose.nodeDashJoseStrings.pkcs8
import typings.nodeDashJose.nodeDashJoseStrings.pkix
import typings.nodeDashJose.nodeDashJoseStrings.public
import typings.nodeDashJose.nodeDashJoseStrings.spki
import typings.nodeDashJose.nodeDashJoseStrings.x509
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWK")
@js.native
object JWKNs extends js.Object {
  trait JWEEncryptor extends js.Object {
    def `final`(): js.Promise[String]
    def update(input: js.Any): this.type
  }
  
  @js.native
  trait Key extends js.Object {
    var alg: String = js.native
    var keystore: KeyStore = js.native
    var kid: String = js.native
    var kty: String = js.native
    var length: Double = js.native
    var use: KeyUse = js.native
    def thumbprint(): js.Promise[String] = js.native
    def thumbprint(hash: String): js.Promise[String] = js.native
    def toJSON(): js.Object = js.native
    def toJSON(isPrivate: Boolean): js.Object = js.native
    def toJSON(isPrivate: Boolean, excluded: js.Array[String]): js.Object = js.native
    def toPEM(): String = js.native
    def toPEM(isPrivate: Boolean): String = js.native
  }
  
  @js.native
  trait KeyStore extends js.Object {
    /**
      * @param key
      *  String serialization of a JSON JWK/(base64-encoded) PEM/(binary-encoded) DER
      *  Buffer of a JSON JWK/(base64-encoded) PEM/(binary-encoded) DER
      * @param form
      * is either a:
      * - "json" for a JSON stringified JWK
      * - "private" for a DER encoded 'raw' private key
      * - "pkcs8" for a DER encoded (unencrypted!) PKCS8 private key
      * - "public" for a DER encoded SPKI public key (alternate to 'spki')
      * - "spki" for a DER encoded SPKI public key
      * - "pkix" for a DER encoded PKIX X.509 certificate
      * - "x509" for a DER encoded PKIX X.509 certificate
      * - "pem" for a PEM encoded of PKCS8 / SPKI / PKIX
      */
    def add(key: String | Buffer | Key | js.Object): js.Promise[Key] = js.native
    def add(
      key: String | Buffer | Key | js.Object,
      form: json | `private` | pkcs8 | public | spki | pkix | x509 | pem
    ): js.Promise[Key] = js.native
    def add(key: RawKey): js.Promise[Key] = js.native
    def all(): js.Array[RawKey] = js.native
    def all(options: Partial[KeyStoreGetOptions]): js.Array[RawKey] = js.native
    def generate(kty: String): js.Promise[Key] = js.native
    def generate(kty: String, size: String): js.Promise[Key] = js.native
    def generate(kty: String, size: String, props: js.Any): js.Promise[Key] = js.native
    def generate(kty: String, size: Double): js.Promise[Key] = js.native
    def generate(kty: String, size: Double, props: js.Any): js.Promise[Key] = js.native
    /**
      * To retrieve a key from a keystore
      */
    def get(kid: String): RawKey = js.native
    def get(kid: String, filter: KeyStoreGetFilter): RawKey = js.native
    def get(options: KeyStoreGetOptions): RawKey = js.native
    def remove(key: Key): Unit = js.native
    /**
      * To export the public keys of a keystore as a JWK-set
      */
    def toJSON(): js.Object = js.native
    def toJSON(exportPrivateKeys: Boolean): js.Object = js.native
  }
  
  trait KeyStoreGetFilter extends js.Object {
    var alg: js.UndefOr[String] = js.undefined
    var kty: js.UndefOr[String] = js.undefined
    var use: js.UndefOr[KeyUse] = js.undefined
  }
  
  trait KeyStoreGetOptions extends KeyStoreGetFilter {
    var kid: String
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeDashJose.nodeDashJoseStrings.sig
    - typings.nodeDashJose.nodeDashJoseStrings.enc
    - typings.nodeDashJose.nodeDashJoseStrings.desc
  */
  trait KeyUse extends js.Object
  
  trait RawKey extends js.Object {
    var alg: String
    // e and n make up the public key
    var e: String
    var kty: String
    var n: String
    var use: KeyUse
  }
  
  val MODE_DECRYPT: String = js.native
  val MODE_ENCRYPT: String = js.native
  val MODE_SIGN: String = js.native
  val MODE_UNWRAP: String = js.native
  val MODE_VERIFY: String = js.native
  val MODE_WRAP: String = js.native
  def asKey(key: String | Buffer | js.Object | RawKey): js.Promise[Key] = js.native
  def asKey(
    key: String | Buffer | js.Object | RawKey,
    form: json | `private` | pkcs8 | public | spki | pkix | x509 | pem
  ): js.Promise[Key] = js.native
  def asKeyStore(ks: String): js.Promise[KeyStore] = js.native
  /**
    * To import a JWK-set as a keystore
    */
  def asKeyStore(ks: js.Object): js.Promise[KeyStore] = js.native
  def createKey(kty: js.Any, size: js.Any, props: js.Any): js.Promise[Key] = js.native
  /**
    * To create an empty keystore
    */
  def createKeyStore(): KeyStore = js.native
  def isKey(input: js.Any): /* is node-jose.node-jose.JWK.Key */ Boolean = js.native
  def isKeyStore(input: js.Any): /* is node-jose.node-jose.JWK.KeyStore */ Boolean = js.native
}

