package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Various webgl draw modes. These can be used to specify which GL drawMode to use
  * under certain situations and renderers.
  *
  * @memberof PIXI
  * @static
  * @name DRAW_MODES
  * @enum {number}
  * @property {number} POINTS
  * @property {number} LINES
  * @property {number} LINE_LOOP
  * @property {number} LINE_STRIP
  * @property {number} TRIANGLES
  * @property {number} TRIANGLE_STRIP
  * @property {number} TRIANGLE_FAN
  */
@JSGlobal("PIXI.DRAW_MODES")
@js.native
object DRAW_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.DRAW_MODES & Double] = js.native
  
  /* 1 */ val LINES: typings.pixiJs.PIXI.DRAW_MODES.LINES & Double = js.native
  
  /* 2 */ val LINE_LOOP: typings.pixiJs.PIXI.DRAW_MODES.LINE_LOOP & Double = js.native
  
  /* 3 */ val LINE_STRIP: typings.pixiJs.PIXI.DRAW_MODES.LINE_STRIP & Double = js.native
  
  /* 0 */ val POINTS: typings.pixiJs.PIXI.DRAW_MODES.POINTS & Double = js.native
  
  /* 4 */ val TRIANGLES: typings.pixiJs.PIXI.DRAW_MODES.TRIANGLES & Double = js.native
  
  /* 6 */ val TRIANGLE_FAN: typings.pixiJs.PIXI.DRAW_MODES.TRIANGLE_FAN & Double = js.native
  
  /* 5 */ val TRIANGLE_STRIP: typings.pixiJs.PIXI.DRAW_MODES.TRIANGLE_STRIP & Double = js.native
}
