package typings.pixiDotJs.PIXI.filters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoiseFilterUniforms extends js.Object {
  var uNoise: Double
  var uSeed: Double
}

object NoiseFilterUniforms {
  @scala.inline
  def apply(uNoise: Double, uSeed: Double): NoiseFilterUniforms = {
    val __obj = js.Dynamic.literal(uNoise = uNoise, uSeed = uSeed)
  
    __obj.asInstanceOf[NoiseFilterUniforms]
  }
}

