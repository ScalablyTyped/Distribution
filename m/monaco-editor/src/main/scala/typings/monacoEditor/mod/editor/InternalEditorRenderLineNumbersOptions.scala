package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalEditorRenderLineNumbersOptions extends StObject {
  
  val renderFn: (js.Function1[/* lineNumber */ Double, String]) | Null
  
  val renderType: RenderLineNumbersType
}
object InternalEditorRenderLineNumbersOptions {
  
  inline def apply(renderType: RenderLineNumbersType): InternalEditorRenderLineNumbersOptions = {
    val __obj = js.Dynamic.literal(renderType = renderType.asInstanceOf[js.Any], renderFn = null)
    __obj.asInstanceOf[InternalEditorRenderLineNumbersOptions]
  }
  
  extension [Self <: InternalEditorRenderLineNumbersOptions](x: Self) {
    
    inline def setRenderFn(value: /* lineNumber */ Double => String): Self = StObject.set(x, "renderFn", js.Any.fromFunction1(value))
    
    inline def setRenderFnNull: Self = StObject.set(x, "renderFn", null)
    
    inline def setRenderType(value: RenderLineNumbersType): Self = StObject.set(x, "renderType", value.asInstanceOf[js.Any])
  }
}
