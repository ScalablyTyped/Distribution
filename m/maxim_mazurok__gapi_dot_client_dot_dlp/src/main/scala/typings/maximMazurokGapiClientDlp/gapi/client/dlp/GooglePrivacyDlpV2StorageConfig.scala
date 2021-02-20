package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2StorageConfig extends StObject {
  
  /** BigQuery options. */
  var bigQueryOptions: js.UndefOr[GooglePrivacyDlpV2BigQueryOptions] = js.native
  
  /** Google Cloud Storage options. */
  var cloudStorageOptions: js.UndefOr[GooglePrivacyDlpV2CloudStorageOptions] = js.native
  
  /** Google Cloud Datastore options. */
  var datastoreOptions: js.UndefOr[GooglePrivacyDlpV2DatastoreOptions] = js.native
  
  /**
    * Hybrid inspection options. Early access feature is in a pre-release state and might change or have limited support. For more information, see
    * https://cloud.google.com/products#product-launch-stages.
    */
  var hybridOptions: js.UndefOr[GooglePrivacyDlpV2HybridOptions] = js.native
  
  var timespanConfig: js.UndefOr[GooglePrivacyDlpV2TimespanConfig] = js.native
}
object GooglePrivacyDlpV2StorageConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2StorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StorageConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2StorageConfigMutableBuilder[Self <: GooglePrivacyDlpV2StorageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigQueryOptions(value: GooglePrivacyDlpV2BigQueryOptions): Self = StObject.set(x, "bigQueryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigQueryOptionsUndefined: Self = StObject.set(x, "bigQueryOptions", js.undefined)
    
    @scala.inline
    def setCloudStorageOptions(value: GooglePrivacyDlpV2CloudStorageOptions): Self = StObject.set(x, "cloudStorageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudStorageOptionsUndefined: Self = StObject.set(x, "cloudStorageOptions", js.undefined)
    
    @scala.inline
    def setDatastoreOptions(value: GooglePrivacyDlpV2DatastoreOptions): Self = StObject.set(x, "datastoreOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreOptionsUndefined: Self = StObject.set(x, "datastoreOptions", js.undefined)
    
    @scala.inline
    def setHybridOptions(value: GooglePrivacyDlpV2HybridOptions): Self = StObject.set(x, "hybridOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHybridOptionsUndefined: Self = StObject.set(x, "hybridOptions", js.undefined)
    
    @scala.inline
    def setTimespanConfig(value: GooglePrivacyDlpV2TimespanConfig): Self = StObject.set(x, "timespanConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimespanConfigUndefined: Self = StObject.set(x, "timespanConfig", js.undefined)
  }
}
