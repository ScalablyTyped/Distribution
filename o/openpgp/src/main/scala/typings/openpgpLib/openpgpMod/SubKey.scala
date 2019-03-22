package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "SubKey")
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
  def getExpirationTime(primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey, date: stdLib.Date): js.Promise[stdLib.Date | openpgpLib.Infinity | scala.Null] = js.native
  /**
    * Returns the expiration time of the subkey or Infinity if key does not expire
    * Returns null if the subkey is invalid.
    * @param primaryKey The primary key packet
    * @param date Use the given date instead of the current time
    * @returns
    */
  def getExpirationTime(primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey, date: stdLib.Date): js.Promise[stdLib.Date | openpgpLib.Infinity | scala.Null] = js.native
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
    primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey,
    signature: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.PublicKey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey,
    signature: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.PublicSubkey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey,
    signature: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.SecretKey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey,
    signature: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.SecretSubkey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey,
    signature: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.PublicKey,
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
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey,
    signature: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.PublicSubkey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey,
    signature: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.SecretKey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey,
    signature: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.SecretSubkey,
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
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey,
    reasonForRevocation: revoke_reasonForRevocation,
    date: stdLib.Date
  ): js.Promise[openpgpLib.openpgpMod.keyNs.SubKey] = js.native
  /**
    * Transforms structured subkey data to packetlist
    * @returns
    */
  def toPacketlist(): openpgpLib.openpgpMod.packetNs.List = js.native
  /**
    * Update subkey with new components from specified subkey
    * @param subKey Source subkey to merge
    * @param primaryKey primary key used for validation
    * @returns
    */
  def update(subKey: openpgpLib.openpgpMod.keyNs.SubKey, primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def update(
    subKey: openpgpLib.openpgpMod.keyNs.SubKey,
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretSubkey
  ): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def verify(primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.enumsNs.keyStatus] = js.native
  /**
    * Verify subkey. Checks for revocation signatures, expiration time
    * and valid binding signature
    * @param primaryKey The primary key packet
    * @param date Use the given date instead of the current time
    * @returns The status of the subkey
    */
  def verify(primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.enumsNs.keyStatus] = js.native
}

