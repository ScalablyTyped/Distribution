package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2WordList extends StObject {
  
  /** Words or phrases defining the dictionary. The dictionary must contain at least one phrase and every phrase must contain at least 2 characters that are letters or digits. [required] */
  var words: js.UndefOr[js.Array[String]] = js.native
}
object GooglePrivacyDlpV2WordList {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2WordList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2WordList]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2WordListMutableBuilder[Self <: GooglePrivacyDlpV2WordList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
