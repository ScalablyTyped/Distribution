package typings.nodeJose.mod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWK {
  
  @JSImport("node-jose", "JWK.MODE_DECRYPT")
  @js.native
  val MODE_DECRYPT: String = js.native
  
  @JSImport("node-jose", "JWK.MODE_ENCRYPT")
  @js.native
  val MODE_ENCRYPT: String = js.native
  
  @JSImport("node-jose", "JWK.MODE_SIGN")
  @js.native
  val MODE_SIGN: String = js.native
  
  @JSImport("node-jose", "JWK.MODE_UNWRAP")
  @js.native
  val MODE_UNWRAP: String = js.native
  
  @JSImport("node-jose", "JWK.MODE_VERIFY")
  @js.native
  val MODE_VERIFY: String = js.native
  
  @JSImport("node-jose", "JWK.MODE_WRAP")
  @js.native
  val MODE_WRAP: String = js.native
  
  @JSImport("node-jose", "JWK.asKey")
  @js.native
  def asKey(
    key: String | Buffer | js.Object | RawKey,
    form: js.UndefOr[json | `private` | pkcs8 | public | spki | pkix | x509 | pem],
    extras: js.UndefOr[Record[String, _]]
  ): js.Promise[Key] = js.native
  
  @JSImport("node-jose", "JWK.asKeyStore")
  @js.native
  def asKeyStore(ks: String): js.Promise[KeyStore] = js.native
  /**
    * To import a JWK-set as a keystore
    */
  @JSImport("node-jose", "JWK.asKeyStore")
  @js.native
  def asKeyStore(ks: js.Object): js.Promise[KeyStore] = js.native
  
  @JSImport("node-jose", "JWK.createKey")
  @js.native
  def createKey(kty: js.Any, size: js.Any, props: js.Any): js.Promise[Key] = js.native
  
  /**
    * To create an empty keystore
    */
  @JSImport("node-jose", "JWK.createKeyStore")
  @js.native
  def createKeyStore(): KeyStore = js.native
  
  @JSImport("node-jose", "JWK.isKey")
  @js.native
  def isKey(input: js.Any): /* is node-jose.node-jose.JWK.Key */ Boolean = js.native
  
  @JSImport("node-jose", "JWK.isKeyStore")
  @js.native
  def isKeyStore(input: js.Any): /* is node-jose.node-jose.JWK.KeyStore */ Boolean = js.native
  
  @js.native
  trait JWEEncryptor extends StObject {
    
    def `final`(): js.Promise[String] = js.native
    
    def update(input: js.Any): this.type = js.native
  }
  object JWEEncryptor {
    
    @scala.inline
    def apply(`final`: () => js.Promise[String], update: js.Any => JWEEncryptor): JWEEncryptor = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
      __obj.asInstanceOf[JWEEncryptor]
    }
    
    @scala.inline
    implicit class JWEEncryptorMutableBuilder[Self <: JWEEncryptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinal(value: () => js.Promise[String]): Self = StObject.set(x, "final", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: js.Any => JWEEncryptor): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var alg: String = js.native
    
    var keystore: KeyStore = js.native
    
    var kid: String = js.native
    
    var kty: String = js.native
    
    var length: Double = js.native
    
    def thumbprint(): js.Promise[String] = js.native
    def thumbprint(hash: String): js.Promise[String] = js.native
    
    def toJSON(): js.Object = js.native
    def toJSON(isPrivate: js.UndefOr[scala.Nothing], excluded: js.Array[String]): js.Object = js.native
    def toJSON(isPrivate: Boolean): js.Object = js.native
    def toJSON(isPrivate: Boolean, excluded: js.Array[String]): js.Object = js.native
    
    def toPEM(): String = js.native
    def toPEM(isPrivate: Boolean): String = js.native
    
    var use: KeyUse = js.native
  }
  
  @js.native
  trait KeyStore extends StObject {
    
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
  
  @js.native
  trait KeyStoreGetFilter extends StObject {
    
    var alg: js.UndefOr[String] = js.native
    
    var kty: js.UndefOr[String] = js.native
    
    var use: js.UndefOr[KeyUse] = js.native
  }
  object KeyStoreGetFilter {
    
    @scala.inline
    def apply(): KeyStoreGetFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyStoreGetFilter]
    }
    
    @scala.inline
    implicit class KeyStoreGetFilterMutableBuilder[Self <: KeyStoreGetFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      @scala.inline
      def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
      
      @scala.inline
      def setUse(value: KeyUse): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
  
  @js.native
  trait KeyStoreGetOptions extends KeyStoreGetFilter {
    
    var kid: String = js.native
  }
  object KeyStoreGetOptions {
    
    @scala.inline
    def apply(kid: String): KeyStoreGetOptions = {
      val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyStoreGetOptions]
    }
    
    @scala.inline
    implicit class KeyStoreGetOptionsMutableBuilder[Self <: KeyStoreGetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeJose.nodeJoseStrings.sig
    - typings.nodeJose.nodeJoseStrings.enc
    - typings.nodeJose.nodeJoseStrings.desc
  */
  trait KeyUse extends StObject
  object KeyUse {
    
    @scala.inline
    def desc: typings.nodeJose.nodeJoseStrings.desc = "desc".asInstanceOf[typings.nodeJose.nodeJoseStrings.desc]
    
    @scala.inline
    def enc: typings.nodeJose.nodeJoseStrings.enc = "enc".asInstanceOf[typings.nodeJose.nodeJoseStrings.enc]
    
    @scala.inline
    def sig: typings.nodeJose.nodeJoseStrings.sig = "sig".asInstanceOf[typings.nodeJose.nodeJoseStrings.sig]
  }
  
  @js.native
  trait RawKey extends StObject {
    
    var alg: String = js.native
    
    // e and n make up the public key
    var e: String = js.native
    
    var kid: String = js.native
    
    var kty: String = js.native
    
    var n: String = js.native
    
    var use: KeyUse = js.native
  }
  object RawKey {
    
    @scala.inline
    def apply(alg: String, e: String, kid: String, kty: String, n: String, use: KeyUse): RawKey = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawKey]
    }
    
    @scala.inline
    implicit class RawKeyMutableBuilder[Self <: RawKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse(value: KeyUse): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    }
  }
}
