package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CharsToIgnore extends StObject {
  
  /** Characters to not transform when masking. */
  var charactersToSkip: js.UndefOr[String] = js.native
  
  /** Common characters to not transform when masking. Useful to avoid removing punctuation. */
  var commonCharactersToIgnore: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2CharsToIgnore {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CharsToIgnore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CharsToIgnore]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CharsToIgnoreMutableBuilder[Self <: GooglePrivacyDlpV2CharsToIgnore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharactersToSkip(value: String): Self = StObject.set(x, "charactersToSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharactersToSkipUndefined: Self = StObject.set(x, "charactersToSkip", js.undefined)
    
    @scala.inline
    def setCommonCharactersToIgnore(value: String): Self = StObject.set(x, "commonCharactersToIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonCharactersToIgnoreUndefined: Self = StObject.set(x, "commonCharactersToIgnore", js.undefined)
  }
}
