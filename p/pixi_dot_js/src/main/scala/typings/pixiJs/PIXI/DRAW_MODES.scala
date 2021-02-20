package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DRAW_MODES extends StObject
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
}
