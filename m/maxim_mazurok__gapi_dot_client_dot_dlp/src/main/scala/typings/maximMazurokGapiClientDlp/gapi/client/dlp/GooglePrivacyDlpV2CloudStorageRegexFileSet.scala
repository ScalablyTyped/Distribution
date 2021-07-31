package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CloudStorageRegexFileSet extends StObject {
  
  /** The name of a Cloud Storage bucket. Required. */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of regular expressions matching file paths to exclude. All files in the bucket that match at least one of these regular expressions will be excluded from the scan. Regular
    * expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
    */
  var excludeRegex: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of regular expressions matching file paths to include. All files in the bucket that match at least one of these regular expressions will be included in the set of files,
    * except for those that also match an item in `exclude_regex`. Leaving this field empty will match all files by default (this is equivalent to including `.*` in the list). Regular
    * expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
    */
  var includeRegex: js.UndefOr[js.Array[String]] = js.undefined
}
object GooglePrivacyDlpV2CloudStorageRegexFileSet {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CloudStorageRegexFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CloudStorageRegexFileSet]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CloudStorageRegexFileSetMutableBuilder[Self <: GooglePrivacyDlpV2CloudStorageRegexFileSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    @scala.inline
    def setExcludeRegex(value: js.Array[String]): Self = StObject.set(x, "excludeRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeRegexUndefined: Self = StObject.set(x, "excludeRegex", js.undefined)
    
    @scala.inline
    def setExcludeRegexVarargs(value: String*): Self = StObject.set(x, "excludeRegex", js.Array(value :_*))
    
    @scala.inline
    def setIncludeRegex(value: js.Array[String]): Self = StObject.set(x, "includeRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRegexUndefined: Self = StObject.set(x, "includeRegex", js.undefined)
    
    @scala.inline
    def setIncludeRegexVarargs(value: String*): Self = StObject.set(x, "includeRegex", js.Array(value :_*))
  }
}
