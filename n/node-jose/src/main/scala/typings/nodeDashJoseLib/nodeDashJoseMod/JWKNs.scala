package typings
package nodeDashJoseLib.nodeDashJoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWK")
@js.native
object JWKNs extends js.Object {
  trait JWEEncryptor extends js.Object {
    def `final`(): js.Promise[java.lang.String]
    def update(input: js.Any): this.type
  }
  
  @js.native
  trait Key extends js.Object {
    var alg: java.lang.String = js.native
    var keystore: KeyStore = js.native
    var kid: java.lang.String = js.native
    var kty: java.lang.String = js.native
    var length: scala.Double = js.native
    var use: KeyUse = js.native
    def thumbprint(): js.Promise[java.lang.String] = js.native
    def thumbprint(hash: java.lang.String): js.Promise[java.lang.String] = js.native
    def toJSON(): js.Object = js.native
    def toJSON(isPrivate: scala.Boolean): js.Object = js.native
    def toJSON(isPrivate: scala.Boolean, excluded: js.Array[java.lang.String]): js.Object = js.native
    def toPEM(): java.lang.String = js.native
    def toPEM(isPrivate: scala.Boolean): java.lang.String = js.native
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
    def add(key: java.lang.String | nodeLib.Buffer | Key | js.Object): js.Promise[Key] = js.native
    def add(
      key: java.lang.String | nodeLib.Buffer | Key | js.Object,
      form: nodeDashJoseLib.nodeDashJoseLibStrings.json | nodeDashJoseLib.nodeDashJoseLibStrings.`private` | nodeDashJoseLib.nodeDashJoseLibStrings.pkcs8 | nodeDashJoseLib.nodeDashJoseLibStrings.public | nodeDashJoseLib.nodeDashJoseLibStrings.spki | nodeDashJoseLib.nodeDashJoseLibStrings.pkix | nodeDashJoseLib.nodeDashJoseLibStrings.x509 | nodeDashJoseLib.nodeDashJoseLibStrings.pem
    ): js.Promise[Key] = js.native
    def add(key: RawKey): js.Promise[Key] = js.native
    def all(): js.Array[RawKey] = js.native
    def all(options: stdLib.Partial[KeyStoreGetOptions]): js.Array[RawKey] = js.native
    def generate(kty: java.lang.String): js.Promise[Key] = js.native
    def generate(kty: java.lang.String, size: java.lang.String): js.Promise[Key] = js.native
    def generate(kty: java.lang.String, size: java.lang.String, props: js.Any): js.Promise[Key] = js.native
    def generate(kty: java.lang.String, size: scala.Double): js.Promise[Key] = js.native
    def generate(kty: java.lang.String, size: scala.Double, props: js.Any): js.Promise[Key] = js.native
    /**
      * To retrieve a key from a keystore
      */
    def get(kid: java.lang.String): RawKey = js.native
    def get(kid: java.lang.String, filter: KeyStoreGetFilter): RawKey = js.native
    def get(options: KeyStoreGetOptions): RawKey = js.native
    def remove(key: Key): scala.Unit = js.native
    /**
      * To export the public keys of a keystore as a JWK-set
      */
    def toJSON(): js.Object = js.native
    def toJSON(exportPrivateKeys: scala.Boolean): js.Object = js.native
  }
  
  trait KeyStoreGetFilter extends js.Object {
    var alg: js.UndefOr[java.lang.String] = js.undefined
    var kty: js.UndefOr[java.lang.String] = js.undefined
    var use: js.UndefOr[KeyUse] = js.undefined
  }
  
  trait KeyStoreGetOptions extends KeyStoreGetFilter {
    var kid: java.lang.String
  }
  
  /* Rewritten from type alias, can be one of: 
    - nodeDashJoseLib.nodeDashJoseLibStrings.sig
    - nodeDashJoseLib.nodeDashJoseLibStrings.enc
    - nodeDashJoseLib.nodeDashJoseLibStrings.desc
  */
  trait KeyUse extends js.Object
  
  trait RawKey extends js.Object {
    var alg: java.lang.String
    // e and n make up the public key
    var e: java.lang.String
    var kty: java.lang.String
    var n: java.lang.String
    var use: KeyUse
  }
  
  val MODE_DECRYPT: java.lang.String = js.native
  val MODE_ENCRYPT: java.lang.String = js.native
  val MODE_SIGN: java.lang.String = js.native
  val MODE_UNWRAP: java.lang.String = js.native
  val MODE_VERIFY: java.lang.String = js.native
  val MODE_WRAP: java.lang.String = js.native
  def asKey(key: java.lang.String | nodeLib.Buffer | js.Object | RawKey): js.Promise[Key] = js.native
  def asKey(
    key: java.lang.String | nodeLib.Buffer | js.Object | RawKey,
    form: nodeDashJoseLib.nodeDashJoseLibStrings.json | nodeDashJoseLib.nodeDashJoseLibStrings.`private` | nodeDashJoseLib.nodeDashJoseLibStrings.pkcs8 | nodeDashJoseLib.nodeDashJoseLibStrings.public | nodeDashJoseLib.nodeDashJoseLibStrings.spki | nodeDashJoseLib.nodeDashJoseLibStrings.pkix | nodeDashJoseLib.nodeDashJoseLibStrings.x509 | nodeDashJoseLib.nodeDashJoseLibStrings.pem
  ): js.Promise[Key] = js.native
  def asKeyStore(ks: java.lang.String): js.Promise[KeyStore] = js.native
  /**
    * To import a JWK-set as a keystore
    */
  def asKeyStore(ks: js.Object): js.Promise[KeyStore] = js.native
  def createKey(kty: js.Any, size: js.Any, props: js.Any): js.Promise[Key] = js.native
  /**
    * To create an empty keystore
    */
  def createKeyStore(): KeyStore = js.native
  def isKey(input: js.Any): /* is node-jose.node-jose.JWK.Key */ scala.Boolean = js.native
  def isKeyStore(input: js.Any): /* is node-jose.node-jose.JWK.KeyStore */ scala.Boolean = js.native
}

