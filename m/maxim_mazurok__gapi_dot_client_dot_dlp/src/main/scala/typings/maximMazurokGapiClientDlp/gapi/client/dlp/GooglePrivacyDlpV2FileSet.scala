package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2FileSet extends StObject {
  
  /** The regex-filtered set of files to scan. Exactly one of `url` or `regex_file_set` must be set. */
  var regexFileSet: js.UndefOr[GooglePrivacyDlpV2CloudStorageRegexFileSet] = js.undefined
  
  /**
    * The Cloud Storage url of the file(s) to scan, in the format `gs:///`. Trailing wildcard in the path is allowed. If the url ends in a trailing slash, the bucket or directory
    * represented by the url will be scanned non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is equivalent to `gs://mybucket/ *`, and
    * `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/ *`. Exactly one of `url` or `regex_file_set` must be set.
    */
  var url: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2FileSet {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2FileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2FileSet]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2FileSetMutableBuilder[Self <: GooglePrivacyDlpV2FileSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegexFileSet(value: GooglePrivacyDlpV2CloudStorageRegexFileSet): Self = StObject.set(x, "regexFileSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexFileSetUndefined: Self = StObject.set(x, "regexFileSet", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
