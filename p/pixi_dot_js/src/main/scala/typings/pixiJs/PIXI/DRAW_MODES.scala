package typings.pixiJs.PIXI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DRAW_MODES extends js.Object

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
object DRAW_MODES extends js.Object {
  @js.native
  sealed trait LINES extends DRAW_MODES
  
  @js.native
  sealed trait LINE_LOOP extends DRAW_MODES
  
  @js.native
  sealed trait LINE_STRIP extends DRAW_MODES
  
  @js.native
  sealed trait POINTS extends DRAW_MODES
  
  @js.native
  sealed trait TRIANGLES extends DRAW_MODES
  
  @js.native
  sealed trait TRIANGLE_FAN extends DRAW_MODES
  
  @js.native
  sealed trait TRIANGLE_STRIP extends DRAW_MODES
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DRAW_MODES with Double] = js.native
  /* 1 */ @js.native
  object LINES extends TopLevel[LINES with Double]
  
  /* 2 */ @js.native
  object LINE_LOOP extends TopLevel[LINE_LOOP with Double]
  
  /* 3 */ @js.native
  object LINE_STRIP extends TopLevel[LINE_STRIP with Double]
  
  /* 0 */ @js.native
  object POINTS extends TopLevel[POINTS with Double]
  
  /* 4 */ @js.native
  object TRIANGLES extends TopLevel[TRIANGLES with Double]
  
  /* 6 */ @js.native
  object TRIANGLE_FAN extends TopLevel[TRIANGLE_FAN with Double]
  
  /* 5 */ @js.native
  object TRIANGLE_STRIP extends TopLevel[TRIANGLE_STRIP with Double]
  
}

