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
  
  @scala.inline
  def apply(value: String): IMarkdownString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkdownString]
  }
  
  @scala.inline
  implicit class IMarkdownStringMutableBuilder[Self <: IMarkdownString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
    
    @scala.inline
    def setSupportThemeIcons(value: Boolean): Self = StObject.set(x, "supportThemeIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportThemeIconsUndefined: Self = StObject.set(x, "supportThemeIcons", js.undefined)
    
    @scala.inline
    def setUris(value: StringDictionary[UriComponents]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
