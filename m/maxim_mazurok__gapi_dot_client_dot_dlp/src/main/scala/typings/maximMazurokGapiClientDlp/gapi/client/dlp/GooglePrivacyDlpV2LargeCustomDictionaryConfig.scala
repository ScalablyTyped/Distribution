package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2LargeCustomDictionaryConfig extends StObject {
  
  /** Field in a BigQuery table where each cell represents a dictionary phrase. */
  var bigQueryField: js.UndefOr[GooglePrivacyDlpV2BigQueryField] = js.undefined
  
  /** Set of files containing newline-delimited lists of dictionary phrases. */
  var cloudStorageFileSet: js.UndefOr[GooglePrivacyDlpV2CloudStorageFileSet] = js.undefined
  
  /**
    * Location to store dictionary artifacts in Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the
    * dictionary is considered invalid and can no longer be used.
    */
  var outputPath: js.UndefOr[GooglePrivacyDlpV2CloudStoragePath] = js.undefined
}
object GooglePrivacyDlpV2LargeCustomDictionaryConfig {
  
  inline def apply(): GooglePrivacyDlpV2LargeCustomDictionaryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LargeCustomDictionaryConfig]
  }
  
  extension [Self <: GooglePrivacyDlpV2LargeCustomDictionaryConfig](x: Self) {
    
    inline def setBigQueryField(value: GooglePrivacyDlpV2BigQueryField): Self = StObject.set(x, "bigQueryField", value.asInstanceOf[js.Any])
    
    inline def setBigQueryFieldUndefined: Self = StObject.set(x, "bigQueryField", js.undefined)
    
    inline def setCloudStorageFileSet(value: GooglePrivacyDlpV2CloudStorageFileSet): Self = StObject.set(x, "cloudStorageFileSet", value.asInstanceOf[js.Any])
    
    inline def setCloudStorageFileSetUndefined: Self = StObject.set(x, "cloudStorageFileSet", js.undefined)
    
    inline def setOutputPath(value: GooglePrivacyDlpV2CloudStoragePath): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
  }
}
