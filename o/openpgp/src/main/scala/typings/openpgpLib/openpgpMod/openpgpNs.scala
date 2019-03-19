package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "openpgp")
@js.native
object openpgpNs extends js.Object {
  trait DecryptOptions extends js.Object {
    /**
      * (optional) use the given date for verification instead of the current time
      */
    var date: js.UndefOr[stdLib.Date] = js.undefined
    /**
      * (optional) whether to return data as a string(Stream) or Uint8Array(Stream). If 'utf8' (the default), also normalize newlines.
      */
    var format: js.UndefOr[openpgpLib.openpgpLibStrings.utf8 | openpgpLib.openpgpLibStrings.binary] = js.undefined
    /**
      * the message object with the encrypted data
      */
    var message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message
    /**
      * (optional) passwords to decrypt the message
      */
    var passwords: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
    /**
      * (optional) private keys with decrypted secret key data or session key
      */
    var privateKeys: js.UndefOr[
        openpgpLib.openpgpMod.openpgpNs.keyNs.Key | js.Array[openpgpLib.openpgpMod.openpgpNs.keyNs.Key]
      ] = js.undefined
    /**
      * (optional) array of public keys or single key, to verify signatures
      */
    var publicKeys: js.UndefOr[
        openpgpLib.openpgpMod.openpgpNs.keyNs.Key | js.Array[openpgpLib.openpgpMod.openpgpNs.keyNs.Key]
      ] = js.undefined
    /**
      * (optional) session keys in the form: { data:Uint8Array, algorithm:String }
      */
    var sessionKeys: js.UndefOr[openpgpLib.Anon_Algorithm | js.Array[openpgpLib.Anon_Algorithm]] = js.undefined
    /**
      * (optional) detached signature for verification
      */
    var signature: js.UndefOr[openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature] = js.undefined
    /**
      * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
      */
    var streaming: js.UndefOr[
        openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
      ] = js.undefined
  }
  
