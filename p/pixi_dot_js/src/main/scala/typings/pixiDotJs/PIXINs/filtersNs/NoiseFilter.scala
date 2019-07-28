package typings.pixiDotJs.PIXINs.filtersNs

import typings.pixiDotJs.PIXINs.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// pixi-filters.d.ts todo
// https://github.com/pixijs/pixi-filters/
@JSGlobal("PIXI.filters.NoiseFilter")
@js.native
class NoiseFilter () extends Filter[NoiseFilterUniforms] {
  def this(noise: Double) = this()
  def this(noise: Double, seed: Double) = this()
  var noise: Double = js.native
  var seed: Double = js.native
}

