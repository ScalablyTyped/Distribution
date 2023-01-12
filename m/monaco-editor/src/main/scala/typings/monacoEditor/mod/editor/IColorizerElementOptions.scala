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
  
  inline def apply(): IColorizerElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorizerElementOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IColorizerElementOptions] (val x: Self) extends AnyVal {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
