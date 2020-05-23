package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Graphics curves resolution settings. If `adaptive` flag is set to `true`,
  * the resolution is calculated based on the curve's length to ensure better visual quality.
  * Adaptive draw works with `bezierCurveTo` and `quadraticCurveTo`.
  *
  * @static
  * @constant
  * @memberof PIXI
  * @name GRAPHICS_CURVES
  * @type {object}
  * @property {boolean} adaptive=false - flag indicating if the resolution should be adaptive
  * @property {number} maxLength=10 - maximal length of a single segment of the curve (if adaptive = false, ignored)
  * @property {number} minSegments=8 - minimal number of segments in the curve (if adaptive = false, ignored)
  * @property {number} maxSegments=2048 - maximal number of segments in the curve (if adaptive = false, ignored)
  */
@JSGlobal("PIXI.GRAPHICS_CURVES")
@js.native
object GRAPHICS_CURVES extends js.Object {
  var adaptive: Boolean = js.native
  var maxLength: Double = js.native
  var maxSegments: Double = js.native
  var minSegments: Double = js.native
}

