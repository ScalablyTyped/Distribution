package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileAppContentFile extends Entity {
  
  // The Azure Storage URI.
  var azureStorageUri: js.UndefOr[NullableOption[String]] = js.native
  
  // The time the Azure storage Uri expires.
  var azureStorageUriExpirationDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The time the file was created.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // A value indicating whether the file is committed.
  var isCommitted: js.UndefOr[Boolean] = js.native
  
  // The manifest information.
  var manifest: js.UndefOr[NullableOption[Double]] = js.native
  
  // the file name.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
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
  implicit class MobileAppContentFileMutableBuilder[Self <: MobileAppContentFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAzureStorageUri(value: NullableOption[String]): Self = StObject.set(x, "azureStorageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureStorageUriExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "azureStorageUriExpirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureStorageUriExpirationDateTimeNull: Self = StObject.set(x, "azureStorageUriExpirationDateTime", null)
    
    @scala.inline
    def setAzureStorageUriExpirationDateTimeUndefined: Self = StObject.set(x, "azureStorageUriExpirationDateTime", js.undefined)
    
    @scala.inline
    def setAzureStorageUriNull: Self = StObject.set(x, "azureStorageUri", null)
    
    @scala.inline
    def setAzureStorageUriUndefined: Self = StObject.set(x, "azureStorageUri", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setIsCommitted(value: Boolean): Self = StObject.set(x, "isCommitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCommittedUndefined: Self = StObject.set(x, "isCommitted", js.undefined)
    
    @scala.inline
    def setManifest(value: NullableOption[Double]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestNull: Self = StObject.set(x, "manifest", null)
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeEncrypted(value: Double): Self = StObject.set(x, "sizeEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeEncryptedUndefined: Self = StObject.set(x, "sizeEncrypted", js.undefined)
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUploadState(value: MobileAppContentFileUploadState): Self = StObject.set(x, "uploadState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadStateUndefined: Self = StObject.set(x, "uploadState", js.undefined)
  }
}
