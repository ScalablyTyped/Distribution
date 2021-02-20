package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Glossary extends StObject {
  
  /** Output only. When the glossary creation was finished. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Output only. The number of entries defined in the glossary. */
  var entryCount: js.UndefOr[Double] = js.native
  
  /** Required. Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints. */
  var inputConfig: js.UndefOr[GlossaryInputConfig] = js.native
  
  /** Used with equivalent term set glossaries. */
  var languageCodesSet: js.UndefOr[LanguageCodesSet] = js.native
  
  /** Used with unidirectional glossaries. */
  var languagePair: js.UndefOr[LanguageCodePair] = js.native
  
  /** Required. The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. When CreateGlossary was called. */
  var submitTime: js.UndefOr[String] = js.native
}
object Glossary {
  
  @scala.inline
  def apply(): Glossary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Glossary]
  }
  
  @scala.inline
  implicit class GlossaryMutableBuilder[Self <: Glossary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEntryCount(value: Double): Self = StObject.set(x, "entryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryCountUndefined: Self = StObject.set(x, "entryCount", js.undefined)
    
    @scala.inline
    def setInputConfig(value: GlossaryInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    @scala.inline
    def setLanguageCodesSet(value: LanguageCodesSet): Self = StObject.set(x, "languageCodesSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodesSetUndefined: Self = StObject.set(x, "languageCodesSet", js.undefined)
    
    @scala.inline
    def setLanguagePair(value: LanguageCodePair): Self = StObject.set(x, "languagePair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagePairUndefined: Self = StObject.set(x, "languagePair", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: String): Self = StObject.set(x, "submitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeUndefined: Self = StObject.set(x, "submitTime", js.undefined)
  }
}
