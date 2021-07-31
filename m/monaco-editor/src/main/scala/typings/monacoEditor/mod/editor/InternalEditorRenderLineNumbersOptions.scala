package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalEditorRenderLineNumbersOptions extends StObject {
  
  val renderFn: (js.Function1[/* lineNumber */ Double, String]) | Null
  
  val renderType: RenderLineNumbersType
}
object InternalEditorRenderLineNumbersOptions {
  
  @scala.inline
  def apply(renderType: RenderLineNumbersType): InternalEditorRenderLineNumbersOptions = {
    val __obj = js.Dynamic.literal(renderType = renderType.asInstanceOf[js.Any], renderFn = null)
    __obj.asInstanceOf[InternalEditorRenderLineNumbersOptions]
  }
  
  @scala.inline
  implicit class InternalEditorRenderLineNumbersOptionsMutableBuilder[Self <: InternalEditorRenderLineNumbersOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderFn(value: /* lineNumber */ Double => String): Self = StObject.set(x, "renderFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderFnNull: Self = StObject.set(x, "renderFn", null)
    
    @scala.inline
    def setRenderType(value: RenderLineNumbersType): Self = StObject.set(x, "renderType", value.asInstanceOf[js.Any])
  }
}
