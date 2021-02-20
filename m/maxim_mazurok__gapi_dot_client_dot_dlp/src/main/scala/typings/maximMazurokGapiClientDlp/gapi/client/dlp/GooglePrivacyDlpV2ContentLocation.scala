package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ContentLocation extends StObject {
  
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
  implicit class GooglePrivacyDlpV2ContentLocationMutableBuilder[Self <: GooglePrivacyDlpV2ContentLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setContainerTimestamp(value: String): Self = StObject.set(x, "containerTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTimestampUndefined: Self = StObject.set(x, "containerTimestamp", js.undefined)
    
    @scala.inline
    def setContainerVersion(value: String): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    @scala.inline
    def setDocumentLocation(value: GooglePrivacyDlpV2DocumentLocation): Self = StObject.set(x, "documentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentLocationUndefined: Self = StObject.set(x, "documentLocation", js.undefined)
    
    @scala.inline
    def setImageLocation(value: GooglePrivacyDlpV2ImageLocation): Self = StObject.set(x, "imageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLocationUndefined: Self = StObject.set(x, "imageLocation", js.undefined)
    
    @scala.inline
    def setMetadataLocation(value: GooglePrivacyDlpV2MetadataLocation): Self = StObject.set(x, "metadataLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataLocationUndefined: Self = StObject.set(x, "metadataLocation", js.undefined)
    
    @scala.inline
    def setRecordLocation(value: GooglePrivacyDlpV2RecordLocation): Self = StObject.set(x, "recordLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordLocationUndefined: Self = StObject.set(x, "recordLocation", js.undefined)
  }
}
