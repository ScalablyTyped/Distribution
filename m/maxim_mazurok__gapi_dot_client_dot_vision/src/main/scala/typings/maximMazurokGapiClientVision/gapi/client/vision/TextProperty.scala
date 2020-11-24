package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextProperty extends js.Object {
  
  /** Detected start or end of a text segment. */
  var detectedBreak: js.UndefOr[DetectedBreak] = js.native
  
  /** A list of detected languages together with confidence. */
  var detectedLanguages: js.UndefOr[js.Array[DetectedLanguage]] = js.native
}
object TextProperty {
  
  @scala.inline
  def apply(): TextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProperty]
  }
  
  @scala.inline
  implicit class TextPropertyOps[Self <: TextProperty] (val x: Self) extends AnyVal {
    
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
    def setDetectedBreak(value: DetectedBreak): Self = this.set("detectedBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedBreak: Self = this.set("detectedBreak", js.undefined)
    
    @scala.inline
    def setDetectedLanguagesVarargs(value: DetectedLanguage*): Self = this.set("detectedLanguages", js.Array(value :_*))
    
    @scala.inline
    def setDetectedLanguages(value: js.Array[DetectedLanguage]): Self = this.set("detectedLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedLanguages: Self = this.set("detectedLanguages", js.undefined)
  }
}
