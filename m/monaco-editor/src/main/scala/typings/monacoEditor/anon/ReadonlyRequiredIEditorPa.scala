package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorPaddingOptions>> */
trait ReadonlyRequiredIEditorPa extends StObject {
  
  val bottom: Double
  
  val top: Double
}
object ReadonlyRequiredIEditorPa {
  
  inline def apply(bottom: Double, top: Double): ReadonlyRequiredIEditorPa = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIEditorPa]
  }
  
  extension [Self <: ReadonlyRequiredIEditorPa](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
