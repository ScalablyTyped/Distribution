package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Glossary extends js.Object {
  
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
  implicit class GlossaryOps[Self <: Glossary] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setEntryCount(value: Double): Self = this.set("entryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryCount: Self = this.set("entryCount", js.undefined)
    
    @scala.inline
    def setInputConfig(value: GlossaryInputConfig): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
    
    @scala.inline
    def setLanguageCodesSet(value: LanguageCodesSet): Self = this.set("languageCodesSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCodesSet: Self = this.set("languageCodesSet", js.undefined)
    
    @scala.inline
    def setLanguagePair(value: LanguageCodePair): Self = this.set("languagePair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguagePair: Self = this.set("languagePair", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: String): Self = this.set("submitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitTime: Self = this.set("submitTime", js.undefined)
  }
}
