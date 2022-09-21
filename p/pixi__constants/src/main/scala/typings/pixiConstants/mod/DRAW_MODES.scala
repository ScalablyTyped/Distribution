package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DRAW_MODES extends StObject
@JSImport("@pixi/constants", "DRAW_MODES")
@js.native
object DRAW_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DRAW_MODES & Double] = js.native
  
  @js.native
  sealed trait LINES
    extends StObject
       with DRAW_MODES
  /* 1 */ val LINES: typings.pixiConstants.mod.DRAW_MODES.LINES & Double = js.native
  
  @js.native
  sealed trait LINE_LOOP
    extends StObject
       with DRAW_MODES
  /* 2 */ val LINE_LOOP: typings.pixiConstants.mod.DRAW_MODES.LINE_LOOP & Double = js.native
  
  @js.native
  sealed trait LINE_STRIP
    extends StObject
       with DRAW_MODES
  /* 3 */ val LINE_STRIP: typings.pixiConstants.mod.DRAW_MODES.LINE_STRIP & Double = js.native
  
  @js.native
  sealed trait POINTS
    extends StObject
       with DRAW_MODES
  /* 0 */ val POINTS: typings.pixiConstants.mod.DRAW_MODES.POINTS & Double = js.native
  
  @js.native
  sealed trait TRIANGLES
    extends StObject
       with DRAW_MODES
  /* 4 */ val TRIANGLES: typings.pixiConstants.mod.DRAW_MODES.TRIANGLES & Double = js.native
  
  @js.native
  sealed trait TRIANGLE_FAN
    extends StObject
       with DRAW_MODES
  /* 6 */ val TRIANGLE_FAN: typings.pixiConstants.mod.DRAW_MODES.TRIANGLE_FAN & Double = js.native
  
  @js.native
  sealed trait TRIANGLE_STRIP
    extends StObject
       with DRAW_MODES
  /* 5 */ val TRIANGLE_STRIP: typings.pixiConstants.mod.DRAW_MODES.TRIANGLE_STRIP & Double = js.native
}
