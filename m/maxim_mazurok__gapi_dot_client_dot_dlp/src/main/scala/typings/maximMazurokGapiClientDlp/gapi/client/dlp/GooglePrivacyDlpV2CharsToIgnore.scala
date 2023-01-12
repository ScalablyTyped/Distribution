package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2CharsToIgnore extends StObject {
  
  /** Characters to not transform when masking. */
  var charactersToSkip: js.UndefOr[String] = js.undefined
  
  /** Common characters to not transform when masking. Useful to avoid removing punctuation. */
  var commonCharactersToIgnore: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2CharsToIgnore {
  
  inline def apply(): GooglePrivacyDlpV2CharsToIgnore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CharsToIgnore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2CharsToIgnore] (val x: Self) extends AnyVal {
    
    inline def setCharactersToSkip(value: String): Self = StObject.set(x, "charactersToSkip", value.asInstanceOf[js.Any])
    
    inline def setCharactersToSkipUndefined: Self = StObject.set(x, "charactersToSkip", js.undefined)
    
    inline def setCommonCharactersToIgnore(value: String): Self = StObject.set(x, "commonCharactersToIgnore", value.asInstanceOf[js.Any])
    
    inline def setCommonCharactersToIgnoreUndefined: Self = StObject.set(x, "commonCharactersToIgnore", js.undefined)
  }
}
