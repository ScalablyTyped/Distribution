package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColorizerOptions extends StObject {
  
  var tabSize: js.UndefOr[Double] = js.undefined
}
object IColorizerOptions {
  
  inline def apply(): IColorizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorizerOptions]
  }
  
  extension [Self <: IColorizerOptions](x: Self) {
    
    inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
  }
}
