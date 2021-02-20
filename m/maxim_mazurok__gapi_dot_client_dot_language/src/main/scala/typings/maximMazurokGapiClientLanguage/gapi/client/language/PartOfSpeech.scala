package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartOfSpeech extends StObject {
  
  /** The grammatical aspect. */
  var aspect: js.UndefOr[String] = js.native
  
  /** The grammatical case. */
  var `case`: js.UndefOr[String] = js.native
  
  /** The grammatical form. */
  var form: js.UndefOr[String] = js.native
  
  /** The grammatical gender. */
  var gender: js.UndefOr[String] = js.native
  
  /** The grammatical mood. */
  var mood: js.UndefOr[String] = js.native
  
  /** The grammatical number. */
  var number: js.UndefOr[String] = js.native
  
  /** The grammatical person. */
  var person: js.UndefOr[String] = js.native
  
  /** The grammatical properness. */
  var proper: js.UndefOr[String] = js.native
  
  /** The grammatical reciprocity. */
  var reciprocity: js.UndefOr[String] = js.native
  
  /** The part of speech tag. */
  var tag: js.UndefOr[String] = js.native
  
  /** The grammatical tense. */
  var tense: js.UndefOr[String] = js.native
  
  /** The grammatical voice. */
  var voice: js.UndefOr[String] = js.native
}
object PartOfSpeech {
  
  @scala.inline
  def apply(): PartOfSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartOfSpeech]
  }
  
  @scala.inline
  implicit class PartOfSpeechMutableBuilder[Self <: PartOfSpeech] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspect(value: String): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    @scala.inline
    def setCase(value: String): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseUndefined: Self = StObject.set(x, "case", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setMood(value: String): Self = StObject.set(x, "mood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoodUndefined: Self = StObject.set(x, "mood", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    
    @scala.inline
    def setProper(value: String): Self = StObject.set(x, "proper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperUndefined: Self = StObject.set(x, "proper", js.undefined)
    
    @scala.inline
    def setReciprocity(value: String): Self = StObject.set(x, "reciprocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReciprocityUndefined: Self = StObject.set(x, "reciprocity", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTense(value: String): Self = StObject.set(x, "tense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenseUndefined: Self = StObject.set(x, "tense", js.undefined)
    
    @scala.inline
    def setVoice(value: String): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
