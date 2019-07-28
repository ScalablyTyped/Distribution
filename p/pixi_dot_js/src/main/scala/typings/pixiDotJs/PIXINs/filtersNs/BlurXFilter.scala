package typings.pixiDotJs.PIXINs.filtersNs

import typings.pixiDotJs.PIXINs.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.filters.BlurXFilter")
@js.native
class BlurXFilter () extends Filter[BlurXFilterUniforms] {
  def this(strength: Double) = this()
  def this(strength: Double, quality: Double) = this()
  def this(strength: Double, quality: Double, resolution: Double) = this()
  def this(strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
  var _quality: Double = js.native
  var blur: Double = js.native
  var firstRun: Boolean = js.native
  var passes: Double = js.native
  var quality: Double = js.native
  var strength: Double = js.native
}

