package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2LargeCustomDictionaryConfig extends js.Object {
  
  /** Field in a BigQuery table where each cell represents a dictionary phrase. */
  var bigQueryField: js.UndefOr[GooglePrivacyDlpV2BigQueryField] = js.native
  
  /** Set of files containing newline-delimited lists of dictionary phrases. */
  var cloudStorageFileSet: js.UndefOr[GooglePrivacyDlpV2CloudStorageFileSet] = js.native
  
  /**
    * Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the
    * dictionary is considered invalid and can no longer be used.
    */
  var outputPath: js.UndefOr[GooglePrivacyDlpV2CloudStoragePath] = js.native
}
object GooglePrivacyDlpV2LargeCustomDictionaryConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2LargeCustomDictionaryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LargeCustomDictionaryConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2LargeCustomDictionaryConfigOps[Self <: GooglePrivacyDlpV2LargeCustomDictionaryConfig] (val x: Self) extends AnyVal {
    
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
    def setBigQueryField(value: GooglePrivacyDlpV2BigQueryField): Self = this.set("bigQueryField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigQueryField: Self = this.set("bigQueryField", js.undefined)
    
    @scala.inline
    def setCloudStorageFileSet(value: GooglePrivacyDlpV2CloudStorageFileSet): Self = this.set("cloudStorageFileSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudStorageFileSet: Self = this.set("cloudStorageFileSet", js.undefined)
    
    @scala.inline
    def setOutputPath(value: GooglePrivacyDlpV2CloudStoragePath): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
  }
}
