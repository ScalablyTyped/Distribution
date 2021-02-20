package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instruction extends StObject {
  
  var instruction: js.UndefOr[String] = js.native
}
object Instruction {
  
  @scala.inline
  def apply(): Instruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instruction]
  }
  
  @scala.inline
  implicit class InstructionMutableBuilder[Self <: Instruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
  }
}
