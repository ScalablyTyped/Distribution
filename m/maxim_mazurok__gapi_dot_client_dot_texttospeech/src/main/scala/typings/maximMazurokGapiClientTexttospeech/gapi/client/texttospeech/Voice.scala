package typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Voice extends js.Object {
  
  /** The languages that this voice supports, expressed as [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g. "en-US", "es-419", "cmn-tw"). */
  var languageCodes: js.UndefOr[js.Array[String]] = js.native
  
  /** The name of this voice. Each distinct voice has a unique name. */
  var name: js.UndefOr[String] = js.native
  
  /** The natural sample rate (in hertz) for this voice. */
  var naturalSampleRateHertz: js.UndefOr[Double] = js.native
  
  /** The gender of this voice. */
  var ssmlGender: js.UndefOr[String] = js.native
}
object Voice {
  
  @scala.inline
  def apply(): Voice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Voice]
  }
  
  @scala.inline
  implicit class VoiceOps[Self <: Voice] (val x: Self) extends AnyVal {
    
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
    def setLanguageCodesVarargs(value: String*): Self = this.set("languageCodes", js.Array(value :_*))
    
    @scala.inline
    def setLanguageCodes(value: js.Array[String]): Self = this.set("languageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCodes: Self = this.set("languageCodes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNaturalSampleRateHertz(value: Double): Self = this.set("naturalSampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNaturalSampleRateHertz: Self = this.set("naturalSampleRateHertz", js.undefined)
    
    @scala.inline
    def setSsmlGender(value: String): Self = this.set("ssmlGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsmlGender: Self = this.set("ssmlGender", js.undefined)
  }
}
