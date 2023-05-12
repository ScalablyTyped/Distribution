package typings.monacoEditor.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMarkdownString extends StObject {
  
  val baseUri: js.UndefOr[UriComponents] = js.undefined
  
  val isTrusted: js.UndefOr[Boolean | MarkdownStringTrustedOptions] = js.undefined
  
  val supportHtml: js.UndefOr[Boolean] = js.undefined
  
  val supportThemeIcons: js.UndefOr[Boolean] = js.undefined
  
  var uris: js.UndefOr[StringDictionary[UriComponents]] = js.undefined
  
  val value: String
}
object IMarkdownString {
  
  inline def apply(value: String): IMarkdownString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkdownString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMarkdownString] (val x: Self) extends AnyVal {
    
    inline def setBaseUri(value: UriComponents): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    inline def setBaseUriUndefined: Self = StObject.set(x, "baseUri", js.undefined)
    
    inline def setIsTrusted(value: Boolean | MarkdownStringTrustedOptions): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
    
    inline def setSupportHtml(value: Boolean): Self = StObject.set(x, "supportHtml", value.asInstanceOf[js.Any])
    
    inline def setSupportHtmlUndefined: Self = StObject.set(x, "supportHtml", js.undefined)
    
    inline def setSupportThemeIcons(value: Boolean): Self = StObject.set(x, "supportThemeIcons", value.asInstanceOf[js.Any])
    
    inline def setSupportThemeIconsUndefined: Self = StObject.set(x, "supportThemeIcons", js.undefined)
    
    inline def setUris(value: StringDictionary[UriComponents]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
