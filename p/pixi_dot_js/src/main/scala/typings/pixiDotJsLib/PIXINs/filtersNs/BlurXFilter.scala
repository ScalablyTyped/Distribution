package typings
package pixiDotJsLib.PIXINs.filtersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.filters.BlurXFilter")
@js.native
class BlurXFilter ()
  extends pixiDotJsLib.PIXINs.Filter[BlurXFilterUniforms] {
  def this(strength: scala.Double) = this()
  def this(strength: scala.Double, quality: scala.Double) = this()
  def this(strength: scala.Double, quality: scala.Double, resolution: scala.Double) = this()
  def this(strength: scala.Double, quality: scala.Double, resolution: scala.Double, kernelSize: scala.Double) = this()
  var _quality: scala.Double = js.native
  var blur: scala.Double = js.native
  var firstRun: scala.Boolean = js.native
  var passes: scala.Double = js.native
  var quality: scala.Double = js.native
  var strength: scala.Double = js.native
}

