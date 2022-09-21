package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileAppContentFile
  extends StObject
     with Entity {
  
  // The Azure Storage URI.
  var azureStorageUri: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The time the Azure storage Uri expires.
  var azureStorageUriExpirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The time the file was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // A value indicating whether the file is committed.
  var isCommitted: js.UndefOr[Boolean] = js.undefined
  
  // The manifest information.
  var manifest: js.UndefOr[NullableOption[String]] = js.undefined
  
  // the file name.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
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
  
  inline def apply(): MobileAppContentFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppContentFile]
  }
  
  extension [Self <: MobileAppContentFile](x: Self) {
    
    inline def setAzureStorageUri(value: NullableOption[String]): Self = StObject.set(x, "azureStorageUri", value.asInstanceOf[js.Any])
    
    inline def setAzureStorageUriExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "azureStorageUriExpirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setAzureStorageUriExpirationDateTimeNull: Self = StObject.set(x, "azureStorageUriExpirationDateTime", null)
    
    inline def setAzureStorageUriExpirationDateTimeUndefined: Self = StObject.set(x, "azureStorageUriExpirationDateTime", js.undefined)
    
    inline def setAzureStorageUriNull: Self = StObject.set(x, "azureStorageUri", null)
    
    inline def setAzureStorageUriUndefined: Self = StObject.set(x, "azureStorageUri", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setIsCommitted(value: Boolean): Self = StObject.set(x, "isCommitted", value.asInstanceOf[js.Any])
    
    inline def setIsCommittedUndefined: Self = StObject.set(x, "isCommitted", js.undefined)
    
    inline def setManifest(value: NullableOption[String]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestNull: Self = StObject.set(x, "manifest", null)
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeEncrypted(value: Double): Self = StObject.set(x, "sizeEncrypted", value.asInstanceOf[js.Any])
    
    inline def setSizeEncryptedUndefined: Self = StObject.set(x, "sizeEncrypted", js.undefined)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUploadState(value: MobileAppContentFileUploadState): Self = StObject.set(x, "uploadState", value.asInstanceOf[js.Any])
    
    inline def setUploadStateUndefined: Self = StObject.set(x, "uploadState", js.undefined)
  }
}
