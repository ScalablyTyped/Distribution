package typings.openpgp.mod.key

import typings.openpgp.AnonKeyid
import typings.openpgp.AnonKeyidUserid
import typings.openpgp.AnonSelfCertification
import typings.openpgp.mod.Infinity
import typings.openpgp.mod.`type`.keyid.Keyid
import typings.openpgp.mod.enums.keyStatus
import typings.openpgp.mod.packet.List
import typings.openpgp.mod.packet.PublicKey
import typings.openpgp.mod.packet.PublicSubkey
import typings.openpgp.mod.packet.SecretKey
import typings.openpgp.mod.packet.SecretSubkey
import typings.openpgp.mod.packet.Signature
import typings.openpgp.mod.revokeReasonForRevocation
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class that represents an OpenPGP key. Must contain a primary key.
  * Can contain additional subkeys, signatures, user ids, user attributes.
  */
@JSImport("openpgp", "key.Key")
@js.native
class Key protected () extends js.Object {
  /**
    * @param packetlist The packets that form this key
    */
  def this(packetlist: List) = this()
  var primaryKey: Key = js.native
  /**
    * Applies a revocation certificate to a key
    * This adds the first signature packet in the armored text to the key,
    * if it is a valid revocation signature.
    * @param revocationCertificate armored revocation certificate
    * @returns new revoked key
    */
  def applyRevocationCertificate(revocationCertificate: String): js.Promise[Key] = js.native
  /**
    * Returns ASCII armored text of key
    * @returns ASCII armor
    */
  def armor(): String = js.native
  /**
    * Decrypts all secret key and subkey packets matching keyId
    * @param passphrases
    * @param keyId
    * @returns true if all matching key and subkey packets decrypted successfully
    */
  def decrypt(passphrases: String): js.Promise[Boolean] = js.native
  def decrypt(passphrases: String, keyId: Keyid): js.Promise[Boolean] = js.native
  def decrypt(passphrases: js.Array[String]): js.Promise[Boolean] = js.native
  def decrypt(passphrases: js.Array[String], keyId: Keyid): js.Promise[Boolean] = js.native
  /**
    * Encrypts all secret key and subkey packets matching keyId
    * @param passphrases - if multiple passphrases, then should be in same order as packets each should encrypt
    * @param keyId
    * @returns
    */
  def encrypt(passphrases: String): js.Promise[js.Array[SecretKey | SecretSubkey]] = js.native
  def encrypt(passphrases: String, keyId: Keyid): js.Promise[js.Array[SecretKey | SecretSubkey]] = js.native
  def encrypt(passphrases: js.Array[_]): js.Promise[js.Array[SecretKey | SecretSubkey]] = js.native
  def encrypt(passphrases: js.Array[_], keyId: Keyid): js.Promise[js.Array[SecretKey | SecretSubkey]] = js.native
  /**
    * Returns algorithm information
    * @returns An object of the form {algorithm: string, bits:int, curve:String}
    */
  def getAlgorithmInfo(): js.Object = js.native
  /**
    * Returns the creation time of the key
    * @returns
    */
  def getCreationTime(): Date = js.native
  /**
    * Returns last created key or key by given keyId that is available for encryption or decryption
    * @param keyId, optional
    * @param date, optional
    * @param userId, optional
    * @returns key or null if no encryption key has been found
    */
  def getEncryptionKey(): js.Promise[Key | SubKey | Null] = js.native
  def getEncryptionKey(keyId: Keyid): js.Promise[Key | SubKey | Null] = js.native
  def getEncryptionKey(keyId: Keyid, date: Date): js.Promise[Key | SubKey | Null] = js.native
  def getEncryptionKey(keyId: Keyid, date: Date, userId: String): js.Promise[Key | SubKey | Null] = js.native
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
  def getExpirationTime(): js.Promise[Date | Infinity | Null] = js.native
  def getExpirationTime(capabilities: js.Any): js.Promise[Date | Infinity | Null] = js.native
  def getExpirationTime(capabilities: js.Any, keyId: Keyid): js.Promise[Date | Infinity | Null] = js.native
  def getExpirationTime(capabilities: js.Any, keyId: Keyid, userId: js.Object): js.Promise[Date | Infinity | Null] = js.native
  /**
    * Calculates the fingerprint of the key
    * @returns A string containing the fingerprint in lowercase hex
    */
  def getFingerprint(): String = js.native
  /**
    * Calculates the key id of the key
    * @returns A 8 byte key id
    */
  def getKeyId(): String = js.native
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
  def getKeys(keyId: Keyid): js.Array[_] = js.native
  /**
    * Returns primary user and most significant (latest valid) self signature
    * - if multiple primary users exist, returns the one with the latest self signature
    * - otherwise, returns the user with the latest self signature
    * @param date (optional) use the given date for verification instead of the current time
    * @param userId (optional) user ID to get instead of the primary user, if it exists
    * @returns The primary user and the self signature
    */
  def getPrimaryUser(): js.Promise[AnonSelfCertification] = js.native
  def getPrimaryUser(date: Date): js.Promise[AnonSelfCertification] = js.native
  def getPrimaryUser(date: Date, userId: js.Object): js.Promise[AnonSelfCertification] = js.native
  /**
    * Get revocation certificate from a revoked key.
    * (To get a revocation certificate for an unrevoked key, call revoke() first.)
    * @returns armored revocation certificate
    */
  def getRevocationCertificate(): js.Promise[String] = js.native
  /**
    * Returns last created key or key by given keyId that is available for signing and verification
    * @param keyId, optional
    * @param date (optional) use the given date for verification instead of the current time
    * @param userId, optional user ID
    * @returns key or null if no signing key has been found
    */
  def getSigningKey(keyId: Keyid): js.Promise[Key | SubKey | Null] = js.native
  def getSigningKey(keyId: Keyid, date: Date): js.Promise[Key | SubKey | Null] = js.native
  def getSigningKey(keyId: Keyid, date: Date, userId: js.Object): js.Promise[Key | SubKey | Null] = js.native
  /**
    * Returns an array containing all public or private subkeys matching keyId;
    * If keyId is not present, returns all subkeys.
    * @param keyId
    * @returns
    */
  def getSubkeys(keyId: Keyid): js.Array[_] = js.native
  /**
    * Returns userids
    * @returns array of userids
    */
  def getUserIds(): js.Array[String] = js.native
  /**
    * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
    * @returns Whether the two keys have the same version and public key data
    */
  def hasSameFingerprintAs(): Boolean = js.native
  /**
    * Check whether secret-key data is available in decrypted form. Returns null for public keys.
    * @returns
    */
  def isDecrypted(): Boolean | Null = js.native
  /**
    * Returns true if this is a private key
    * @returns
    */
  def isPrivate(): Boolean = js.native
  /**
    * Returns true if this is a public key
    * @returns
    */
  def isPublic(): Boolean = js.native
  /**
    * Checks if a signature on a key is revoked
    * @param
    * @param signature The signature to verify
    * @param key, optional The key to verify the signature
    * @param date Use the given date instead of the current time
    * @returns True if the certificate is revoked
    */
  def isRevoked(signature: Signature): js.Promise[Boolean] = js.native
  def isRevoked(signature: Signature, key: PublicKey): js.Promise[Boolean] = js.native
  def isRevoked(signature: Signature, key: PublicKey, date: Date): js.Promise[Boolean] = js.native
  def isRevoked(signature: Signature, key: PublicSubkey): js.Promise[Boolean] = js.native
  def isRevoked(signature: Signature, key: PublicSubkey, date: Date): js.Promise[Boolean] = js.native
  def isRevoked(signature: Signature, key: SecretKey): js.Promise[Boolean] = js.native
  def isRevoked(signature: Signature, key: SecretKey, date: Date): js.Promise[Boolean] = js.native
  def isRevoked(signature: Signature, key: SecretSubkey): js.Promise[Boolean] = js.native
  def isRevoked(signature: Signature, key: SecretSubkey, date: Date): js.Promise[Boolean] = js.native
  /**
    * Transforms packetlist to structured key data
    * @param packetlist The packets that form a key
    */
  def packetlist2structure(packetlist: List): Unit = js.native
  /**
    * Revokes the key
    * @param reasonForRevocation optional, object indicating the reason for revocation
    * @param reasonForRevocation.flag optional, flag indicating the reason for revocation
    * @param reasonForRevocation.string optional, string explaining the reason for revocation
    * @param date optional, override the creationtime of the revocation signature
    * @returns new key with revocation signature
    */
  def revoke(reasonForRevocation: revokeReasonForRevocation, date: Date): js.Promise[Key] = js.native
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
  def signPrimaryUser(privateKey: js.Array[_], date: Date, userId: js.Object): js.Promise[Key] = js.native
  /**
    * Transforms structured key data to packetlist
    * @returns The packets that form a key
    */
  def toPacketlist(): List = js.native
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
  def verifyAllUsers(keys: js.Array[_]): js.Promise[js.Array[AnonKeyidUserid]] = js.native
  /**
    * Verify primary key. Checks for revocation signatures, expiration time
    * and valid self signature
    * @param date (optional) use the given date for verification instead of the current time
    * @param userId (optional) user ID
    * @returns The status of the primary key
    */
  def verifyPrimaryKey(): js.Promise[keyStatus] = js.native
  def verifyPrimaryKey(date: Date): js.Promise[keyStatus] = js.native
  def verifyPrimaryKey(date: Date, userId: js.Object): js.Promise[keyStatus] = js.native
  /**
    * Verifies primary user of key
    * - if no arguments are given, verifies the self certificates;
    * - otherwise, verifies all certificates signed with given keys.
    * @param keys array of keys to verify certificate signatures
    * @param date (optional) use the given date for verification instead of the current time
    * @param userId (optional) user ID to get instead of the primary user, if it exists
    * @returns List of signer's keyid and validity of signature
    */
  def verifyPrimaryUser(keys: js.Array[_], date: Date, userId: js.Object): js.Promise[js.Array[AnonKeyid]] = js.native
}

