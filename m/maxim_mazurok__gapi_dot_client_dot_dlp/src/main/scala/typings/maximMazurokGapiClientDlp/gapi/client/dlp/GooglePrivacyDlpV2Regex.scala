package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Regex extends js.Object {
  
  /** The index of the submatch to extract as findings. When not specified, the entire match is returned. No more than 3 may be included. */
  var groupIndexes: js.UndefOr[js.Array[Double]] = js.native
  
  /** Pattern defining the regular expression. Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub. */
  var pattern: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2Regex {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Regex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Regex]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RegexOps[Self <: GooglePrivacyDlpV2Regex] (val x: Self) extends AnyVal {
    
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
    def setGroupIndexesVarargs(value: Double*): Self = this.set("groupIndexes", js.Array(value :_*))
    
    @scala.inline
    def setGroupIndexes(value: js.Array[Double]): Self = this.set("groupIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIndexes: Self = this.set("groupIndexes", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
}
