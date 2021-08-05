package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ContentLocation extends StObject {
  
  /**
    * Name of the container where the finding is located. The top level name is the source file name or table name. Names of some common storage containers are formatted as follows: *
    * BigQuery tables: `{project_id}:{dataset_id}.{table_id}` * Cloud Storage files: `gs://{bucket}/{path}` * Datastore namespace: {namespace} Nested names could be absent if the embedded
    * object has no string identifier (for an example an image contained within a document).
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * Findings container modification timestamp, if applicable. For Google Cloud Storage contains last file modification timestamp. For BigQuery table contains last_modified_time
    * property. For Datastore - not populated.
    */
  var containerTimestamp: js.UndefOr[String] = js.undefined
  
  /** Findings container version, if available ("generation" for Google Cloud Storage). */
  var containerVersion: js.UndefOr[String] = js.undefined
  
  /** Location data for document files. */
  var documentLocation: js.UndefOr[GooglePrivacyDlpV2DocumentLocation] = js.undefined
  
  /** Location within an image's pixels. */
  var imageLocation: js.UndefOr[GooglePrivacyDlpV2ImageLocation] = js.undefined
  
  /** Location within the metadata for inspected content. */
  var metadataLocation: js.UndefOr[GooglePrivacyDlpV2MetadataLocation] = js.undefined
  
  /** Location within a row or record of a database table. */
  var recordLocation: js.UndefOr[GooglePrivacyDlpV2RecordLocation] = js.undefined
}
object GooglePrivacyDlpV2ContentLocation {
  
  inline def apply(): GooglePrivacyDlpV2ContentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ContentLocation]
  }
  
  extension [Self <: GooglePrivacyDlpV2ContentLocation](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setContainerTimestamp(value: String): Self = StObject.set(x, "containerTimestamp", value.asInstanceOf[js.Any])
    
    inline def setContainerTimestampUndefined: Self = StObject.set(x, "containerTimestamp", js.undefined)
    
    inline def setContainerVersion(value: String): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    inline def setDocumentLocation(value: GooglePrivacyDlpV2DocumentLocation): Self = StObject.set(x, "documentLocation", value.asInstanceOf[js.Any])
    
    inline def setDocumentLocationUndefined: Self = StObject.set(x, "documentLocation", js.undefined)
    
    inline def setImageLocation(value: GooglePrivacyDlpV2ImageLocation): Self = StObject.set(x, "imageLocation", value.asInstanceOf[js.Any])
    
    inline def setImageLocationUndefined: Self = StObject.set(x, "imageLocation", js.undefined)
    
    inline def setMetadataLocation(value: GooglePrivacyDlpV2MetadataLocation): Self = StObject.set(x, "metadataLocation", value.asInstanceOf[js.Any])
    
    inline def setMetadataLocationUndefined: Self = StObject.set(x, "metadataLocation", js.undefined)
    
    inline def setRecordLocation(value: GooglePrivacyDlpV2RecordLocation): Self = StObject.set(x, "recordLocation", value.asInstanceOf[js.Any])
    
    inline def setRecordLocationUndefined: Self = StObject.set(x, "recordLocation", js.undefined)
  }
}
