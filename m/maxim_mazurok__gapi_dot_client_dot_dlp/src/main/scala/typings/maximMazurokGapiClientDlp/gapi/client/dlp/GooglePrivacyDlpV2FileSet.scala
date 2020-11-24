package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2FileSet extends js.Object {
  
  /** The regex-filtered set of files to scan. Exactly one of `url` or `regex_file_set` must be set. */
  var regexFileSet: js.UndefOr[GooglePrivacyDlpV2CloudStorageRegexFileSet] = js.native
  
  /**
    * The Cloud Storage url of the file(s) to scan, in the format `gs:///`. Trailing wildcard in the path is allowed. If the url ends in a trailing slash, the bucket or directory
    * represented by the url will be scanned non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is equivalent to `gs://mybucket/ *`, and
    * `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/ *`. Exactly one of `url` or `regex_file_set` must be set.
    */
  var url: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2FileSet {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2FileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2FileSet]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2FileSetOps[Self <: GooglePrivacyDlpV2FileSet] (val x: Self) extends AnyVal {
    
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
    def setRegexFileSet(value: GooglePrivacyDlpV2CloudStorageRegexFileSet): Self = this.set("regexFileSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexFileSet: Self = this.set("regexFileSet", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
