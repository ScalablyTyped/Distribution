package typings
package pixiDotJsLib.PIXINs.filtersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoiseFilterUniforms extends js.Object {
  var uNoise: scala.Double
  var uSeed: scala.Double
}

object NoiseFilterUniforms {
  @scala.inline
  def apply(uNoise: scala.Double, uSeed: scala.Double): NoiseFilterUniforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uNoise")(uNoise)
    __obj.updateDynamic("uSeed")(uSeed)
    __obj.asInstanceOf[NoiseFilterUniforms]
  }
}

