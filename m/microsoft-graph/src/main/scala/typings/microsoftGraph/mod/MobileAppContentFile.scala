package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileAppContentFile extends Entity {
  // The Azure Storage URI.
  var azureStorageUri: js.UndefOr[String] = js.undefined
  // The time the Azure storage Uri expires.
  var azureStorageUriExpirationDateTime: js.UndefOr[String] = js.undefined
  // The time the file was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // A value indicating whether the file is committed.
  var isCommitted: js.UndefOr[Boolean] = js.undefined
  // The manifest information.
  var manifest: js.UndefOr[Double] = js.undefined
  // the file name.
  var name: js.UndefOr[String] = js.undefined
  // The size of the file prior to encryption.
  var size: js.UndefOr[Double] = js.undefined
  // The size of the file after encryption.
  var sizeEncrypted: js.UndefOr[Double] = js.undefined
  /**
    * The state of the current upload request. Possible values are: success, transientError, error, unknown,
    * azureStorageUriRequestSuccess, azureStorageUriRequestPending, azureStorageUriRequestFailed,
    * azureStorageUriRequestTimedOut, azureStorageUriRenewalSuccess, azureStorageUriRenewalPending,
    * azureStorageUriRenewalFailed, azureStorageUriRenewalTimedOut, commitFileSuccess, commitFilePending, commitFileFailed,
    * commitFileTimedOut.
    */
  var uploadState: js.UndefOr[MobileAppContentFileUploadState] = js.undefined
}

object MobileAppContentFile {
  @scala.inline
  def apply(
    azureStorageUri: String = null,
    azureStorageUriExpirationDateTime: String = null,
    createdDateTime: String = null,
    id: String = null,
    isCommitted: js.UndefOr[Boolean] = js.undefined,
    manifest: js.UndefOr[Double] = js.undefined,
    name: String = null,
    size: js.UndefOr[Double] = js.undefined,
    sizeEncrypted: js.UndefOr[Double] = js.undefined,
    uploadState: MobileAppContentFileUploadState = null
  ): MobileAppContentFile = {
    val __obj = js.Dynamic.literal()
    if (azureStorageUri != null) __obj.updateDynamic("azureStorageUri")(azureStorageUri.asInstanceOf[js.Any])
    if (azureStorageUriExpirationDateTime != null) __obj.updateDynamic("azureStorageUriExpirationDateTime")(azureStorageUriExpirationDateTime.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isCommitted)) __obj.updateDynamic("isCommitted")(isCommitted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manifest)) __obj.updateDynamic("manifest")(manifest.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeEncrypted)) __obj.updateDynamic("sizeEncrypted")(sizeEncrypted.get.asInstanceOf[js.Any])
    if (uploadState != null) __obj.updateDynamic("uploadState")(uploadState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileAppContentFile]
  }
}