  trait DecryptResult extends js.Object {
    var data: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.NodeStream | stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array]
    var filename: java.lang.String
    var signatures: js.Array[openpgpLib.Anon_KeyidValid]
  }
  
  trait EncryptOptions extends js.Object {
    /**
      * (optional) if the return values should be ascii armored or the message/signature objects
      */
    var armor: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * (optional) which compression algorithm to compress the message with, defaults to what is specified in config
      */
    var compression: js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.compression] = js.undefined
    /**
      * (optional) override the creation date of the message signature
      */
    var date: js.UndefOr[stdLib.Date] = js.undefined
    /**
      * (optional) if the signature should be detached (if true, signature will be added to returned object)
      */
    var detached: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
      */
    var fromUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
    /**
      * message to be encrypted as created by openpgp.message.fromText or openpgp.message.fromBinary
      */
    var message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message
    /**
      * (optional) array of passwords or a single password to encrypt the message
      */
    var passwords: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    /**
      * (optional) private keys for signing. If omitted message will not be signed
      */
    var privateKeys: js.UndefOr[openpgpLib.openpgpMod.openpgpNs.keyNs.Key | js.Array[_]] = js.undefined
    /**
      * (optional) array of keys or single key, used to encrypt the message
      */
    var publicKeys: js.UndefOr[openpgpLib.openpgpMod.openpgpNs.keyNs.Key | js.Array[_]] = js.undefined
    /**
      * (optional) if the unencrypted session key should be added to returned object
      */
    var returnSessionKey: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * (optional) session key in the form: { data:Uint8Array, algorithm:String }
      */
    var sessionKey: js.UndefOr[openpgpLib.Anon_Algorithm] = js.undefined
    /**
      * (optional) a detached signature to add to the encrypted message
      */
    var signature: js.UndefOr[openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature] = js.undefined
    /**
      * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
      */
    var streaming: js.UndefOr[
        openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
      ] = js.undefined
    /**
      * (optional) array of user IDs to encrypt for, one per key in `publicKeys`, e.g. [ { name:'Robert Receiver', email:'robert@openpgp.org' }]
      */
    var toUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
    /**
      * (optional) use a key ID of 0 instead of the public key IDs
      */
    var wildcard: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait EncryptResult extends js.Object {
    var data: java.lang.String | openpgpLib.ReadableStream[java.lang.String]
    var message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message
    var sessionKey: openpgpLib.Anon_AeadAlgorithm
    var signature: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature
  }
  
  @js.native
  class HKP protected () extends js.Object {
    /**
      * Initialize the HKP client and configure it with the key server url and fetch function.
      * @param keyServerBaseUrl (optional) The HKP key server base url including
      *        the protocol to use, e.g. 'https://pgp.mit.edu'; defaults to
      *        openpgp.config.keyserver (https://keyserver.ubuntu.com)
      */
    def this(keyServerBaseUrl: java.lang.String) = this()
    /**
      * Search for a public key on the key server either by key ID or part of the user ID.
      * @param options.keyID The long public key ID.
      * @param options.query This can be any part of the key user ID such as name
      *        or email address.
      * @returns The ascii armored public key.
      */
    def lookup(): js.Promise[java.lang.String] = js.native
    /**
      * Upload a public key to the server.
      * @param publicKeyArmored An ascii armored public key to be uploaded.
      * @returns
      */
    def upload(publicKeyArmored: java.lang.String): js.Promise[_] = js.native
  }
  
  trait KeyOptions extends js.Object {
    /**
      * (optional) elliptic curve for ECC keys: elliptic curve for ECC keys:
      *                                         curve25519, p256, p384, p521, secp256k1,
      *                                         brainpoolP256r1, brainpoolP384r1, or brainpoolP512r1.
      */
    var curve: js.UndefOr[java.lang.String] = js.undefined
    /**
      * (optional) override the creation date of the key and the key signatures
      */
    var date: js.UndefOr[stdLib.Date] = js.undefined
    /**
      * (optional) The number of seconds after the key creation time that the key expires
      */
    var keyExpirationTime: js.UndefOr[scala.Double] = js.undefined
    /**
      * (optional) number of bits for RSA keys: 2048 or 4096.
      */
    var numBits: js.UndefOr[scala.Double] = js.undefined
    /**
      * (optional) The passphrase used to encrypt the resulting private key
      */
    var passphrase: js.UndefOr[java.lang.String] = js.undefined
    /**
      * (optional) options for each subkey, default to main key options. e.g. [ {sign: true, passphrase: '123'}]
      *            sign parameter defaults to false, and indicates whether the subkey should sign rather than encrypt
      */
    var subkeys: js.UndefOr[js.Array[openpgpLib.Anon_Passphrase]] = js.undefined
    /**
      * array of user IDs e.g. [ { name:'Phil Zimmermann', email:'phil@openpgp.org' }]
      */
    var userIds: js.Array[UserID]
  }
  
  @js.native
  /**
    * This object is used for storing and retrieving configuration from HTML5 local storage.
    */
  class LocalStorage () extends js.Object {
    /**
      * Reads the config out of the HTML5 local storage
      * and initializes the object config.
      * if config is null the default config will be used
      */
    def read(): scala.Unit = js.native
    /**
      * Writes the config to HTML5 local storage
      */
    def write(): scala.Unit = js.native
  }
  
  @js.native
  class LocalStore protected () extends js.Object {
    /**
      * The class that deals with storage of the keyring.
      * Currently the only option is to use HTML5 local storage.
      * @param prefix prefix for itemnames in localstore
      */
    def this(prefix: java.lang.String) = this()
    /**
      * Load the private keys from HTML5 local storage.
      * @returns array of keys retrieved from localstore
      */
    def loadPrivate(): js.Array[_] = js.native
    /**
      * Load the public keys from HTML5 local storage.
      * @returns array of keys retrieved from localstore
      */
    def loadPublic(): js.Array[_] = js.native
    /**
      * Saves the current state of the private keys to HTML5 local storage.
      * The key array gets stringified using JSON
      * @param keys array of keys to save in localstore
      */
    def storePrivate(keys: js.Array[_]): scala.Unit = js.native
    /**
      * Saves the current state of the public keys to HTML5 local storage.
      * The key array gets stringified using JSON
      * @param keys array of keys to save in localstore
      */
    def storePublic(keys: js.Array[_]): scala.Unit = js.native
  }
  
  trait SignOptions extends js.Object {
    /**
      * (optional) if the return value should be ascii armored or the message object
      */
    var armor: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * (optional) override the creation date of the signature
      */
    var date: js.UndefOr[stdLib.Date] = js.undefined
    /**
      * (optional) if the return value should contain a detached signature
      */
    var detached: js.UndefOr[scala.Boolean] = js.undefined
    /**
      *  (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
      */
    var fromUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
    /**
      * (cleartext) message to be signed
      */
    var message: openpgpLib.openpgpMod.openpgpNs.cleartextNs.CleartextMessage | openpgpLib.openpgpMod.openpgpNs.messageNs.Message
    /**
      * array of keys or single key with decrypted secret key data to sign cleartext
      */
    var privateKeys: openpgpLib.openpgpMod.openpgpNs.keyNs.Key | js.Array[_]
    /**
      * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
      */
    var streaming: js.UndefOr[
        openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
      ] = js.undefined
  }
  
  trait SignResult extends js.Object {
    var data: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.NodeStream
    var message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message
    var signature: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.NodeStream | openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature
  }
  
  /**
    * Class that represents a subkey packet and the relevant signatures.
    */
  @js.native
  class SubKey () extends js.Object {
    /**
      * Returns algorithm information
      * @returns An object of the form {algorithm: string, bits:int, curve:String}
      */
    def getAlgorithmInfo(): js.Object = js.native
    /**
      * Returns the creation time of the key
      * @returns
      */
    def getCreationTime(): stdLib.Date = js.native
    def getExpirationTime(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey, date: stdLib.Date): js.Promise[stdLib.Date | openpgpLib.Infinity | scala.Null] = js.native
    /**
      * Returns the expiration time of the subkey or Infinity if key does not expire
      * Returns null if the subkey is invalid.
      * @param primaryKey The primary key packet
      * @param date Use the given date instead of the current time
      * @returns
      */
    def getExpirationTime(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey, date: stdLib.Date): js.Promise[stdLib.Date | openpgpLib.Infinity | scala.Null] = js.native
    /**
      * Calculates the fingerprint of the key
      * @returns A string containing the fingerprint in lowercase hex
      */
    def getFingerprint(): java.lang.String = js.native
    /**
      * Calculates the key id of the key
      * @returns A 8 byte key id
      */
    def getKeyId(): java.lang.String = js.native
    /**
      * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
      * @returns Whether the two keys have the same version and public key data
      */
    def hasSameFingerprintAs(): scala.Boolean = js.native
    /**
      * Check whether secret-key data is available in decrypted form. Returns null for public keys.
      * @returns
      */
    def isDecrypted(): scala.Boolean | scala.Null = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    /**
      * Checks if a binding signature of a subkey is revoked
      * @param primaryKey The primary key packet
      * @param signature The binding signature to verify
      * @param key, optional The key to verify the signature
      * @param date Use the given date instead of the current time
      * @returns True if the binding signature is revoked
      */
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    /**
      * Revokes the subkey
      * @param primaryKey decrypted private primary key for revocation
      * @param reasonForRevocation optional, object indicating the reason for revocation
      * @param reasonForRevocation.flag optional, flag indicating the reason for revocation
      * @param reasonForRevocation.string optional, string explaining the reason for revocation
      * @param date optional, override the creationtime of the revocation signature
      * @returns new subkey with revocation signature
      */
    def revoke(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      reasonForRevocation: revoke_reasonForRevocation,
      date: stdLib.Date
    ): js.Promise[openpgpLib.openpgpMod.openpgpNs.keyNs.SubKey] = js.native
    /**
      * Transforms structured subkey data to packetlist
      * @returns
      */
    def toPacketlist(): openpgpLib.openpgpMod.openpgpNs.packetNs.List = js.native
    /**
      * Update subkey with new components from specified subkey
      * @param subKey Source subkey to merge
      * @param primaryKey primary key used for validation
      * @returns
      */
    def update(
      subKey: openpgpLib.openpgpMod.openpgpNs.keyNs.SubKey,
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey
    ): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    def update(
      subKey: openpgpLib.openpgpMod.openpgpNs.keyNs.SubKey,
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey
    ): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    def verify(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
    /**
      * Verify subkey. Checks for revocation signatures, expiration time
      * and valid binding signature
      * @param primaryKey The primary key packet
      * @param date Use the given date instead of the current time
      * @returns The status of the subkey
      */
    def verify(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
  }
  
  /**
    * Class that represents an user ID or attribute packet and the relevant signatures.
    */
  @js.native
  class User () extends js.Object {
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    /**
      * Checks if a given certificate of the user is revoked
      * @param primaryKey The primary key packet
      * @param certificate The certificate to verify
      * @param key, optional The key to verify the signature
      * @param date Use the given date instead of the current time
      * @returns True if the certificate is revoked
      */
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def sign(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey, privateKeys: js.Array[_]): js.Promise[openpgpLib.openpgpMod.openpgpNs.keyNs.Key] = js.native
    /**
      * Signs user
      * @param primaryKey The primary key packet
      * @param privateKeys Decrypted private keys for signing
      * @returns New user with new certificate signatures
      */
    def sign(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey, privateKeys: js.Array[_]): js.Promise[openpgpLib.openpgpMod.openpgpNs.keyNs.Key] = js.native
    /**
      * Transforms structured user data to packetlist
      * @returns
      */
    def toPacketlist(): openpgpLib.openpgpMod.openpgpNs.packetNs.List = js.native
    /**
      * Update user with new components from specified user
      * @param user Source user to merge
      * @param primaryKey primary key used for validation
      * @returns
      */
    def update(
      user: openpgpLib.openpgpMod.openpgpNs.keyNs.User,
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey
    ): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    def update(
      user: openpgpLib.openpgpMod.openpgpNs.keyNs.User,
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey
    ): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    def verify(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
    /**
      * Verify User. Checks for existence of self signatures, revocation signatures
      * and validity of self signature
      * @param primaryKey The primary key packet
      * @param date Use the given date instead of the current time
      * @returns Status of user
      */
    def verify(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
    def verifyAllCertifications(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      keys: js.Array[_],
      date: stdLib.Date
    ): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
    /**
      * Verifies all user certificates
      * @param primaryKey The primary key packet
      * @param keys Array of keys to verify certificate signatures
      * @param date Use the given date instead of the current time
      * @returns List of signer's keyid and validity of signature
      */
    def verifyAllCertifications(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      keys: js.Array[_],
      date: stdLib.Date
    ): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
    def verifyCertificate(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      keys: js.Array[_],
      date: stdLib.Date
    ): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
    /**
      * Verifies the user certificate
      * @param primaryKey The primary key packet
      * @param certificate A certificate of this user
      * @param keys Array of keys to verify certificate signatures
      * @param date Use the given date instead of the current time
      * @returns status of the certificate
      */
    def verifyCertificate(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      keys: js.Array[_],
      date: stdLib.Date
    ): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
  }
  
  trait UserID extends js.Object {
    var email: java.lang.String
    var name: java.lang.String
  }
  
  trait VerifyOptions extends js.Object {
    /**
      * (optional) use the given date for verification instead of the current time
      */
    var date: js.UndefOr[stdLib.Date] = js.undefined
    /**
      * (cleartext) message object with signatures
      */
    var message: openpgpLib.openpgpMod.openpgpNs.cleartextNs.CleartextMessage | openpgpLib.openpgpMod.openpgpNs.messageNs.Message
    /**
      * array of publicKeys or single key, to verify signatures
      */
    var publicKeys: openpgpLib.openpgpMod.openpgpNs.keyNs.Key | js.Array[_]
    /**
      * (optional) detached signature for verification
      */
    var signature: js.UndefOr[openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature] = js.undefined
    /**
      * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
      */
    var streaming: js.UndefOr[
        openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
      ] = js.undefined
  }
  
  trait VerifyResult extends js.Object {
    var data: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.NodeStream | stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array]
    var signatures: js.Array[openpgpLib.Anon_KeyidValid]
  }
  
  trait revokeKey_reasonForRevocation extends js.Object {
    /**
      * (optional) flag indicating the reason for revocation
      */
    var flag: openpgpLib.openpgpMod.openpgpNs.enumsNs.reasonForRevocation
    /**
      * (optional) string explaining the reason for revocation
      */
    var string: java.lang.String
  }
  
  trait revoke_reasonForRevocation extends js.Object {
    /**
      * optional, flag indicating the reason for revocation
      */
    var flag: openpgpLib.openpgpMod.openpgpNs.enumsNs.reasonForRevocation
    /**
      * optional, string explaining the reason for revocation
      */
    var string: java.lang.String
  }
  
  /**
    * Input validation
    */
  def checkString(): scala.Unit = js.native
  /**
    * Convert data to or from Stream
    * @param data the data to convert
    * @param streaming (optional) whether to return a ReadableStream
    * @returns the data in the respective format
    */
  def convertStream(data: js.Object): js.Object = js.native
  def convertStream(data: js.Object, streaming: openpgpLib.openpgpLibNumbers.`false`): js.Object = js.native
  @JSName("convertStream")
  def convertStream_node(data: js.Object, streaming: openpgpLib.openpgpLibStrings.node): js.Object = js.native
  @JSName("convertStream")
  def convertStream_web(data: js.Object, streaming: openpgpLib.openpgpLibStrings.web): js.Object = js.native
  def convertStreams(obj: js.Object, streaming: openpgpLib.openpgpLibNumbers.`false`, keys: js.Array[_]): js.Object = js.native
  @JSName("convertStreams")
  def convertStreams_node(obj: js.Object, streaming: openpgpLib.openpgpLibStrings.node, keys: js.Array[_]): js.Object = js.native
  /**
    * Convert object properties from Stream
    * @param obj the data to convert
    * @param streaming (optional) whether to return ReadableStreams
    * @param keys (optional) which keys to return as streams, if possible
    * @returns the data in the respective format
    */
  @JSName("convertStreams")
  def convertStreams_web(obj: js.Object, streaming: openpgpLib.openpgpLibStrings.web, keys: js.Array[_]): js.Object = js.native
  /**
    * Decrypts a message with the user's private key, a session key or a password. Either a private key,
    * a session key or a password must be specified.
    * @param options
    * @returns Object containing decrypted and verified message in the form:
    *          {
    *          data: string|ReadableStream<String>|NodeStream, (if format was 'utf8', the default)
    *          data: Uint8Array|ReadableStream<Uint8Array>|NodeStream, (if format was 'binary')
    *          filename: string,
    *          signatures: [
    *          {
    *          keyid: module:type/keyid,
    *          verified: Promise<Boolean>,
    *          valid: boolean (if streaming was false)
    *          }, ...
    *          ]
    *          }
    */
  def decrypt(options: DecryptOptions): js.Promise[DecryptResult] = js.native
  /**
    * Unlock a private key with your passphrase.
    * @param privateKey the private key that is to be decrypted
    * @param passphrase the user's passphrase(s) chosen during key generation
    * @returns the unlocked key object in the form: { key:Key }
    */
  def decryptKey(privateKey: openpgpLib.openpgpMod.openpgpNs.keyNs.Key, passphrase: java.lang.String): js.Promise[openpgpLib.Anon_Key_59924605] = js.native
  def decryptKey(privateKey: openpgpLib.openpgpMod.openpgpNs.keyNs.Key, passphrase: js.Array[_]): js.Promise[openpgpLib.Anon_Key_59924605] = js.native
  /**
    * Decrypt symmetric session keys with a private key or password. Either a private key or
    * a password must be specified.
    * @param message a message object containing the encrypted session key packets
    * @param privateKeys (optional) private keys with decrypted secret key data
    * @param passwords (optional) passwords to decrypt the session key
    * @returns Array of decrypted session key, algorithm pairs in form:
    *          { data:Uint8Array, algorithm:String }
    *          or 'undefined' if no key packets found
    */
  def decryptSessionKeys(message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message,
    privateKeys: js.Array[openpgpLib.openpgpMod.openpgpNs.keyNs.Key]
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message,
    privateKeys: js.Array[openpgpLib.openpgpMod.openpgpNs.keyNs.Key],
    passwords: java.lang.String
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message,
    privateKeys: js.Array[openpgpLib.openpgpMod.openpgpNs.keyNs.Key],
    passwords: js.Array[java.lang.String]
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message,
    privateKeys: openpgpLib.openpgpMod.openpgpNs.keyNs.Key
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message,
    privateKeys: openpgpLib.openpgpMod.openpgpNs.keyNs.Key,
    passwords: java.lang.String
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  def decryptSessionKeys(
    message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message,
    privateKeys: openpgpLib.openpgpMod.openpgpNs.keyNs.Key,
    passwords: js.Array[java.lang.String]
  ): js.Promise[js.UndefOr[js.Array[openpgpLib.Anon_Algorithm]]] = js.native
  /**
    * Cleanup the current instance of the web worker.
    */
  def destroyWorker(): scala.Unit = js.native
  /**
    * Encrypts message text/data with public keys, passwords or both at once. At least either public keys or passwords
    * must be specified. If private keys are specified, those will be used to sign the message.
    * @param options 
    * @returns Object containing encrypted (and optionally signed) message in the form:
    *          {
    *          data: string|ReadableStream<String>|NodeStream, (if `armor` was true, the default)
    *          message: Message, (if `armor` was false)
    *          signature: string|ReadableStream<String>|NodeStream, (if `detached` was true and `armor` was true)
    *          signature: Signature (if `detached` was true and `armor` was false)
    *          sessionKey: { data, algorithm, aeadAlgorithm } (if `returnSessionKey` was true)
    *          }
    */
  def encrypt(options: EncryptOptions): js.Promise[EncryptResult] = js.native
  /**
    * Lock a private key with your passphrase.
    * @param privateKey the private key that is to be decrypted
    * @param passphrase the user's passphrase(s) chosen during key generation
    * @returns the locked key object in the form: { key:Key }
    */
  def encryptKey(privateKey: openpgpLib.openpgpMod.openpgpNs.keyNs.Key, passphrase: java.lang.String): js.Promise[openpgpLib.Anon_Key_59924605] = js.native
  def encryptKey(privateKey: openpgpLib.openpgpMod.openpgpNs.keyNs.Key, passphrase: js.Array[_]): js.Promise[openpgpLib.Anon_Key_59924605] = js.native
  /**
    * Encrypt a symmetric session key with public keys, passwords, or both at once. At least either public keys
    * or passwords must be specified.
    * @param data the session key to be encrypted e.g. 16 random bytes (for aes128)
    * @param algorithm algorithm of the symmetric session key e.g. 'aes128' or 'aes256'
    * @param aeadAlgorithm (optional) aead algorithm, e.g. 'eax' or 'ocb'
    * @param publicKeys (optional) array of public keys or single key, used to encrypt the key
    * @param passwords (optional) passwords for the message
    * @param wildcard (optional) use a key ID of 0 instead of the public key IDs
    * @param date (optional) override the date
    * @param toUserIds (optional) array of user IDs to encrypt for, one per key in `publicKeys`, e.g. [ { name:'Phil Zimmermann', email:'phil@openpgp.org' }]
    * @returns the encrypted session key packets contained in a message object
    */
  def encryptSessionKey(
    data: stdLib.Uint8Array,
    algorithm: java.lang.String,
    aeadAlgorithm: js.UndefOr[java.lang.String],
    publicKeys: js.UndefOr[
      js.Array[openpgpLib.openpgpMod.openpgpNs.keyNs.Key] | openpgpLib.openpgpMod.openpgpNs.keyNs.Key
    ],
    passwords: js.UndefOr[js.Array[java.lang.String] | java.lang.String],
    wildcard: js.UndefOr[scala.Boolean],
    date: js.UndefOr[stdLib.Date],
    toUserIds: js.UndefOr[js.Array[_]]
  ): js.Promise[openpgpLib.openpgpMod.openpgpNs.messageNs.Message] = js.native
  /**
    * Generates a new OpenPGP key pair. Supports RSA and ECC keys. Primary and subkey will be of same type.
    * @param options
    * @returns The generated key object in the form:
    *          { key:Key, privateKeyArmored:String, publicKeyArmored:String, revocationCertificate:String }
    */
  def generateKey(option: KeyOptions): js.Promise[openpgpLib.Anon_Key] = js.native
  /**
    * Returns a reference to the async proxy if the worker was initialized with openpgp.initWorker()
    * @returns the async proxy or null if not initialized
    */
  def getWorker(): openpgpLib.openpgpMod.openpgpNs.workerNs.asyncUnderscoreProxyNs.AsyncProxy | scala.Null = js.native
  /**
    * Set the path for the web worker script and create an instance of the async proxy
    * @param path relative path to the worker scripts, default: 'openpgp.worker.js'
    * @param n number of workers to initialize
    * @param workers alternative to path parameter: web workers initialized with 'openpgp.worker.js'
    */
  def initWorker(path: java.lang.String): scala.Unit = js.native
  def initWorker(path: java.lang.String, n: scala.Double): scala.Unit = js.native
  def initWorker(path: java.lang.String, n: scala.Double, workers: js.Array[_]): scala.Unit = js.native
  /**
    * Link result.data to the message stream for cancellation.
    * Also, forward errors in the message to result.data.
    * @param result the data to convert
    * @param message message object
    * @param erroringStream (optional) stream which either errors or gets closed without data
    * @returns
    */
  def linkStreams(
    result: js.Object,
    message: openpgpLib.openpgpMod.openpgpNs.messageNs.Message,
    erroringStream: openpgpLib.ReadableStream[java.lang.String]
  ): js.Object = js.native
  /**
    * Check for native AEAD support and configuration by the user. Only
    * browsers that implement the current WebCrypto specification support
    * native GCM. Native EAX is built on CTR and CBC, which current
    * browsers support. OCB and CFB are not natively supported.
    * @returns If authenticated encryption should be used
    */
  def nativeAEAD(): scala.Boolean = js.native
  /**
    * Global error handler that logs the stack trace and rethrows a high lvl error message.
    * @param message A human readable high level error Message
    * @param error The internal error that caused the failure
    */
  def onError(message: java.lang.String, error: stdLib.Error): scala.Unit = js.native
  /**
    * Wait until signature objects have been verified
    * @param signatures list of signatures
    */
  def prepareSignatures(signatures: js.Object): scala.Unit = js.native
  /**
    * Reformats signature packets for a key and rewraps key object.
    * @param privateKey private key to reformat
    * @param userIds array of user IDs e.g. [ { name:'Phil Zimmermann', email:'phil@openpgp.org' }]
    * @param passphrase (optional) The passphrase used to encrypt the resulting private key
    * @param keyExpirationTime (optional) The number of seconds after the key creation time that the key expires
    * @param revocationCertificate (optional) Whether the returned object should include a revocation certificate to revoke the public key
    * @returns The generated key object in the form:
    *          { key:Key, privateKeyArmored:String, publicKeyArmored:String, revocationCertificate:String }
    */
  def reformatKey(privateKey: openpgpLib.openpgpMod.openpgpNs.keyNs.Key, userIds: js.Array[_]): js.Promise[js.Object] = js.native
  def reformatKey(
    privateKey: openpgpLib.openpgpMod.openpgpNs.keyNs.Key,
    userIds: js.Array[_],
    passphrase: java.lang.String
  ): js.Promise[js.Object] = js.native
  def reformatKey(
    privateKey: openpgpLib.openpgpMod.openpgpNs.keyNs.Key,
    userIds: js.Array[_],
    passphrase: java.lang.String,
    keyExpirationTime: scala.Double
  ): js.Promise[js.Object] = js.native
  def reformatKey(
    privateKey: openpgpLib.openpgpMod.openpgpNs.keyNs.Key,
    userIds: js.Array[_],
    passphrase: java.lang.String,
    keyExpirationTime: scala.Double,
    revocationCertificate: scala.Boolean
  ): js.Promise[js.Object] = js.native
  /**
    * Revokes a key. Requires either a private key or a revocation certificate.
    * If a revocation certificate is passed, the reasonForRevocation parameters will be ignored.
    * @param key (optional) public or private key to revoke
    * @param revocationCertificate (optional) revocation certificate to revoke the key with
    * @param reasonForRevocation (optional) object indicating the reason for revocation
    * @param reasonForRevocation.flag (optional) flag indicating the reason for revocation
    * @param reasonForRevocation.string (optional) string explaining the reason for revocation
    * @returns The revoked key object in the form:
    *          { privateKey:Key, privateKeyArmored:String, publicKey:Key, publicKeyArmored:String }
    *          (if private key is passed) or { publicKey:Key, publicKeyArmored:String } (otherwise)
    */
  def revokeKey(): js.Promise[openpgpLib.Anon_PrivateKey | openpgpLib.Anon_PublicKey] = js.native
  def revokeKey(key: openpgpLib.openpgpMod.openpgpNs.keyNs.Key): js.Promise[openpgpLib.Anon_PrivateKey | openpgpLib.Anon_PublicKey] = js.native
  def revokeKey(key: openpgpLib.openpgpMod.openpgpNs.keyNs.Key, revocationCertificate: java.lang.String): js.Promise[openpgpLib.Anon_PrivateKey | openpgpLib.Anon_PublicKey] = js.native
  def revokeKey(
    key: openpgpLib.openpgpMod.openpgpNs.keyNs.Key,
    revocationCertificate: java.lang.String,
    reasonForRevocation: revokeKey_reasonForRevocation
  ): js.Promise[openpgpLib.Anon_PrivateKey | openpgpLib.Anon_PublicKey] = js.native
  /**
    * Signs a cleartext message.
    * @param options
    * @returns Object containing signed message in the form:
    *          {
    *          data: string|ReadableStream<String>|NodeStream, (if `armor` was true, the default)
    *          message: Message (if `armor` was false)
    *          }
    *          Or, if `detached` was true:
    *          {
    *          signature: string|ReadableStream<String>|NodeStream, (if `armor` was true, the default)
    *          signature: Signature (if `armor` was false)
    *          }
    */
  def sign(options: SignOptions): js.Promise[SignResult] = js.native
  /**
    * Normalize parameter to an array if it is not undefined.
    * @param param the parameter to be normalized
    * @returns the resulting array or undefined
    */
  def toArray(param: js.Object): js.UndefOr[js.Array[_]] = js.native
  /**
    * Verifies signatures of cleartext signed message
    * @param options
    * @returns Object containing verified message in the form:
    *          {
    *          data: string|ReadableStream<String>|NodeStream, (if `message` was a CleartextMessage)
    *          data: Uint8Array|ReadableStream<Uint8Array>|NodeStream, (if `message` was a Message)
    *          signatures: [
    *          {
    *          keyid: module:type/keyid,
    *          verified: Promise<Boolean>,
    *          valid: boolean (if `streaming` was false)
    *          }, ...
    *          ]
    *          }
    */
  def verify(options: VerifyOptions): js.Promise[VerifyResult] = js.native
  @JSName("cleartext")
  @js.native
  object cleartextNs extends js.Object {
    /**
      * Class that represents an OpenPGP cleartext signed message.
      * See {@link https://tools.ietf.org/html/rfc4880#section-7}
      */
    @js.native
    class CleartextMessage protected () extends js.Object {
      /**
        * @param text The cleartext of the signed message
        * @param signature The detached signature or an empty signature for unsigned messages
        */
      def this(text: java.lang.String, signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature) = this()
      /**
        * Returns ASCII armored text of cleartext signed message
        * @returns ASCII armor
        */
      def armor(): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
      /**
        * Returns the key IDs of the keys that signed the cleartext message
        * @returns array of keyid objects
        */
      def getSigningKeyIds(): js.Array[_] = js.native
      /**
        * Get cleartext
        * @returns cleartext of message
        */
      def getText(): java.lang.String = js.native
      /**
        * Sign the cleartext message
        * @param privateKeys private keys with decrypted secret key data for signing
        * @param signature (optional) any existing detached signature
        * @param date (optional) The creation time of the signature that should be created
        * @param userIds (optional) user IDs to sign with, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
        * @returns new cleartext message with signed content
        */
      def sign(
        privateKeys: js.Array[_],
        signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature,
        date: stdLib.Date,
        userIds: js.Array[_]
      ): js.Promise[CleartextMessage] = js.native
      /**
        * Sign the cleartext message
        * @param privateKeys private keys with decrypted secret key data for signing
        * @param signature (optional) any existing detached signature
        * @param date (optional) The creation time of the signature that should be created
        * @param userIds (optional) user IDs to sign with, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
        * @returns new detached signature of message content
        */
      def signDetached(
        privateKeys: js.Array[_],
        signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature,
        date: stdLib.Date,
        userIds: js.Array[_]
      ): js.Promise[openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature] = js.native
      /**
        * Verify signatures of cleartext signed message
        * @param keys array of keys to verify signatures
        * @param date (optional) Verify the signature against the given date, i.e. check signature creation time < date < expiration time
        * @returns list of signer's keyid and validity of signature
        */
      def verify(keys: js.Array[_], date: stdLib.Date): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
      /**
        * Verify signatures of cleartext signed message
        * @param keys array of keys to verify signatures
        * @param date (optional) Verify the signature against the given date, i.e. check signature creation time < date < expiration time
        * @returns list of signer's keyid and validity of signature
        */
      def verifyDetached(keys: js.Array[_], date: stdLib.Date): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
    }
    
    /**
      * Creates a new CleartextMessage object from text
      * @param text
      */
    def fromText(text: java.lang.String): scala.Unit = js.native
    /**
      * reads an OpenPGP cleartext signed message and returns a CleartextMessage object
      * @param armoredText text to be parsed
      * @returns new cleartext message object
      */
    def readArmored(armoredText: java.lang.String): CleartextMessage = js.native
    def readArmored(armoredText: openpgpLib.ReadableStream[java.lang.String]): CleartextMessage = js.native
  }
  
  /**
    * @see module:config/config
    */
  @JSName("config")
  @js.native
  object configNs extends js.Object {
    /**
      * Chunk Size Byte for Authenticated Encryption with Additional Data (AEAD) mode
      * Only has an effect when aead_protect is set to true.
      * Must be an integer value from 0 to 56.
      */
    var aead_chunk_size_byte: js.Any = js.native
    /**
      * Default Authenticated Encryption with Additional Data (AEAD) encryption mode
      * Only has an effect when aead_protect is set to true.
      */
    var aead_mode: js.Any = js.native
    /**
      * Use Authenticated Encryption with Additional Data (AEAD) protection for symmetric encryption.
      * **NOT INTEROPERABLE WITH OTHER OPENPGP IMPLEMENTATIONS**
      * **FUTURE OPENPGP.JS VERSIONS MAY BREAK COMPATIBILITY WHEN USING THIS OPTION**
      */
    var aead_protect: js.Any = js.native
    /**
      * Use Authenticated Encryption with Additional Data (AEAD) protection for symmetric encryption.
      * 0 means we implement a variant of {@link https://tools.ietf.org/html/draft-ford-openpgp-format-00|this IETF draft}.
      * 4 means we implement {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04|RFC4880bis-04}.
      * Note that this determines how AEAD packets are parsed even when aead_protect is set to false
      */
    var aead_protect_version: js.Any = js.native
    var allow_unauthenticated_stream: js.Any = js.native
    var checksum_required: js.Any = js.native
    var commentstring: js.Any = js.native
    var compression: js.Any = js.native
    var debug: js.Any = js.native
    var deflate_level: js.Any = js.native
    var encryption_cipher: js.Any = js.native
    var ignore_mdc_error: js.Any = js.native
    /**
      * Use integrity protection for symmetric encryption
      */
    var integrity_protect: js.Any = js.native
    var keyserver: js.Any = js.native
    /**
      * Max userid string length (used for parsing)
      */
    var max_userid_length: js.Any = js.native
    var min_bytes_for_web_crypto: js.Any = js.native
    var node_store: js.Any = js.native
    /**
      * Work-around for rare GPG decryption bug when encrypting with multiple passwords.
      * **Slower and slightly less secure**
      */
    var password_collision_check: js.Any = js.native
    var prefer_hash_algorithm: js.Any = js.native
    var revocations_expire: js.Any = js.native
    var rsa_blinding: js.Any = js.native
    /**
      * {@link https://tools.ietf.org/html/rfc4880#section-3.7.1.3|RFC4880 3.7.1.3}:
      * Iteration Count Byte for S2K (String to Key)
      */
    var s2k_iteration_count_byte: js.Any = js.native
    var show_comment: js.Any = js.native
    var show_version: js.Any = js.native
    var tolerant: js.Any = js.native
    var use_native: js.Any = js.native
    var versionstring: js.Any = js.native
    var zero_copy: js.Any = js.native
    @JSName("localStorage")
    @js.native
    object localStorageNs extends js.Object {
      @js.native
      /**
        * This object is used for storing and retrieving configuration from HTML5 local storage.
        */
      class LocalStorage () extends js.Object {
        /**
          * Reads the config out of the HTML5 local storage
          * and initializes the object config.
          * if config is null the default config will be used
          */
        def read(): scala.Unit = js.native
        /**
          * Writes the config to HTML5 local storage
          */
        def write(): scala.Unit = js.native
      }
      
    }
    
  }
  
  /**
    * @see module:crypto/crypto
    * @see module:crypto/signature
    * @see module:crypto/public_key
    * @see module:crypto/cipher
    * @see module:crypto/random
    * @see module:crypto/hash
    */
  @JSName("crypto")
  @js.native
  object cryptoNs extends js.Object {
    /**
      * @see module:crypto/public_key/elliptic/ecdh
      */
    @JSName("aes_kw")
    @js.native
    object aesUnderscoreKwNs extends js.Object {
      /**
        * AES key unwrap
        * @param key
        * @param data
        * @returns
        * @throws
        */
      def unwrap(key: java.lang.String, data: java.lang.String): stdLib.Uint8Array = js.native
      /**
        * AES key wrap
        * @param key
        * @param data
        * @returns
        */
      def wrap(key: java.lang.String, data: java.lang.String): stdLib.Uint8Array = js.native
    }
    
    @JSName("cfb")
    @js.native
    object cfbNs extends js.Object {
      def decrypt(algo: js.Any, key: js.Any, ciphertext: js.Any, iv: js.Any): js.Promise[_] = js.native
      def encrypt(algo: js.Any, key: js.Any, plaintext: js.Any, iv: js.Any): js.Any = js.native
    }
    
    @JSName("cipher")
    @js.native
    object cipherNs extends js.Object {
      /**
        * AES-128 encryption and decryption (ID 7)
        * @param key 128-bit key
        * @see
        * @see
        * @returns
        */
      def aes128(key: java.lang.String): js.Object = js.native
      /**
        * AES-128 Block Cipher (ID 8)
        * @param key 192-bit key
        * @see
        * @see
        * @returns
        */
      def aes192(key: java.lang.String): js.Object = js.native
      /**
        * AES-128 Block Cipher (ID 9)
        * @param key 256-bit key
        * @see
        * @see
        * @returns
        */
      def aes256(key: java.lang.String): js.Object = js.native
      /**
        * Blowfish Block Cipher (ID 4)
        * @param key 128-bit key
        * @see
        * @returns
        */
      def blowfish(key: java.lang.String): js.Object = js.native
      /**
        * CAST-128 Block Cipher (ID 3)
        * @param key 128-bit key
        * @see
        * @returns
        */
      def cast5(key: java.lang.String): js.Object = js.native
      /**
        * Not implemented
        * @throws
        */
      def idea(): scala.Unit = js.native
      /**
        * Triple DES Block Cipher (ID 2)
        * @param key 192-bit key
        * @see
        * @returns
        */
      def tripledes(key: java.lang.String): js.Object = js.native
      /**
        * Twofish Block Cipher (ID 10)
        * @param key 256-bit key
        * @see
        * @returns
        */
      def twofish(key: java.lang.String): js.Object = js.native
    }
    
    @JSName("cmac")
    @js.native
    object cmacNs extends js.Object {
      /**
        * This implementation of CMAC is based on the description of OMAC in
        * http://web.cs.ucdavis.edu/~rogaway/papers/eax.pdf. As per that
        * document:
        * We have made a small modification to the OMAC algorithm as it was
        * originally presented, changing one of its two constants.
        * Specifically, the constant 4 at line 85 was the constant 1/2 (the
        * multiplicative inverse of 2) in the original definition of OMAC [14].
        * The OMAC authors indicate that they will promulgate this modification
        * [15], which slightly simplifies implementations.
        */
      val blockLength: js.Any = js.native
      /**
        * xor `padding` into the end of `data`. This function implements "the
        * operation xor→ [which] xors the shorter string into the end of longer
        * one". Since data is always as least as long as padding, we can
        * simplify the implementation.
        * @param data
        * @param padding
        */
      def rightXorMut(data: stdLib.Uint8Array, padding: stdLib.Uint8Array): scala.Unit = js.native
    }
    
    @JSName("crypto")
    @js.native
    object cryptoNs extends js.Object {
      /**
        * Generate algorithm-specific key parameters
        * @param algo The public key algorithm
        * @param bits Bit length for RSA keys
        * @param oid Object identifier for ECC keys
        * @returns The array of parameters
        */
      def generateParams(
        algo: java.lang.String,
        bits: openpgpLib.Integer,
        oid: openpgpLib.openpgpMod.openpgpNs.typeNs.oidNs.OID
      ): js.Array[_] = js.native
      /**
        * Generating a session key for the specified symmetric algorithm
        * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
        * @param algo Symmetric encryption algorithm
        * @returns Random bytes as a string to be used as a key
        */
      def generateSessionKey(algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric): stdLib.Uint8Array = js.native
      /**
        * Returns the types comprising the encrypted session key of an algorithm
        * @param algo The public key algorithm
        * @returns The array of types
        */
      def getEncSessionKeyParamTypes(algo: java.lang.String): js.Array[_] = js.native
      /**
        * Generates a random byte prefix for the specified algorithm
        * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
        * @param algo Symmetric encryption algorithm
        * @returns Random bytes with length equal to the block size of the cipher, plus the last two bytes repeated.
        */
      def getPrefixRandom(algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric): stdLib.Uint8Array = js.native
      /**
        * Returns the types comprising the private key of an algorithm
        * @param algo The public key algorithm
        * @returns The array of types
        */
      def getPrivKeyParamTypes(algo: java.lang.String): js.Array[_] = js.native
      /**
        * Returns the types comprising the public key of an algorithm
        * @param algo The public key algorithm
        * @returns The array of types
        */
      def getPubKeyParamTypes(algo: java.lang.String): js.Array[_] = js.native
      /**
        * Decrypts data using specified algorithm and private key parameters.
        * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1} for public key algorithms.
        * @param algo Public key algorithm
        * @param key_params Algorithm-specific public, private key parameters
        * @param data_params encrypted session key parameters
        * @param fingerprint Recipient fingerprint
        * @returns An MPI containing the decrypted data
        */
      def publicKeyDecrypt(
        algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey,
        key_params: js.Array[
              openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI | openpgpLib.openpgpMod.openpgpNs.typeNs.oidNs.OID | openpgpLib.openpgpMod.openpgpNs.typeNs.kdfUnderscoreParamsNs.KDFParams
            ],
        data_params: js.Array[
              openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI | openpgpLib.openpgpMod.openpgpNs.typeNs.oidNs.OID | openpgpLib.openpgpMod.openpgpNs.typeNs.kdfUnderscoreParamsNs.KDFParams
            ],
        fingerprint: java.lang.String
      ): openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI = js.native
      /**
        * Encrypts data using specified algorithm and public key parameters.
        * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1} for public key algorithms.
        * @param algo Public key algorithm
        * @param pub_params Algorithm-specific public key parameters
        * @param data Data to be encrypted as MPI
        * @param fingerprint Recipient fingerprint
        * @returns encrypted session key parameters
        */
      def publicKeyEncrypt(
        algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey,
        pub_params: js.Array[
              openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI | openpgpLib.openpgpMod.openpgpNs.typeNs.oidNs.OID | openpgpLib.openpgpMod.openpgpNs.typeNs.kdfUnderscoreParamsNs.KDFParams
            ],
        data: openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI,
        fingerprint: java.lang.String
      ): js.Array[_] = js.native
    }
    
    @JSName("eax")
    @js.native
    object eaxNs extends js.Object {
      /**
        * Class to en/decrypt using EAX mode.
        * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
        * @param key The encryption key
        */
      def EAX(cipher: java.lang.String, key: stdLib.Uint8Array): scala.Unit = js.native
      /**
        * Decrypt ciphertext input.
        * @param ciphertext The ciphertext input to be decrypted
        * @param nonce The nonce (16 bytes)
        * @param adata Associated data to verify
        * @returns The plaintext output
        */
      def decrypt(ciphertext: stdLib.Uint8Array, nonce: stdLib.Uint8Array, adata: stdLib.Uint8Array): js.Promise[stdLib.Uint8Array] = js.native
      /**
        * Encrypt plaintext input.
        * @param plaintext The cleartext input to be encrypted
        * @param nonce The nonce (16 bytes)
        * @param adata Associated data to sign
        * @returns The ciphertext output
        */
      def encrypt(plaintext: stdLib.Uint8Array, nonce: stdLib.Uint8Array, adata: stdLib.Uint8Array): js.Promise[stdLib.Uint8Array] = js.native
    }
    
    @JSName("gcm")
    @js.native
    object gcmNs extends js.Object {
      /**
        * Class to en/decrypt using GCM mode.
        * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
        * @param key The encryption key
        */
      def GCM(cipher: java.lang.String, key: stdLib.Uint8Array): scala.Unit = js.native
    }
    
    /**
      * @see
      * @see
      */
    @JSName("hash")
    @js.native
    object hashNs extends js.Object {
      /**
        * @see module:md5
        */
      var md5: js.Any = js.native
      /**
        * @see hash.js
        */
      var ripemd: js.Any = js.native
      /**
        * @see asmCrypto
        */
      var sha1: js.Any = js.native
      /**
        * @see hash.js
        */
      var sha224: js.Any = js.native
      /**
        * @see asmCrypto
        */
      var sha256: js.Any = js.native
      /**
        * @see hash.js
        */
      var sha384: js.Any = js.native
      /**
        * @see asmCrypto
        */
      var sha512: js.Any = js.native
      /**
        * Create a hash on the specified data using the specified algorithm
        * @param algo Hash algorithm type (see {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4})
        * @param data Data to be hashed
        * @returns hash value
        */
      def digest(algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash, data: stdLib.Uint8Array): js.Promise[stdLib.Uint8Array] = js.native
      /**
        * Returns the hash size in bytes of the specified hash algorithm type
        * @param algo Hash algorithm type (See {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4})
        * @returns Size in bytes of the resulting hash
        */
      def getHashByteLength(algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash): openpgpLib.Integer = js.native
    }
    
    @JSName("ocb")
    @js.native
    object ocbNs extends js.Object {
      /**
        * Class to en/decrypt using OCB mode.
        * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
        * @param key The encryption key
        */
      def OCB(cipher: java.lang.String, key: stdLib.Uint8Array): scala.Unit = js.native
      /**
        * Decrypt ciphertext input.
        * @param ciphertext The ciphertext input to be decrypted
        * @param nonce The nonce (15 bytes)
        * @param adata Associated data to sign
        * @returns The ciphertext output
        */
      def decrypt(ciphertext: stdLib.Uint8Array, nonce: stdLib.Uint8Array, adata: stdLib.Uint8Array): js.Promise[stdLib.Uint8Array] = js.native
      /**
        * Encrypt plaintext input.
        * @param plaintext The cleartext input to be encrypted
        * @param nonce The nonce (15 bytes)
        * @param adata Associated data to sign
        * @returns The ciphertext output
        */
      def encrypt(plaintext: stdLib.Uint8Array, nonce: stdLib.Uint8Array, adata: stdLib.Uint8Array): js.Promise[stdLib.Uint8Array] = js.native
    }
    
    /**
      * @see module:crypto/public_key/rsa
      * @see module:crypto/public_key/elliptic/ecdh
      * @see module:packet.PublicKeyEncryptedSessionKey
      */
    @JSName("pkcs1")
    @js.native
    object pkcs1Ns extends js.Object {
      /**
        * ASN1 object identifiers for hashes
        * @see
        */
      val hash_headers: js.Any = js.native
      @JSName("eme")
      @js.native
      object emeNs extends js.Object {
        /**
          * Decode a EME-PKCS1-v1_5 padded message
          * @see
          * @param EM encoded message, an octet string
          * @returns message, an octet string
          */
        def decode(EM: java.lang.String): java.lang.String = js.native
        /**
          * Create a EME-PKCS1-v1_5 padded message
          * @see
          * @param M message to be encoded
          * @param k the length in octets of the key modulus
          * @returns EME-PKCS1 padded message
          */
        def encode(M: java.lang.String, k: openpgpLib.Integer): js.Promise[java.lang.String] = js.native
      }
      
      @JSName("emsa")
      @js.native
      object emsaNs extends js.Object {
        /**
          * Create a EMSA-PKCS1-v1_5 padded message
          * @see
          * @param algo Hash algorithm type used
          * @param hashed message to be encoded
          * @param emLen intended length in octets of the encoded message
          * @returns encoded message
          */
        def encode(algo: openpgpLib.Integer, hashed: stdLib.Uint8Array, emLen: openpgpLib.Integer): java.lang.String = js.native
      }
      
    }
    
    /**
      * @see module:packet.PublicKeyEncryptedSessionKey
      */
    @JSName("pkcs5")
    @js.native
    object pkcs5Ns extends js.Object {
      /**
        * Remove pkcs5 padding from a string.
        * @param msg Text to remove padding from
        * @returns Text with padding removed
        */
      def decode(msg: java.lang.String): java.lang.String = js.native
      /**
        * Add pkcs5 padding to a text.
        * @param msg Text to add padding
        * @returns Text with padding added
        */
      def encode(msg: java.lang.String): java.lang.String = js.native
    }
    
    @JSName("public_key")
    @js.native
    object publicUnderscoreKeyNs extends js.Object {
      @JSName("dsa")
      @js.native
      object dsaNs extends js.Object {
        /**
          * DSA Sign function
          * @param hash_algo
          * @param hashed
          * @param g
          * @param p
          * @param q
          * @param x
          * @returns
          */
        def sign(
          hash_algo: openpgpLib.Integer,
          hashed: stdLib.Uint8Array,
          g: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          x: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
        ): js.Object = js.native
        /**
          * DSA Verify function
          * @param hash_algo
          * @param r
          * @param s
          * @param hashed
          * @param g
          * @param p
          * @param q
          * @param y
          * @returns BN
          */
        def verify(
          hash_algo: openpgpLib.Integer,
          r: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          s: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          hashed: stdLib.Uint8Array,
          g: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          y: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
        ): js.Any = js.native
      }
      
      @JSName("elgamal")
      @js.native
      object elgamalNs extends js.Object {
        /**
          * ElGamal Encryption function
          * @param c1
          * @param c2
          * @param p
          * @param x
          * @returns BN
          */
        def decrypt(
          c1: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          c2: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          x: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
        ): js.Any = js.native
        /**
          * ElGamal Encryption function
          * @param m
          * @param p
          * @param g
          * @param y
          * @returns
          */
        def encrypt(
          m: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          g: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          y: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
        ): js.Object = js.native
      }
      
      /**
        * @see module:crypto/public_key/elliptic/curve
        * @see module:crypto/public_key/elliptic/ecdh
        * @see module:crypto/public_key/elliptic/ecdsa
        * @see module:crypto/public_key/elliptic/eddsa
        */
      @JSName("elliptic")
      @js.native
      object ellipticNs extends js.Object {
        @JSName("curve")
        @js.native
        object curveNs extends js.Object {
          @js.native
          class Curve () extends js.Object
          
        }
        
        @JSName("ecdh")
        @js.native
        object ecdhNs extends js.Object {
          /**
            * Decrypt and unwrap the value derived from session key
            * @param oid Elliptic curve object identifier
            * @param cipher_algo Symmetric cipher to use
            * @param hash_algo Hash algorithm to use
            * @param V Public part of ephemeral key
            * @param C Encrypted and wrapped value derived from session key
            * @param d Recipient private key
            * @param fingerprint Recipient fingerprint
            * @returns Value derived from session
            */
          def decrypt(
            oid: openpgpLib.openpgpMod.openpgpNs.typeNs.oidNs.OID,
            cipher_algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric,
            hash_algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash,
            V: stdLib.Uint8Array,
            C: stdLib.Uint8Array,
            d: stdLib.Uint8Array,
            fingerprint: java.lang.String
          ): js.Promise[
                    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ _
                  ] = js.native
          /**
            * Encrypt and wrap a session key
            * @param oid Elliptic curve object identifier
            * @param cipher_algo Symmetric cipher to use
            * @param hash_algo Hash algorithm to use
            * @param m Value derived from session key (RFC 6637)
            * @param Q Recipient public key
            * @param fingerprint Recipient fingerprint
            * @returns Returns public part of ephemeral key and encoded session key
            */
          def encrypt(
            oid: openpgpLib.openpgpMod.openpgpNs.typeNs.oidNs.OID,
            cipher_algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric,
            hash_algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash,
            m: openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI,
            Q: stdLib.Uint8Array,
            fingerprint: java.lang.String
          ): js.Promise[openpgpLib.Anon_C] = js.native
          /**
            * Generate ECDHE secret from private key and public part of ephemeral key
            * @param curve Elliptic curve object
            * @param V Public part of ephemeral key
            * @param d Recipient private key
            * @returns Generated ephemeral secret
            */
          def genPrivateEphemeralKey(
            curve: openpgpLib.openpgpMod.openpgpNs.cryptoNs.publicUnderscoreKeyNs.ellipticNs.curveNs.Curve,
            V: stdLib.Uint8Array,
            d: stdLib.Uint8Array
          ): js.Promise[
                    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ _
                  ] = js.native
          /**
            * Generate ECDHE ephemeral key and secret from public key
            * @param curve Elliptic curve object
            * @param Q Recipient public key
            * @returns Returns public part of ephemeral key and generated ephemeral secret
            */
          def genPublicEphemeralKey(
            curve: openpgpLib.openpgpMod.openpgpNs.cryptoNs.publicUnderscoreKeyNs.ellipticNs.curveNs.Curve,
            Q: stdLib.Uint8Array
          ): js.Promise[openpgpLib.Anon_S] = js.native
        }
        
        @JSName("ecdsa")
        @js.native
        object ecdsaNs extends js.Object {
          /**
            * Sign a message using the provided key
            * @param oid Elliptic curve object identifier
            * @param hash_algo Hash algorithm used to sign
            * @param m Message to sign
            * @param d Private key used to sign the message
            * @param hashed The hashed message
            * @returns Signature of the message
            */
          def sign(
            oid: openpgpLib.openpgpMod.openpgpNs.typeNs.oidNs.OID,
            hash_algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash,
            m: stdLib.Uint8Array,
            d: stdLib.Uint8Array,
            hashed: stdLib.Uint8Array
          ): js.Object = js.native
          /**
            * Verifies if a signature is valid for a message
            * @param oid Elliptic curve object identifier
            * @param hash_algo Hash algorithm used in the signature
            * @param signature Signature to verify
            * @param m Message to verify
            * @param Q Public key used to verify the message
            * @param hashed The hashed message
            * @returns
            */
          def verify(
            oid: openpgpLib.openpgpMod.openpgpNs.typeNs.oidNs.OID,
            hash_algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash,
            signature: js.Object,
            m: stdLib.Uint8Array,
            Q: stdLib.Uint8Array,
            hashed: stdLib.Uint8Array
          ): scala.Boolean = js.native
        }
        
        @JSName("eddsa")
        @js.native
        object eddsaNs extends js.Object {
          /**
            * Sign a message using the provided keygit
            * @param oid Elliptic curve object identifier
            * @param hash_algo Hash algorithm used to sign
            * @param m Message to sign
            * @param d Private key used to sign
            * @param hashed The hashed message
            * @returns Signature of the message
            */
          def sign(
            oid: openpgpLib.openpgpMod.openpgpNs.typeNs.oidNs.OID,
            hash_algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash,
            m: stdLib.Uint8Array,
            d: stdLib.Uint8Array,
            hashed: stdLib.Uint8Array
          ): js.Object = js.native
          /**
            * Verifies if a signature is valid for a message
            * @param oid Elliptic curve object identifier
            * @param hash_algo Hash algorithm used in the signature
            * @param signature Signature to verify the message
            * @param m Message to verify
            * @param Q Public key used to verify the message
            * @param hashed The hashed message
            * @returns
            */
          def verify(
            oid: openpgpLib.openpgpMod.openpgpNs.typeNs.oidNs.OID,
            hash_algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash,
            signature: js.Object,
            m: stdLib.Uint8Array,
            Q: stdLib.Uint8Array,
            hashed: stdLib.Uint8Array
          ): scala.Boolean = js.native
        }
        
        @JSName("key")
        @js.native
        object keyNs extends js.Object {
          @js.native
          class KeyPair () extends js.Object
          
        }
        
      }
      
      @JSName("prime")
      @js.native
      object primeNs extends js.Object {
        /**
          * Tests whether n is probably prime or not using Fermat's test with b = 2.
          * Fails if b^(n-1) mod n === 1.
          * @param n Number to test
          * @param b Optional Fermat test base
          * @returns
          */
        def fermat(
          n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          b: openpgpLib.Integer
        ): scala.Boolean = js.native
        /**
          * Probabilistic primality testing
          * @param n Number to test
          * @param e Optional RSA exponent to check against the prime
          * @param k Optional number of iterations of Miller-Rabin test
          * @returns
          */
        def isProbablePrime(
          n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          k: openpgpLib.Integer
        ): scala.Boolean = js.native
        /**
          * Tests whether n is probably prime or not using the Miller-Rabin test.
          * See HAC Remark 4.28.
          * @param n Number to test
          * @param k Optional number of iterations of Miller-Rabin test
          * @param rand Optional function to generate potential witnesses
          * @returns
          */
        def millerRabin(
          n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          k: openpgpLib.Integer,
          rand: js.Function
        ): scala.Boolean = js.native
        /**
          * Probabilistic random number generator
          * @param bits Bit length of the prime
          * @param e Optional RSA exponent to check against the prime
          * @param k Optional number of iterations of Miller-Rabin test
          * @returns BN
          */
        def randomProbablePrime(
          bits: openpgpLib.Integer,
          e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          k: openpgpLib.Integer
        ): js.Any = js.native
      }
      
      @JSName("rsa")
      @js.native
      object rsaNs extends js.Object {
        /**
          * Decrypt RSA message
          * @param m message
          * @param n RSA public modulus
          * @param e RSA public exponent
          * @param d RSA private exponent
          * @param p RSA private prime p
          * @param q RSA private prime q
          * @param u RSA private inverse of prime q
          * @returns RSA Plaintext
          */
        def decrypt(
          m: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          d: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          q: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          u: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
        ): js.Any = js.native
        /**
          * Encrypt message
          * @param m message
          * @param n RSA public modulus
          * @param e RSA public exponent
          * @returns RSA Ciphertext
          */
        def encrypt(
          m: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
        ): js.Any = js.native
        /**
          * Generate a new random private key B bits long with public exponent E.
          * When possible, webCrypto is used. Otherwise, primes are generated using
          * 40 rounds of the Miller-Rabin probabilistic random prime generation algorithm.
          * @see module:crypto/public_key/prime
          * @param B RSA bit length
          * @param E RSA public exponent in hex string
          * @returns RSA public modulus, RSA public exponent, RSA private exponent,
          *          RSA private prime p, RSA private prime q, u = q ** -1 mod p
          */
        def generate(B: openpgpLib.Integer, E: java.lang.String): js.Object = js.native
        /**
          * Create signature
          * @param m message
          * @param n RSA public modulus
          * @param e RSA public exponent
          * @param d RSA private exponent
          * @returns RSA Signature
          */
        def sign(
          m: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          d: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
        ): js.Any = js.native
        /**
          * Verify signature
          * @param s signature
          * @param n RSA public modulus
          * @param e RSA public exponent
          * @returns
          */
        def verify(
          s: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
          e: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
        ): js.Any = js.native
      }
      
    }
    
    @JSName("random")
    @js.native
    object randomNs extends js.Object {
      /**
        * Buffer for secure random numbers
        */
      def RandomBuffer(): scala.Unit = js.native
      /**
        * Create a secure random MPI that is greater than or equal to min and less than max.
        * @param min Lower bound, included
        * @param max Upper bound, excluded
        * @returns Random MPI
        */
      def getRandomBN(
        min: openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI,
        max: openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI
      ): js.Any = js.native
      /**
        * Retrieve secure random byte array of the specified length
        * @param length Length in bytes to generate
        * @returns Random byte array
        */
      def getRandomBytes(length: openpgpLib.Integer): stdLib.Uint8Array = js.native
    }
    
    @JSName("signature")
    @js.native
    object signatureNs extends js.Object {
      /**
        * Creates a signature on data using specified algorithms and private key parameters.
        * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1}
        * and {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4}
        * for public key and hash algorithms.
        * @param algo Public key algorithm
        * @param hash_algo Hash algorithm
        * @param key_params Algorithm-specific public and private key parameters
        * @param data Data to be signed
        * @param hashed The hashed data
        * @returns Signature
        */
      def sign(
        algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey,
        hash_algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash,
        key_params: js.Array[openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI],
        data: stdLib.Uint8Array,
        hashed: stdLib.Uint8Array
      ): stdLib.Uint8Array = js.native
      /**
        * Verifies the signature provided for data using specified algorithms and public key parameters.
        * See {@link https://tools.ietf.org/html/rfc4880#section-9.1|RFC 4880 9.1}
        * and {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4}
        * for public key and hash algorithms.
        * @param algo Public key algorithm
        * @param hash_algo Hash algorithm
        * @param msg_MPIs Algorithm-specific signature parameters
        * @param pub_MPIs Algorithm-specific public key parameters
        * @param data Data for which the signature was created
        * @param hashed The hashed data
        * @returns True if signature is valid
        */
      def verify(
        algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey,
        hash_algo: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash,
        msg_MPIs: js.Array[openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI],
        pub_MPIs: js.Array[openpgpLib.openpgpMod.openpgpNs.typeNs.mpiNs.MPI],
        data: stdLib.Uint8Array,
        hashed: stdLib.Uint8Array
      ): scala.Boolean = js.native
    }
    
  }
  
  @JSName("eme")
  @js.native
  object emeNs extends js.Object {
    /**
      * Decode a EME-PKCS1-v1_5 padded message
      * @see
      * @param EM encoded message, an octet string
      * @returns message, an octet string
      */
    def decode(EM: java.lang.String): java.lang.String = js.native
    /**
      * Create a EME-PKCS1-v1_5 padded message
      * @see
      * @param M message to be encoded
      * @param k the length in octets of the key modulus
      * @returns EME-PKCS1 padded message
      */
    def encode(M: java.lang.String, k: openpgpLib.Integer): js.Promise[java.lang.String] = js.native
  }
  
  @JSName("emsa")
  @js.native
  object emsaNs extends js.Object {
    /**
      * Create a EMSA-PKCS1-v1_5 padded message
      * @see
      * @param algo Hash algorithm type used
      * @param hashed message to be encoded
      * @param emLen intended length in octets of the encoded message
      * @returns encoded message
      */
    def encode(algo: openpgpLib.Integer, hashed: stdLib.Uint8Array, emLen: openpgpLib.Integer): java.lang.String = js.native
  }
  
  @JSName("encoding")
  @js.native
  object encodingNs extends js.Object {
    @JSName("armor")
    @js.native
    object armorNs extends js.Object {
      /**
        * Add additional information to the armor version of an OpenPGP binary
        * packet block.
        * @author Alex
        * @version 2011-12-16
        * @param customComment (optional) additional comment to add to the armored string
        * @returns The header information
        */
      def addheader(customComment: java.lang.String): java.lang.String = js.native
      /**
        * Armor an OpenPGP binary packet block
        * @param messagetype type of the message
        * @param body
        * @param partindex
        * @param parttotal
        * @param customComment (optional) additional comment to add to the armored string
        * @returns Armored text
        */
      def armor(
        messagetype: openpgpLib.Integer,
        body: js.Any,
        partindex: openpgpLib.Integer,
        parttotal: openpgpLib.Integer
      ): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
      def armor(
        messagetype: openpgpLib.Integer,
        body: js.Any,
        partindex: openpgpLib.Integer,
        parttotal: openpgpLib.Integer,
        customComment: java.lang.String
      ): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
      /**
        * Internal function to calculate a CRC-24 checksum over a given string (data)
        * @param data Data to create a CRC-24 checksum for
        * @returns The CRC-24 checksum
        */
      def createcrc24(data: java.lang.String): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
      def createcrc24(data: openpgpLib.ReadableStream[java.lang.String]): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
      /**
        * DeArmor an OpenPGP armored message; verify the checksum and return
        * the encoded bytes
        * @param text OpenPGP armored message
        * @returns An object with attribute "text" containing the message text,
        *          an attribute "data" containing a stream of bytes and "type" for the ASCII armor type
        */
      def dearmor(text: java.lang.String): js.Promise[js.Object] = js.native
      /**
        * Calculates a checksum over the given data and returns it base64 encoded
        * @param data Data to create a CRC-24 checksum for
        * @returns Base64 encoded checksum
        */
      def getCheckSum(data: java.lang.String): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
      def getCheckSum(data: openpgpLib.ReadableStream[java.lang.String]): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
      /**
        * Splits a message into two parts, the body and the checksum. This is an internal function
        * @param text OpenPGP armored message part
        * @returns An object with attribute "body" containing the body
        *          and an attribute "checksum" containing the checksum.
        */
      def splitChecksum(text: java.lang.String): js.Object = js.native
    }
    
    @JSName("base64")
    @js.native
    object base64Ns extends js.Object {
      /**
        * Convert radix-64 to binary array
        * @param t radix-64 string to convert
        * @param u if true, input is interpreted as URL-safe
        * @returns binary array version of input string
        */
      def r2s(t: java.lang.String, u: scala.Boolean): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
      def r2s(t: openpgpLib.ReadableStream[java.lang.String], u: scala.Boolean): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
      def s2r(t: openpgpLib.ReadableStream[stdLib.Uint8Array]): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
      def s2r(t: openpgpLib.ReadableStream[stdLib.Uint8Array], u: scala.Boolean): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
      /**
        * Convert binary array to radix-64
        * @param t Uint8Array to convert
        * @param u if true, output is URL-safe
        * @returns radix-64 version of input string
        */
      def s2r(t: stdLib.Uint8Array): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
      def s2r(t: stdLib.Uint8Array, u: scala.Boolean): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
    }
    
  }
  
  @JSName("enums")
  @js.native
  object enumsNs extends js.Object {
    @js.native
    sealed trait aead extends js.Object
    
    @js.native
    sealed trait armor extends js.Object
    
    @js.native
    sealed trait compression extends js.Object
    
    trait curve extends js.Object
    
    @js.native
    sealed trait features extends js.Object
    
    @js.native
    sealed trait hash extends js.Object
    
    @js.native
    sealed trait keyFlags extends js.Object
    
    @js.native
    sealed trait keyStatus extends js.Object
    
    @js.native
    sealed trait literal extends js.Object
    
    @js.native
    sealed trait packet extends js.Object
    
    @js.native
    sealed trait publicKey extends js.Object
    
    @js.native
    sealed trait reasonForRevocation extends js.Object
    
    @js.native
    sealed trait s2k extends js.Object
    
    @js.native
    sealed trait signature extends js.Object
    
    @js.native
    sealed trait signatureSubpacket extends js.Object
    
    @js.native
    sealed trait symmetric extends js.Object
    
    @js.native
    sealed trait webHash extends js.Object
    
    /**
      * Converts from an integer to string.
      */
    def read(): scala.Unit = js.native
    /**
      * Asserts validity and converts from string/integer to integer.
      */
    def write(): scala.Unit = js.native
    /**
      * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.6|RFC4880bis-04, section 9.6}
      */
    @js.native
    object aead extends js.Object {
      @js.native
      sealed trait eax
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.aead
      
      @js.native
      sealed trait experimental_gcm
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.aead
      
      @js.native
      sealed trait ocb
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.aead
      
      /* 1 */ val eax: eax with scala.Double = js.native
      /* 100 */ val experimental_gcm: experimental_gcm with scala.Double = js.native
      /* 2 */ val ocb: ocb with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.aead with scala.Double] = js.native
    }
    
    /**
      * Armor type
      */
    @js.native
    object armor extends js.Object {
      @js.native
      sealed trait message
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.armor
      
      @js.native
      sealed trait multipart_last
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.armor
      
      @js.native
      sealed trait multipart_section
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.armor
      
      @js.native
      sealed trait private_key
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.armor
      
      @js.native
      sealed trait public_key
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.armor
      
      @js.native
      sealed trait signature
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.armor
      
      @js.native
      sealed trait signed
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.armor
      
      /* 3 */ val message: message with scala.Double = js.native
      /* 1 */ val multipart_last: multipart_last with scala.Double = js.native
      /* 0 */ val multipart_section: multipart_section with scala.Double = js.native
      /* 5 */ val private_key: private_key with scala.Double = js.native
      /* 4 */ val public_key: public_key with scala.Double = js.native
      /* 6 */ val signature: signature with scala.Double = js.native
      /* 2 */ val signed: signed with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.armor with scala.Double] = js.native
    }
    
    /**
      * {@link https://tools.ietf.org/html/rfc4880#section-9.3|RFC4880, section 9.3}
      */
    @js.native
    object compression extends js.Object {
      @js.native
      sealed trait bzip2
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.compression
      
      @js.native
      sealed trait uncompressed
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.compression
      
      /**
        * RFC1951
        */
      @js.native
      sealed trait zip
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.compression
      
      /**
        * RFC1950
        */
      @js.native
      sealed trait zlib
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.compression
      
      /* 3 */ val bzip2: bzip2 with scala.Double = js.native
      /* 0 */ val uncompressed: uncompressed with scala.Double = js.native
      /* 1 */ val zip: zip with scala.Double = js.native
      /* 2 */ val zlib: zlib with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.compression with scala.Double] = js.native
    }
    
    /**
      * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-5.2.3.25|RFC4880bis-04, section 5.2.3.25}
      */
    @js.native
    object features extends js.Object {
      /**
        * 0x02 - AEAD Encrypted Data Packet (packet 20) and version 5
        * Symmetric-Key Encrypted Session Key Packets (packet 3)
        */
      @js.native
      sealed trait aead
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.features
      
      /**
        * 0x01 - Modification Detection (packets 18 and 19)
        */
      @js.native
      sealed trait modification_detection
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.features
      
      /**
        * 0x04 - Version 5 Public-Key Packet format and corresponding new
        * fingerprint format
        */
      @js.native
      sealed trait v5_keys
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.features
      
      /* 2 */ val aead: aead with scala.Double = js.native
      /* 1 */ val modification_detection: modification_detection with scala.Double = js.native
      /* 4 */ val v5_keys: v5_keys with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.features with scala.Double] = js.native
    }
    
    /**
      * {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC4880, section 9.4}
      */
    @js.native
    object hash extends js.Object {
      @js.native
      sealed trait md5
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.hash
      
      @js.native
      sealed trait ripemd
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.hash
      
      @js.native
      sealed trait sha1
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.hash
      
      @js.native
      sealed trait sha224
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.hash
      
      @js.native
      sealed trait sha256
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.hash
      
      @js.native
      sealed trait sha384
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.hash
      
      @js.native
      sealed trait sha512
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.hash
      
      /* 1 */ val md5: md5 with scala.Double = js.native
      /* 3 */ val ripemd: ripemd with scala.Double = js.native
      /* 2 */ val sha1: sha1 with scala.Double = js.native
      /* 11 */ val sha224: sha224 with scala.Double = js.native
      /* 8 */ val sha256: sha256 with scala.Double = js.native
      /* 9 */ val sha384: sha384 with scala.Double = js.native
      /* 10 */ val sha512: sha512 with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.hash with scala.Double] = js.native
    }
    
    /**
      * Key flags
      */
    @js.native
    object keyFlags extends js.Object {
      /**
        * 0x20 - This key may be used for authentication.
        */
      @js.native
      sealed trait authentication
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyFlags
      
      /**
        * 0x01 - This key may be used to certify other keys.
        */
      @js.native
      sealed trait certify_keys
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyFlags
      
      /**
        * 0x04 - This key may be used to encrypt communications.
        */
      @js.native
      sealed trait encrypt_communication
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyFlags
      
      /**
        * 0x08 - This key may be used to encrypt storage.
        */
      @js.native
      sealed trait encrypt_storage
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyFlags
      
      /**
        * 0x80 - The private component of this key may be in the
        * possession of more than one person.
        */
      @js.native
      sealed trait shared_private_key
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyFlags
      
      /**
        * 0x02 - This key may be used to sign data.
        */
      @js.native
      sealed trait sign_data
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyFlags
      
      /**
        * 0x10 - The private component of this key may have been split
        * by a secret-sharing mechanism.
        */
      @js.native
      sealed trait split_private_key
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyFlags
      
      /* 32 */ val authentication: authentication with scala.Double = js.native
      /* 1 */ val certify_keys: certify_keys with scala.Double = js.native
      /* 4 */ val encrypt_communication: encrypt_communication with scala.Double = js.native
      /* 8 */ val encrypt_storage: encrypt_storage with scala.Double = js.native
      /* 128 */ val shared_private_key: shared_private_key with scala.Double = js.native
      /* 2 */ val sign_data: sign_data with scala.Double = js.native
      /* 16 */ val split_private_key: split_private_key with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyFlags with scala.Double] = js.native
    }
    
    /**
      * Key status
      */
    @js.native
    object keyStatus extends js.Object {
      @js.native
      sealed trait expired
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus
      
      @js.native
      sealed trait invalid
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus
      
      @js.native
      sealed trait no_self_cert
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus
      
      @js.native
      sealed trait revoked
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus
      
      @js.native
      sealed trait valid
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus
      
      /* 1 */ val expired: expired with scala.Double = js.native
      /* 0 */ val invalid: invalid with scala.Double = js.native
      /* 4 */ val no_self_cert: no_self_cert with scala.Double = js.native
      /* 2 */ val revoked: revoked with scala.Double = js.native
      /* 3 */ val valid: valid with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus with scala.Double] = js.native
    }
    
    /**
      * Data types in the literal packet
      */
    @js.native
    object literal extends js.Object {
      /**
        * Binary data 'b'
        */
      @js.native
      sealed trait binary
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.literal
      
      /**
        * MIME message body part 'm'
        */
      @js.native
      sealed trait mime
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.literal
      
      /**
        * Text data 't'
        */
      @js.native
      sealed trait text
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.literal
      
      /**
        * Utf8 data 'u'
        */
      @js.native
      sealed trait utf8
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.literal
      
      /* 98 */ val binary: binary with scala.Double = js.native
      /* 109 */ val mime: mime with scala.Double = js.native
      /* 116 */ val text: text with scala.Double = js.native
      /* 117 */ val utf8: utf8 with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.literal with scala.Double] = js.native
    }
    
    /**
      * A list of packet types and numeric tags associated with them.
      */
    @js.native
    object packet extends js.Object {
      @js.native
      sealed trait compressed
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait literal
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait marker
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait modificationDetectionCode
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait onePassSignature
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait publicKey
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait publicKeyEncryptedSessionKey
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait publicSubkey
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait secretKey
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait secretSubkey
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait signature
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait symEncryptedAEADProtected
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait symEncryptedIntegrityProtected
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait symEncryptedSessionKey
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait symmetricallyEncrypted
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait trust
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait userAttribute
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      @js.native
      sealed trait userid
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.packet
      
      /* 8 */ val compressed: compressed with scala.Double = js.native
      /* 11 */ val literal: literal with scala.Double = js.native
      /* 10 */ val marker: marker with scala.Double = js.native
      /* 19 */ val modificationDetectionCode: modificationDetectionCode with scala.Double = js.native
      /* 4 */ val onePassSignature: onePassSignature with scala.Double = js.native
      /* 6 */ val publicKey: publicKey with scala.Double = js.native
      /* 1 */ val publicKeyEncryptedSessionKey: publicKeyEncryptedSessionKey with scala.Double = js.native
      /* 14 */ val publicSubkey: publicSubkey with scala.Double = js.native
      /* 5 */ val secretKey: secretKey with scala.Double = js.native
      /* 7 */ val secretSubkey: secretSubkey with scala.Double = js.native
      /* 2 */ val signature: signature with scala.Double = js.native
      /* 20 */ val symEncryptedAEADProtected: symEncryptedAEADProtected with scala.Double = js.native
      /* 18 */ val symEncryptedIntegrityProtected: symEncryptedIntegrityProtected with scala.Double = js.native
      /* 3 */ val symEncryptedSessionKey: symEncryptedSessionKey with scala.Double = js.native
      /* 9 */ val symmetricallyEncrypted: symmetricallyEncrypted with scala.Double = js.native
      /* 12 */ val trust: trust with scala.Double = js.native
      /* 17 */ val userAttribute: userAttribute with scala.Double = js.native
      /* 13 */ val userid: userid with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.packet with scala.Double] = js.native
    }
    
    /**
      * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.1|RFC4880bis-04, section 9.1}
      */
    @js.native
    object publicKey extends js.Object {
      /**
        * Reserved for AEDH
        */
      @js.native
      sealed trait aedh
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey
      
      /**
        * Reserved for AEDSA
        */
      @js.native
      sealed trait aedsa
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey
      
      /**
        * DSA (Sign only) [FIPS186] [HAC]
        */
      @js.native
      sealed trait dsa
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey
      
      /**
        * ECDH (Encrypt only) [RFC6637]
        */
      @js.native
      sealed trait ecdh
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey
      
      /**
        * ECDSA (Sign only) [RFC6637]
        */
      @js.native
      sealed trait ecdsa
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey
      
      /**
        * EdDSA (Sign only)
        * [ {@link https://tools.ietf.org/html/draft-koch-eddsa-for-openpgp-04|Draft RFC}]
        */
      @js.native
      sealed trait eddsa
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey
      
      /**
        * Elgamal (Encrypt only) [ELGAMAL] [HAC]
        */
      @js.native
      sealed trait elgamal
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey
      
      /**
        * RSA (Encrypt only) [HAC]
        */
      @js.native
      sealed trait rsa_encrypt
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey
      
      /**
        * RSA (Encrypt or Sign) [HAC]
        */
      @js.native
      sealed trait rsa_encrypt_sign
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey
      
      /**
        * RSA (Sign only) [HAC]
        */
      @js.native
      sealed trait rsa_sign
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey
      
      /* 23 */ val aedh: aedh with scala.Double = js.native
      /* 24 */ val aedsa: aedsa with scala.Double = js.native
      /* 17 */ val dsa: dsa with scala.Double = js.native
      /* 18 */ val ecdh: ecdh with scala.Double = js.native
      /* 19 */ val ecdsa: ecdsa with scala.Double = js.native
      /* 22 */ val eddsa: eddsa with scala.Double = js.native
      /* 16 */ val elgamal: elgamal with scala.Double = js.native
      /* 2 */ val rsa_encrypt: rsa_encrypt with scala.Double = js.native
      /* 1 */ val rsa_encrypt_sign: rsa_encrypt_sign with scala.Double = js.native
      /* 3 */ val rsa_sign: rsa_sign with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.publicKey with scala.Double] = js.native
    }
    
    /**
      * {@link https://tools.ietf.org/html/rfc4880#section-5.2.3.23|RFC4880, section 5.2.3.23}
      */
    @js.native
    object reasonForRevocation extends js.Object {
      /**
        * Key material has been comPromise<any>d (key revocations)
        */
      @js.native
      sealed trait key_comPromised
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.reasonForRevocation
      
      /**
        * Key is retired and no longer used (key revocations)
        */
      @js.native
      sealed trait key_retired
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.reasonForRevocation
      
      /**
        * Key is superseded (key revocations)
        */
      @js.native
      sealed trait key_superseded
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.reasonForRevocation
      
      /**
        * No reason specified (key revocations or cert revocations)
        */
      @js.native
      sealed trait no_reason
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.reasonForRevocation
      
      /**
        * User ID information is no longer valid (cert revocations)
        */
      @js.native
      sealed trait userid_invalid
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.reasonForRevocation
      
      /* 2 */ val key_comPromised: key_comPromised with scala.Double = js.native
      /* 3 */ val key_retired: key_retired with scala.Double = js.native
      /* 1 */ val key_superseded: key_superseded with scala.Double = js.native
      /* 0 */ val no_reason: no_reason with scala.Double = js.native
      /* 32 */ val userid_invalid: userid_invalid with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.reasonForRevocation with scala.Double] = js.native
    }
    
    /**
      * A string to key specifier type
      */
    @js.native
    object s2k extends js.Object {
      @js.native
      sealed trait gnu
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.s2k
      
      @js.native
      sealed trait iterated
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.s2k
      
      @js.native
      sealed trait salted
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.s2k
      
      @js.native
      sealed trait simple
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.s2k
      
      /* 101 */ val gnu: gnu with scala.Double = js.native
      /* 3 */ val iterated: iterated with scala.Double = js.native
      /* 1 */ val salted: salted with scala.Double = js.native
      /* 0 */ val simple: simple with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.s2k with scala.Double] = js.native
    }
    
    /**
      * One pass signature packet type
      */
    @js.native
    object signature extends js.Object {
      /**
        * 0x00: Signature of a binary document.
        */
      @js.native
      sealed trait binary
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x12: Casual certification of a User ID and Public-Key packet.
        * The issuer of this certification has done some casual
        * verification of the claim of identity.
        */
      @js.native
      sealed trait cert_casual
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x10: Generic certification of a User ID and Public-Key packet.
        * The issuer of this certification does not make any particular
        * assertion as to how well the certifier has checked that the owner
        * of the key is in fact the person described by the User ID.
        */
      @js.native
      sealed trait cert_generic
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x11: Persona certification of a User ID and Public-Key packet.
        * The issuer of this certification has not done any verification of
        * the claim that the owner of this key is the User ID specified.
        */
      @js.native
      sealed trait cert_persona
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x13: Positive certification of a User ID and Public-Key packet.
        * The issuer of this certification has done substantial
        * verification of the claim of identity.
        * Most OpenPGP implementations make their "key signatures" as 0x10
        * certifications.  Some implementations can issue 0x11-0x13
        * certifications, but few differentiate between the types.
        */
      @js.native
      sealed trait cert_positive
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x30: Certification revocation signature
        * This signature revokes an earlier User ID certification signature
        * (signature class 0x10 through 0x13) or direct-key signature
        * (0x1F).  It should be issued by the same key that issued the
        * revoked signature or an authorized revocation key.  The signature
        * is computed over the same data as the certificate that it
        * revokes, and should have a later creation date than that
        * certificate.
        */
      @js.native
      sealed trait cert_revocation
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x1F: Signature directly on a key
        * This signature is calculated directly on a key.  It binds the
        * information in the Signature subpackets to the key, and is
        * appropriate to be used for subpackets that provide information
        * about the key, such as the Revocation Key subpacket.  It is also
        * appropriate for statements that non-self certifiers want to make
        * about the key itself, rather than the binding between a key and a
        * name.
        */
      @js.native
      sealed trait key
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x19: Primary Key Binding Signature
        * This signature is a statement by a signing subkey, indicating
        * that it is owned by the primary key and subkey.  This signature
        * is calculated the same way as a 0x18 signature: directly on the
        * primary key and subkey, and not on any User ID or other packets.
        * When a signature is made over a key, the hash data starts with the
        * octet 0x99, followed by a two-octet length of the key, and then body
        * of the key packet.  (Note that this is an old-style packet header for
        * a key packet with two-octet length.)  A subkey binding signature
        * (type 0x18) or primary key binding signature (type 0x19) then hashes
        * the subkey using the same format as the main key (also using 0x99 as
        * the first octet).
        */
      @js.native
      sealed trait key_binding
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x20: Key revocation signature
        * The signature is calculated directly on the key being revoked.  A
        * revoked key is not to be used.  Only revocation signatures by the
        * key being revoked, or by an authorized revocation key, should be
        * considered valid revocation signatures.a
        */
      @js.native
      sealed trait key_revocation
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x02: Standalone signature.
        * This signature is a signature of only its own subpacket contents.
        * It is calculated identically to a signature over a zero-lengh
        * binary document.  Note that it doesn't make sense to have a V3
        * standalone signature.
        */
      @js.native
      sealed trait standalone
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x18: Subkey Binding Signature
        * This signature is a statement by the top-level signing key that
        * indicates that it owns the subkey.  This signature is calculated
        * directly on the primary key and subkey, and not on any User ID or
        * other packets.  A signature that binds a signing subkey MUST have
        * an Embedded Signature subpacket in this binding signature that
        * contains a 0x19 signature made by the signing subkey on the
        * primary key and subkey.
        */
      @js.native
      sealed trait subkey_binding
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x28: Subkey revocation signature
        * The signature is calculated directly on the subkey being revoked.
        * A revoked subkey is not to be used.  Only revocation signatures
        * by the top-level signature key that is bound to this subkey, or
        * by an authorized revocation key, should be considered valid
        * revocation signatures.
        * Key revocation signatures (types 0x20 and 0x28)
        * hash only the key being revoked.
        */
      @js.native
      sealed trait subkey_revocation
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x01: Signature of a canonical text document.
        * Canonicalyzing the document by converting line endings.
        */
      @js.native
      sealed trait text
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x50: Third-Party Confirmation signature.
        * This signature is a signature over some other OpenPGP Signature
        * packet(s).  It is analogous to a notary seal on the signed data.
        * A third-party signature SHOULD include Signature Target
        * subpacket(s) to give easy identification.  Note that we really do
        * mean SHOULD.  There are plausible uses for this (such as a blind
        * party that only sees the signature, not the key or source
        * document) that cannot include a target subpacket.
        */
      @js.native
      sealed trait third_party
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /**
        * 0x40: Timestamp signature.
        * This signature is only meaningful for the timestamp contained in
        * it.
        */
      @js.native
      sealed trait timestamp
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signature
      
      /* 0 */ val binary: binary with scala.Double = js.native
      /* 18 */ val cert_casual: cert_casual with scala.Double = js.native
      /* 16 */ val cert_generic: cert_generic with scala.Double = js.native
      /* 17 */ val cert_persona: cert_persona with scala.Double = js.native
      /* 19 */ val cert_positive: cert_positive with scala.Double = js.native
      /* 48 */ val cert_revocation: cert_revocation with scala.Double = js.native
      /* 31 */ val key: key with scala.Double = js.native
      /* 25 */ val key_binding: key_binding with scala.Double = js.native
      /* 32 */ val key_revocation: key_revocation with scala.Double = js.native
      /* 2 */ val standalone: standalone with scala.Double = js.native
      /* 24 */ val subkey_binding: subkey_binding with scala.Double = js.native
      /* 40 */ val subkey_revocation: subkey_revocation with scala.Double = js.native
      /* 1 */ val text: text with scala.Double = js.native
      /* 80 */ val third_party: third_party with scala.Double = js.native
      /* 64 */ val timestamp: timestamp with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.signature with scala.Double] = js.native
    }
    
    /**
      * Signature subpacket type
      */
    @js.native
    object signatureSubpacket extends js.Object {
      @js.native
      sealed trait embedded_signature
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait exportable_certification
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait features
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait issuer
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait issuer_fingerprint
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait key_expiration_time
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait key_flags
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait key_server_preferences
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait notation_data
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait placeholder_backwards_compatibility
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait policy_uri
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait preferred_aead_algorithms
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait preferred_compression_algorithms
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait preferred_hash_algorithms
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait preferred_key_server
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait preferred_symmetric_algorithms
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait primary_user_id
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait reason_for_revocation
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait regular_expression
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait revocable
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait revocation_key
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait signature_creation_time
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait signature_expiration_time
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait signature_target
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait signers_user_id
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      @js.native
      sealed trait trust_signature
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket
      
      /* 32 */ val embedded_signature: embedded_signature with scala.Double = js.native
      /* 4 */ val exportable_certification: exportable_certification with scala.Double = js.native
      /* 30 */ val features: features with scala.Double = js.native
      /* 16 */ val issuer: issuer with scala.Double = js.native
      /* 33 */ val issuer_fingerprint: issuer_fingerprint with scala.Double = js.native
      /* 9 */ val key_expiration_time: key_expiration_time with scala.Double = js.native
      /* 27 */ val key_flags: key_flags with scala.Double = js.native
      /* 23 */ val key_server_preferences: key_server_preferences with scala.Double = js.native
      /* 20 */ val notation_data: notation_data with scala.Double = js.native
      /* 10 */ val placeholder_backwards_compatibility: placeholder_backwards_compatibility with scala.Double = js.native
      /* 26 */ val policy_uri: policy_uri with scala.Double = js.native
      /* 34 */ val preferred_aead_algorithms: preferred_aead_algorithms with scala.Double = js.native
      /* 22 */ val preferred_compression_algorithms: preferred_compression_algorithms with scala.Double = js.native
      /* 21 */ val preferred_hash_algorithms: preferred_hash_algorithms with scala.Double = js.native
      /* 24 */ val preferred_key_server: preferred_key_server with scala.Double = js.native
      /* 11 */ val preferred_symmetric_algorithms: preferred_symmetric_algorithms with scala.Double = js.native
      /* 25 */ val primary_user_id: primary_user_id with scala.Double = js.native
      /* 29 */ val reason_for_revocation: reason_for_revocation with scala.Double = js.native
      /* 6 */ val regular_expression: regular_expression with scala.Double = js.native
      /* 7 */ val revocable: revocable with scala.Double = js.native
      /* 12 */ val revocation_key: revocation_key with scala.Double = js.native
      /* 2 */ val signature_creation_time: signature_creation_time with scala.Double = js.native
      /* 3 */ val signature_expiration_time: signature_expiration_time with scala.Double = js.native
      /* 31 */ val signature_target: signature_target with scala.Double = js.native
      /* 28 */ val signers_user_id: signers_user_id with scala.Double = js.native
      /* 5 */ val trust_signature: trust_signature with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.signatureSubpacket with scala.Double] = js.native
    }
    
    /**
      * {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC4880, section 9.2}
      */
    @js.native
    object symmetric extends js.Object {
      @js.native
      sealed trait `3des`
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric
      
      @js.native
      sealed trait aes128
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric
      
      @js.native
      sealed trait aes192
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric
      
      @js.native
      sealed trait aes256
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric
      
      @js.native
      sealed trait blowfish
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric
      
      @js.native
      sealed trait cast5
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric
      
      /**
        * Not implemented!
        */
      @js.native
      sealed trait idea
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric
      
      @js.native
      sealed trait plaintext
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric
      
      @js.native
      sealed trait tripledes
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric
      
      @js.native
      sealed trait twofish
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric
      
      /* 2 */ val `3des`: `3des` with scala.Double = js.native
      /* 7 */ val aes128: aes128 with scala.Double = js.native
      /* 8 */ val aes192: aes192 with scala.Double = js.native
      /* 9 */ val aes256: aes256 with scala.Double = js.native
      /* 4 */ val blowfish: blowfish with scala.Double = js.native
      /* 3 */ val cast5: cast5 with scala.Double = js.native
      /* 1 */ val idea: idea with scala.Double = js.native
      /* 0 */ val plaintext: plaintext with scala.Double = js.native
      /* 2 */ val tripledes: tripledes with scala.Double = js.native
      /* 10 */ val twofish: twofish with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric with scala.Double] = js.native
    }
    
    /**
      * A list of hash names as accepted by webCrypto functions.
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest|Parameters, algo}
      */
    @js.native
    object webHash extends js.Object {
      @js.native
      sealed trait `SHA-1`
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.webHash
      
      @js.native
      sealed trait `SHA-256`
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.webHash
      
      @js.native
      sealed trait `SHA-384`
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.webHash
      
      @js.native
      sealed trait `SHA-512`
        extends openpgpLib.openpgpMod.openpgpNs.enumsNs.webHash
      
      /* 2 */ val `SHA-1`: `SHA-1` with scala.Double = js.native
      /* 8 */ val `SHA-256`: `SHA-256` with scala.Double = js.native
      /* 9 */ val `SHA-384`: `SHA-384` with scala.Double = js.native
      /* 10 */ val `SHA-512`: `SHA-512` with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[openpgpLib.openpgpMod.openpgpNs.enumsNs.webHash with scala.Double] = js.native
    }
    
  }
  
  @JSName("hkp")
  @js.native
  object hkpNs extends js.Object {
    @js.native
    class HKP protected () extends js.Object {
      /**
        * Initialize the HKP client and configure it with the key server url and fetch function.
        * @param keyServerBaseUrl (optional) The HKP key server base url including
        *        the protocol to use, e.g. 'https://pgp.mit.edu'; defaults to
        *        openpgp.config.keyserver (https://keyserver.ubuntu.com)
        */
      def this(keyServerBaseUrl: java.lang.String) = this()
      /**
        * Search for a public key on the key server either by key ID or part of the user ID.
        * @param options.keyID The long public key ID.
        * @param options.query This can be any part of the key user ID such as name
        *        or email address.
        * @returns The ascii armored public key.
        */
      def lookup(): js.Promise[java.lang.String] = js.native
      /**
        * Upload a public key to the server.
        * @param publicKeyArmored An ascii armored public key to be uploaded.
        * @returns
        */
      def upload(publicKeyArmored: java.lang.String): js.Promise[_] = js.native
    }
    
  }
  
  @JSName("key")
  @js.native
  object keyNs extends js.Object {
    /**
      * Class that represents an OpenPGP key. Must contain a primary key.
      * Can contain additional subkeys, signatures, user ids, user attributes.
      */
    @js.native
    class Key protected () extends js.Object {
      /**
        * @param packetlist The packets that form this key
        */
      def this(packetlist: openpgpLib.openpgpMod.openpgpNs.packetNs.List) = this()
      /**
        * Applies a revocation certificate to a key
        * This adds the first signature packet in the armored text to the key,
        * if it is a valid revocation signature.
        * @param revocationCertificate armored revocation certificate
        * @returns new revoked key
        */
      def applyRevocationCertificate(revocationCertificate: java.lang.String): js.Promise[Key] = js.native
      /**
        * Returns ASCII armored text of key
        * @returns ASCII armor
        */
      def armor(): openpgpLib.ReadableStream[java.lang.String] = js.native
      /**
        * Decrypts all secret key and subkey packets matching keyId
        * @param passphrases
        * @param keyId
        * @returns true if all matching key and subkey packets decrypted successfully
        */
      def decrypt(passphrases: java.lang.String): js.Promise[scala.Boolean] = js.native
      def decrypt(passphrases: java.lang.String, keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid): js.Promise[scala.Boolean] = js.native
      def decrypt(passphrases: js.Array[java.lang.String]): js.Promise[scala.Boolean] = js.native
      def decrypt(
        passphrases: js.Array[java.lang.String],
        keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid
      ): js.Promise[scala.Boolean] = js.native
      /**
        * Encrypts all secret key and subkey packets matching keyId
        * @param passphrases - if multiple passphrases, then should be in same order as packets each should encrypt
        * @param keyId
        * @returns
        */
      def encrypt(passphrases: java.lang.String): js.Promise[
            js.Array[
              openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey | openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey
            ]
          ] = js.native
      def encrypt(passphrases: java.lang.String, keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid): js.Promise[
            js.Array[
              openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey | openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey
            ]
          ] = js.native
      def encrypt(passphrases: js.Array[_]): js.Promise[
            js.Array[
              openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey | openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey
            ]
          ] = js.native
      def encrypt(passphrases: js.Array[_], keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid): js.Promise[
            js.Array[
              openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey | openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey
            ]
          ] = js.native
      /**
        * Returns algorithm information
        * @returns An object of the form {algorithm: string, bits:int, curve:String}
        */
      def getAlgorithmInfo(): js.Object = js.native
      /**
        * Returns the creation time of the key
        * @returns
        */
      def getCreationTime(): stdLib.Date = js.native
      /**
        * Returns last created key or key by given keyId that is available for encryption or decryption
        * @param keyId, optional
        * @param date, optional
        * @param userId, optional
        * @returns key or null if no encryption key has been found
        */
      def getEncryptionKey(): js.Promise[Key | SubKey | scala.Null] = js.native
      def getEncryptionKey(keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid): js.Promise[Key | SubKey | scala.Null] = js.native
      def getEncryptionKey(keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid, date: stdLib.Date): js.Promise[Key | SubKey | scala.Null] = js.native
      def getEncryptionKey(
        keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid,
        date: stdLib.Date,
        userId: java.lang.String
      ): js.Promise[Key | SubKey | scala.Null] = js.native
      /**
        * Returns the latest date when the key can be used for encrypting, signing, or both, depending on the `capabilities` paramater.
        * When `capabilities` is null, defaults to returning the expiry date of the primary key.
        * Returns null if `capabilities` is passed and the key does not have the specified capabilities or is revoked or invalid.
        * Returns Infinity if the key doesn't expire.
        * @param {encrypt | sign | encrypt_sign} capabilities, optional
        * @param keyId, optional
        * @param userId, optional user ID
        * @returns
        */
      def getExpirationTime(
        capabilities: js.Any,
        keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid,
        userId: js.Object
      ): js.Promise[stdLib.Date | openpgpLib.Infinity | scala.Null] = js.native
      /**
        * Calculates the fingerprint of the key
        * @returns A string containing the fingerprint in lowercase hex
        */
      def getFingerprint(): java.lang.String = js.native
      /**
        * Calculates the key id of the key
        * @returns A 8 byte key id
        */
      def getKeyId(): java.lang.String = js.native
      /**
        * Returns key IDs of all keys
        * @returns
        */
      def getKeyIds(): js.Array[_] = js.native
      /**
        * Returns an array containing all public or private keys matching keyId.
        * If keyId is not present, returns all keys starting with the primary key.
        * @param keyId
        * @returns
        */
      def getKeys(keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid): js.Array[_] = js.native
      /**
        * Returns primary user and most significant (latest valid) self signature
        * - if multiple primary users exist, returns the one with the latest self signature
        * - otherwise, returns the user with the latest self signature
        * @param date (optional) use the given date for verification instead of the current time
        * @param userId (optional) user ID to get instead of the primary user, if it exists
        * @returns The primary user and the self signature
        */
      def getPrimaryUser(date: stdLib.Date, userId: js.Object): js.Promise[openpgpLib.Anon_SelfCertification] = js.native
      /**
        * Get revocation certificate from a revoked key.
        * (To get a revocation certificate for an unrevoked key, call revoke() first.)
        * @returns armored revocation certificate
        */
      def getRevocationCertificate(): js.Promise[java.lang.String] = js.native
      /**
        * Returns last created key or key by given keyId that is available for signing and verification
        * @param keyId, optional
        * @param date (optional) use the given date for verification instead of the current time
        * @param userId, optional user ID
        * @returns key or null if no signing key has been found
        */
      def getSigningKey(keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid): js.Promise[Key | SubKey | scala.Null] = js.native
      def getSigningKey(keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid, date: stdLib.Date): js.Promise[Key | SubKey | scala.Null] = js.native
      def getSigningKey(keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid, date: stdLib.Date, userId: js.Object): js.Promise[Key | SubKey | scala.Null] = js.native
      /**
        * Returns an array containing all public or private subkeys matching keyId;
        * If keyId is not present, returns all subkeys.
        * @param keyId
        * @returns
        */
      def getSubkeys(keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid): js.Array[_] = js.native
      /**
        * Returns userids
        * @returns array of userids
        */
      def getUserIds(): js.Array[_] = js.native
      /**
        * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
        * @returns Whether the two keys have the same version and public key data
        */
      def hasSameFingerprintAs(): scala.Boolean = js.native
      /**
        * Check whether secret-key data is available in decrypted form. Returns null for public keys.
        * @returns
        */
      def isDecrypted(): scala.Boolean | scala.Null = js.native
      /**
        * Returns true if this is a private key
        * @returns
        */
      def isPrivate(): scala.Boolean = js.native
      /**
        * Returns true if this is a public key
        * @returns
        */
      def isPublic(): scala.Boolean = js.native
      /**
        * Checks if a signature on a key is revoked
        * @param
        * @param signature The signature to verify
        * @param key, optional The key to verify the signature
        * @param date Use the given date instead of the current time
        * @returns True if the certificate is revoked
        */
      def isRevoked(signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      /**
        * Transforms packetlist to structured key data
        * @param packetlist The packets that form a key
        */
      def packetlist2structure(packetlist: openpgpLib.openpgpMod.openpgpNs.packetNs.List): scala.Unit = js.native
      /**
        * Revokes the key
        * @param reasonForRevocation optional, object indicating the reason for revocation
        * @param reasonForRevocation.flag optional, flag indicating the reason for revocation
        * @param reasonForRevocation.string optional, string explaining the reason for revocation
        * @param date optional, override the creationtime of the revocation signature
        * @returns new key with revocation signature
        */
      def revoke(reasonForRevocation: openpgpLib.openpgpMod.openpgpNs.revoke_reasonForRevocation, date: stdLib.Date): js.Promise[Key] = js.native
      /**
        * Signs all users of key
        * @param privateKeys decrypted private keys for signing
        * @returns new public key with new certificate signature
        */
      def signAllUsers(privateKeys: js.Array[_]): js.Promise[Key] = js.native
      /**
        * Signs primary user of key
        * @param privateKey decrypted private keys for signing
        * @param date (optional) use the given date for verification instead of the current time
        * @param userId (optional) user ID to get instead of the primary user, if it exists
        * @returns new public key with new certificate signature
        */
      def signPrimaryUser(privateKey: js.Array[_], date: stdLib.Date, userId: js.Object): js.Promise[Key] = js.native
      /**
        * Transforms structured key data to packetlist
        * @returns The packets that form a key
        */
      def toPacketlist(): openpgpLib.openpgpMod.openpgpNs.packetNs.List = js.native
      /**
        * Returns key as public key (shallow copy)
        * @returns new public Key
        */
      def toPublic(): Key = js.native
      /**
        * Update key with new components from specified key with same key ID:
        * users, subkeys, certificates are merged into the destination key,
        * duplicates and expired signatures are ignored.
        * If the specified key is a private key and the destination key is public,
        * the destination key is transformed to a private key.
        * @param key Source key to merge
        * @returns
        */
      def update(key: Key): js.Promise[js.UndefOr[scala.Nothing]] = js.native
      /**
        * Verifies all users of key
        * - if no arguments are given, verifies the self certificates;
        * - otherwise, verifies all certificates signed with given keys.
        * @param keys array of keys to verify certificate signatures
        * @returns list of userid, signer's keyid and validity of signature
        */
      def verifyAllUsers(keys: js.Array[_]): js.Promise[js.Array[openpgpLib.Anon_KeyidUserid]] = js.native
      /**
        * Verify primary key. Checks for revocation signatures, expiration time
        * and valid self signature
        * @param date (optional) use the given date for verification instead of the current time
        * @param userId (optional) user ID
        * @returns The status of the primary key
        */
      def verifyPrimaryKey(): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
      def verifyPrimaryKey(date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
      def verifyPrimaryKey(date: stdLib.Date, userId: js.Object): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
      /**
        * Verifies primary user of key
        * - if no arguments are given, verifies the self certificates;
        * - otherwise, verifies all certificates signed with given keys.
        * @param keys array of keys to verify certificate signatures
        * @param date (optional) use the given date for verification instead of the current time
        * @param userId (optional) user ID to get instead of the primary user, if it exists
        * @returns List of signer's keyid and validity of signature
        */
      def verifyPrimaryUser(keys: js.Array[_], date: stdLib.Date, userId: js.Object): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
    }
    
    trait KeyResult extends js.Object {
      var err: js.Array[stdLib.Error] | scala.Null
      var keys: js.Array[Key]
    }
    
    /**
      * Class that represents a subkey packet and the relevant signatures.
      */
    @js.native
    class SubKey () extends js.Object {
      /**
        * Returns algorithm information
        * @returns An object of the form {algorithm: string, bits:int, curve:String}
        */
      def getAlgorithmInfo(): js.Object = js.native
      /**
        * Returns the creation time of the key
        * @returns
        */
      def getCreationTime(): stdLib.Date = js.native
      def getExpirationTime(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey, date: stdLib.Date): js.Promise[stdLib.Date | openpgpLib.Infinity | scala.Null] = js.native
      /**
        * Returns the expiration time of the subkey or Infinity if key does not expire
        * Returns null if the subkey is invalid.
        * @param primaryKey The primary key packet
        * @param date Use the given date instead of the current time
        * @returns
        */
      def getExpirationTime(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey, date: stdLib.Date): js.Promise[stdLib.Date | openpgpLib.Infinity | scala.Null] = js.native
      /**
        * Calculates the fingerprint of the key
        * @returns A string containing the fingerprint in lowercase hex
        */
      def getFingerprint(): java.lang.String = js.native
      /**
        * Calculates the key id of the key
        * @returns A 8 byte key id
        */
      def getKeyId(): java.lang.String = js.native
      /**
        * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
        * @returns Whether the two keys have the same version and public key data
        */
      def hasSameFingerprintAs(): scala.Boolean = js.native
      /**
        * Check whether secret-key data is available in decrypted form. Returns null for public keys.
        * @returns
        */
      def isDecrypted(): scala.Boolean | scala.Null = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      /**
        * Checks if a binding signature of a subkey is revoked
        * @param primaryKey The primary key packet
        * @param signature The binding signature to verify
        * @param key, optional The key to verify the signature
        * @param date Use the given date instead of the current time
        * @returns True if the binding signature is revoked
        */
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      /**
        * Revokes the subkey
        * @param primaryKey decrypted private primary key for revocation
        * @param reasonForRevocation optional, object indicating the reason for revocation
        * @param reasonForRevocation.flag optional, flag indicating the reason for revocation
        * @param reasonForRevocation.string optional, string explaining the reason for revocation
        * @param date optional, override the creationtime of the revocation signature
        * @returns new subkey with revocation signature
        */
      def revoke(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        reasonForRevocation: openpgpLib.openpgpMod.openpgpNs.revoke_reasonForRevocation,
        date: stdLib.Date
      ): js.Promise[SubKey] = js.native
      /**
        * Transforms structured subkey data to packetlist
        * @returns
        */
      def toPacketlist(): openpgpLib.openpgpMod.openpgpNs.packetNs.List = js.native
      /**
        * Update subkey with new components from specified subkey
        * @param subKey Source subkey to merge
        * @param primaryKey primary key used for validation
        * @returns
        */
      def update(subKey: SubKey, primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
      def update(subKey: SubKey, primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
      def verify(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
      /**
        * Verify subkey. Checks for revocation signatures, expiration time
        * and valid binding signature
        * @param primaryKey The primary key packet
        * @param date Use the given date instead of the current time
        * @returns The status of the subkey
        */
      def verify(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
    }
    
    /**
      * Class that represents an user ID or attribute packet and the relevant signatures.
      */
    @js.native
    class User () extends js.Object {
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      /**
        * Checks if a given certificate of the user is revoked
        * @param primaryKey The primary key packet
        * @param certificate The certificate to verify
        * @param key, optional The key to verify the signature
        * @param date Use the given date instead of the current time
        * @returns True if the certificate is revoked
        */
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def isRevoked(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
        date: stdLib.Date
      ): js.Promise[scala.Boolean] = js.native
      def sign(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey, privateKeys: js.Array[_]): js.Promise[Key] = js.native
      /**
        * Signs user
        * @param primaryKey The primary key packet
        * @param privateKeys Decrypted private keys for signing
        * @returns New user with new certificate signatures
        */
      def sign(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey, privateKeys: js.Array[_]): js.Promise[Key] = js.native
      /**
        * Transforms structured user data to packetlist
        * @returns
        */
      def toPacketlist(): openpgpLib.openpgpMod.openpgpNs.packetNs.List = js.native
      /**
        * Update user with new components from specified user
        * @param user Source user to merge
        * @param primaryKey primary key used for validation
        * @returns
        */
      def update(user: User, primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
      def update(user: User, primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
      def verify(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
      /**
        * Verify User. Checks for existence of self signatures, revocation signatures
        * and validity of self signature
        * @param primaryKey The primary key packet
        * @param date Use the given date instead of the current time
        * @returns Status of user
        */
      def verify(primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
      def verifyAllCertifications(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        keys: js.Array[_],
        date: stdLib.Date
      ): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
      /**
        * Verifies all user certificates
        * @param primaryKey The primary key packet
        * @param keys Array of keys to verify certificate signatures
        * @param date Use the given date instead of the current time
        * @returns List of signer's keyid and validity of signature
        */
      def verifyAllCertifications(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        keys: js.Array[_],
        date: stdLib.Date
      ): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
      def verifyCertificate(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
        certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        keys: js.Array[_],
        date: stdLib.Date
      ): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
      /**
        * Verifies the user certificate
        * @param primaryKey The primary key packet
        * @param certificate A certificate of this user
        * @param keys Array of keys to verify certificate signatures
        * @param date Use the given date instead of the current time
        * @returns status of the certificate
        */
      def verifyCertificate(
        primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
        certificate: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
        keys: js.Array[_],
        date: stdLib.Date
      ): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.keyStatus] = js.native
    }
    
    /**
      * Check if signature has revocation key sub packet (not supported by OpenPGP.js)
      * and throw error if found
      * @param signature The certificate or signature to check
      * @param keyId Check only certificates or signatures from a certain issuer key ID
      */
    def checkRevocationKey(
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      keyId: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid
    ): scala.Unit = js.native
    /**
      * Create signature packet
      * @param dataToSign Contains packets to be signed
      * @param signingKeyPacket secret key packet for signing
      * @param signatureProperties (optional) properties to write on the signature packet before signing
      * @param date (optional) override the creationtime of the signature
      * @param userId (optional) user ID
      * @returns signature packet
      */
    def createSignaturePacket(
      dataToSign: js.Object,
      signingKeyPacket: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      signatureProperties: js.Object,
      date: stdLib.Date,
      userId: js.Object
    ): openpgpLib.openpgpMod.openpgpNs.packetNs.Signature = js.native
    def createSignaturePacket(
      dataToSign: js.Object,
      signingKeyPacket: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
      signatureProperties: js.Object,
      date: stdLib.Date,
      userId: js.Object
    ): openpgpLib.openpgpMod.openpgpNs.packetNs.Signature = js.native
    /**
      * Generates a new OpenPGP key. Supports RSA and ECC keys.
      * Primary and subkey will be of same type.
      * @param options.keyType To indicate what type of key to make.
      *        RSA is 1. See {@link https://tools.ietf.org/html/rfc4880#section-9.1}
      * @param options.numBits number of bits for the key creation.
      * @param options.userIds Assumes already in form of "User Name <username@email.com>"
      *        If array is used, the first userId is set as primary user Id
      * @param options.passphrase The passphrase used to encrypt the resulting private key
      * @param options.keyExpirationTime The number of seconds after the key creation time that the key expires
      * @param curve (optional) elliptic curve for ECC keys
      * @param date Override the creation date of the key and the key signatures
      * @param subkeys (optional) options for each subkey, default to main key options. e.g. [ {sign: true, passphrase: '123'}]
      *        sign parameter defaults to false, and indicates whether the subkey should sign rather than encrypt
      * @returns
      */
    def generate(options: openpgpLib.openpgpMod.openpgpNs.KeyOptions): js.Promise[Key] = js.native
    /**
      * Returns the valid and non-expired signature that has the latest creation date, while ignoring signatures created in the future.
      * @param signatures List of signatures
      * @param date Use the given date instead of the current time
      * @returns The latest valid signature
      */
    def getLatestValidSignature(signatures: js.Array[_], date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.openpgpNs.packetNs.Signature] = js.native
    /**
      * Returns the preferred symmetric/aead algorithm for a set of keys
      * @param {symmetric | aead} type Type of preference to return
      * @param keys Set of keys
      * @param date (optional) use the given date for verification instead of the current time
      * @param userIds (optional) user IDs
      * @returns Preferred symmetric algorithm
      */
    def getPreferredAlgo(`type`: js.Any, keys: js.Array[_], date: stdLib.Date, userIds: js.Array[_]): js.Promise[openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric] = js.native
    /**
      * Returns the preferred signature hash algorithm of a key
      * @param key (optional) the key to get preferences from
      * @param keyPacket key packet used for signing
      * @param date (optional) use the given date for verification instead of the current time
      * @param userId (optional) user ID
      * @returns
      */
    def getPreferredHashAlgo(
      key: Key,
      keyPacket: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      date: stdLib.Date,
      userId: js.Object
    ): js.Promise[java.lang.String] = js.native
    def getPreferredHashAlgo(
      key: Key,
      keyPacket: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
      date: stdLib.Date,
      userId: js.Object
    ): js.Promise[java.lang.String] = js.native
    /**
      * Returns whether aead is supported by all keys in the set
      * @param keys Set of keys
      * @param date (optional) use the given date for verification instead of the current time
      * @param userIds (optional) user IDs
      * @returns
      */
    def isAeadSupported(keys: js.Array[_], date: stdLib.Date, userIds: js.Array[_]): js.Promise[scala.Boolean] = js.native
    def isDataRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      dataToVerify: js.Object,
      revocations: js.Array[_],
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isDataRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      dataToVerify: js.Object,
      revocations: js.Array[_],
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isDataRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      dataToVerify: js.Object,
      revocations: js.Array[_],
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isDataRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      dataToVerify: js.Object,
      revocations: js.Array[_],
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isDataRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      dataToVerify: js.Object,
      revocations: js.Array[_],
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    /**
      * Checks if a given certificate or binding signature is revoked
      * @param primaryKey The primary key packet
      * @param dataToVerify The data to check
      * @param revocations The revocation signatures to check
      * @param signature The certificate or signature to check
      * @param key, optional The key packet to check the signature
      * @param date Use the given date instead of the current time
      * @returns True if the signature revokes the data
      */
    def isDataRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      dataToVerify: js.Object,
      revocations: js.Array[_],
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.PublicSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isDataRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      dataToVerify: js.Object,
      revocations: js.Array[_],
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    def isDataRevoked(
      primaryKey: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretKey,
      dataToVerify: js.Object,
      revocations: js.Array[_],
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      key: openpgpLib.openpgpMod.openpgpNs.packetNs.SecretSubkey,
      date: stdLib.Date
    ): js.Promise[scala.Boolean] = js.native
    /**
      * Reads an unarmored OpenPGP key list and returns one or multiple key objects
      * @param data to be parsed
      * @returns result object with key and error arrays
      */
    def read(data: stdLib.Uint8Array): js.Promise[openpgpLib.Anon_Err] = js.native
    /**
      * Reads an OpenPGP armored text and returns one or multiple key objects
      * @param armoredText text to be parsed
      * @returns result object with key and error arrays
      */
    def readArmored(armoredText: java.lang.String): js.Promise[KeyResult] = js.native
    def readArmored(armoredText: openpgpLib.ReadableStream[java.lang.String]): js.Promise[KeyResult] = js.native
    /**
      * Reformats and signs an OpenPGP key with a given User ID. Currently only supports RSA keys.
      * @param options.privateKey The private key to reformat
      * @param options.keyType
      * @param options.userIds Assumes already in form of "User Name <username@email.com>"
      *        If array is used, the first userId is set as primary user Id
      * @param options.passphrase The passphrase used to encrypt the resulting private key
      * @param options.keyExpirationTime The number of seconds after the key creation time that the key expires
      * @param date Override the creation date of the key and the key signatures
      * @param subkeys (optional) options for each subkey, default to main key options. e.g. [ {sign: true, passphrase: '123'}]
      * @returns
      */
    def reformat(date: stdLib.Date, subkeys: js.Array[_]): js.Promise[Key] = js.native
  }
  
  /**
    * @see module:keyring/keyring
    * @see module:keyring/localstore
    */
  @JSName("keyring")
  @js.native
  object keyringNs extends js.Object {
    @JSName("keyring")
    @js.native
    object keyringNs extends js.Object {
      @js.native
      /**
        * Initialization routine for the keyring.
        * @param storeHandler class implementing loadPublic(), loadPrivate(), storePublic(), and storePrivate() methods
        */
      class Keyring () extends js.Object {
        def this(storeHandler: openpgpLib.openpgpMod.openpgpNs.keyringNs.localstoreNs.LocalStore) = this()
        /**
          * Clear the keyring - erase all the keys
          */
        def clear(): scala.Unit = js.native
        /**
          * Get all public and private keys
          * @returns all keys
          */
        def getAllKeys(): js.Array[_] = js.native
        /**
          * Searches the keyring for keys having the specified key id
          * @param keyId provided as string of lowercase hex number
          *        withouth 0x prefix (can be 16-character key ID or fingerprint)
          * @param deep if true search also in subkeys
          * @returns keys found or null
          */
        def getKeysForId(keyId: java.lang.String, deep: scala.Boolean): js.Array[_] | scala.Null = js.native
        /**
          * Calls the storeHandler to load the keys
          */
        def load(): scala.Unit = js.native
        /**
          * Removes keys having the specified key id from the keyring
          * @param keyId provided as string of lowercase hex number
          *        withouth 0x prefix (can be 16-character key ID or fingerprint)
          * @returns keys found or null
          */
        def removeKeysForId(keyId: java.lang.String): js.Array[_] | scala.Null = js.native
        /**
          * Calls the storeHandler to save the keys
          */
        def store(): scala.Unit = js.native
      }
      
      /**
        * Array of keys
        * @param keys The keys to store in this array
        */
      def KeyArray(keys: js.Array[_]): scala.Unit = js.native
    }
    
    @JSName("localstore")
    @js.native
    object localstoreNs extends js.Object {
      @js.native
      class LocalStore protected () extends js.Object {
        /**
          * The class that deals with storage of the keyring.
          * Currently the only option is to use HTML5 local storage.
          * @param prefix prefix for itemnames in localstore
          */
        def this(prefix: java.lang.String) = this()
        /**
          * Load the private keys from HTML5 local storage.
          * @returns array of keys retrieved from localstore
          */
        def loadPrivate(): js.Array[_] = js.native
        /**
          * Load the public keys from HTML5 local storage.
          * @returns array of keys retrieved from localstore
          */
        def loadPublic(): js.Array[_] = js.native
        /**
          * Saves the current state of the private keys to HTML5 local storage.
          * The key array gets stringified using JSON
          * @param keys array of keys to save in localstore
          */
        def storePrivate(keys: js.Array[_]): scala.Unit = js.native
        /**
          * Saves the current state of the public keys to HTML5 local storage.
          * The key array gets stringified using JSON
          * @param keys array of keys to save in localstore
          */
        def storePublic(keys: js.Array[_]): scala.Unit = js.native
      }
      
    }
    
  }
  
  @JSName("message")
  @js.native
  object messageNs extends js.Object {
    /**
      * Class that represents an OpenPGP message.
      * Can be an encrypted message, signed message, compressed message or literal message
      */
    @js.native
    class Message protected () extends js.Object {
      /**
        * @param packetlist The packets that form this message
        *        See {@link https://tools.ietf.org/html/rfc4880#section-11.3}
        */
      def this(packetlist: openpgpLib.openpgpMod.openpgpNs.packetNs.List) = this()
      var packets: openpgpLib.openpgpMod.openpgpNs.packetNs.List = js.native
      /**
        * Append signature to unencrypted message object
        * @param detachedSignature The detached ASCII-armored or Uint8Array PGP signature
        */
      def appendSignature(detachedSignature: java.lang.String): scala.Unit = js.native
      def appendSignature(detachedSignature: stdLib.Uint8Array): scala.Unit = js.native
      /**
        * Returns ASCII armored text of message
        * @returns ASCII armor
        */
      def armor(): openpgpLib.ReadableStream[java.lang.String] = js.native
      /**
        * Compresses the message (the literal and -if signed- signature data packets of the message)
        * @param compression compression algorithm to be used
        * @returns new message with compressed content
        */
      def compress(compression: openpgpLib.openpgpMod.openpgpNs.enumsNs.compression): Message = js.native
      /**
        * Decrypt the message. Either a private key, a session key, or a password must be specified.
        * @param privateKeys (optional) private keys with decrypted secret data
        * @param passwords (optional) passwords used to decrypt
        * @param sessionKeys (optional) session keys in the form: { data:Uint8Array, algorithm:String, [aeadAlgorithm:String] }
        * @param streaming (optional) whether to process data as a stream
        * @returns new message with decrypted content
        */
      def decrypt(): js.Promise[Message] = js.native
      def decrypt(privateKeys: js.Array[_]): js.Promise[Message] = js.native
      def decrypt(privateKeys: js.Array[_], passwords: js.Array[_]): js.Promise[Message] = js.native
      def decrypt(privateKeys: js.Array[_], passwords: js.Array[_], sessionKeys: js.Array[_]): js.Promise[Message] = js.native
      def decrypt(
        privateKeys: js.Array[_],
        passwords: js.Array[_],
        sessionKeys: js.Array[_],
        streaming: scala.Boolean
      ): js.Promise[Message] = js.native
      /**
        * Decrypt encrypted session keys either with private keys or passwords.
        * @param privateKeys (optional) private keys with decrypted secret data
        * @param passwords (optional) passwords used to decrypt
        * @returns array of object with potential sessionKey, algorithm pairs
        */
      def decryptSessionKeys(): js.Promise[js.Array[openpgpLib.Anon_Algorithm]] = js.native
      def decryptSessionKeys(privateKeys: js.Array[_]): js.Promise[js.Array[openpgpLib.Anon_Algorithm]] = js.native
      def decryptSessionKeys(privateKeys: js.Array[_], passwords: js.Array[_]): js.Promise[js.Array[openpgpLib.Anon_Algorithm]] = js.native
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
        keys: js.UndefOr[js.Array[_]],
        passwords: js.UndefOr[js.Array[_]],
        sessionKey: js.UndefOr[js.Object],
        wildcard: js.UndefOr[scala.Boolean],
        date: js.UndefOr[stdLib.Date],
        userIds: js.UndefOr[js.Array[_]],
        streaming: js.UndefOr[scala.Boolean]
      ): js.Promise[Message] = js.native
      /**
        * Returns the key IDs of the keys to which the session key is encrypted
        * @returns array of keyid objects
        */
      def getEncryptionKeyIds(): js.Array[_] = js.native
      /**
        * Get filename from literal data packet
        * @returns filename of literal data packet as string
        */
      def getFilename(): java.lang.String | scala.Null = js.native
      /**
        * Get literal data that is the body of the message
        * @returns literal body of the message as Uint8Array
        */
      def getLiteralData(): stdLib.Uint8Array | scala.Null = js.native
      /**
        * Returns the key IDs of the keys that signed the message
        * @returns array of keyid objects
        */
      def getSigningKeyIds(): js.Array[_] = js.native
      /**
        * Get literal data as text
        * @returns literal body of the message interpreted as text
        */
      def getText(): java.lang.String | scala.Null = js.native
      /**
        * Sign the message (the literal data packet of the message)
        * @param privateKeys private keys with decrypted secret key data for signing
        * @param signature (optional) any existing detached signature to add to the message
        * @param date (optional) override the creation time of the signature
        * @param userIds (optional) user IDs to sign with, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
        * @returns new message with signed content
        */
      def sign(privateKeys: js.Array[_]): js.Promise[Message] = js.native
      def sign(privateKeys: js.Array[_], signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature): js.Promise[Message] = js.native
      def sign(
        privateKeys: js.Array[_],
        signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature,
        date: stdLib.Date
      ): js.Promise[Message] = js.native
      def sign(
        privateKeys: js.Array[_],
        signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature,
        date: stdLib.Date,
        userIds: js.Array[_]
      ): js.Promise[Message] = js.native
      /**
        * Create a detached signature for the message (the literal data packet of the message)
        * @param privateKeys private keys with decrypted secret key data for signing
        * @param signature (optional) any existing detached signature
        * @param date (optional) override the creation time of the signature
        * @param userIds (optional) user IDs to sign with, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
        * @returns new detached signature of message content
        */
      def signDetached(privateKeys: js.Array[_]): js.Promise[openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature] = js.native
      def signDetached(privateKeys: js.Array[_], signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature): js.Promise[openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature] = js.native
      def signDetached(
        privateKeys: js.Array[_],
        signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature,
        date: stdLib.Date
      ): js.Promise[openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature] = js.native
      def signDetached(
        privateKeys: js.Array[_],
        signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature,
        date: stdLib.Date,
        userIds: js.Array[_]
      ): js.Promise[openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature] = js.native
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
      def verify(keys: js.Array[_]): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
      def verify(keys: js.Array[_], date: stdLib.Date): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
      def verify(keys: js.Array[_], date: stdLib.Date, streaming: scala.Boolean): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
      /**
        * Verify detached message signature
        * @param keys array of keys to verify signatures
        * @param signature
        * @param date Verify the signature against the given date, i.e. check signature creation time < date < expiration time
        * @returns list of signer's keyid and validity of signature
        */
      def verifyDetached(keys: js.Array[_], signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
      def verifyDetached(
        keys: js.Array[_],
        signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature,
        date: stdLib.Date
      ): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
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
    def createSignaturePackets(
      literalDataPacket: openpgpLib.openpgpMod.openpgpNs.packetNs.Literal,
      privateKeys: js.Array[_],
      signature: openpgpLib.openpgpMod.openpgpNs.signatureNs.Signature,
      date: stdLib.Date,
      userIds: js.Array[_]
    ): js.Promise[openpgpLib.openpgpMod.openpgpNs.packetNs.List] = js.native
    /**
      * Create object containing signer's keyid and validity of signature
      * @param signature signature packets
      * @param literalDataList array of literal data packets
      * @param keys array of keys to verify signatures
      * @param date Verify the signature against the given date,
      *        i.e. check signature creation time < date < expiration time
      * @returns list of signer's keyid and validity of signature
      */
    def createVerificationObject(
      signature: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
      literalDataList: js.Array[_],
      keys: js.Array[_],
      date: stdLib.Date
    ): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
    /**
      * Create list of objects containing signer's keyid and validity of signature
      * @param signatureList array of signature packets
      * @param literalDataList array of literal data packets
      * @param keys array of keys to verify signatures
      * @param date Verify the signature against the given date,
      *        i.e. check signature creation time < date < expiration time
      * @returns list of signer's keyid and validity of signature
      */
    def createVerificationObjects(signatureList: js.Array[_], literalDataList: js.Array[_], keys: js.Array[_], date: stdLib.Date): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
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
    def encryptSessionKey(
      sessionKey: stdLib.Uint8Array,
      symAlgo: java.lang.String,
      aeadAlgo: java.lang.String,
      publicKeys: js.Array[_],
      passwords: js.Array[_],
      wildcard: scala.Boolean,
      date: stdLib.Date,
      userIds: js.Array[_]
    ): js.Promise[Message] = js.native
    def fromBinary(bytes: openpgpLib.ReadableStream[stdLib.Uint8Array]): Message = js.native
    def fromBinary(bytes: openpgpLib.ReadableStream[stdLib.Uint8Array], filename: java.lang.String): Message = js.native
    def fromBinary(bytes: openpgpLib.ReadableStream[stdLib.Uint8Array], filename: java.lang.String, date: stdLib.Date): Message = js.native
    def fromBinary(
      bytes: openpgpLib.ReadableStream[stdLib.Uint8Array],
      filename: java.lang.String,
      date: stdLib.Date,
      `type`: js.Any
    ): Message = js.native
    /**
      * creates new message object from binary data
      * @param bytes
      * @param filename (optional)
      * @param date (optional)
      * @param {utf8 | binary | text | mime} type (optional) data packet type
      * @returns new message object
      */
    def fromBinary(bytes: stdLib.Uint8Array): Message = js.native
    def fromBinary(bytes: stdLib.Uint8Array, filename: java.lang.String): Message = js.native
    def fromBinary(bytes: stdLib.Uint8Array, filename: java.lang.String, date: stdLib.Date): Message = js.native
    def fromBinary(bytes: stdLib.Uint8Array, filename: java.lang.String, date: stdLib.Date, `type`: js.Any): Message = js.native
    /**
      * creates new message object from text
      * @param text
      * @param filename (optional)
      * @param date (optional)
      * @param {utf8 | binary | text | mime} type (optional) data packet type
      * @returns new message object
      */
    def fromText(text: java.lang.String): Message = js.native
    def fromText(text: java.lang.String, filename: java.lang.String): Message = js.native
    def fromText(text: java.lang.String, filename: java.lang.String, date: stdLib.Date): Message = js.native
    def fromText(text: java.lang.String, filename: java.lang.String, date: stdLib.Date, `type`: js.Any): Message = js.native
    def fromText(text: openpgpLib.ReadableStream[java.lang.String]): Message = js.native
    def fromText(text: openpgpLib.ReadableStream[java.lang.String], filename: java.lang.String): Message = js.native
    def fromText(text: openpgpLib.ReadableStream[java.lang.String], filename: java.lang.String, date: stdLib.Date): Message = js.native
    def fromText(
      text: openpgpLib.ReadableStream[java.lang.String],
      filename: java.lang.String,
      date: stdLib.Date,
      `type`: js.Any
    ): Message = js.native
    def read(input: openpgpLib.ReadableStream[stdLib.Uint8Array]): js.Promise[Message] = js.native
    def read(input: openpgpLib.ReadableStream[stdLib.Uint8Array], fromStream: scala.Boolean): js.Promise[Message] = js.native
    /**
      * reads an OpenPGP message as byte array and returns a message object
      * @param input binary message
      * @param fromStream whether the message was created from a Stream
      * @returns new message object
      */
    def read(input: stdLib.Uint8Array): js.Promise[Message] = js.native
    def read(input: stdLib.Uint8Array, fromStream: scala.Boolean): js.Promise[Message] = js.native
    /**
      * reads an OpenPGP armored message and returns a message object
      * @param armoredText text to be parsed
      * @returns new message object
      */
    def readArmored(armoredText: java.lang.String): js.Promise[Message] = js.native
    def readArmored(armoredText: openpgpLib.ReadableStream[java.lang.String]): js.Promise[Message] = js.native
  }
  
  /**
    * @see module:packet/all_packets
    * @see module:packet/clone
    * @see module:packet.List
    */
  @JSName("packet")
  @js.native
  object packetNs extends js.Object {
    @js.native
    /**
      * Implementation of the Compressed Data Packet (Tag 8)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.6|RFC4880 5.6}:
      * The Compressed Data packet contains compressed data.  Typically,
      * this packet is found as the contents of an encrypted packet, or following
      * a Signature or One-Pass Signature packet, and contains a literal data packet.
      */
    class Compressed () extends js.Object {
      /**
        * Compression algorithm
        * @type {compression}
        */
      var algorithm: js.Any = js.native
      /**
        * Compressed packet data
        */
      var compressed: stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
      /**
        * List of packets
        */
      var packets: List = js.native
      /**
        * Packet type
        */
      var tag: openpgpLib.openpgpMod.openpgpNs.enumsNs.packet = js.native
      /**
        * Compress the packet data (member decompressedData)
        */
      def compress(): scala.Unit = js.native
      /**
        * Decompression method for decompressing the compressed data
        * read by read_packet
        */
      def decompress(): scala.Unit = js.native
      def read(bytes: openpgpLib.ReadableStream[stdLib.Uint8Array]): scala.Unit = js.native
      /**
        * Parsing function for the packet.
        * @param bytes Payload of a tag 8 packet
        */
      def read(bytes: stdLib.Uint8Array): scala.Unit = js.native
      /**
        * Return the compressed packet.
        * @returns binary compressed packet
        */
      def write(): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
    }
    
    @js.native
    /**
      * This class represents a list of openpgp packets.
      * Take care when iterating over it - the packets themselves
      * are stored as numerical indices.
      */
    class List () extends js.Object {
      /**
        * The number of packets contained within the list.
        */
      val length: openpgpLib.Integer = js.native
      /**
        * Concatenates packetlist or array of packets
        */
      def concat(): scala.Unit = js.native
      /**
        * Creates a new PacketList with all packets from the given types
        */
      def filterByTag(): scala.Unit = js.native
      /**
        * Traverses packet tree and returns first matching packet
        * @param type The packet type
        * @returns
        */
      def findPacket(`type`: openpgpLib.openpgpMod.openpgpNs.enumsNs.packet): js.UndefOr[List] = js.native
      /**
        * Returns array of found indices by tag
        */
      def indexOfTag(): scala.Unit = js.native
      /**
        * Adds a packet to the list. This is the only supported method of doing so;
        * writing to packetlist[i] directly will result in an error.
        * @param packet Packet to push
        */
      def push(packet: js.Object): scala.Unit = js.native
      def read(A: openpgpLib.ReadableStream[stdLib.Uint8Array]): scala.Unit = js.native
      /**
        * Reads a stream of binary data and interprents it as a list of packets.
        * @param A Uint8Array of bytes.
        */
      def read(A: stdLib.Uint8Array): scala.Unit = js.native
      /**
        * Creates a binary representation of openpgp objects contained within the
        * class instance.
        * @returns A Uint8Array containing valid openpgp packets.
        */
      def write(): stdLib.Uint8Array = js.native
    }
    
    @js.native
    class Literal protected () extends js.Object {
      /**
        * Implementation of the Literal Data Packet (Tag 11)
        * {@link https://tools.ietf.org/html/rfc4880#section-5.9|RFC4880 5.9}:
        * A Literal Data packet contains the body of a message; data that is not to be
        * further interpreted.
        * @param date the creation date of the literal package
        */
      def this(date: stdLib.Date) = this()
      /**
        * Get the byte sequence representing the literal packet data
        * @param clone (optional) Whether to return a clone so that getBytes/getText can be called again
        * @returns A sequence of bytes
        */
      def getBytes(clone: scala.Boolean): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
      /**
        * Get the filename of the literal packet data
        * @returns filename
        */
      def getFilename(): java.lang.String = js.native
      /**
        * Returns literal data packets as native JavaScript string
        * with normalized end of line to \n
        * @param clone (optional) Whether to return a clone so that getBytes/getText can be called again
        * @returns literal data as text
        */
      def getText(clone: scala.Boolean): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
      def read(input: openpgpLib.ReadableStream[stdLib.Uint8Array]): Literal = js.native
      /**
        * Parsing function for a literal data packet (tag 11).
        * @param input Payload of a tag 11 packet
        * @returns object representation
        */
      def read(input: stdLib.Uint8Array): Literal = js.native
      def setBytes(bytes: openpgpLib.ReadableStream[stdLib.Uint8Array], format: js.Any): scala.Unit = js.native
      /**
        * Set the packet data to value represented by the provided string of bytes.
        * @param bytes The string of bytes
        * @param {utf8 | binary | text | mime} format The format of the string of bytes
        */
      def setBytes(bytes: stdLib.Uint8Array, format: js.Any): scala.Unit = js.native
      /**
        * Sets the filename of the literal packet data
        * @param filename Any native javascript string
        */
      def setFilename(filename: java.lang.String): scala.Unit = js.native
      /**
        * Set the packet data to a javascript native string, end of line
        * will be normalized to \r\n and by default text is converted to UTF8
        * @param text Any native javascript string
        * @param {utf8 | binary | text | mime} format (optional) The format of the string of bytes
        */
      def setText(text: java.lang.String, format: js.Any): scala.Unit = js.native
      def setText(text: openpgpLib.ReadableStream[java.lang.String], format: js.Any): scala.Unit = js.native
      /**
        * Creates a string representation of the packet
        * @returns Uint8Array representation of the packet
        */
      def write(): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
    }
    
    @js.native
    /**
      * Implementation of the strange "Marker packet" (Tag 10)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.8|RFC4880 5.8}:
      * An experimental version of PGP used this packet as the Literal
      * packet, but no released version of PGP generated Literal packets with this
      * tag. With PGP 5.x, this packet has been reassigned and is reserved for use as
      * the Marker packet.
      * Such a packet MUST be ignored when received.
      */
    class Marker () extends js.Object {
      /**
        * Parsing function for a literal data packet (tag 10).
        * @param input Payload of a tag 10 packet
        * @param position Position to start reading from the input string
        * @param len Length of the packet or the remaining length of
        *        input at position
        * @returns Object representation
        */
      def read(input: java.lang.String, position: openpgpLib.Integer, len: openpgpLib.Integer): Marker = js.native
    }
    
    @js.native
    /**
      * Implementation of the One-Pass Signature Packets (Tag 4)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.4|RFC4880 5.4}:
      * The One-Pass Signature packet precedes the signed data and contains
      * enough information to allow the receiver to begin calculating any
      * hashes needed to verify the signature.  It allows the Signature
      * packet to be placed at the end of the message, so that the signer
      * can compute the entire signed message in one pass.
      */
    class OnePassSignature () extends js.Object {
      /**
        * A one-octet number holding a flag showing whether the signature is nested.
        * A zero value indicates that the next packet is another One-Pass Signature packet
        * that describes another signature to be applied to the same message data.
        */
      var flags: js.Any = js.native
      /**
        * A one-octet number describing the hash algorithm used.
        * @see
        */
      var hashAlgorithm: js.Any = js.native
      /**
        * An eight-octet number holding the Key ID of the signing key.
        */
      var issuerKeyId: js.Any = js.native
      /**
        * A one-octet number describing the public-key algorithm used.
        * @see
        */
      var publicKeyAlgorithm: js.Any = js.native
      /**
        * A one-octet signature type.
        * Signature types are described in
        * {@link https://tools.ietf.org/html/rfc4880#section-5.2.1|RFC4880 Section 5.2.1}.
        */
      var signatureType: js.Any = js.native
      /**
        * Packet type
        */
      var tag: openpgpLib.openpgpMod.openpgpNs.enumsNs.packet = js.native
      /**
        * A one-octet version number.  The current version is 3.
        */
      var version: js.Any = js.native
      /**
        * Fix custom types after cloning
        */
      def postCloneTypeFix(): scala.Unit = js.native
      /**
        * parsing function for a one-pass signature packet (tag 4).
        * @param bytes payload of a tag 4 packet
        * @returns object representation
        */
      def read(bytes: stdLib.Uint8Array): OnePassSignature = js.native
      /**
        * creates a string representation of a one-pass signature packet
        * @returns a Uint8Array representation of a one-pass signature packet
        */
      def write(): stdLib.Uint8Array = js.native
    }
    
    @js.native
    /**
      * Implementation of the Key Material Packet (Tag 5,6,7,14)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.5|RFC4480 5.5}:
      * A key material packet contains all the information about a public or
      * private key.  There are four variants of this packet type, and two
      * major versions.
      * A Public-Key packet starts a series of packets that forms an OpenPGP
      * key (sometimes called an OpenPGP certificate).
      */
    class PublicKey () extends js.Object {
      /**
        * Public key algorithm.
        */
      var algorithm: java.lang.String = js.native
      /**
        * Key creation date.
        */
      var created: stdLib.Date = js.native
      /**
        * Time until expiration in days (V3 only)
        */
      var expirationTimeV3: openpgpLib.Integer = js.native
      /**
        * Fingerprint in lowercase hex
        */
      var fingerprint: java.lang.String = js.native
      /**
        * Keyid
        */
      var keyid: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid = js.native
      /**
        * Algorithm specific params
        */
      var params: js.Array[js.Object] = js.native
      /**
        * Alias of read()
        * @see module:packet.PublicKey#read
        */
      var readPublicKey: js.Any = js.native
      /**
        * Packet type
        */
      var tag: openpgpLib.openpgpMod.openpgpNs.enumsNs.packet = js.native
      /**
        * Packet version
        */
      var version: openpgpLib.Integer = js.native
      /**
        * Alias of write()
        * @see module:packet.PublicKey#write
        */
      var writePublicKey: js.Any = js.native
      /**
        * Returns algorithm information
        * @returns An object of the form {algorithm: string, bits:int, curve:String}
        */
      def getAlgorithmInfo(): js.Object = js.native
      /**
        * Returns the creation time of the key
        * @returns
        */
      def getCreationTime(): stdLib.Date = js.native
      /**
        * Calculates the fingerprint of the key
        * @returns A string containing the fingerprint in lowercase hex
        */
      def getFingerprint(): java.lang.String = js.native
      /**
        * Calculates the fingerprint of the key
        * @returns A Uint8Array containing the fingerprint
        */
      def getFingerprintBytes(): stdLib.Uint8Array = js.native
      /**
        * Calculates the key id of the key
        * @returns A 8 byte key id
        */
      def getKeyId(): java.lang.String = js.native
      /**
        * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
        * @returns Whether the two keys have the same version and public key data
        */
      def hasSameFingerprintAs(): scala.Boolean = js.native
      /**
        * Check whether secret-key data is available in decrypted form. Returns null for public keys.
        * @returns
        */
      def isDecrypted(): scala.Boolean | scala.Null = js.native
      /**
        * Fix custom types after cloning
        */
      def postCloneTypeFix(): scala.Unit = js.native
      /**
        * Internal Parser for public keys as specified in {@link https://tools.ietf.org/html/rfc4880#section-5.5.2|RFC 4880 section 5.5.2 Public-Key Packet Formats}
        * called by read_tag&lt;num&gt;
        * @param bytes Input array to read the packet from
        * @returns This object with attributes set by the parser
        */
      def read(bytes: stdLib.Uint8Array): js.Object = js.native
      /**
        * Same as write_private_key, but has less information because of
        * public key.
        * @returns OpenPGP packet body contents,
        */
      def write(): stdLib.Uint8Array = js.native
      /**
        * Write an old version packet - it's used by some of the internal routines.
        */
      def writeOld(): scala.Unit = js.native
    }
    
    @js.native
    /**
      * Public-Key Encrypted Session Key Packets (Tag 1)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.1|RFC4880 5.1}:
      * A Public-Key Encrypted Session Key packet holds the session key
      * used to encrypt a message. Zero or more Public-Key Encrypted Session Key
      * packets and/or Symmetric-Key Encrypted Session Key packets may precede a
      * Symmetrically Encrypted Data Packet, which holds an encrypted message. The
      * message is encrypted with the session key, and the session key is itself
      * encrypted and stored in the Encrypted Session Key packet(s). The
      * Symmetrically Encrypted Data Packet is preceded by one Public-Key Encrypted
      * Session Key packet for each OpenPGP key to which the message is encrypted.
      * The recipient of the message finds a session key that is encrypted to their
      * public key, decrypts the session key, and then uses the session key to
      * decrypt the message.
      */
    class PublicKeyEncryptedSessionKey () extends js.Object {
      var encrypted: js.Array[_] = js.native
      /**
        * Decrypts the session key (only for public key encrypted session key
        * packets (tag 1)
        * @param key Private key with secret params unlocked
        * @returns
        */
      def decrypt(key: SecretKey): js.Promise[scala.Boolean] = js.native
      /**
        * Encrypt session key packet
        * @param key Public key
        * @returns
        */
      def encrypt(key: PublicKey): js.Promise[scala.Boolean] = js.native
      /**
        * Fix custom types after cloning
        */
      def postCloneTypeFix(): scala.Unit = js.native
      /**
        * Parsing function for a publickey encrypted session key packet (tag 1).
        * @param input Payload of a tag 1 packet
        * @param position Position to start reading from the input string
        * @param len Length of the packet or the remaining length of
        *        input at position
        * @returns Object representation
        */
      def read(input: stdLib.Uint8Array, position: openpgpLib.Integer, len: openpgpLib.Integer): PublicKeyEncryptedSessionKey = js.native
      /**
        * Create a string representation of a tag 1 packet
        * @returns The Uint8Array representation
        */
      def write(): stdLib.Uint8Array = js.native
    }
    
    @js.native
    /**
      * A Public-Subkey packet (tag 14) has exactly the same format as a
      * Public-Key packet, but denotes a subkey.  One or more subkeys may be
      * associated with a top-level key.  By convention, the top-level key
      * provides signature services, and the subkeys provide encryption
      * services.
      */
    class PublicSubkey () extends js.Object {
      /**
        * Public key algorithm.
        */
      var algorithm: java.lang.String = js.native
      /**
        * Key creation date.
        */
      var created: stdLib.Date = js.native
      /**
        * Time until expiration in days (V3 only)
        */
      var expirationTimeV3: openpgpLib.Integer = js.native
      /**
        * Fingerprint in lowercase hex
        */
      var fingerprint: java.lang.String = js.native
      /**
        * Keyid
        */
      var keyid: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid = js.native
      /**
        * Algorithm specific params
        */
      var params: js.Array[js.Object] = js.native
      /**
        * Alias of read()
        * @see module:packet.PublicKey#read
        */
      var readPublicKey: js.Any = js.native
      /**
        * Packet type
        */
      var tag: openpgpLib.openpgpMod.openpgpNs.enumsNs.packet = js.native
      /**
        * Packet version
        */
      var version: openpgpLib.Integer = js.native
      /**
        * Alias of write()
        * @see module:packet.PublicKey#write
        */
      var writePublicKey: js.Any = js.native
      /**
        * Returns algorithm information
        * @returns An object of the form {algorithm: string, bits:int, curve:String}
        */
      def getAlgorithmInfo(): js.Object = js.native
      /**
        * Returns the creation time of the key
        * @returns
        */
      def getCreationTime(): stdLib.Date = js.native
      /**
        * Calculates the fingerprint of the key
        * @returns A string containing the fingerprint in lowercase hex
        */
      def getFingerprint(): java.lang.String = js.native
      /**
        * Calculates the fingerprint of the key
        * @returns A Uint8Array containing the fingerprint
        */
      def getFingerprintBytes(): stdLib.Uint8Array = js.native
      /**
        * Calculates the key id of the key
        * @returns A 8 byte key id
        */
      def getKeyId(): java.lang.String = js.native
      /**
        * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
        * @returns Whether the two keys have the same version and public key data
        */
      def hasSameFingerprintAs(): scala.Boolean = js.native
      /**
        * Check whether secret-key data is available in decrypted form. Returns null for public keys.
        * @returns
        */
      def isDecrypted(): scala.Boolean | scala.Null = js.native
      /**
        * Fix custom types after cloning
        */
      def postCloneTypeFix(): scala.Unit = js.native
      /**
        * Internal Parser for public keys as specified in {@link https://tools.ietf.org/html/rfc4880#section-5.5.2|RFC 4880 section 5.5.2 Public-Key Packet Formats}
        * called by read_tag&lt;num&gt;
        * @param bytes Input array to read the packet from
        * @returns This object with attributes set by the parser
        */
      def read(bytes: stdLib.Uint8Array): js.Object = js.native
      /**
        * Same as write_private_key, but has less information because of
        * public key.
        * @returns OpenPGP packet body contents,
        */
      def write(): stdLib.Uint8Array = js.native
      /**
        * Write an old version packet - it's used by some of the internal routines.
        */
      def writeOld(): scala.Unit = js.native
    }
    
    @js.native
    /**
      * A Secret-Key packet contains all the information that is found in a
      * Public-Key packet, including the public-key material, but also
      * includes the secret-key material after all the public-key fields.
      */
    class SecretKey () extends js.Object {
      /**
        * Public key algorithm.
        */
      var algorithm: java.lang.String = js.native
      /**
        * Key creation date.
        */
      var created: stdLib.Date = js.native
      /**
        * Encrypted secret-key data
        */
      var encrypted: js.Any = js.native
      /**
        * Time until expiration in days (V3 only)
        */
      var expirationTimeV3: openpgpLib.Integer = js.native
      /**
        * Fingerprint in lowercase hex
        */
      var fingerprint: java.lang.String = js.native
      /**
        * Indicator if secret-key data is encrypted. `this.isEncrypted === false` means data is available in decrypted form.
        */
      var isEncrypted: js.Any = js.native
      /**
        * Keyid
        */
      var keyid: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid = js.native
      /**
        * Algorithm specific params
        */
      var params: js.Array[js.Object] = js.native
      /**
        * Alias of read()
        * @see module:packet.PublicKey#read
        */
      var readPublicKey: js.Any = js.native
      /**
        * Packet type
        */
      var tag: openpgpLib.openpgpMod.openpgpNs.enumsNs.packet = js.native
      /**
        * Packet version
        */
      var version: openpgpLib.Integer = js.native
      /**
        * Alias of write()
        * @see module:packet.PublicKey#write
        */
      var writePublicKey: js.Any = js.native
      /**
        * Clear private params, return to initial state
        */
      def clearPrivateParams(): scala.Unit = js.native
      /**
        * Decrypts the private key params which are needed to use the key.
        * {@link module:packet.SecretKey.isDecrypted} should be false, as
        * otherwise calls to this function will throw an error.
        * @param passphrase The passphrase for this private key as string
        * @returns
        */
      def decrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
      /**
        * Encrypt the payload. By default, we use aes256 and iterated, salted string
        * to key specifier. If the key is in a decrypted state (isEncrypted === false)
        * and the passphrase is empty or undefined, the key will be set as not encrypted.
        * This can be used to remove passphrase protection after calling decrypt().
        * @param passphrase
        * @returns
        */
      def encrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
      /**
        * Returns algorithm information
        * @returns An object of the form {algorithm: string, bits:int, curve:String}
        */
      def getAlgorithmInfo(): js.Object = js.native
      /**
        * Returns the creation time of the key
        * @returns
        */
      def getCreationTime(): stdLib.Date = js.native
      /**
        * Calculates the fingerprint of the key
        * @returns A string containing the fingerprint in lowercase hex
        */
      def getFingerprint(): java.lang.String = js.native
      /**
        * Calculates the fingerprint of the key
        * @returns A Uint8Array containing the fingerprint
        */
      def getFingerprintBytes(): stdLib.Uint8Array = js.native
      /**
        * Calculates the key id of the key
        * @returns A 8 byte key id
        */
      def getKeyId(): java.lang.String = js.native
      /**
        * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
        * @returns Whether the two keys have the same version and public key data
        */
      def hasSameFingerprintAs(): scala.Boolean = js.native
      /**
        * Check whether secret-key data is available in decrypted form. Returns null for public keys.
        * @returns
        */
      def isDecrypted(): scala.Boolean | scala.Null = js.native
      /**
        * Fix custom types after cloning
        */
      def postCloneTypeFix(): scala.Unit = js.native
      /**
        * Internal parser for private keys as specified in
        * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-5.5.3|RFC4880bis-04 section 5.5.3}
        * @param bytes Input string to read the packet from
        */
      def read(bytes: java.lang.String): scala.Unit = js.native
      /**
        * Creates an OpenPGP key packet for the given key.
        * @returns A string of bytes containing the secret key OpenPGP packet
        */
      def write(): java.lang.String = js.native
      /**
        * Write an old version packet - it's used by some of the internal routines.
        */
      def writeOld(): scala.Unit = js.native
    }
    
    @js.native
    /**
      * A Secret-Subkey packet (tag 7) is the subkey analog of the Secret
      * Key packet and has exactly the same format.
      */
    class SecretSubkey () extends js.Object {
      /**
        * Public key algorithm.
        */
      var algorithm: java.lang.String = js.native
      /**
        * Key creation date.
        */
      var created: stdLib.Date = js.native
      /**
        * Encrypted secret-key data
        */
      var encrypted: js.Any = js.native
      /**
        * Time until expiration in days (V3 only)
        */
      var expirationTimeV3: openpgpLib.Integer = js.native
      /**
        * Fingerprint in lowercase hex
        */
      var fingerprint: java.lang.String = js.native
      /**
        * Indicator if secret-key data is encrypted. `this.isEncrypted === false` means data is available in decrypted form.
        */
      var isEncrypted: js.Any = js.native
      /**
        * Keyid
        */
      var keyid: openpgpLib.openpgpMod.openpgpNs.typeNs.keyidNs.Keyid = js.native
      /**
        * Algorithm specific params
        */
      var params: js.Array[js.Object] = js.native
      /**
        * Alias of read()
        * @see module:packet.PublicKey#read
        */
      var readPublicKey: js.Any = js.native
      /**
        * Packet type
        */
      var tag: openpgpLib.openpgpMod.openpgpNs.enumsNs.packet = js.native
      /**
        * Packet version
        */
      var version: openpgpLib.Integer = js.native
      /**
        * Alias of write()
        * @see module:packet.PublicKey#write
        */
      var writePublicKey: js.Any = js.native
      /**
        * Clear private params, return to initial state
        */
      def clearPrivateParams(): scala.Unit = js.native
      /**
        * Decrypts the private key params which are needed to use the key.
        * {@link module:packet.SecretKey.isDecrypted} should be false, as
        * otherwise calls to this function will throw an error.
        * @param passphrase The passphrase for this private key as string
        * @returns
        */
      def decrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
      /**
        * Encrypt the payload. By default, we use aes256 and iterated, salted string
        * to key specifier. If the key is in a decrypted state (isEncrypted === false)
        * and the passphrase is empty or undefined, the key will be set as not encrypted.
        * This can be used to remove passphrase protection after calling decrypt().
        * @param passphrase
        * @returns
        */
      def encrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
      /**
        * Returns algorithm information
        * @returns An object of the form {algorithm: string, bits:int, curve:String}
        */
      def getAlgorithmInfo(): js.Object = js.native
      /**
        * Returns the creation time of the key
        * @returns
        */
      def getCreationTime(): stdLib.Date = js.native
      /**
        * Calculates the fingerprint of the key
        * @returns A string containing the fingerprint in lowercase hex
        */
      def getFingerprint(): java.lang.String = js.native
      /**
        * Calculates the fingerprint of the key
        * @returns A Uint8Array containing the fingerprint
        */
      def getFingerprintBytes(): stdLib.Uint8Array = js.native
      /**
        * Calculates the key id of the key
        * @returns A 8 byte key id
        */
      def getKeyId(): java.lang.String = js.native
      /**
        * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
        * @returns Whether the two keys have the same version and public key data
        */
      def hasSameFingerprintAs(): scala.Boolean = js.native
      /**
        * Check whether secret-key data is available in decrypted form. Returns null for public keys.
        * @returns
        */
      def isDecrypted(): scala.Boolean | scala.Null = js.native
      /**
        * Fix custom types after cloning
        */
      def postCloneTypeFix(): scala.Unit = js.native
      /**
        * Internal parser for private keys as specified in
        * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-5.5.3|RFC4880bis-04 section 5.5.3}
        * @param bytes Input string to read the packet from
        */
      def read(bytes: java.lang.String): scala.Unit = js.native
      /**
        * Creates an OpenPGP key packet for the given key.
        * @returns A string of bytes containing the secret key OpenPGP packet
        */
      def write(): java.lang.String = js.native
      /**
        * Write an old version packet - it's used by some of the internal routines.
        */
      def writeOld(): scala.Unit = js.native
    }
    
    @js.native
    class Signature protected () extends js.Object {
      /**
        * Implementation of the Signature Packet (Tag 2)
        * {@link https://tools.ietf.org/html/rfc4880#section-5.2|RFC4480 5.2}:
        * A Signature packet describes a binding between some public key and
        * some data.  The most common signatures are a signature of a file or a
        * block of text, and a signature that is a certification of a User ID.
        * @param date the creation date of the signature
        */
      def this(date: stdLib.Date) = this()
      /**
        * Returns the expiration time of the signature or Infinity if signature does not expire
        * @returns expiration time
        */
      def getExpirationTime(): stdLib.Date = js.native
      /**
        * Verifies signature expiration date
        * @param date (optional) use the given date for verification instead of the current time
        * @returns true if expired
        */
      def isExpired(date: stdLib.Date): scala.Boolean = js.native
      /**
        * Fix custom types after cloning
        */
      def postCloneTypeFix(): scala.Unit = js.native
      /**
        * parsing function for a signature packet (tag 2).
        * @param bytes payload of a tag 2 packet
        * @param position position to start reading from the bytes string
        * @param len length of the packet or the remaining length of bytes at position
        * @returns object representation
        */
      def read(bytes: java.lang.String, position: openpgpLib.Integer, len: openpgpLib.Integer): Signature = js.native
      /**
        * Signs provided data. This needs to be done prior to serialization.
        * @param key private key used to sign the message.
        * @param data Contains packets to be signed.
        * @returns
        */
      def sign(key: SecretKey, data: js.Object): js.Promise[scala.Boolean] = js.native
      def verify(
        key: PublicKey,
        signatureType: openpgpLib.openpgpMod.openpgpNs.enumsNs.signature,
        data: java.lang.String
      ): js.Promise[scala.Boolean] = js.native
      def verify(key: PublicKey, signatureType: openpgpLib.openpgpMod.openpgpNs.enumsNs.signature, data: js.Object): js.Promise[scala.Boolean] = js.native
      /**
        * verifys the signature packet. Note: not signature types are implemented
        * @param key the public key to verify the signature
        * @param signatureType expected signature type
        * @param data data which on the signature applies
        * @returns True if message is verified, else false.
        */
      def verify(
        key: PublicSubkey,
        signatureType: openpgpLib.openpgpMod.openpgpNs.enumsNs.signature,
        data: java.lang.String
      ): js.Promise[scala.Boolean] = js.native
      def verify(
        key: PublicSubkey,
        signatureType: openpgpLib.openpgpMod.openpgpNs.enumsNs.signature,
        data: js.Object
      ): js.Promise[scala.Boolean] = js.native
      def verify(
        key: SecretKey,
        signatureType: openpgpLib.openpgpMod.openpgpNs.enumsNs.signature,
        data: java.lang.String
      ): js.Promise[scala.Boolean] = js.native
      def verify(key: SecretKey, signatureType: openpgpLib.openpgpMod.openpgpNs.enumsNs.signature, data: js.Object): js.Promise[scala.Boolean] = js.native
      def verify(
        key: SecretSubkey,
        signatureType: openpgpLib.openpgpMod.openpgpNs.enumsNs.signature,
        data: java.lang.String
      ): js.Promise[scala.Boolean] = js.native
      def verify(
        key: SecretSubkey,
        signatureType: openpgpLib.openpgpMod.openpgpNs.enumsNs.signature,
        data: js.Object
      ): js.Promise[scala.Boolean] = js.native
      /**
        * Creates Uint8Array of bytes of all subpacket data except Issuer and Embedded Signature subpackets
        * @returns subpacket data
        */
      def write_hashed_sub_packets(): stdLib.Uint8Array = js.native
      /**
        * Creates Uint8Array of bytes of Issuer and Embedded Signature subpackets
        * @returns subpacket data
        */
      def write_unhashed_sub_packets(): stdLib.Uint8Array = js.native
    }
    
    @js.native
    /**
      * Implementation of the Symmetrically Encrypted Authenticated Encryption with
      * Additional Data (AEAD) Protected Data Packet
      * {@link https://tools.ietf.org/html/draft-ford-openpgp-format-00#section-2.1}:
      * AEAD Protected Data Packet
      */
    class SymEncryptedAEADProtected () extends js.Object {
      def crypt(
        fn: js.Any,
        key: stdLib.Uint8Array,
        data: openpgpLib.ReadableStream[stdLib.Uint8Array],
        streaming: scala.Boolean
      ): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
      /**
        * En/decrypt the payload.
        * @param {encrypt | decrypt} fn Whether to encrypt or decrypt
        * @param key The session key used to en/decrypt the payload
        * @param data The data to en/decrypt
        * @param streaming Whether the top-level function will return a stream
        * @returns
        */
      def crypt(fn: js.Any, key: stdLib.Uint8Array, data: stdLib.Uint8Array, streaming: scala.Boolean): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
      /**
        * Decrypt the encrypted payload.
        * @param sessionKeyAlgorithm The session key's cipher algorithm e.g. 'aes128'
        * @param key The session key used to encrypt the payload
        * @param streaming Whether the top-level function will return a stream
        * @returns
        */
      def decrypt(sessionKeyAlgorithm: java.lang.String, key: stdLib.Uint8Array, streaming: scala.Boolean): scala.Boolean = js.native
      /**
        * Encrypt the packet list payload.
        * @param sessionKeyAlgorithm The session key's cipher algorithm e.g. 'aes128'
        * @param key The session key used to encrypt the payload
        * @param streaming Whether the top-level function will return a stream
        */
      def encrypt(sessionKeyAlgorithm: java.lang.String, key: stdLib.Uint8Array, streaming: scala.Boolean): scala.Unit = js.native
      def read(bytes: openpgpLib.ReadableStream[stdLib.Uint8Array]): scala.Unit = js.native
      /**
        * Parse an encrypted payload of bytes in the order: version, IV, ciphertext (see specification)
        * @param bytes
        */
      def read(bytes: stdLib.Uint8Array): scala.Unit = js.native
      /**
        * Write the encrypted payload of bytes in the order: version, IV, ciphertext (see specification)
        * @returns The encrypted payload
        */
      def write(): stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array] = js.native
    }
    
    @js.native
    /**
      * Implementation of the Sym. Encrypted Integrity Protected Data Packet (Tag 18)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.13|RFC4880 5.13}:
      * The Symmetrically Encrypted Integrity Protected Data packet is
      * a variant of the Symmetrically Encrypted Data packet. It is a new feature
      * created for OpenPGP that addresses the problem of detecting a modification to
      * encrypted data. It is used in combination with a Modification Detection Code
      * packet.
      */
    class SymEncryptedIntegrityProtected () extends js.Object {
      /**
        * The encrypted payload.
        */
      var encrypted: js.Any = js.native
      /**
        * If after decrypting the packet this is set to true,
        * a modification has been detected and thus the contents
        * should be discarded.
        */
      var modification: scala.Boolean = js.native
      /**
        * Decrypts the encrypted data contained in the packet.
        * @param sessionKeyAlgorithm The selected symmetric encryption algorithm to be used e.g. 'aes128'
        * @param key The key of cipher blocksize length to be used
        * @param streaming Whether to read this.encrypted as a stream
        * @returns
        */
      def decrypt(sessionKeyAlgorithm: java.lang.String, key: stdLib.Uint8Array, streaming: scala.Boolean): js.Promise[scala.Boolean] = js.native
      /**
        * Encrypt the payload in the packet.
        * @param sessionKeyAlgorithm The selected symmetric encryption algorithm to be used e.g. 'aes128'
        * @param key The key of cipher blocksize length to be used
        * @param streaming Whether to set this.encrypted to a stream
        * @returns
        */
      def encrypt(sessionKeyAlgorithm: java.lang.String, key: stdLib.Uint8Array, streaming: scala.Boolean): js.Promise[scala.Boolean] = js.native
    }
    
    @js.native
    /**
      * Public-Key Encrypted Session Key Packets (Tag 1)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.1|RFC4880 5.1}:
      * A Public-Key Encrypted Session Key packet holds the session key
      * used to encrypt a message. Zero or more Public-Key Encrypted Session Key
      * packets and/or Symmetric-Key Encrypted Session Key packets may precede a
      * Symmetrically Encrypted Data Packet, which holds an encrypted message. The
      * message is encrypted with the session key, and the session key is itself
      * encrypted and stored in the Encrypted Session Key packet(s). The
      * Symmetrically Encrypted Data Packet is preceded by one Public-Key Encrypted
      * Session Key packet for each OpenPGP key to which the message is encrypted.
      * The recipient of the message finds a session key that is encrypted to their
      * public key, decrypts the session key, and then uses the session key to
      * decrypt the message.
      */
    class SymEncryptedSessionKey () extends js.Object {
      /**
        * Decrypts the session key
        * @param passphrase The passphrase in string form
        * @returns
        */
      def decrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
      /**
        * Encrypts the session key
        * @param passphrase The passphrase in string form
        * @returns
        */
      def encrypt(passphrase: java.lang.String): js.Promise[scala.Boolean] = js.native
      /**
        * Fix custom types after cloning
        */
      def postCloneTypeFix(): scala.Unit = js.native
      /**
        * Parsing function for a symmetric encrypted session key packet (tag 3).
        * @param input Payload of a tag 1 packet
        * @param position Position to start reading from the input string
        * @param len Length of the packet or the remaining length of
        *        input at position
        * @returns Object representation
        */
      def read(input: stdLib.Uint8Array, position: openpgpLib.Integer, len: openpgpLib.Integer): SymEncryptedSessionKey = js.native
    }
    
    @js.native
    /**
      * Implementation of the Symmetrically Encrypted Data Packet (Tag 9)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.7|RFC4880 5.7}:
      * The Symmetrically Encrypted Data packet contains data encrypted with a
      * symmetric-key algorithm. When it has been decrypted, it contains other
      * packets (usually a literal data packet or compressed data packet, but in
      * theory other Symmetrically Encrypted Data packets or sequences of packets
      * that form whole OpenPGP messages).
      */
    class SymmetricallyEncrypted () extends js.Object {
      /**
        * Encrypted secret-key data
        */
      var encrypted: js.Any = js.native
      /**
        * When true, decrypt fails if message is not integrity protected
        * @see module:config.ignore_mdc_error
        */
      var ignore_mdc_error: js.Any = js.native
      /**
        * Decrypted packets contained within.
        */
      var packets: List = js.native
      /**
        * Packet type
        */
      var tag: openpgpLib.openpgpMod.openpgpNs.enumsNs.packet = js.native
      /**
        * Decrypt the symmetrically-encrypted packet data
        * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
        * @param sessionKeyAlgorithm Symmetric key algorithm to use
        * @param key The key of cipher blocksize length to be used
        * @returns
        */
      def decrypt(sessionKeyAlgorithm: openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric, key: stdLib.Uint8Array): js.Promise[scala.Boolean] = js.native
      /**
        * Encrypt the symmetrically-encrypted packet data
        * See {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC 4880 9.2} for algorithms.
        * @param sessionKeyAlgorithm Symmetric key algorithm to use
        * @param key The key of cipher blocksize length to be used
        * @returns
        */
      def encrypt(sessionKeyAlgorithm: openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric, key: stdLib.Uint8Array): js.Promise[scala.Boolean] = js.native
    }
    
    @js.native
    /**
      * Implementation of the Trust Packet (Tag 12)
      * {@link https://tools.ietf.org/html/rfc4880#section-5.10|RFC4880 5.10}:
      * The Trust packet is used only within keyrings and is not normally
      * exported.  Trust packets contain data that record the user's
      * specifications of which key holders are trustworthy introducers,
      * along with other information that implementing software uses for
      * trust information.  The format of Trust packets is defined by a given
      * implementation.
      * Trust packets SHOULD NOT be emitted to output streams that are
      * transferred to other users, and they SHOULD be ignored on any input
      * other than local keyring files.
      */
    class Trust () extends js.Object {
      /**
        * Parsing function for a trust packet (tag 12).
        * Currently not implemented as we ignore trust packets
        * @param byptes payload of a tag 12 packet
        */
      def read(byptes: java.lang.String): scala.Unit = js.native
    }
    
    @js.native
    /**
      * Implementation of the User Attribute Packet (Tag 17)
      * The User Attribute packet is a variation of the User ID packet.  It
      * is capable of storing more types of data than the User ID packet,
      * which is limited to text.  Like the User ID packet, a User Attribute
      * packet may be certified by the key owner ("self-signed") or any other
      * key owner who cares to certify it.  Except as noted, a User Attribute
      * packet may be used anywhere that a User ID packet may be used.
      * While User Attribute packets are not a required part of the OpenPGP
      * standard, implementations SHOULD provide at least enough
      * compatibility to properly handle a certification signature on the
      * User Attribute packet.  A simple way to do this is by treating the
      * User Attribute packet as a User ID packet with opaque contents, but
      * an implementation may use any method desired.
      */
    class UserAttribute () extends js.Object {
      /**
        * Compare for equality
        * @param usrAttr
        * @returns true if equal
        */
      def equals(usrAttr: UserAttribute): scala.Boolean = js.native
      /**
        * parsing function for a user attribute packet (tag 17).
        * @param input payload of a tag 17 packet
        */
      def read(input: stdLib.Uint8Array): scala.Unit = js.native
      /**
        * Creates a binary representation of the user attribute packet
        * @returns string representation
        */
      def write(): stdLib.Uint8Array = js.native
    }
    
    @js.native
    /**
      * Implementation of the User ID Packet (Tag 13)
      * A User ID packet consists of UTF-8 text that is intended to represent
      * the name and email address of the key holder.  By convention, it
      * includes an RFC 2822 [RFC2822] mail name-addr, but there are no
      * restrictions on its content.  The packet length in the header
      * specifies the length of the User ID.
      */
    class Userid () extends js.Object {
      /**
        * A string containing the user id. Usually in the form
        * John Doe <john@example.com>
        */
      var userid: java.lang.String = js.native
      /**
        * Set userid string from object, e.g. { name:'Phil Zimmermann', email:'phil@openpgp.org' }
        */
      def format(): scala.Unit = js.native
      /**
        * Parse userid string, e.g. 'John Doe <john@example.com>'
        */
      def parse(): scala.Unit = js.native
      /**
        * Parsing function for a user id packet (tag 13).
        * @param input payload of a tag 13 packet
        */
      def read(input: stdLib.Uint8Array): scala.Unit = js.native
      /**
        * Creates a binary representation of the user id packet
        * @returns binary representation
        */
      def write(): stdLib.Uint8Array = js.native
    }
    
    /**
      * Allocate a new packet from structured packet clone
      * @see
      * @param packetClone packet clone
      * @returns new packet object with data from packet clone
      */
    def fromStructuredClone(packetClone: js.Object): js.Object = js.native
    /**
      * Allocate a new packet
      * @param tag property name from {@link module:enums.packet}
      * @returns new packet object with type based on tag
      */
    def newPacketFromTag(tag: java.lang.String): js.Object = js.native
    /* static members */
    @js.native
    object List extends js.Object {
      /**
        * Allocate a new packetlist from structured packetlist clone
        * See {@link https://w3c.github.io/html/infrastructure.html#safe-passing-of-structured-data}
        * @param packetClone packetlist clone
        * @returns new packetlist object with data from packetlist clone
        */
      def fromStructuredClone(packetClone: js.Object): js.Object = js.native
    }
    
    @JSName("all_packets")
    @js.native
    object allUnderscorePacketsNs extends js.Object {
      /**
        * @see module:packet.Compressed
        */
      var Compressed: js.Any = js.native
      /**
        * @see module:packet.Literal
        */
      var Literal: js.Any = js.native
      /**
        * @see module:packet.Marker
        */
      var Marker: js.Any = js.native
      /**
        * @see module:packet.OnePassSignature
        */
      var OnePassSignature: js.Any = js.native
      /**
        * @see module:packet.PublicKey
        */
      var PublicKey: js.Any = js.native
      /**
        * @see module:packet.PublicKeyEncryptedSessionKey
        */
      var PublicKeyEncryptedSessionKey: js.Any = js.native
      /**
        * @see module:packet.PublicSubkey
        */
      var PublicSubkey: js.Any = js.native
      /**
        * @see module:packet.SecretKey
        */
      var SecretKey: js.Any = js.native
      /**
        * @see module:packet.SecretSubkey
        */
      var SecretSubkey: js.Any = js.native
      /**
        * @see module:packet.Signature
        */
      var Signature: js.Any = js.native
      /**
        * @see module:packet.SymEncryptedAEADProtected
        */
      var SymEncryptedAEADProtected: js.Any = js.native
      /**
        * @see module:packet.SymEncryptedIntegrityProtected
        */
      var SymEncryptedIntegrityProtected: js.Any = js.native
      /**
        * @see module:packet.SymEncryptedSessionKey
        */
      var SymEncryptedSessionKey: js.Any = js.native
      /**
        * @see module:packet.SymmetricallyEncrypted
        */
      var SymmetricallyEncrypted: js.Any = js.native
      /**
        * @see module:packet.Trust
        */
      var Trust: js.Any = js.native
      /**
        * @see module:packet.UserAttribute
        */
      var UserAttribute: js.Any = js.native
      /**
        * @see module:packet.Userid
        */
      var Userid: js.Any = js.native
    }
    
    @JSName("clone")
    @js.native
    object cloneNs extends js.Object {
      /**
        * Create a packetlist from the correspoding object types.
        * @param options the object passed to and from the web worker
        * @returns a mutated version of the options optject
        */
      def clonePackets(options: js.Object): js.Object = js.native
      /**
        * Creates an object with the correct prototype from a corresponding packetlist.
        * @param options the object passed to and from the web worker
        * @param method the public api function name to be delegated to the worker
        * @returns a mutated version of the options optject
        */
      def parseClonedPackets(options: js.Object, method: java.lang.String): js.Object = js.native
    }
    
    @JSName("packet")
    @js.native
    object packetNs extends js.Object {
      def read(input: openpgpLib.ReadableStream[stdLib.Uint8Array], callback: js.Function): scala.Boolean = js.native
      /**
        * Generic static Packet Parser function
        * @param input Input stream as string
        * @param callback Function to call with the parsed packet
        * @returns Returns false if the stream was empty and parsing is done, and true otherwise.
        */
      def read(input: stdLib.Uint8Array, callback: js.Function): scala.Boolean = js.native
      /**
        * Whether the packet type supports partial lengths per RFC4880
        * @param tag_type Tag type
        * @returns String of the header
        */
      def supportsStreaming(tag_type: openpgpLib.Integer): scala.Boolean = js.native
      /**
        * Writes a packet header version 4 with the given tag_type and length to a
        * string
        * @param tag_type Tag type
        * @param length Length of the payload
        * @returns String of the header
        */
      def writeHeader(tag_type: openpgpLib.Integer, length: openpgpLib.Integer): java.lang.String = js.native
      /**
        * Writes a packet header Version 3 with the given tag_type and length to a
        * string
        * @param tag_type Tag type
        * @param length Length of the payload
        * @returns String of the header
        */
      def writeOldHeader(tag_type: openpgpLib.Integer, length: openpgpLib.Integer): java.lang.String = js.native
      /**
        * Encodes a given integer of length to the openpgp length specifier to a
        * string
        * @param length The length to encode
        * @returns String with openpgp length representation
        */
      def writeSimpleLength(length: openpgpLib.Integer): stdLib.Uint8Array = js.native
    }
    
  }
  
  @JSName("signature")
  @js.native
  object signatureNs extends js.Object {
    /**
      * Class that represents an OpenPGP signature.
      */
    @js.native
    class Signature protected () extends js.Object {
      /**
        * @param packetlist The signature packets
        */
      def this(packetlist: openpgpLib.openpgpMod.openpgpNs.packetNs.List) = this()
      /**
        * Returns ASCII armored text of signature
        * @returns ASCII armor
        */
      def armor(): openpgpLib.ReadableStream[java.lang.String] = js.native
    }
    
    def read(input: openpgpLib.ReadableStream[stdLib.Uint8Array]): Signature = js.native
    /**
      * reads an OpenPGP signature as byte array and returns a signature object
      * @param input binary signature
      * @returns new signature object
      */
    def read(input: stdLib.Uint8Array): Signature = js.native
    /**
      * reads an OpenPGP armored signature and returns a signature object
      * @param armoredText text to be parsed
      * @returns new signature object
      */
    def readArmored(armoredText: java.lang.String): Signature = js.native
    def readArmored(armoredText: openpgpLib.ReadableStream[java.lang.String]): Signature = js.native
  }
  
  @JSName("type")
  @js.native
  object typeNs extends js.Object {
    /**
      * Encoded symmetric key for ECDH
      */
    @JSName("ecdh_symkey")
    @js.native
    object ecdhUnderscoreSymkeyNs extends js.Object {
      @js.native
      class ECDHSymmetricKey () extends js.Object {
        /**
          * Read an ECDHSymmetricKey from an Uint8Array
          * @param input Where to read the encoded symmetric key from
          * @returns Number of read bytes
          */
        def read(input: stdLib.Uint8Array): scala.Double = js.native
        /**
          * Write an ECDHSymmetricKey as an Uint8Array
          * @returns An array containing the value
          */
        def write(): stdLib.Uint8Array = js.native
      }
      
    }
    
    /**
      * Implementation of type KDF parameters
      * {@link https://tools.ietf.org/html/rfc6637#section-7|RFC 6637 7}:
      * A key derivation function (KDF) is necessary to implement the EC
      * encryption.  The Concatenation Key Derivation Function (Approved
      * Alternative 1) [NIST-SP800-56A] with the KDF hash function that is
      * SHA2-256 [FIPS-180-3] or stronger is REQUIRED.
      */
    @JSName("kdf_params")
    @js.native
    object kdfUnderscoreParamsNs extends js.Object {
      @js.native
      class KDFParams protected () extends js.Object {
        /**
          * @param hash Hash algorithm
          * @param cipher Symmetric algorithm
          */
        def this(hash: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash, cipher: openpgpLib.openpgpMod.openpgpNs.enumsNs.symmetric) = this()
        /**
          * Read KDFParams from an Uint8Array
          * @param input Where to read the KDFParams from
          * @returns Number of read bytes
          */
        def read(input: stdLib.Uint8Array): scala.Double = js.native
        /**
          * Write KDFParams to an Uint8Array
          * @returns Array with the KDFParams value
          */
        def write(): stdLib.Uint8Array = js.native
      }
      
    }
    
    /**
      * Implementation of type key id
      * {@link https://tools.ietf.org/html/rfc4880#section-3.3|RFC4880 3.3}:
      * A Key ID is an eight-octet scalar that identifies a key.
      * Implementations SHOULD NOT assume that Key IDs are unique.  The
      * section "Enhanced Key Formats" below describes how Key IDs are
      * formed.
      */
    @JSName("keyid")
    @js.native
    object keyidNs extends js.Object {
      @js.native
      class Keyid () extends js.Object {
        /**
          * Checks equality of Key ID's
          * @param keyid
          * @param matchWildcard Indicates whether to check if either keyid is a wildcard
          */
        def equals(keyid: Keyid, matchWildcard: scala.Boolean): scala.Unit = js.native
        /**
          * Parsing method for a key id
          * @param input Input to read the key id from
          */
        def read(input: stdLib.Uint8Array): scala.Unit = js.native
      }
      
    }
    
    /**
      * Implementation of type MPI ( {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC4880 3.2})
      * Multiprecision integers (also called MPIs) are unsigned integers used
      * to hold large integers such as the ones used in cryptographic
      * calculations.
      * An MPI consists of two pieces: a two-octet scalar that is the length
      * of the MPI in bits followed by a string of octets that contain the
      * actual integer.
      */
    @JSName("mpi")
    @js.native
    object mpiNs extends js.Object {
      @js.native
      class MPI () extends js.Object {
        /**
          * Parsing function for a MPI ( {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC 4880 3.2}).
          * @param input Payload of MPI data
          * @param endian Endianness of the data; 'be' for big-endian or 'le' for little-endian
          * @returns Length of data read
          */
        def read(input: stdLib.Uint8Array, endian: java.lang.String): openpgpLib.Integer = js.native
        /**
          * Converts the mpi object to a bytes as specified in
          * {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC4880 3.2}
          * @param endian Endianness of the payload; 'be' for big-endian or 'le' for little-endian
          * @param length Length of the data part of the MPI
          * @returns mpi Byte representation
          */
        def write(endian: java.lang.String, length: openpgpLib.Integer): stdLib.Uint8Array = js.native
      }
      
    }
    
    /**
      * Wrapper to an OID value
      * {@link https://tools.ietf.org/html/rfc6637#section-11|RFC6637, section 11}:
      * The sequence of octets in the third column is the result of applying
      * the Distinguished Encoding Rules (DER) to the ASN.1 Object Identifier
      * with subsequent truncation.  The truncation removes the two fields of
      * encoded Object Identifier.  The first omitted field is one octet
      * representing the Object Identifier tag, and the second omitted field
      * is the length of the Object Identifier body.  For example, the
      * complete ASN.1 DER encoding for the NIST P-256 curve OID is "06 08 2A
      * 86 48 CE 3D 03 01 07", from which the first entry in the table above
      * is constructed by omitting the first two octets.  Only the truncated
      * sequence of octets is the valid representation of a curve OID.
      */
    @JSName("oid")
    @js.native
    object oidNs extends js.Object {
      @js.native
      class OID () extends js.Object {
        /**
          * If a known curve object identifier, return the canonical name of the curve
          * @returns String with the canonical name of the curve
          */
        def getName(): java.lang.String = js.native
        /**
          * Method to read an OID object
          * @param input Where to read the OID from
          * @returns Number of read bytes
          */
        def read(input: stdLib.Uint8Array): scala.Double = js.native
        /**
          * Serialize an OID object as a hex string
          * @returns String with the hex value of the OID
          */
        def toHex(): java.lang.String = js.native
        /**
          * Serialize an OID object
          * @returns Array with the serialized value the OID
          */
        def write(): stdLib.Uint8Array = js.native
      }
      
    }
    
    /**
      * Implementation of the String-to-key specifier
      * {@link https://tools.ietf.org/html/rfc4880#section-3.7|RFC4880 3.7}:
      * String-to-key (S2K) specifiers are used to convert passphrase strings
      * into symmetric-key encryption/decryption keys.  They are used in two
      * places, currently: to encrypt the secret part of private keys in the
      * private keyring, and to convert passphrases to encryption keys for
      * symmetrically encrypted messages.
      */
    @JSName("s2k")
    @js.native
    object s2kNs extends js.Object {
      @js.native
      class S2K () extends js.Object {
        var algorithm: openpgpLib.openpgpMod.openpgpNs.enumsNs.hash = js.native
        var c: openpgpLib.Integer = js.native
        /**
          * Eight bytes of salt in a binary string.
          */
        var salt: java.lang.String = js.native
        var `type`: openpgpLib.openpgpMod.openpgpNs.enumsNs.s2k = js.native
        /**
          * Produces a key using the specified passphrase and the defined
          * hashAlgorithm
          * @param passphrase Passphrase containing user input
          * @returns Produced key with a length corresponding to
          *          hashAlgorithm hash length
          */
        def produce_key(passphrase: java.lang.String): stdLib.Uint8Array = js.native
        /**
          * Parsing function for a string-to-key specifier ( {@link https://tools.ietf.org/html/rfc4880#section-3.7|RFC 4880 3.7}).
          * @param input Payload of string-to-key specifier
          * @returns Actual length of the object
          */
        def read(input: java.lang.String): openpgpLib.Integer = js.native
        /**
          * Serializes s2k information
          * @returns binary representation of s2k
          */
        def write(): stdLib.Uint8Array = js.native
      }
      
    }
    
  }
  
  /**
    * This object contains utility functions
    */
  @JSName("util")
  @js.native
  object utilNs extends js.Object {
    /**
      * Concat a list of Uint8Arrays, Strings or Streams
      * The caller must not mix Uint8Arrays with Strings, but may mix Streams with non-Streams.
      * @param Array of Uint8Arrays/Strings/Streams to concatenate
      * @returns Concatenated array
      */
    var concat: js.Any = js.native
    /**
      * Concat Uint8Arrays
      * @param Array of Uint8Arrays to concatenate
      * @returns Concatenated array
      */
    var concatUint8Array: js.Any = js.native
    /**
      * Convert a Uint8Array to an MPI-formatted Uint8Array.
      * Note: the output is **not** an MPI object.
      * @see
      * @see
      * @param bin An array of 8-bit integers to convert
      * @returns MPI-formatted Uint8Array
      */
    def Uint8Array_to_MPI(bin: stdLib.Uint8Array): stdLib.Uint8Array = js.native
    /**
      * Convert an array of 8-bit integer to a Base-64 encoded string
      * @param bytes An array of 8-bit integers to convert
      * @param url If true, output is URL-safe
      * @returns Base-64 encoded string
      */
    def Uint8Array_to_b64(bytes: stdLib.Uint8Array, url: scala.Boolean): java.lang.String = js.native
    /**
      * Convert an array of 8-bit integers to a hex string
      * @param bytes Array of 8-bit integers to convert
      * @returns Hexadecimal representation of the array
      */
    def Uint8Array_to_hex(bytes: stdLib.Uint8Array): java.lang.String = js.native
    /**
      * Convert an array of 8-bit integers to a string
      * @param bytes An array of 8-bit integers to convert
      * @returns String representation of the array
      */
    def Uint8Array_to_str(bytes: stdLib.Uint8Array): java.lang.String = js.native
    /**
      * Convert a Base-64 encoded string an array of 8-bit integer
      * Note: accepts both Radix-64 and URL-safe strings
      * @param base64 Base-64 encoded string to convert
      * @returns An array of 8-bit integers
      */
    def b64_to_Uint8Array(base64: java.lang.String): stdLib.Uint8Array = js.native
    /**
      * Normalize line endings to \r\n
      */
    def canonicalizeEOL(): scala.Unit = js.native
    def decode_utf8(utf8: openpgpLib.ReadableStream[java.lang.String]): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
    /**
      * Convert a Uint8Array of utf8 bytes to a native javascript string
      * @param utf8 A valid squence of utf8 bytes
      * @returns A native javascript string
      */
    def decode_utf8(utf8: stdLib.Uint8Array): java.lang.String | openpgpLib.ReadableStream[java.lang.String] = js.native
    /**
      * Detect Node.js runtime.
      */
    def detectNode(): scala.Unit = js.native
    /**
      * Encode input buffer using Z-Base32 encoding.
      * See: https://tools.ietf.org/html/rfc6189#section-5.1.6
      * @param data The binary data to encode
      * @returns Binary data encoded using Z-Base32
      */
    def encodeZBase32(data: stdLib.Uint8Array): java.lang.String = js.native
    /**
      * Convert a native javascript string to a Uint8Array of utf8 bytes
      * @param str The string to convert
      * @returns A valid squence of utf8 bytes
      */
    def encode_utf8(str: java.lang.String): stdLib.Uint8Array | openpgpLib.ReadableStream[java.lang.String] = js.native
    def encode_utf8(str: openpgpLib.ReadableStream[java.lang.String]): stdLib.Uint8Array | openpgpLib.ReadableStream[java.lang.String] = js.native
    /**
      * Check Uint8Array equality
      * @param first array
      * @param second array
      * @returns equality
      */
    def equalsUint8Array(first: stdLib.Uint8Array, second: stdLib.Uint8Array): scala.Boolean = js.native
    /**
      * Format user id for internal use.
      */
    def formatUserId(): scala.Unit = js.native
    /**
      * Get native Node.js Buffer constructor. This should be used since
      * Buffer is not available under browserify.
      * @returns The Buffer constructor or 'undefined'
      */
    def getNodeBuffer(): js.Function = js.native
    /**
      * Get native Node.js crypto api. The default configuration is to use
      * the api when available. But it can also be deactivated with config.use_native
      * @returns The crypto module or 'undefined'
      */
    def getNodeCrypto(): js.Object = js.native
    /**
      * Get transferable objects to pass buffers with zero copy (similar to "pass by reference" in C++)
      * See: https://developer.mozilla.org/en-US/docs/Web/API/Worker/postMessage
      * Also, convert ReadableStreams to MessagePorts
      * @param obj the options object to be passed to the web worker
      * @returns an array of binary data to be passed
      */
    def getTransferables(obj: js.Object): js.Array[_] = js.native
    /**
      * Get native Web Cryptography api, only the current version of the spec.
      * The default configuration is to use the api when available. But it can
      * be deactivated with config.use_native
      * @returns The SubtleCrypto api or 'undefined'
      */
    def getWebCrypto(): js.Object = js.native
    /**
      * Get native Web Cryptography api for all browsers, including legacy
      * implementations of the spec e.g IE11 and Safari 8/9. The default
      * configuration is to use the api when available. But it can be deactivated
      * with config.use_native
      * @returns The SubtleCrypto api or 'undefined'
      */
    def getWebCryptoAll(): js.Object = js.native
    /**
      * Convert a hex string to an array of 8-bit integers
      * @param hex A hex string to convert
      * @returns An array of 8-bit integers
      */
    def hex_to_Uint8Array(hex: java.lang.String): stdLib.Uint8Array = js.native
    /**
      * Create binary string from a hex encoded string
      * @param str Hex string to convert
      * @returns
      */
    def hex_to_str(str: java.lang.String): java.lang.String = js.native
    /**
      * Convert line endings from canonicalized \r\n to native \n
      */
    def nativeEOL(): scala.Unit = js.native
    /**
      * Get native Node.js module
      * @param The module to require
      * @returns The required module or 'undefined'
      */
    def nodeRequire(The: java.lang.String): js.Object = js.native
    /**
      * Parse user id.
      */
    def parseUserId(): scala.Unit = js.native
    /**
      * Helper function to print a debug message. Debug
      * messages are only printed if
      * @param str String of the debug message
      */
    def print_debug(str: java.lang.String): scala.Unit = js.native
    /**
      * Helper function to print a debug error. Debug
      * messages are only printed if
      * @param str String of the debug message
      */
    def print_debug_error(str: java.lang.String): scala.Unit = js.native
    /**
      * Helper function to print a debug message. Debug
      * messages are only printed if
      * @param str String of the debug message
      */
    def print_debug_hexarray_dump(str: java.lang.String): scala.Unit = js.native
    /**
      * Helper function to print a debug message. Debug
      * messages are only printed if
      * @param str String of the debug message
      */
    def print_debug_hexstr_dump(str: java.lang.String): scala.Unit = js.native
    def print_entire_stream(str: java.lang.String, input: java.lang.String, concat: js.Function): scala.Unit = js.native
    /**
      * Read a stream to the end and print it to the console when it's closed.
      * @param str String of the debug message
      * @param input Stream to print
      * @param concat Function to concatenate chunks of the stream (defaults to util.concat).
      */
    def print_entire_stream(str: java.lang.String, input: openpgpLib.ReadableStream[java.lang.String], concat: js.Function): scala.Unit = js.native
    def print_entire_stream(str: java.lang.String, input: stdLib.Uint8Array, concat: js.Function): scala.Unit = js.native
    /**
      * Remove trailing spaces and tabs from each line
      */
    def removeTrailingSpaces(): scala.Unit = js.native
    /**
      * Convert MessagePorts back to ReadableStreams
      * @param obj
      * @returns
      */
    def restoreStreams(obj: js.Object): js.Object = js.native
    /**
      * If S[1] == 0, then double(S) == (S[2..128] || 0);
      * otherwise, double(S) == (S[2..128] || 0) xor
      * (zeros(120) || 10000111).
      * Both OCB and EAX (through CMAC) require this function to be constant-time.
      * @param data
      */
    /* Illegal function name 'double' can't be used here
      function double(data: Uint8Array): void;
      */
    /**
      * Shift a Uint8Array to the right by n bits
      * @param array The array to shift
      * @param bits Amount of bits to shift (MUST be smaller
      *        than 8)
      * @returns Resulting array.
      */
    def shiftRight(array: stdLib.Uint8Array, bits: openpgpLib.Integer): java.lang.String = js.native
    /**
      * Convert a string to an array of 8-bit integers
      * @param str String to convert
      * @returns An array of 8-bit integers
      */
    def str_to_Uint8Array(str: java.lang.String): stdLib.Uint8Array = js.native
    /**
      * Create hex string from a binary
      * @param str String to convert
      * @returns String containing the hexadecimal values
      */
    def str_to_hex(str: java.lang.String): java.lang.String = js.native
    /**
      * Calculates a 16bit sum of a Uint8Array by adding each character
      * codes modulus 65535
      * @param Uint8Array to create a sum of
      * @returns 2 bytes containing the sum of all charcodes % 65535
      */
    def write_checksum(Uint8Array: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  }
  
  @JSName("wkd")
  @js.native
  object wkdNs extends js.Object {
    @js.native
    /**
      * Initialize the WKD client
      */
    class WKD () extends js.Object {
      /**
        * Search for a public key using Web Key Directory protocol.
        * @param options.email User's email.
        * @param options.rawBytes Returns Uint8Array instead of parsed key.
        * @returns The public key.
        */
      def lookup(): js.Promise[stdLib.Uint8Array | openpgpLib.Anon_Err] = js.native
    }
    
  }
  
  @JSName("worker")
  @js.native
  object workerNs extends js.Object {
    /**
      * @see module:openpgp.initWorker
      * @see module:openpgp.getWorker
      * @see module:openpgp.destroyWorker
      * @see module:worker/worker
      */
    @JSName("async_proxy")
    @js.native
    object asyncUnderscoreProxyNs extends js.Object {
      @js.native
      class AsyncProxy protected () extends js.Object {
        /**
          * Initializes a new proxy and loads the web worker
          * @param path The path to the worker or 'openpgp.worker.js' by default
          * @param n number of workers to initialize if path given
          * @param config config The worker configuration
          * @param worker alternative to path parameter: web worker initialized with 'openpgp.worker.js'
          */
        def this(path: java.lang.String, n: scala.Double, config: js.Object, worker: js.Array[_]) = this()
        /**
          * Generic proxy function that handles all commands from the public api.
          * @param method the public api function to be delegated to the worker thread
          * @param options the api function's options
          * @returns see the corresponding public api functions for their return types
          */
        def delegate(method: java.lang.String, options: js.Object): js.Promise[_] = js.native
        /**
          * Get new request ID
          * @returns New unique request ID
          */
        def getID(): openpgpLib.Integer = js.native
        /**
          * Message handling
          */
        def handleMessage(): scala.Unit = js.native
        /**
          * Send message to worker with random data
          * @param size Number of bytes to send
          */
        def seedRandom(size: openpgpLib.Integer): scala.Unit = js.native
        /**
          * Terminates the workers
          */
        def terminate(): scala.Unit = js.native
      }
      
    }
    
    /**
      * @see module:openpgp.initWorker
      * @see module:openpgp.getWorker
      * @see module:openpgp.destroyWorker
      * @see module:worker/async_proxy
      */
    @JSName("worker")
    @js.native
    object workerNs extends js.Object {
      /**
        * Set config from main context to worker context.
        * @param config The openpgp configuration
        */
      def configure(config: js.Object): scala.Unit = js.native
      /**
        * Generic proxy function that handles all commands from the public api.
        * @param method The public api function to be delegated to the worker thread
        * @param options The api function's options
        */
      def delegate(method: java.lang.String, options: js.Object): scala.Unit = js.native
      /**
        * Handle random buffer exhaustion by requesting more random bytes from the main window
        * @returns Empty Promise<any> whose resolution indicates that the buffer has been refilled
        */
      def randomCallback(): js.Promise[js.Object] = js.native
      /**
        * Respond to the main window.
        * @param event Contains event type and data
        */
      def response(event: js.Object): scala.Unit = js.native
      /**
        * Seed the library with entropy gathered window.crypto.getRandomValues
        * as this api is only avalible in the main window.
        * @param buffer Some random bytes
        */
      def seedRandom(buffer: js.Array[_]): scala.Unit = js.native
    }
    
  }
  
}

