package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageCodePair extends StObject {
  
  /** Required. The BCP-47 language code of the input text, for example, "en-US". Expected to be an exact match for GlossaryTerm.language_code. */
  var sourceLanguageCode: js.UndefOr[String] = js.undefined
  
  /** Required. The BCP-47 language code for translation output, for example, "zh-CN". Expected to be an exact match for GlossaryTerm.language_code. */
  var targetLanguageCode: js.UndefOr[String] = js.undefined
}
object LanguageCodePair {
  
  @scala.inline
  def apply(): LanguageCodePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageCodePair]
  }
  
  @scala.inline
  implicit class LanguageCodePairMutableBuilder[Self <: LanguageCodePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceLanguageCode(value: String): Self = StObject.set(x, "sourceLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLanguageCodeUndefined: Self = StObject.set(x, "sourceLanguageCode", js.undefined)
    
    @scala.inline
    def setTargetLanguageCode(value: String): Self = StObject.set(x, "targetLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLanguageCodeUndefined: Self = StObject.set(x, "targetLanguageCode", js.undefined)
  }
}
