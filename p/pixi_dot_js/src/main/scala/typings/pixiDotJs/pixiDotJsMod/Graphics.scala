package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.Anon_Adaptive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Graphics class contains methods used to draw primitive shapes such as lines, circles and
  * rectangles to the display, and to color and fill them.
  */
@JSImport("pixi.js", "Graphics")
@js.native
class Graphics ()
  extends typings.pixiDotJs.PIXI.Graphics {
  def this(nativeLines: Boolean) = this()
}

/* static members */
@JSImport("pixi.js", "Graphics")
@js.native
object Graphics extends js.Object {
  /**
    * Graphics curves resolution settings. If `adaptive` flag is set to `true`,
    * the resolution is calculated based on the curve"s length to ensure better visual quality.
    * Adaptive draw works with `bezierCurveTo` and `quadraticCurveTo`.
    *
    * @property {boolean} adaptive=false - flag indicating if the resolution should be adaptive
    * @property {number} maxLength=10 - maximal length of a single segment of the curve (if adaptive = false, ignored)
    * @property {number} minSegments=8 - minimal number of segments in the curve (if adaptive = false, ignored)
    * @property {number} maxSegments=2048 - maximal number of segments in the curve (if adaptive = false, ignored)
    */
  var CURVES: Anon_Adaptive = js.native
  var _SPRITE_TEXTURE: typings.pixiDotJs.PIXI.Texture = js.native
}

