package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
trait I18nLanguageSnippet extends StObject {
  
  /** A short BCP-47 code that uniquely identifies a language. */
  var hl: js.UndefOr[String] = js.undefined
  
  /** The human-readable name of the language in the language itself. */
  var name: js.UndefOr[String] = js.undefined
}
object I18nLanguageSnippet {
  
  inline def apply(): I18nLanguageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nLanguageSnippet]
  }
  
  extension [Self <: I18nLanguageSnippet](x: Self) {
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
