package typings.nodeJose.mod.JWK

import typings.node.Buffer
import typings.nodeJose.anon.PartialKeyStoreGetOptions
import typings.nodeJose.nodeJoseStrings.`private`
import typings.nodeJose.nodeJoseStrings.json
import typings.nodeJose.nodeJoseStrings.pem
import typings.nodeJose.nodeJoseStrings.pkcs8
import typings.nodeJose.nodeJoseStrings.pkix
import typings.nodeJose.nodeJoseStrings.public
import typings.nodeJose.nodeJoseStrings.spki
import typings.nodeJose.nodeJoseStrings.x509
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def add(
    key: String | Buffer | Key | js.Object,
    form: js.UndefOr[json | `private` | pkcs8 | public | spki | pkix | x509 | pem],
    extras: js.UndefOr[Record[String, _]]
  ): js.Promise[Key] = js.native
  def add(key: RawKey): js.Promise[Key] = js.native
  
  def all(): js.Array[RawKey] = js.native
  def all(options: PartialKeyStoreGetOptions): js.Array[RawKey] = js.native
  
  /**
    * Generates a new random Key into this KeyStore.
    *
    * The type of {size} depends on the value of {kty}:
    *
    * + **`EC`**: String naming the curve to use, which can be one of:
    *   `"P-256"`, `"P-384"`, or `"P-521"` (default is **`"P-256"`**).
    * + **`RSA`**: Number describing the size of the key, in bits (default is
    *   **`2048`**).
    * + **`oct`**: Number describing the size of the key, in bits (default is
    *   **`256`**).
    *
    * Any properties in {props} are applied before the key is generated,
    * and are expected to be data types acceptable in JSON.  This allows the
    * generated key to have a specific key identifier, or to specify its
    * acceptable usage.
    */
  def generate(kty: String): js.Promise[Key] = js.native
  def generate(kty: String, size: js.UndefOr[scala.Nothing], props: js.Any): js.Promise[Key] = js.native
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
