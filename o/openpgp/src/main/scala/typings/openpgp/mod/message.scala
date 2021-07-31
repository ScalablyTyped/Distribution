package typings.openpgp.mod

import typings.openpgp.anon.Algorithm
import typings.openpgp.anon.Keyid
import typings.openpgp.mod.enums.compression
import typings.openpgp.mod.packet.List
import typings.openpgp.mod.packet.Literal
import typings.openpgp.mod.signature.Signature
import typings.openpgp.openpgpStrings.binary
import typings.openpgp.openpgpStrings.mime
import typings.openpgp.openpgpStrings.text
import typings.openpgp.openpgpStrings.utf8
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object message {
  
  @JSImport("openpgp", "message")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Class that represents an OpenPGP message.
    * Can be an encrypted message, signed message, compressed message or literal message
    */
  @JSImport("openpgp", "message.Message")
  @js.native
  class Message protected () extends StObject {
    /**
      * @param packetlist The packets that form this message
      *        See {@link https://tools.ietf.org/html/rfc4880#section-11.3}
      */
    def this(packetlist: List) = this()
    
    /**
      * Append signature to unencrypted message object
      * @param detachedSignature The detached ASCII-armored or Uint8Array PGP signature
      */
    def appendSignature(detachedSignature: String): Unit = js.native
    def appendSignature(detachedSignature: Uint8Array): Unit = js.native
    
    /**
      * Returns ASCII armored text of message
      * @returns ASCII armor
      */
    def armor(): ReadableStream[String] = js.native
    
    /**
      * Compresses the message (the literal and -if signed- signature data packets of the message)
      * @param compression compression algorithm to be used
      * @returns new message with compressed content
      */
    def compress(compression: compression): Message = js.native
    
    /**
      * Decrypt the message. Either a private key, a session key, or a password must be specified.
      * @param privateKeys (optional) private keys with decrypted secret data
      * @param passwords (optional) passwords used to decrypt
      * @param sessionKeys (optional) session keys in the form: { data:Uint8Array, algorithm:String, [aeadAlgorithm:String] }
      * @param streaming (optional) whether to process data as a stream
      * @returns new message with decrypted content
      */
    def decrypt(): js.Promise[Message] = js.native
    def decrypt(privateKeys: js.Array[js.Any]): js.Promise[Message] = js.native
    def decrypt(privateKeys: js.Array[js.Any], passwords: js.Array[js.Any]): js.Promise[Message] = js.native
    def decrypt(privateKeys: js.Array[js.Any], passwords: js.Array[js.Any], sessionKeys: js.Array[js.Any]): js.Promise[Message] = js.native
    def decrypt(
      privateKeys: js.Array[js.Any],
      passwords: js.Array[js.Any],
      sessionKeys: js.Array[js.Any],
      streaming: Boolean
    ): js.Promise[Message] = js.native
    def decrypt(privateKeys: js.Array[js.Any], passwords: js.Array[js.Any], sessionKeys: Unit, streaming: Boolean): js.Promise[Message] = js.native
    def decrypt(privateKeys: js.Array[js.Any], passwords: Unit, sessionKeys: js.Array[js.Any]): js.Promise[Message] = js.native
    def decrypt(privateKeys: js.Array[js.Any], passwords: Unit, sessionKeys: js.Array[js.Any], streaming: Boolean): js.Promise[Message] = js.native
    def decrypt(privateKeys: js.Array[js.Any], passwords: Unit, sessionKeys: Unit, streaming: Boolean): js.Promise[Message] = js.native
    def decrypt(privateKeys: Unit, passwords: js.Array[js.Any]): js.Promise[Message] = js.native
    def decrypt(privateKeys: Unit, passwords: js.Array[js.Any], sessionKeys: js.Array[js.Any]): js.Promise[Message] = js.native
    def decrypt(privateKeys: Unit, passwords: js.Array[js.Any], sessionKeys: js.Array[js.Any], streaming: Boolean): js.Promise[Message] = js.native
    def decrypt(privateKeys: Unit, passwords: js.Array[js.Any], sessionKeys: Unit, streaming: Boolean): js.Promise[Message] = js.native
    def decrypt(privateKeys: Unit, passwords: Unit, sessionKeys: js.Array[js.Any]): js.Promise[Message] = js.native
    def decrypt(privateKeys: Unit, passwords: Unit, sessionKeys: js.Array[js.Any], streaming: Boolean): js.Promise[Message] = js.native
    def decrypt(privateKeys: Unit, passwords: Unit, sessionKeys: Unit, streaming: Boolean): js.Promise[Message] = js.native
    
    /**
      * Decrypt encrypted session keys either with private keys or passwords.
      * @param privateKeys (optional) private keys with decrypted secret data
      * @param passwords (optional) passwords used to decrypt
      * @returns array of object with potential sessionKey, algorithm pairs
      */
    def decryptSessionKeys(): js.Promise[js.Array[Algorithm]] = js.native
    def decryptSessionKeys(privateKeys: js.Array[js.Any]): js.Promise[js.Array[Algorithm]] = js.native
    def decryptSessionKeys(privateKeys: js.Array[js.Any], passwords: js.Array[js.Any]): js.Promise[js.Array[Algorithm]] = js.native
    def decryptSessionKeys(privateKeys: Unit, passwords: js.Array[js.Any]): js.Promise[js.Array[Algorithm]] = js.native
    
    /**
      * Encrypt the message either with public keys, passwords, or both at once.
      * @param keys (optional) public key(s) for message encryption
      * @param passwords (optional) password(s) for message encryption
      * @param sessionKey (optional) session key in the form: { data:Uint8Array, algorithm:String, [aeadAlgorithm:String] }
      * @param wildcard (optional) use a key ID of 0 instead of the public key IDs
      * @param date (optional) override the creation date of the literal package
      * @param userIds (optional) user IDs to encrypt for, e.g. [ { name:'Robert Receiver', email:'robert@openpgp.org' }]
      * @param streaming (optional) whether to process data as a stream
      * @returns new message with encrypted content
      */
    def encrypt(
      keys: js.UndefOr[js.Array[js.Any]],
      passwords: js.UndefOr[js.Array[js.Any]],
      sessionKey: js.UndefOr[js.Object],
      wildcard: js.UndefOr[Boolean],
      date: js.UndefOr[Date],
      userIds: js.UndefOr[js.Array[js.Any]],
      streaming: js.UndefOr[Boolean]
    ): js.Promise[Message] = js.native
    
    /**
      * Returns the key IDs of the keys to which the session key is encrypted
      * @returns array of keyid objects
      */
    def getEncryptionKeyIds(): js.Array[js.Any] = js.native
    
    /**
      * Get filename from literal data packet
      * @returns filename of literal data packet as string
      */
    def getFilename(): String | Null = js.native
    
    /**
      * Get literal data that is the body of the message
      * @returns literal body of the message as Uint8Array
      */
    def getLiteralData(): Uint8Array | Null = js.native
    
    /**
      * Returns the key IDs of the keys that signed the message
      * @returns array of keyid objects
      */
    def getSigningKeyIds(): js.Array[js.Any] = js.native
    
    /**
      * Get literal data as text
      * @returns literal body of the message interpreted as text
      */
    def getText(): String | Null = js.native
    
    var packets: List = js.native
    
    /**
      * Sign the message (the literal data packet of the message)
      * @param privateKeys private keys with decrypted secret key data for signing
      * @param signature (optional) any existing detached signature to add to the message
      * @param date (optional) override the creation time of the signature
      * @param userIds (optional) user IDs to sign with, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
      * @returns new message with signed content
      */
    def sign(privateKeys: js.Array[js.Any]): js.Promise[Message] = js.native
    def sign(privateKeys: js.Array[js.Any], signature: Unit, date: Unit, userIds: js.Array[js.Any]): js.Promise[Message] = js.native
    def sign(privateKeys: js.Array[js.Any], signature: Unit, date: Date): js.Promise[Message] = js.native
    def sign(privateKeys: js.Array[js.Any], signature: Unit, date: Date, userIds: js.Array[js.Any]): js.Promise[Message] = js.native
    def sign(privateKeys: js.Array[js.Any], signature: Signature): js.Promise[Message] = js.native
    def sign(privateKeys: js.Array[js.Any], signature: Signature, date: Unit, userIds: js.Array[js.Any]): js.Promise[Message] = js.native
    def sign(privateKeys: js.Array[js.Any], signature: Signature, date: Date): js.Promise[Message] = js.native
    def sign(privateKeys: js.Array[js.Any], signature: Signature, date: Date, userIds: js.Array[js.Any]): js.Promise[Message] = js.native
    
    /**
      * Create a detached signature for the message (the literal data packet of the message)
      * @param privateKeys private keys with decrypted secret key data for signing
      * @param signature (optional) any existing detached signature
      * @param date (optional) override the creation time of the signature
      * @param userIds (optional) user IDs to sign with, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
      * @returns new detached signature of message content
      */
    def signDetached(privateKeys: js.Array[js.Any]): js.Promise[Signature] = js.native
    def signDetached(privateKeys: js.Array[js.Any], signature: Unit, date: Unit, userIds: js.Array[js.Any]): js.Promise[Signature] = js.native
    def signDetached(privateKeys: js.Array[js.Any], signature: Unit, date: Date): js.Promise[Signature] = js.native
    def signDetached(privateKeys: js.Array[js.Any], signature: Unit, date: Date, userIds: js.Array[js.Any]): js.Promise[Signature] = js.native
    def signDetached(privateKeys: js.Array[js.Any], signature: Signature): js.Promise[Signature] = js.native
    def signDetached(privateKeys: js.Array[js.Any], signature: Signature, date: Unit, userIds: js.Array[js.Any]): js.Promise[Signature] = js.native
    def signDetached(privateKeys: js.Array[js.Any], signature: Signature, date: Date): js.Promise[Signature] = js.native
    def signDetached(privateKeys: js.Array[js.Any], signature: Signature, date: Date, userIds: js.Array[js.Any]): js.Promise[Signature] = js.native
    
    /**
      * Unwrap compressed message
      * @returns message Content of compressed message
      */
    def unwrapCompressed(): Message = js.native
    
    /**
      * Verify message signatures
      * @param keys array of keys to verify signatures
      * @param date (optional) Verify the signature against the given date, i.e. check signature creation time < date < expiration time
      * @param streaming (optional) whether to process data as a stream
      * @returns list of signer's keyid and validity of signature
      */
    def verify(keys: js.Array[js.Any]): js.Promise[js.Array[Keyid]] = js.native
    def verify(keys: js.Array[js.Any], date: Unit, streaming: Boolean): js.Promise[js.Array[Keyid]] = js.native
    def verify(keys: js.Array[js.Any], date: Date): js.Promise[js.Array[Keyid]] = js.native
    def verify(keys: js.Array[js.Any], date: Date, streaming: Boolean): js.Promise[js.Array[Keyid]] = js.native
    
    /**
      * Verify detached message signature
      * @param keys array of keys to verify signatures
      * @param signature
      * @param date Verify the signature against the given date, i.e. check signature creation time < date < expiration time
      * @returns list of signer's keyid and validity of signature
      */
    def verifyDetached(keys: js.Array[js.Any], signature: Signature): js.Promise[js.Array[Keyid]] = js.native
    def verifyDetached(keys: js.Array[js.Any], signature: Signature, date: Date): js.Promise[js.Array[Keyid]] = js.native
  }
  
  /**
    * Create signature packets for the message
    * @param literalDataPacket the literal data packet to sign
    * @param privateKeys private keys with decrypted secret key data for signing
    * @param signature (optional) any existing detached signature to append
    * @param date (optional) override the creationtime of the signature
    * @param userIds (optional) user IDs to sign with, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    * @returns list of signature packets
    */
  @scala.inline
  def createSignaturePackets(
    literalDataPacket: Literal,
    privateKeys: js.Array[js.Any],
    signature: Signature,
    date: Date,
    userIds: js.Array[js.Any]
  ): js.Promise[List] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignaturePackets")(literalDataPacket.asInstanceOf[js.Any], privateKeys.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], date.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[List]]
  
  /**
    * Create object containing signer's keyid and validity of signature
    * @param signature signature packets
    * @param literalDataList array of literal data packets
    * @param keys array of keys to verify signatures
    * @param date Verify the signature against the given date,
    *        i.e. check signature creation time < date < expiration time
    * @returns list of signer's keyid and validity of signature
    */
  @scala.inline
  def createVerificationObject(
    signature: typings.openpgp.mod.packet.Signature,
    literalDataList: js.Array[js.Any],
    keys: js.Array[js.Any],
    date: Date
  ): js.Promise[js.Array[Keyid]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerificationObject")(signature.asInstanceOf[js.Any], literalDataList.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Keyid]]]
  
  /**
    * Create list of objects containing signer's keyid and validity of signature
    * @param signatureList array of signature packets
    * @param literalDataList array of literal data packets
    * @param keys array of keys to verify signatures
    * @param date Verify the signature against the given date,
    *        i.e. check signature creation time < date < expiration time
    * @returns list of signer's keyid and validity of signature
    */
  @scala.inline
  def createVerificationObjects(
    signatureList: js.Array[js.Any],
    literalDataList: js.Array[js.Any],
    keys: js.Array[js.Any],
    date: Date
  ): js.Promise[js.Array[Keyid]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerificationObjects")(signatureList.asInstanceOf[js.Any], literalDataList.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Keyid]]]
  
  /**
    * Encrypt a session key either with public keys, passwords, or both at once.
    * @param sessionKey session key for encryption
    * @param symAlgo session key algorithm
    * @param aeadAlgo (optional) aead algorithm, e.g. 'eax' or 'ocb'
    * @param publicKeys (optional) public key(s) for message encryption
    * @param passwords (optional) for message encryption
    * @param wildcard (optional) use a key ID of 0 instead of the public key IDs
    * @param date (optional) override the date
    * @param userIds (optional) user IDs to encrypt for, e.g. [ { name:'Robert Receiver', email:'robert@openpgp.org' }]
    * @returns new message with encrypted content
    */
  @scala.inline
  def encryptSessionKey(
    sessionKey: Uint8Array,
    symAlgo: String,
    aeadAlgo: String,
    publicKeys: js.Array[js.Any],
    passwords: js.Array[js.Any],
    wildcard: Boolean,
    date: Date,
    userIds: js.Array[js.Any]
  ): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptSessionKey")(sessionKey.asInstanceOf[js.Any], symAlgo.asInstanceOf[js.Any], aeadAlgo.asInstanceOf[js.Any], publicKeys.asInstanceOf[js.Any], passwords.asInstanceOf[js.Any], wildcard.asInstanceOf[js.Any], date.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  
  @scala.inline
  def fromBinary(bytes: ReadableStream[Uint8Array]): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Message]
  @scala.inline
  def fromBinary(bytes: ReadableStream[Uint8Array], filename: String): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary(bytes: ReadableStream[Uint8Array], filename: String, date: Date): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary(bytes: ReadableStream[Uint8Array], filename: Unit, date: Date): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Message]
  /**
    * creates new message object from binary data
    * @param bytes
    * @param filename (optional)
    * @param date (optional)
    * @param type (optional) data packet type
    * @returns new message object
    */
  @scala.inline
  def fromBinary(bytes: Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Message]
  @scala.inline
  def fromBinary(bytes: Uint8Array, filename: String): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary(bytes: Uint8Array, filename: String, date: Date): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary(bytes: Uint8Array, filename: Unit, date: Date): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  @scala.inline
  def fromBinary_binary(bytes: ReadableStream[Uint8Array], filename: String, date: Unit, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_binary(bytes: ReadableStream[Uint8Array], filename: String, date: Date, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_binary(bytes: ReadableStream[Uint8Array], filename: Unit, date: Unit, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_binary(bytes: ReadableStream[Uint8Array], filename: Unit, date: Date, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_binary(bytes: Uint8Array, filename: String, date: Unit, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_binary(bytes: Uint8Array, filename: String, date: Date, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_binary(bytes: Uint8Array, filename: Unit, date: Unit, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_binary(bytes: Uint8Array, filename: Unit, date: Date, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  @scala.inline
  def fromBinary_mime(bytes: ReadableStream[Uint8Array], filename: String, date: Unit, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_mime(bytes: ReadableStream[Uint8Array], filename: String, date: Date, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_mime(bytes: ReadableStream[Uint8Array], filename: Unit, date: Unit, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_mime(bytes: ReadableStream[Uint8Array], filename: Unit, date: Date, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_mime(bytes: Uint8Array, filename: String, date: Unit, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_mime(bytes: Uint8Array, filename: String, date: Date, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_mime(bytes: Uint8Array, filename: Unit, date: Unit, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_mime(bytes: Uint8Array, filename: Unit, date: Date, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  @scala.inline
  def fromBinary_text(bytes: ReadableStream[Uint8Array], filename: String, date: Unit, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_text(bytes: ReadableStream[Uint8Array], filename: String, date: Date, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_text(bytes: ReadableStream[Uint8Array], filename: Unit, date: Unit, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_text(bytes: ReadableStream[Uint8Array], filename: Unit, date: Date, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_text(bytes: Uint8Array, filename: String, date: Unit, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_text(bytes: Uint8Array, filename: String, date: Date, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_text(bytes: Uint8Array, filename: Unit, date: Unit, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_text(bytes: Uint8Array, filename: Unit, date: Date, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  @scala.inline
  def fromBinary_utf8(bytes: ReadableStream[Uint8Array], filename: String, date: Unit, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_utf8(bytes: ReadableStream[Uint8Array], filename: String, date: Date, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_utf8(bytes: ReadableStream[Uint8Array], filename: Unit, date: Unit, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_utf8(bytes: ReadableStream[Uint8Array], filename: Unit, date: Date, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_utf8(bytes: Uint8Array, filename: String, date: Unit, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_utf8(bytes: Uint8Array, filename: String, date: Date, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_utf8(bytes: Uint8Array, filename: Unit, date: Unit, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromBinary_utf8(bytes: Uint8Array, filename: Unit, date: Date, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  /**
    * creates new message object from text
    * @param text
    * @param filename (optional)
    * @param date (optional)
    * @param type (optional) data packet type
    * @returns new message object
    */
  @scala.inline
  def fromText(text: String): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any]).asInstanceOf[Message]
  @scala.inline
  def fromText(text: String, filename: String): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText(text: String, filename: String, date: Date): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText(text: String, filename: Unit, date: Date): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText(text: ReadableStream[String]): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any]).asInstanceOf[Message]
  @scala.inline
  def fromText(text: ReadableStream[String], filename: String): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText(text: ReadableStream[String], filename: String, date: Date): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText(text: ReadableStream[String], filename: Unit, date: Date): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  @scala.inline
  def fromText_binary(text: String, filename: String, date: Unit, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_binary(text: String, filename: String, date: Date, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_binary(text: String, filename: Unit, date: Unit, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_binary(text: String, filename: Unit, date: Date, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_binary(text: ReadableStream[String], filename: String, date: Unit, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_binary(text: ReadableStream[String], filename: String, date: Date, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_binary(text: ReadableStream[String], filename: Unit, date: Unit, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_binary(text: ReadableStream[String], filename: Unit, date: Date, `type`: binary): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  @scala.inline
  def fromText_mime(text: String, filename: String, date: Unit, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_mime(text: String, filename: String, date: Date, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_mime(text: String, filename: Unit, date: Unit, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_mime(text: String, filename: Unit, date: Date, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_mime(text: ReadableStream[String], filename: String, date: Unit, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_mime(text: ReadableStream[String], filename: String, date: Date, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_mime(text: ReadableStream[String], filename: Unit, date: Unit, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_mime(text: ReadableStream[String], filename: Unit, date: Date, `type`: mime): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  @scala.inline
  def fromText_text(text: String, filename: String, date: Unit, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_text(text: String, filename: String, date: Date, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_text(text: String, filename: Unit, date: Unit, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_text(text: String, filename: Unit, date: Date, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_text(text: ReadableStream[String], filename: String, date: Unit, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_text(text: ReadableStream[String], filename: String, date: Date, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_text(text: ReadableStream[String], filename: Unit, date: Unit, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_text(text: ReadableStream[String], filename: Unit, date: Date, `type`: text): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  @scala.inline
  def fromText_utf8(text: String, filename: String, date: Unit, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_utf8(text: String, filename: String, date: Date, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_utf8(text: String, filename: Unit, date: Unit, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_utf8(text: String, filename: Unit, date: Date, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_utf8(text: ReadableStream[String], filename: String, date: Unit, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_utf8(text: ReadableStream[String], filename: String, date: Date, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_utf8(text: ReadableStream[String], filename: Unit, date: Unit, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  @scala.inline
  def fromText_utf8(text: ReadableStream[String], filename: Unit, date: Date, `type`: utf8): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], date.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Message]
  
  @scala.inline
  def read(input: ReadableStream[Uint8Array]): js.Promise[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Message]]
  @scala.inline
  def read(input: ReadableStream[Uint8Array], fromStream: Boolean): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(input.asInstanceOf[js.Any], fromStream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  /**
    * reads an OpenPGP message as byte array and returns a message object
    * @param input binary message
    * @param fromStream whether the message was created from a Stream
    * @returns new message object
    */
  @scala.inline
  def read(input: Uint8Array): js.Promise[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Message]]
  @scala.inline
  def read(input: Uint8Array, fromStream: Boolean): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(input.asInstanceOf[js.Any], fromStream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  
  /**
    * reads an OpenPGP armored message and returns a message object
    * @param armoredText text to be parsed
    * @returns new message object
    */
  @scala.inline
  def readArmored(armoredText: String): js.Promise[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("readArmored")(armoredText.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Message]]
  @scala.inline
  def readArmored(armoredText: ReadableStream[String]): js.Promise[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("readArmored")(armoredText.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Message]]
}
