package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileEncryptionInfo extends js.Object {
  // The key used to encrypt the file content.
  var encryptionKey: js.UndefOr[Double] = js.undefined
  // The file digest prior to encryption.
  var fileDigest: js.UndefOr[Double] = js.undefined
  // The file digest algorithm.
  var fileDigestAlgorithm: js.UndefOr[String] = js.undefined
  // The initialization vector used for the encryption algorithm.
  var initializationVector: js.UndefOr[Double] = js.undefined
  // The hash of the encrypted file content + IV (content hash).
  var mac: js.UndefOr[Double] = js.undefined
  // The key used to get mac.
  var macKey: js.UndefOr[Double] = js.undefined
  // The profile identifier.
  var profileIdentifier: js.UndefOr[String] = js.undefined
}

object FileEncryptionInfo {
  @scala.inline
  def apply(
    encryptionKey: js.UndefOr[Double] = js.undefined,
    fileDigest: js.UndefOr[Double] = js.undefined,
    fileDigestAlgorithm: String = null,
    initializationVector: js.UndefOr[Double] = js.undefined,
    mac: js.UndefOr[Double] = js.undefined,
    macKey: js.UndefOr[Double] = js.undefined,
    profileIdentifier: String = null
  ): FileEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encryptionKey)) __obj.updateDynamic("encryptionKey")(encryptionKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fileDigest)) __obj.updateDynamic("fileDigest")(fileDigest.get.asInstanceOf[js.Any])
    if (fileDigestAlgorithm != null) __obj.updateDynamic("fileDigestAlgorithm")(fileDigestAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(initializationVector)) __obj.updateDynamic("initializationVector")(initializationVector.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.get.asInstanceOf[js.Any])
    if (!js.isUndefined(macKey)) __obj.updateDynamic("macKey")(macKey.get.asInstanceOf[js.Any])
    if (profileIdentifier != null) __obj.updateDynamic("profileIdentifier")(profileIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileEncryptionInfo]
  }
}

