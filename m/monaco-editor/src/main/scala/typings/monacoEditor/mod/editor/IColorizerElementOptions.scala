package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColorizerElementOptions
  extends StObject
     with IColorizerOptions {
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
}
object IColorizerElementOptions {
  
  @scala.inline
  def apply(): IColorizerElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorizerElementOptions]
  }
  
  @scala.inline
  implicit class IColorizerElementOptionsMutableBuilder[Self <: IColorizerElementOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
