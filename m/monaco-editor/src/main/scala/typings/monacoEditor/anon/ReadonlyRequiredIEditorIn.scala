package typings.monacoEditor.anon

import typings.monacoEditor.monacoEditorStrings.off
import typings.monacoEditor.monacoEditorStrings.offUnlessPressed
import typings.monacoEditor.monacoEditorStrings.on
import typings.monacoEditor.monacoEditorStrings.onUnlessPressed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorInlayHintsOptions>> */
trait ReadonlyRequiredIEditorIn extends StObject {
  
  val enabled: on | off | offUnlessPressed | onUnlessPressed
  
  val fontFamily: String
  
  val fontSize: Double
  
  val padding: Boolean
}
object ReadonlyRequiredIEditorIn {
  
  inline def apply(
    enabled: on | off | offUnlessPressed | onUnlessPressed,
    fontFamily: String,
    fontSize: Double,
    padding: Boolean
  ): ReadonlyRequiredIEditorIn = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIEditorIn]
  }
  
  extension [Self <: ReadonlyRequiredIEditorIn](x: Self) {
    
    inline def setEnabled(value: on | off | offUnlessPressed | onUnlessPressed): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Boolean): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
