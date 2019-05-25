package typings
package olLib.renderCanvasInstructionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Instruction extends js.Object

@JSImport("ol/render/canvas/Instruction", "Instruction")
@js.native
object Instruction extends js.Object {
  @js.native
  sealed trait BEGIN_GEOMETRY
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait BEGIN_PATH
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait CIRCLE
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait CLOSE_PATH
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait CUSTOM
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait DRAW_CHARS
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait DRAW_IMAGE
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait END_GEOMETRY
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait FILL
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait MOVE_TO_LINE_TO
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait SET_FILL_STYLE
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait SET_STROKE_STYLE
    extends olLib.renderCanvasInstructionMod.Instruction
  
  @js.native
  sealed trait STROKE
    extends olLib.renderCanvasInstructionMod.Instruction
  
}

