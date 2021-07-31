package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalEditorPaddingOptions extends StObject {
  
  val bottom: Double
  
  val top: Double
}
object InternalEditorPaddingOptions {
  
  @scala.inline
  def apply(bottom: Double, top: Double): InternalEditorPaddingOptions = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalEditorPaddingOptions]
  }
  
  @scala.inline
  implicit class InternalEditorPaddingOptionsMutableBuilder[Self <: InternalEditorPaddingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
