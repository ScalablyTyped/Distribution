package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CloudStorageOptions extends StObject {
  
  /**
    * Max number of bytes to scan from a file. If a scanned file's size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and
    * bytes_limit_per_file_percent can be specified.
    */
  var bytesLimitPerFile: js.UndefOr[String] = js.native
  
  /**
    * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no
    * limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified.
    */
  var bytesLimitPerFilePercent: js.UndefOr[Double] = js.native
  
  /** The set of one or more files to scan. */
  var fileSet: js.UndefOr[GooglePrivacyDlpV2FileSet] = js.native
  
  /**
    * List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected
    * files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is
    * restricted to 'global', 'us', 'asia', and 'europe'.
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no
    * limit. Defaults to 0.
    */
  var filesLimitPercent: js.UndefOr[Double] = js.native
  
  var sampleMethod: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2CloudStorageOptions {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CloudStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CloudStorageOptions]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CloudStorageOptionsMutableBuilder[Self <: GooglePrivacyDlpV2CloudStorageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesLimitPerFile(value: String): Self = StObject.set(x, "bytesLimitPerFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesLimitPerFilePercent(value: Double): Self = StObject.set(x, "bytesLimitPerFilePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesLimitPerFilePercentUndefined: Self = StObject.set(x, "bytesLimitPerFilePercent", js.undefined)
    
    @scala.inline
    def setBytesLimitPerFileUndefined: Self = StObject.set(x, "bytesLimitPerFile", js.undefined)
    
    @scala.inline
    def setFileSet(value: GooglePrivacyDlpV2FileSet): Self = StObject.set(x, "fileSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSetUndefined: Self = StObject.set(x, "fileSet", js.undefined)
    
    @scala.inline
    def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    @scala.inline
    def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value :_*))
    
    @scala.inline
    def setFilesLimitPercent(value: Double): Self = StObject.set(x, "filesLimitPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesLimitPercentUndefined: Self = StObject.set(x, "filesLimitPercent", js.undefined)
    
    @scala.inline
    def setSampleMethod(value: String): Self = StObject.set(x, "sampleMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleMethodUndefined: Self = StObject.set(x, "sampleMethod", js.undefined)
  }
}
