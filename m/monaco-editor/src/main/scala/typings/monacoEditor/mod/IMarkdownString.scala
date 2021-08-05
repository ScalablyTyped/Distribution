package typings.monacoEditor.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMarkdownString extends StObject {
  
  val isTrusted: js.UndefOr[Boolean] = js.undefined
  
  val supportThemeIcons: js.UndefOr[Boolean] = js.undefined
  
  var uris: js.UndefOr[StringDictionary[UriComponents]] = js.undefined
  
  val value: String
}
object IMarkdownString {
  
  inline def apply(value: String): IMarkdownString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkdownString]
  }
  
  extension [Self <: IMarkdownString](x: Self) {
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
    
    inline def setSupportThemeIcons(value: Boolean): Self = StObject.set(x, "supportThemeIcons", value.asInstanceOf[js.Any])
    
    inline def setSupportThemeIconsUndefined: Self = StObject.set(x, "supportThemeIcons", js.undefined)
    
    inline def setUris(value: StringDictionary[UriComponents]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
