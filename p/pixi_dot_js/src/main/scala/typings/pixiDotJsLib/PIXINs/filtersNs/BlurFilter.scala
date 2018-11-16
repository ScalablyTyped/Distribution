package typings
package pixiDotJsLib.PIXINs.filtersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.filters.BlurFilter")
@js.native
class BlurFilter ()
  extends pixiDotJsLib.PIXINs.Filter[js.Object] {
  def this(strength: scala.Double) = this()
  def this(strength: scala.Double, quality: scala.Double) = this()
  def this(strength: scala.Double, quality: scala.Double, resolution: scala.Double) = this()
  def this(strength: scala.Double, quality: scala.Double, resolution: scala.Double, kernelSize: scala.Double) = this()
  var blur: scala.Double = js.native
  var blurX: scala.Double = js.native
  var blurXFilter: BlurXFilter = js.native
  var blurY: scala.Double = js.native
  var blurYFilter: BlurYFilter = js.native
  var passes: scala.Double = js.native
  var quality: scala.Double = js.native
}

