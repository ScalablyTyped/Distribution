package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object GRAPHICS_CURVES {
  
  @JSImport("pixi.js", "GRAPHICS_CURVES")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi.js", "GRAPHICS_CURVES.adaptive")
  @js.native
  def adaptive: Boolean = js.native
  @scala.inline
  def adaptive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adaptive")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "GRAPHICS_CURVES.maxLength")
  @js.native
  def maxLength: Double = js.native
  @scala.inline
  def maxLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "GRAPHICS_CURVES.maxSegments")
  @js.native
  def maxSegments: Double = js.native
  @scala.inline
  def maxSegments_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSegments")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "GRAPHICS_CURVES.minSegments")
  @js.native
  def minSegments: Double = js.native
  @scala.inline
  def minSegments_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minSegments")(x.asInstanceOf[js.Any])
}
