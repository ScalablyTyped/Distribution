package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2StorageConfig extends StObject {
  
  /** BigQuery options. */
  var bigQueryOptions: js.UndefOr[GooglePrivacyDlpV2BigQueryOptions] = js.undefined
  
  /** Cloud Storage options. */
  var cloudStorageOptions: js.UndefOr[GooglePrivacyDlpV2CloudStorageOptions] = js.undefined
  
  /** Google Cloud Datastore options. */
  var datastoreOptions: js.UndefOr[GooglePrivacyDlpV2DatastoreOptions] = js.undefined
  
  /** Hybrid inspection options. */
  var hybridOptions: js.UndefOr[GooglePrivacyDlpV2HybridOptions] = js.undefined
  
  var timespanConfig: js.UndefOr[GooglePrivacyDlpV2TimespanConfig] = js.undefined
}
object GooglePrivacyDlpV2StorageConfig {
  
  inline def apply(): GooglePrivacyDlpV2StorageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StorageConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2StorageConfig] (val x: Self) extends AnyVal {
    
    inline def setBigQueryOptions(value: GooglePrivacyDlpV2BigQueryOptions): Self = StObject.set(x, "bigQueryOptions", value.asInstanceOf[js.Any])
    
    inline def setBigQueryOptionsUndefined: Self = StObject.set(x, "bigQueryOptions", js.undefined)
    
    inline def setCloudStorageOptions(value: GooglePrivacyDlpV2CloudStorageOptions): Self = StObject.set(x, "cloudStorageOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudStorageOptionsUndefined: Self = StObject.set(x, "cloudStorageOptions", js.undefined)
    
    inline def setDatastoreOptions(value: GooglePrivacyDlpV2DatastoreOptions): Self = StObject.set(x, "datastoreOptions", value.asInstanceOf[js.Any])
    
    inline def setDatastoreOptionsUndefined: Self = StObject.set(x, "datastoreOptions", js.undefined)
    
    inline def setHybridOptions(value: GooglePrivacyDlpV2HybridOptions): Self = StObject.set(x, "hybridOptions", value.asInstanceOf[js.Any])
    
    inline def setHybridOptionsUndefined: Self = StObject.set(x, "hybridOptions", js.undefined)
    
    inline def setTimespanConfig(value: GooglePrivacyDlpV2TimespanConfig): Self = StObject.set(x, "timespanConfig", value.asInstanceOf[js.Any])
    
    inline def setTimespanConfigUndefined: Self = StObject.set(x, "timespanConfig", js.undefined)
  }
}
