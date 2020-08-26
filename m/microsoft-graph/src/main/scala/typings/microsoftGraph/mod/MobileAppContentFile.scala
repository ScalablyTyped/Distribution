package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAppContentFile extends Entity {
  // The Azure Storage URI.
  var azureStorageUri: js.UndefOr[String] = js.native
  // The time the Azure storage Uri expires.
  var azureStorageUriExpirationDateTime: js.UndefOr[String] = js.native
  // The time the file was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // A value indicating whether the file is committed.
  var isCommitted: js.UndefOr[Boolean] = js.native
  // The manifest information.
  var manifest: js.UndefOr[Double] = js.native
  // the file name.
  var name: js.UndefOr[String] = js.native
  // The size of the file prior to encryption.
  var size: js.UndefOr[Double] = js.native
  // The size of the file after encryption.
  var sizeEncrypted: js.UndefOr[Double] = js.native
  /**
    * The state of the current upload request. Possible values are: success, transientError, error, unknown,
    * azureStorageUriRequestSuccess, azureStorageUriRequestPending, azureStorageUriRequestFailed,
    * azureStorageUriRequestTimedOut, azureStorageUriRenewalSuccess, azureStorageUriRenewalPending,
    * azureStorageUriRenewalFailed, azureStorageUriRenewalTimedOut, commitFileSuccess, commitFilePending, commitFileFailed,
    * commitFileTimedOut.
    */
  var uploadState: js.UndefOr[MobileAppContentFileUploadState] = js.native
}

object MobileAppContentFile {
  @scala.inline
  def apply(): MobileAppContentFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppContentFile]
  }
  @scala.inline
  implicit class MobileAppContentFileOps[Self <: MobileAppContentFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAzureStorageUri(value: String): Self = this.set("azureStorageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureStorageUri: Self = this.set("azureStorageUri", js.undefined)
    @scala.inline
    def setAzureStorageUriExpirationDateTime(value: String): Self = this.set("azureStorageUriExpirationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureStorageUriExpirationDateTime: Self = this.set("azureStorageUriExpirationDateTime", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setIsCommitted(value: Boolean): Self = this.set("isCommitted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCommitted: Self = this.set("isCommitted", js.undefined)
    @scala.inline
    def setManifest(value: Double): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizeEncrypted(value: Double): Self = this.set("sizeEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeEncrypted: Self = this.set("sizeEncrypted", js.undefined)
    @scala.inline
    def setUploadState(value: MobileAppContentFileUploadState): Self = this.set("uploadState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadState: Self = this.set("uploadState", js.undefined)
  }
  
}

