package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastMeetingCaptionSettings extends StObject {
  
  // Indicates whether captions are enabled for this Teams live event.
  var isCaptionEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The spoken language.
  var spokenLanguage: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The translation languages (choose up to 6).
  var translationLanguages: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object BroadcastMeetingCaptionSettings {
  
  inline def apply(): BroadcastMeetingCaptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastMeetingCaptionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BroadcastMeetingCaptionSettings] (val x: Self) extends AnyVal {
    
    inline def setIsCaptionEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isCaptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsCaptionEnabledNull: Self = StObject.set(x, "isCaptionEnabled", null)
    
    inline def setIsCaptionEnabledUndefined: Self = StObject.set(x, "isCaptionEnabled", js.undefined)
    
    inline def setSpokenLanguage(value: NullableOption[String]): Self = StObject.set(x, "spokenLanguage", value.asInstanceOf[js.Any])
    
    inline def setSpokenLanguageNull: Self = StObject.set(x, "spokenLanguage", null)
    
    inline def setSpokenLanguageUndefined: Self = StObject.set(x, "spokenLanguage", js.undefined)
    
    inline def setTranslationLanguages(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "translationLanguages", value.asInstanceOf[js.Any])
    
    inline def setTranslationLanguagesNull: Self = StObject.set(x, "translationLanguages", null)
    
    inline def setTranslationLanguagesUndefined: Self = StObject.set(x, "translationLanguages", js.undefined)
    
    inline def setTranslationLanguagesVarargs(value: String*): Self = StObject.set(x, "translationLanguages", js.Array(value*))
  }
}
