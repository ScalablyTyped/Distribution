package typings
package pixiDotJsLib.PIXINs.filtersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// pixi-filters.d.ts todo
// https://github.com/pixijs/pixi-filters/
@JSGlobal("PIXI.filters.NoiseFilter")
@js.native
class NoiseFilter ()
  extends pixiDotJsLib.PIXINs.Filter[NoiseFilterUniforms] {
  def this(noise: scala.Double) = this()
  def this(noise: scala.Double, seed: scala.Double) = this()
  var noise: scala.Double = js.native
  var seed: scala.Double = js.native
}

