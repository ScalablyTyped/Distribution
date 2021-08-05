package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Glossary extends StObject {
  
  /** Output only. When the glossary creation was finished. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The number of entries defined in the glossary. */
  var entryCount: js.UndefOr[Double] = js.undefined
  
  /** Required. Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints. */
  var inputConfig: js.UndefOr[GlossaryInputConfig] = js.undefined
  
  /** Used with equivalent term set glossaries. */
  var languageCodesSet: js.UndefOr[LanguageCodesSet] = js.undefined
  
  /** Used with unidirectional glossaries. */
  var languagePair: js.UndefOr[LanguageCodePair] = js.undefined
  
  /** Required. The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. When CreateGlossary was called. */
  var submitTime: js.UndefOr[String] = js.undefined
}
object Glossary {
  
  inline def apply(): Glossary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Glossary]
  }
  
  extension [Self <: Glossary](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEntryCount(value: Double): Self = StObject.set(x, "entryCount", value.asInstanceOf[js.Any])
    
    inline def setEntryCountUndefined: Self = StObject.set(x, "entryCount", js.undefined)
    
    inline def setInputConfig(value: GlossaryInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setLanguageCodesSet(value: LanguageCodesSet): Self = StObject.set(x, "languageCodesSet", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodesSetUndefined: Self = StObject.set(x, "languageCodesSet", js.undefined)
    
    inline def setLanguagePair(value: LanguageCodePair): Self = StObject.set(x, "languagePair", value.asInstanceOf[js.Any])
    
    inline def setLanguagePairUndefined: Self = StObject.set(x, "languagePair", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubmitTime(value: String): Self = StObject.set(x, "submitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "submitTime", js.undefined)
  }
}
