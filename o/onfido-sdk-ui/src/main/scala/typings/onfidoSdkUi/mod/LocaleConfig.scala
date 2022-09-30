package typings.onfidoSdkUi.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleConfig extends StObject {
  
  var locale: js.UndefOr[SupportedLanguages] = js.undefined
  
  var mobilePhrases: js.UndefOr[Record[String, Any]] = js.undefined
  
  var phrases: Record[String, Any]
}
object LocaleConfig {
  
  inline def apply(phrases: Record[String, Any]): LocaleConfig = {
    val __obj = js.Dynamic.literal(phrases = phrases.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleConfig]
  }
  
  extension [Self <: LocaleConfig](x: Self) {
    
    inline def setLocale(value: SupportedLanguages): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMobilePhrases(value: Record[String, Any]): Self = StObject.set(x, "mobilePhrases", value.asInstanceOf[js.Any])
    
    inline def setMobilePhrasesUndefined: Self = StObject.set(x, "mobilePhrases", js.undefined)
    
    inline def setPhrases(value: Record[String, Any]): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
  }
}
