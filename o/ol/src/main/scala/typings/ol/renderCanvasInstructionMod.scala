package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasInstructionMod {
  
  object default {
    
    @JSImport("ol/render/canvas/Instruction", "default.BEGIN_GEOMETRY")
    @js.native
    val BEGIN_GEOMETRY: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.BEGIN_PATH")
    @js.native
    val BEGIN_PATH: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.CIRCLE")
    @js.native
    val CIRCLE: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.CLOSE_PATH")
    @js.native
    val CLOSE_PATH: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.CUSTOM")
    @js.native
    val CUSTOM: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.DRAW_CHARS")
    @js.native
    val DRAW_CHARS: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.DRAW_IMAGE")
    @js.native
    val DRAW_IMAGE: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.END_GEOMETRY")
    @js.native
    val END_GEOMETRY: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.FILL")
    @js.native
    val FILL: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.MOVE_TO_LINE_TO")
    @js.native
    val MOVE_TO_LINE_TO: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.SET_FILL_STYLE")
    @js.native
    val SET_FILL_STYLE: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.SET_STROKE_STYLE")
    @js.native
    val SET_STROKE_STYLE: Double = js.native
    
    @JSImport("ol/render/canvas/Instruction", "default.STROKE")
    @js.native
    val STROKE: Double = js.native
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
  
  type Instruction = Double
}
