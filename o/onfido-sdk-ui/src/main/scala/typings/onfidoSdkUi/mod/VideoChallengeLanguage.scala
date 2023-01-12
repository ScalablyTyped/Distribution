package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoChallengeLanguage extends StObject {
  
  var language_code: SupportedLanguages
  
  var source: String
}
object VideoChallengeLanguage {
  
  inline def apply(language_code: SupportedLanguages, source: String): VideoChallengeLanguage = {
    val __obj = js.Dynamic.literal(language_code = language_code.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoChallengeLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoChallengeLanguage] (val x: Self) extends AnyVal {
    
    inline def setLanguage_code(value: SupportedLanguages): Self = StObject.set(x, "language_code", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
