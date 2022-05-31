package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instruction extends StObject {
  
  var instruction: js.UndefOr[String] = js.undefined
}
object Instruction {
  
  inline def apply(): Instruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instruction]
  }
  
  extension [Self <: Instruction](x: Self) {
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
  }
}
