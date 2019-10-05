package typings.pixiDotJs.PIXI.filters

import typings.pixiDotJs.PIXI.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.filters.BlurFilter")
@js.native
class BlurFilter ()
  extends Filter[js.Object] {
  def this(strength: Double) = this()
  def this(strength: Double, quality: Double) = this()
  def this(strength: Double, quality: Double, resolution: Double) = this()
  def this(strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
  var blur: Double = js.native
  var blurX: Double = js.native
  var blurXFilter: BlurXFilter = js.native
  var blurY: Double = js.native
  var blurYFilter: BlurYFilter = js.native
  var passes: Double = js.native
  var quality: Double = js.native
}

