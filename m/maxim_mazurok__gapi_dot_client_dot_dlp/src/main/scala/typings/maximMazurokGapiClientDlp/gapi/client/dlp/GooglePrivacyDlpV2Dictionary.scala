package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Dictionary extends js.Object {
  
  /** Newline-delimited file of words in Cloud Storage. Only a single file is accepted. */
  var cloudStoragePath: js.UndefOr[GooglePrivacyDlpV2CloudStoragePath] = js.native
  
  /** List of words or phrases to search for. */
  var wordList: js.UndefOr[GooglePrivacyDlpV2WordList] = js.native
}
object GooglePrivacyDlpV2Dictionary {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Dictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Dictionary]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DictionaryOps[Self <: GooglePrivacyDlpV2Dictionary] (val x: Self) extends AnyVal {
    
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
    def setCloudStoragePath(value: GooglePrivacyDlpV2CloudStoragePath): Self = this.set("cloudStoragePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudStoragePath: Self = this.set("cloudStoragePath", js.undefined)
    
    @scala.inline
    def setWordList(value: GooglePrivacyDlpV2WordList): Self = this.set("wordList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordList: Self = this.set("wordList", js.undefined)
  }
}
