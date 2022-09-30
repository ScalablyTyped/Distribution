package typings.openpgp.mod

import typings.openpgp.mod.enums.keyStatus
import typings.openpgp.mod.packet.PublicKey
import typings.openpgp.mod.packet.PublicSubkey
import typings.openpgp.mod.packet.SecretKey
import typings.openpgp.mod.packet.SecretSubkey
import typings.openpgp.mod.packet.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "SubKey")
@js.native
open class SubKey () extends StObject {
  
  /**
    * Returns algorithm information
    * @returns An object of the form {algorithm: string, bits:int, curve:String}
    */
  def getAlgorithmInfo(): js.Object = js.native
  
  /**
    * Returns the creation time of the key
    * @returns
    */
  def getCreationTime(): js.Date = js.native
  
  def getExpirationTime(primaryKey: PublicKey, date: js.Date): js.Promise[js.Date | Infinity | Null] = js.native
  /**
    * Returns the expiration time of the subkey or Infinity if key does not expire
    * Returns null if the subkey is invalid.
    * @param primaryKey The primary key packet
    * @param date Use the given date instead of the current time
    * @returns
    */
  def getExpirationTime(primaryKey: SecretKey, date: js.Date): js.Promise[js.Date | Infinity | Null] = js.native
  
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
    * Calculates whether two keys have the same fingerprint without actually calculating the fingerprint
    * @returns Whether the two keys have the same version and public key data
    */
  def hasSameFingerprintAs(): Boolean = js.native
  
  /**
    * Check whether secret-key data is available in decrypted form. Returns null for public keys.
    * @returns
    */
  def isDecrypted(): Boolean | Null = js.native
  
  def isRevoked(primaryKey: PublicKey, signature: Signature, key: PublicKey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: PublicKey, signature: Signature, key: PublicSubkey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: PublicKey, signature: Signature, key: SecretKey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: PublicKey, signature: Signature, key: SecretSubkey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: SecretKey, signature: Signature, key: PublicKey, date: js.Date): js.Promise[Boolean] = js.native
  /**
    * Checks if a binding signature of a subkey is revoked
    * @param primaryKey The primary key packet
    * @param signature The binding signature to verify
    * @param key, optional The key to verify the signature
    * @param date Use the given date instead of the current time
    * @returns True if the binding signature is revoked
    */
  def isRevoked(primaryKey: SecretKey, signature: Signature, key: PublicSubkey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: SecretKey, signature: Signature, key: SecretKey, date: js.Date): js.Promise[Boolean] = js.native
  def isRevoked(primaryKey: SecretKey, signature: Signature, key: SecretSubkey, date: js.Date): js.Promise[Boolean] = js.native
  
  /**
    * Revokes the subkey
    * @param primaryKey decrypted private primary key for revocation
    * @param reasonForRevocation optional, object indicating the reason for revocation
    * @param reasonForRevocation.flag optional, flag indicating the reason for revocation
    * @param reasonForRevocation.string optional, string explaining the reason for revocation
    * @param date optional, override the creationtime of the revocation signature
    * @returns new subkey with revocation signature
    */
  def revoke(primaryKey: SecretKey, reasonForRevocation: revokeReasonForRevocation, date: js.Date): js.Promise[typings.openpgp.mod.key.SubKey] = js.native
  
  /**
    * Transforms structured subkey data to packetlist
    * @returns
    */
  def toPacketlist(): typings.openpgp.mod.packet.List = js.native
  
  /**
    * Update subkey with new components from specified subkey
    * @param subKey Source subkey to merge
    * @param primaryKey primary key used for validation
    * @returns
    */
  def update(subKey: typings.openpgp.mod.key.SubKey, primaryKey: SecretKey): js.Promise[Unit] = js.native
  def update(subKey: typings.openpgp.mod.key.SubKey, primaryKey: SecretSubkey): js.Promise[Unit] = js.native
  
  def verify(primaryKey: PublicKey, date: js.Date): js.Promise[keyStatus] = js.native
  /**
    * Verify subkey. Checks for revocation signatures, expiration time
    * and valid binding signature
    * @param primaryKey The primary key packet
    * @param date Use the given date instead of the current time
    * @returns The status of the subkey
    */
  def verify(primaryKey: SecretKey, date: js.Date): js.Promise[keyStatus] = js.native
}
