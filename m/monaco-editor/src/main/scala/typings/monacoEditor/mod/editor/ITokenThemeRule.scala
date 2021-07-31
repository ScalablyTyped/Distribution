package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITokenThemeRule extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var foreground: js.UndefOr[String] = js.undefined
  
  var token: String
}
object ITokenThemeRule {
  
  @scala.inline
  def apply(token: String): ITokenThemeRule = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenThemeRule]
  }
  
  @scala.inline
  implicit class ITokenThemeRuleMutableBuilder[Self <: ITokenThemeRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
