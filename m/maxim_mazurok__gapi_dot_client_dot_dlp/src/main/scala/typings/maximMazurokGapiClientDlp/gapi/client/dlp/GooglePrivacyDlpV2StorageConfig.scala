package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2StorageConfig extends js.Object {
  
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
  implicit class GooglePrivacyDlpV2StorageConfigOps[Self <: GooglePrivacyDlpV2StorageConfig] (val x: Self) extends AnyVal {
    
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
    def setBigQueryOptions(value: GooglePrivacyDlpV2BigQueryOptions): Self = this.set("bigQueryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigQueryOptions: Self = this.set("bigQueryOptions", js.undefined)
    
    @scala.inline
    def setCloudStorageOptions(value: GooglePrivacyDlpV2CloudStorageOptions): Self = this.set("cloudStorageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudStorageOptions: Self = this.set("cloudStorageOptions", js.undefined)
    
    @scala.inline
    def setDatastoreOptions(value: GooglePrivacyDlpV2DatastoreOptions): Self = this.set("datastoreOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastoreOptions: Self = this.set("datastoreOptions", js.undefined)
    
    @scala.inline
    def setHybridOptions(value: GooglePrivacyDlpV2HybridOptions): Self = this.set("hybridOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHybridOptions: Self = this.set("hybridOptions", js.undefined)
    
    @scala.inline
    def setTimespanConfig(value: GooglePrivacyDlpV2TimespanConfig): Self = this.set("timespanConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimespanConfig: Self = this.set("timespanConfig", js.undefined)
  }
}
