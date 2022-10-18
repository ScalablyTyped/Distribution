package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasInstructionMod {
  
  @JSImport("ol/render/canvas/Instruction", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Instruction & Double] = js.native
    
    /* 0 */ val BEGIN_GEOMETRY: typings.ol.renderCanvasInstructionMod.Instruction.BEGIN_GEOMETRY & Double = js.native
    
    /* 1 */ val BEGIN_PATH: typings.ol.renderCanvasInstructionMod.Instruction.BEGIN_PATH & Double = js.native
    
    /* 2 */ val CIRCLE: typings.ol.renderCanvasInstructionMod.Instruction.CIRCLE & Double = js.native
    
    /* 3 */ val CLOSE_PATH: typings.ol.renderCanvasInstructionMod.Instruction.CLOSE_PATH & Double = js.native
    
    /* 4 */ val CUSTOM: typings.ol.renderCanvasInstructionMod.Instruction.CUSTOM & Double = js.native
    
    /* 5 */ val DRAW_CHARS: typings.ol.renderCanvasInstructionMod.Instruction.DRAW_CHARS & Double = js.native
    
    /* 6 */ val DRAW_IMAGE: typings.ol.renderCanvasInstructionMod.Instruction.DRAW_IMAGE & Double = js.native
    
    /* 7 */ val END_GEOMETRY: typings.ol.renderCanvasInstructionMod.Instruction.END_GEOMETRY & Double = js.native
    
    /* 8 */ val FILL: typings.ol.renderCanvasInstructionMod.Instruction.FILL & Double = js.native
    
    /* 9 */ val MOVE_TO_LINE_TO: typings.ol.renderCanvasInstructionMod.Instruction.MOVE_TO_LINE_TO & Double = js.native
    
    /* 10 */ val SET_FILL_STYLE: typings.ol.renderCanvasInstructionMod.Instruction.SET_FILL_STYLE & Double = js.native
    
    /* 11 */ val SET_STROKE_STYLE: typings.ol.renderCanvasInstructionMod.Instruction.SET_STROKE_STYLE & Double = js.native
    
    /* 12 */ val STROKE: typings.ol.renderCanvasInstructionMod.Instruction.STROKE & Double = js.native
  }
  
  @js.native
  sealed trait Instruction extends StObject
  @JSImport("ol/render/canvas/Instruction", "Instruction")
  @js.native
  object Instruction extends StObject {
    
    @js.native
    sealed trait BEGIN_GEOMETRY
      extends StObject
         with Instruction
    
    @js.native
    sealed trait BEGIN_PATH
      extends StObject
         with Instruction
    
    @js.native
    sealed trait CIRCLE
      extends StObject
         with Instruction
    
    @js.native
    sealed trait CLOSE_PATH
      extends StObject
         with Instruction
    
    @js.native
    sealed trait CUSTOM
      extends StObject
         with Instruction
    
    @js.native
    sealed trait DRAW_CHARS
      extends StObject
         with Instruction
    
    @js.native
    sealed trait DRAW_IMAGE
      extends StObject
         with Instruction
    
    @js.native
    sealed trait END_GEOMETRY
      extends StObject
         with Instruction
    
    @js.native
    sealed trait FILL
      extends StObject
         with Instruction
    
    @js.native
    sealed trait MOVE_TO_LINE_TO
      extends StObject
         with Instruction
    
    @js.native
    sealed trait SET_FILL_STYLE
      extends StObject
         with Instruction
    
    @js.native
    sealed trait SET_STROKE_STYLE
      extends StObject
         with Instruction
    
    @js.native
    sealed trait STROKE
      extends StObject
         with Instruction
  }
  
  @JSImport("ol/render/canvas/Instruction", "beginPathInstruction")
  @js.native
  val beginPathInstruction: js.Array[Instruction] = js.native
  
  @JSImport("ol/render/canvas/Instruction", "closePathInstruction")
  @js.native
  val closePathInstruction: js.Array[Instruction] = js.native
  
  @JSImport("ol/render/canvas/Instruction", "fillInstruction")
  @js.native
  val fillInstruction: js.Array[Instruction] = js.native
  
  @JSImport("ol/render/canvas/Instruction", "strokeInstruction")
  @js.native
  val strokeInstruction: js.Array[Instruction] = js.native
}
