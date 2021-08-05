package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitSynthFocused extends StObject {
  
  var emitSynthFocused: Boolean
}
object EmitSynthFocused {
  
  inline def apply(emitSynthFocused: Boolean): EmitSynthFocused = {
    val __obj = js.Dynamic.literal(emitSynthFocused = emitSynthFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitSynthFocused]
  }
  
  extension [Self <: EmitSynthFocused](x: Self) {
    
    inline def setEmitSynthFocused(value: Boolean): Self = StObject.set(x, "emitSynthFocused", value.asInstanceOf[js.Any])
  }
}
