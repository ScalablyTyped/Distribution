package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileEncryptionInfo extends js.Object {
  // The key used to encrypt the file content.
  var encryptionKey: js.UndefOr[scala.Double] = js.undefined
  // The file digest prior to encryption.
  var fileDigest: js.UndefOr[scala.Double] = js.undefined
  // The file digest algorithm.
  var fileDigestAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  // The initialization vector used for the encryption algorithm.
  var initializationVector: js.UndefOr[scala.Double] = js.undefined
  // The hash of the encrypted file content + IV (content hash).
  var mac: js.UndefOr[scala.Double] = js.undefined
  // The key used to get mac.
  var macKey: js.UndefOr[scala.Double] = js.undefined
  // The the profile identifier.
  var profileIdentifier: js.UndefOr[java.lang.String] = js.undefined
}

object FileEncryptionInfo {
  @scala.inline
  def apply(
    encryptionKey: scala.Int | scala.Double = null,
    fileDigest: scala.Int | scala.Double = null,
    fileDigestAlgorithm: java.lang.String = null,
    initializationVector: scala.Int | scala.Double = null,
    mac: scala.Int | scala.Double = null,
    macKey: scala.Int | scala.Double = null,
    profileIdentifier: java.lang.String = null
  ): FileEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (fileDigest != null) __obj.updateDynamic("fileDigest")(fileDigest.asInstanceOf[js.Any])
    if (fileDigestAlgorithm != null) __obj.updateDynamic("fileDigestAlgorithm")(fileDigestAlgorithm)
    if (initializationVector != null) __obj.updateDynamic("initializationVector")(initializationVector.asInstanceOf[js.Any])
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (macKey != null) __obj.updateDynamic("macKey")(macKey.asInstanceOf[js.Any])
    if (profileIdentifier != null) __obj.updateDynamic("profileIdentifier")(profileIdentifier)
    __obj.asInstanceOf[FileEncryptionInfo]
  }
}

