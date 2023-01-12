package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlossaryTerm extends StObject {
  
  /** The language for this glossary term. */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** The text for the glossary term. */
  var text: js.UndefOr[String] = js.undefined
}
object GlossaryTerm {
  
  inline def apply(): GlossaryTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlossaryTerm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlossaryTerm] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
