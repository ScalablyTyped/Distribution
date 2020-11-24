package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ContentLocation extends js.Object {
  
  /**
    * Name of the container where the finding is located. The top level name is the source file name or table name. Names of some common storage containers are formatted as follows: *
    * BigQuery tables: `{project_id}:{dataset_id}.{table_id}` * Cloud Storage files: `gs://{bucket}/{path}` * Datastore namespace: {namespace} Nested names could be absent if the embedded
    * object has no string identifier (for an example an image contained within a document).
    */
  var containerName: js.UndefOr[String] = js.native
  
  /**
    * Findings container modification timestamp, if applicable. For Google Cloud Storage contains last file modification timestamp. For BigQuery table contains last_modified_time
    * property. For Datastore - not populated.
    */
  var containerTimestamp: js.UndefOr[String] = js.native
  
  /** Findings container version, if available ("generation" for Google Cloud Storage). */
  var containerVersion: js.UndefOr[String] = js.native
  
  /** Location data for document files. */
  var documentLocation: js.UndefOr[GooglePrivacyDlpV2DocumentLocation] = js.native
  
  /** Location within an image's pixels. */
  var imageLocation: js.UndefOr[GooglePrivacyDlpV2ImageLocation] = js.native
  
  /** Location within the metadata for inspected content. */
  var metadataLocation: js.UndefOr[GooglePrivacyDlpV2MetadataLocation] = js.native
  
  /** Location within a row or record of a database table. */
  var recordLocation: js.UndefOr[GooglePrivacyDlpV2RecordLocation] = js.native
}
object GooglePrivacyDlpV2ContentLocation {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ContentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ContentLocation]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ContentLocationOps[Self <: GooglePrivacyDlpV2ContentLocation] (val x: Self) extends AnyVal {
    
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
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
    
    @scala.inline
    def setContainerTimestamp(value: String): Self = this.set("containerTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerTimestamp: Self = this.set("containerTimestamp", js.undefined)
    
    @scala.inline
    def setContainerVersion(value: String): Self = this.set("containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerVersion: Self = this.set("containerVersion", js.undefined)
    
    @scala.inline
    def setDocumentLocation(value: GooglePrivacyDlpV2DocumentLocation): Self = this.set("documentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentLocation: Self = this.set("documentLocation", js.undefined)
    
    @scala.inline
    def setImageLocation(value: GooglePrivacyDlpV2ImageLocation): Self = this.set("imageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageLocation: Self = this.set("imageLocation", js.undefined)
    
    @scala.inline
    def setMetadataLocation(value: GooglePrivacyDlpV2MetadataLocation): Self = this.set("metadataLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataLocation: Self = this.set("metadataLocation", js.undefined)
    
    @scala.inline
    def setRecordLocation(value: GooglePrivacyDlpV2RecordLocation): Self = this.set("recordLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordLocation: Self = this.set("recordLocation", js.undefined)
  }
}
