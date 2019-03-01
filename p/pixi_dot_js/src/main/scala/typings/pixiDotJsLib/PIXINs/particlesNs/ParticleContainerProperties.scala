package typings
package pixiDotJsLib.PIXINs.particlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleContainerProperties extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[scala.Boolean] = js.undefined
  var rotation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * DEPRECIATED - Use `vertices`
    */
  var scale: js.UndefOr[scala.Boolean] = js.undefined
  var tint: js.UndefOr[scala.Boolean] = js.undefined
  var uvs: js.UndefOr[scala.Boolean] = js.undefined
  var vertices: js.UndefOr[scala.Boolean] = js.undefined
}

object ParticleContainerProperties {
  @scala.inline
  def apply(
    alpha: js.UndefOr[scala.Boolean] = js.undefined,
    position: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: js.UndefOr[scala.Boolean] = js.undefined,
    scale: js.UndefOr[scala.Boolean] = js.undefined,
    tint: js.UndefOr[scala.Boolean] = js.undefined,
    uvs: js.UndefOr[scala.Boolean] = js.undefined,
    vertices: js.UndefOr[scala.Boolean] = js.undefined
  ): ParticleContainerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation)
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale)
    if (!js.isUndefined(tint)) __obj.updateDynamic("tint")(tint)
    if (!js.isUndefined(uvs)) __obj.updateDynamic("uvs")(uvs)
    if (!js.isUndefined(vertices)) __obj.updateDynamic("vertices")(vertices)
    __obj.asInstanceOf[ParticleContainerProperties]
  }
}

