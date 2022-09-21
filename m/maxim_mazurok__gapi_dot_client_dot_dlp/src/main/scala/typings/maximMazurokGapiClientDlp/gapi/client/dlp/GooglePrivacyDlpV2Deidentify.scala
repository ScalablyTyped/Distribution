package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Deidentify extends StObject {
  
  /**
    * Required. User settable GCS bucket and folders to store de-identified files. This field must be set for cloud storage deidentification. The output GCS bucket must be different from
    * the input bucket. De-identified files will overwrite files in the output path. Form of: gs://bucket/folder/ or gs://bucket
    */
  var cloudStorageOutput: js.UndefOr[String] = js.undefined
  
  /**
    * List of user-specified file type groups to transform. If specified, only the files with these filetypes will be transformed. If empty, all supported files will be transformed.
    * Supported types may be automatically added over time. If a file type is set in this field that isn't supported by the Deidentify action then the job will fail and will not be
    * successfully created/started. Currently the only filetypes supported are: IMAGES, TEXT_FILES, CSV, TSV.
    */
  var fileTypesToTransform: js.UndefOr[js.Array[String]] = js.undefined
  
  /** User specified deidentify templates and configs for structured, unstructured, and image files. */
  var transformationConfig: js.UndefOr[GooglePrivacyDlpV2TransformationConfig] = js.undefined
  
  /**
    * Config for storing transformation details. This is separate from the de-identified content, and contains metadata about the successful transformations and/or failures that occurred
    * while de-identifying. This needs to be set in order for users to access information about the status of each transformation (see TransformationDetails message for more information
    * about what is noted).
    */
  var transformationDetailsStorageConfig: js.UndefOr[GooglePrivacyDlpV2TransformationDetailsStorageConfig] = js.undefined
}
object GooglePrivacyDlpV2Deidentify {
  
  inline def apply(): GooglePrivacyDlpV2Deidentify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Deidentify]
  }
  
  extension [Self <: GooglePrivacyDlpV2Deidentify](x: Self) {
    
    inline def setCloudStorageOutput(value: String): Self = StObject.set(x, "cloudStorageOutput", value.asInstanceOf[js.Any])
    
    inline def setCloudStorageOutputUndefined: Self = StObject.set(x, "cloudStorageOutput", js.undefined)
    
    inline def setFileTypesToTransform(value: js.Array[String]): Self = StObject.set(x, "fileTypesToTransform", value.asInstanceOf[js.Any])
    
    inline def setFileTypesToTransformUndefined: Self = StObject.set(x, "fileTypesToTransform", js.undefined)
    
    inline def setFileTypesToTransformVarargs(value: String*): Self = StObject.set(x, "fileTypesToTransform", js.Array(value*))
    
    inline def setTransformationConfig(value: GooglePrivacyDlpV2TransformationConfig): Self = StObject.set(x, "transformationConfig", value.asInstanceOf[js.Any])
    
    inline def setTransformationConfigUndefined: Self = StObject.set(x, "transformationConfig", js.undefined)
    
    inline def setTransformationDetailsStorageConfig(value: GooglePrivacyDlpV2TransformationDetailsStorageConfig): Self = StObject.set(x, "transformationDetailsStorageConfig", value.asInstanceOf[js.Any])
    
    inline def setTransformationDetailsStorageConfigUndefined: Self = StObject.set(x, "transformationDetailsStorageConfig", js.undefined)
  }
}
