package typings.peerId

import typings.libp2pCrypto.mod.KeyType
import typings.libp2pCrypto.mod.PrivateKey
import typings.libp2pCrypto.mod.PublicKey
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * PeerId is an object representation of a peer identifier.
    */
  @JSImport("peer-id", JSImport.Namespace)
  @js.native
  class ^ protected () extends PeerId {
    def this(id: Uint8Array) = this()
    def this(id: Uint8Array, privKey: PrivateKey) = this()
    def this(id: Uint8Array, privKey: js.UndefOr[scala.Nothing], pubKey: PublicKey) = this()
    def this(id: Uint8Array, privKey: PrivateKey, pubKey: PublicKey) = this()
  }
  
  /**
    * Create a new PeerId.
    * @param opts Options.
    */
  @JSImport("peer-id", "create")
  @js.native
  def create(): js.Promise[PeerId] = js.native
  @JSImport("peer-id", "create")
  @js.native
  def create(opts: CreateOptions): js.Promise[PeerId] = js.native
  
  /**
    * Create PeerId from base58-encoded string.
    * @param str The base58-encoded string.
    */
  @JSImport("peer-id", "createFromB58String")
  @js.native
  def createFromB58String(str: String): PeerId = js.native
  
  /**
    * Create PeerId from raw bytes.
    * @param buf The raw bytes.
    */
  @JSImport("peer-id", "createFromBytes")
  @js.native
  def createFromBytes(buf: Uint8Array): PeerId = js.native
  
  @JSImport("peer-id", "createFromCID")
  @js.native
  def createFromCID(cid: String): PeerId = js.native
  @JSImport("peer-id", "createFromCID")
  @js.native
  def createFromCID(cid: js.Object): PeerId = js.native
  /**
    * Create PeerId from CID.
    * @param cid The CID.
    */
  @JSImport("peer-id", "createFromCID")
  @js.native
  def createFromCID(cid: typings.cids.mod.^): PeerId = js.native
  @JSImport("peer-id", "createFromCID")
  @js.native
  def createFromCID(cid: Uint8Array): PeerId = js.native
  
  /**
    * Create PeerId from hex string.
    * @param str The input hex string.
    */
  @JSImport("peer-id", "createFromHexString")
  @js.native
  def createFromHexString(str: String): PeerId = js.native
  
  /**
    * Create PeerId from PeerId JSON formatted object.
    * @see {@link PeerId#toJSON}
    * @param json PeerId in JSON format.
    */
  @JSImport("peer-id", "createFromJSON")
  @js.native
  def createFromJSON(json: JSONPeerId): js.Promise[PeerId] = js.native
  
  @JSImport("peer-id", "createFromPrivKey")
  @js.native
  def createFromPrivKey(key: String): js.Promise[PeerId] = js.native
  /**
    * Create PeerId from private key.
    * @param key Private key, as Uint8Array or base64-encoded string.
    */
  @JSImport("peer-id", "createFromPrivKey")
  @js.native
  def createFromPrivKey(key: Uint8Array): js.Promise[PeerId] = js.native
  
  @JSImport("peer-id", "createFromProtobuf")
  @js.native
  def createFromProtobuf(buf: String): js.Promise[PeerId] = js.native
  /**
    * Create PeerId from Protobuf bytes.
    * @param buf Protobuf bytes, as Uint8Array or hex-encoded string.
    */
  @JSImport("peer-id", "createFromProtobuf")
  @js.native
  def createFromProtobuf(buf: Uint8Array): js.Promise[PeerId] = js.native
  
  @JSImport("peer-id", "createFromPubKey")
  @js.native
  def createFromPubKey(key: String): js.Promise[PeerId] = js.native
  /**
    * Create PeerId from public key.
    * @param key Public key, as Uint8Array or base64-encoded string.
    */
  @JSImport("peer-id", "createFromPubKey")
  @js.native
  def createFromPubKey(key: Uint8Array): js.Promise[PeerId] = js.native
  
  /**
    * Checks if a value is an instance of PeerId.
    * @param id The value to check.
    */
  @JSImport("peer-id", "isPeerId")
  @js.native
  def isPeerId(id: js.Any): /* is peer-id.peer-id.PeerId */ Boolean = js.native
  
  /**
    * Options for PeerId creation.
    */
  @js.native
  trait CreateOptions extends StObject {
    
    /**
      * The number of bits to use.
      */
    var bits: js.UndefOr[Double] = js.native
    
    /**
      * The type of key to use.
      */
    var keyType: js.UndefOr[KeyType] = js.native
  }
  object CreateOptions {
    
    @scala.inline
    def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit class CreateOptionsMutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      @scala.inline
      def setKeyType(value: KeyType): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    }
  }
  
  /**
    * PeerId JSON format.
    */
  @js.native
  trait JSONPeerId extends StObject {
    
    /**
      * String representation of PeerId.
      */
    var id: String = js.native
    
    /**
      * Private key.
      */
    var privKey: js.UndefOr[String] = js.native
    
    /**
      * Public key.
      */
    var pubKey: js.UndefOr[String] = js.native
  }
  object JSONPeerId {
    
    @scala.inline
    def apply(id: String): JSONPeerId = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONPeerId]
    }
    
    @scala.inline
    implicit class JSONPeerIdMutableBuilder[Self <: JSONPeerId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivKey(value: String): Self = StObject.set(x, "privKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivKeyUndefined: Self = StObject.set(x, "privKey", js.undefined)
      
      @scala.inline
      def setPubKey(value: String): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
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
