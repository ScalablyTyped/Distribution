package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "User")
@js.native
class User () extends js.Object {
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey,
    certificate: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.PublicKey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey,
    certificate: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.PublicSubkey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey,
    certificate: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.SecretKey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey,
    certificate: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.SecretSubkey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey,
    certificate: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.PublicKey,
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
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey,
    certificate: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.PublicSubkey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey,
    certificate: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.SecretKey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def isRevoked(
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey,
    certificate: openpgpLib.openpgpMod.packetNs.Signature,
    key: openpgpLib.openpgpMod.packetNs.SecretSubkey,
    date: stdLib.Date
  ): js.Promise[scala.Boolean] = js.native
  def sign(primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey, privateKeys: js.Array[_]): js.Promise[openpgpLib.openpgpMod.keyNs.Key] = js.native
  /**
    * Signs user
    * @param primaryKey The primary key packet
    * @param privateKeys Decrypted private keys for signing
    * @returns New user with new certificate signatures
    */
  def sign(primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey, privateKeys: js.Array[_]): js.Promise[openpgpLib.openpgpMod.keyNs.Key] = js.native
  /**
    * Transforms structured user data to packetlist
    * @returns
    */
  def toPacketlist(): openpgpLib.openpgpMod.packetNs.List = js.native
  /**
    * Update user with new components from specified user
    * @param user Source user to merge
    * @param primaryKey primary key used for validation
    * @returns
    */
  def update(user: openpgpLib.openpgpMod.keyNs.User, primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def update(user: openpgpLib.openpgpMod.keyNs.User, primaryKey: openpgpLib.openpgpMod.packetNs.SecretSubkey): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def verify(primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.enumsNs.keyStatus] = js.native
  /**
    * Verify User. Checks for existence of self signatures, revocation signatures
    * and validity of self signature
    * @param primaryKey The primary key packet
    * @param date Use the given date instead of the current time
    * @returns Status of user
    */
  def verify(primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey, date: stdLib.Date): js.Promise[openpgpLib.openpgpMod.enumsNs.keyStatus] = js.native
  def verifyAllCertifications(primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey, keys: js.Array[_], date: stdLib.Date): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
  /**
    * Verifies all user certificates
    * @param primaryKey The primary key packet
    * @param keys Array of keys to verify certificate signatures
    * @param date Use the given date instead of the current time
    * @returns List of signer's keyid and validity of signature
    */
  def verifyAllCertifications(primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey, keys: js.Array[_], date: stdLib.Date): js.Promise[js.Array[openpgpLib.Anon_Keyid]] = js.native
  def verifyCertificate(
    primaryKey: openpgpLib.openpgpMod.packetNs.PublicKey,
    certificate: openpgpLib.openpgpMod.packetNs.Signature,
    keys: js.Array[_],
    date: stdLib.Date
  ): js.Promise[openpgpLib.openpgpMod.enumsNs.keyStatus] = js.native
  /**
    * Verifies the user certificate
    * @param primaryKey The primary key packet
    * @param certificate A certificate of this user
    * @param keys Array of keys to verify certificate signatures
    * @param date Use the given date instead of the current time
    * @returns status of the certificate
    */
  def verifyCertificate(
    primaryKey: openpgpLib.openpgpMod.packetNs.SecretKey,
    certificate: openpgpLib.openpgpMod.packetNs.Signature,
    keys: js.Array[_],
    date: stdLib.Date
  ): js.Promise[openpgpLib.openpgpMod.enumsNs.keyStatus] = js.native
}

