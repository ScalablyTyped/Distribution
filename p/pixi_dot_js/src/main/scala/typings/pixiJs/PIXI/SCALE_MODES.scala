package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SCALE_MODES extends js.Object

/**
  * The scale modes that are supported by pixi.
  *
  * The {@link PIXI.settings.SCALE_MODE} scale mode affects the default scaling mode of future operations.
  * It can be re-assigned to either LINEAR or NEAREST, depending upon suitability.
  *
  * @memberof PIXI
  * @static
  * @name SCALE_MODES
  * @enum {number}
  * @property {number} LINEAR Smooth scaling
  * @property {number} NEAREST Pixelating scaling
  */
@JSGlobal("PIXI.SCALE_MODES")
@js.native
object SCALE_MODES extends js.Object {
  @js.native
  sealed trait LINEAR extends SCALE_MODES
  
  @js.native
  sealed trait NEAREST extends SCALE_MODES
  
}

