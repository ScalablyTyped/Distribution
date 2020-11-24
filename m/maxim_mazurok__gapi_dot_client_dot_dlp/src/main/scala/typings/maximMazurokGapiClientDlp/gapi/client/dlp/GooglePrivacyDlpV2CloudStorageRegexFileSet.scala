package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CloudStorageRegexFileSet extends js.Object {
  
  /** The name of a Cloud Storage bucket. Required. */
  var bucketName: js.UndefOr[String] = js.native
  
  /**
    * A list of regular expressions matching file paths to exclude. All files in the bucket that match at least one of these regular expressions will be excluded from the scan. Regular
    * expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
    */
  var excludeRegex: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of regular expressions matching file paths to include. All files in the bucket that match at least one of these regular expressions will be included in the set of files,
    * except for those that also match an item in `exclude_regex`. Leaving this field empty will match all files by default (this is equivalent to including `.*` in the list). Regular
    * expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
    */
  var includeRegex: js.UndefOr[js.Array[String]] = js.native
}
object GooglePrivacyDlpV2CloudStorageRegexFileSet {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CloudStorageRegexFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CloudStorageRegexFileSet]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CloudStorageRegexFileSetOps[Self <: GooglePrivacyDlpV2CloudStorageRegexFileSet] (val x: Self) extends AnyVal {
    
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
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    
    @scala.inline
    def setExcludeRegexVarargs(value: String*): Self = this.set("excludeRegex", js.Array(value :_*))
    
    @scala.inline
    def setExcludeRegex(value: js.Array[String]): Self = this.set("excludeRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeRegex: Self = this.set("excludeRegex", js.undefined)
    
    @scala.inline
    def setIncludeRegexVarargs(value: String*): Self = this.set("includeRegex", js.Array(value :_*))
    
    @scala.inline
    def setIncludeRegex(value: js.Array[String]): Self = this.set("includeRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeRegex: Self = this.set("includeRegex", js.undefined)
  }
}
