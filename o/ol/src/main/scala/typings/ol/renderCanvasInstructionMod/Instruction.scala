package typings.ol.renderCanvasInstructionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Instruction extends js.Object

@JSImport("ol/render/canvas/Instruction", "Instruction")
@js.native
object Instruction extends js.Object {
  @js.native
  sealed trait BEGIN_GEOMETRY extends Instruction
  
  @js.native
  sealed trait BEGIN_PATH extends Instruction
  
  @js.native
  sealed trait CIRCLE extends Instruction
  
  @js.native
  sealed trait CLOSE_PATH extends Instruction
  
  @js.native
  sealed trait CUSTOM extends Instruction
  
  @js.native
  sealed trait DRAW_CHARS extends Instruction
  
  @js.native
  sealed trait DRAW_IMAGE extends Instruction
  
  @js.native
  sealed trait END_GEOMETRY extends Instruction
  
  @js.native
  sealed trait FILL extends Instruction
  
  @js.native
  sealed trait MOVE_TO_LINE_TO extends Instruction
  
  @js.native
  sealed trait SET_FILL_STYLE extends Instruction
  
  @js.native
  sealed trait SET_STROKE_STYLE extends Instruction
  
  @js.native
  sealed trait STROKE extends Instruction
  
}

