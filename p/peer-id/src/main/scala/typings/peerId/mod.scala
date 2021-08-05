package typings.peerId

import typings.libp2pCrypto.mod.KeyType
import typings.libp2pCrypto.mod.PrivateKey
import typings.libp2pCrypto.mod.PublicKey
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * PeerId is an object representation of a peer identifier.
    */
  @JSImport("peer-id", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with PeerId {
    def this(id: Uint8Array) = this()
    def this(id: Uint8Array, privKey: PrivateKey) = this()
    def this(id: Uint8Array, privKey: Unit, pubKey: PublicKey) = this()
    def this(id: Uint8Array, privKey: PrivateKey, pubKey: PublicKey) = this()
  }
  @JSImport("peer-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new PeerId.
    * @param opts Options.
    */
  inline def create(): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[PeerId]]
  inline def create(opts: CreateOptions): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  
  /**
    * Create PeerId from base58-encoded string.
    * @param str The base58-encoded string.
    */
  inline def createFromB58String(str: String): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromB58String")(str.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  /**
    * Create PeerId from raw bytes.
    * @param buf The raw bytes.
    */
  inline def createFromBytes(buf: Uint8Array): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBytes")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def createFromCID(cid: String): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromCID")(cid.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  inline def createFromCID(cid: js.Object): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromCID")(cid.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  /**
    * Create PeerId from CID.
    * @param cid The CID.
    */
  inline def createFromCID(cid: typings.cids.mod.^): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromCID")(cid.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  inline def createFromCID(cid: Uint8Array): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromCID")(cid.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  /**
    * Create PeerId from hex string.
    * @param str The input hex string.
    */
  inline def createFromHexString(str: String): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(str.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  /**
    * Create PeerId from PeerId JSON formatted object.
    * @see {@link PeerId#toJSON}
    * @param json PeerId in JSON format.
    */
  inline def createFromJSON(json: JSONPeerId): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  
  inline def createFromPrivKey(key: String): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPrivKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  /**
    * Create PeerId from private key.
    * @param key Private key, as Uint8Array or base64-encoded string.
    */
  inline def createFromPrivKey(key: Uint8Array): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPrivKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  
  inline def createFromProtobuf(buf: String): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  /**
    * Create PeerId from Protobuf bytes.
    * @param buf Protobuf bytes, as Uint8Array or hex-encoded string.
    */
  inline def createFromProtobuf(buf: Uint8Array): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromProtobuf")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  
  inline def createFromPubKey(key: String): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPubKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  /**
    * Create PeerId from public key.
    * @param key Public key, as Uint8Array or base64-encoded string.
    */
  inline def createFromPubKey(key: Uint8Array): js.Promise[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPubKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PeerId]]
  
  /**
    * Checks if a value is an instance of PeerId.
    * @param id The value to check.
    */
  inline def isPeerId(id: js.Any): /* is peer-id.peer-id.PeerId */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPeerId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is peer-id.peer-id.PeerId */ Boolean]
  
  /**
    * Options for PeerId creation.
    */
  trait CreateOptions extends StObject {
    
    /**
      * The number of bits to use.
      */
    var bits: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of key to use.
      */
    var keyType: js.UndefOr[KeyType] = js.undefined
  }
  object CreateOptions {
    
    inline def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    extension [Self <: CreateOptions](x: Self) {
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      inline def setKeyType(value: KeyType): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    }
  }
  
  /**
    * PeerId JSON format.
    */
  trait JSONPeerId extends StObject {
    
    /**
      * String representation of PeerId.
      */
    var id: String
    
    /**
      * Private key.
      */
    var privKey: js.UndefOr[String] = js.undefined
    
    /**
      * Public key.
      */
    var pubKey: js.UndefOr[String] = js.undefined
  }
  object JSONPeerId {
    
    inline def apply(id: String): JSONPeerId = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONPeerId]
    }
    
    extension [Self <: JSONPeerId](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrivKey(value: String): Self = StObject.set(x, "privKey", value.asInstanceOf[js.Any])
      
      inline def setPrivKeyUndefined: Self = StObject.set(x, "privKey", js.undefined)
      
      inline def setPubKey(value: String): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
      
      inline def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
    }
  }
  
  /**
    * PeerId is an object representation of a peer identifier.
    */
  @js.native
  trait PeerId extends StObject {
    
    /**
      * Checks the equality of `this` peer against a given PeerId.
      * @param id The other PeerId.
      */
    def equals(id: PeerId): Boolean = js.native
    def equals(id: Uint8Array): Boolean = js.native
    
    /**
      * Check if the PeerId has an inline public key.
      */
    def hasInlinePublicKey(): Boolean = js.native
    
    /**
      * Raw id.
      */
    val id: Uint8Array = js.native
    
    /**
      * Checks the equality of `this` peer against a given PeerId.
      * @deprecated Use {.equals}
      * @param id The other PeerId.
      */
    def isEqual(id: PeerId): Boolean = js.native
    def isEqual(id: Uint8Array): Boolean = js.native
    
    /**
      * Check if this PeerId instance is valid (privKey -> pubKey -> Id)
      */
    def isValid(): Boolean = js.native
    
    /**
      * Return the protobuf version of the peer-id.
      * @param excludePriv Whether to exclude the private key information from the output.
      */
    def marshal(): Uint8Array = js.native
    def marshal(excludePriv: Boolean): Uint8Array = js.native
    
    /**
      * Return the protobuf version of the private key, matching go ipfs formatting.
      */
    def marshalPrivKey(): Uint8Array = js.native
    
    /**
      * Return the protobuf version of the public key, matching go ipfs formatting.
      */
    def marshalPubKey(): Uint8Array = js.native
    
    /**
      * Private key.
      */
    var privKey: PrivateKey = js.native
    
    /**
      * Public key.
      */
    var pubKey: PublicKey = js.native
    
    /**
      * Encode to base58 string.
      */
    def toB58String(): String = js.native
    
    /**
      * Return raw id bytes.
      */
    def toBytes(): Uint8Array = js.native
    
    /**
      * Encode to hex.
      */
    def toHexString(): String = js.native
    
    /**
      * Return the jsonified version of the key.
      * Matches the formatting of go-ipfs for its config file.
      * @see {@link PeerId.createFromJSON}
      */
    def toJSON(): JSONPeerId = js.native
    
    /**
      * String representation.
      */
    def toPrint(): String = js.native
  }
}
