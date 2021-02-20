package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait I18nLanguageSnippet extends StObject {
  
  /** A short BCP-47 code that uniquely identifies a language. */
  var hl: js.UndefOr[String] = js.native
  
  /** The human-readable name of the language in the language itself. */
  var name: js.UndefOr[String] = js.native
}
object I18nLanguageSnippet {
  
  @scala.inline
  def apply(): I18nLanguageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nLanguageSnippet]
  }
  
  @scala.inline
  implicit class I18nLanguageSnippetMutableBuilder[Self <: I18nLanguageSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
