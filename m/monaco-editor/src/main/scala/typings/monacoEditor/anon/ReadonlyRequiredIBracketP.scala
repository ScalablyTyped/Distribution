package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IBracketPairColorizationOptions>> */
trait ReadonlyRequiredIBracketP extends StObject {
  
  val enabled: Boolean
  
  val independentColorPoolPerBracketType: Boolean
}
object ReadonlyRequiredIBracketP {
  
  inline def apply(enabled: Boolean, independentColorPoolPerBracketType: Boolean): ReadonlyRequiredIBracketP = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], independentColorPoolPerBracketType = independentColorPoolPerBracketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIBracketP]
  }
  
  extension [Self <: ReadonlyRequiredIBracketP](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setIndependentColorPoolPerBracketType(value: Boolean): Self = StObject.set(x, "independentColorPoolPerBracketType", value.asInstanceOf[js.Any])
  }
}
