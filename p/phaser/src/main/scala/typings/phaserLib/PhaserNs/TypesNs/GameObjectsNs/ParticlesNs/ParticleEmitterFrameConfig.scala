package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterFrameConfig extends js.Object {
  /**
    * Whether texture frames will be assigned consecutively (true) or at random (false).
    */
  var cycle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * One or more texture frames.
    */
  var frames: js.UndefOr[
    scala.Double | (js.Array[scala.Double | phaserLib.PhaserNs.TexturesNs.Frame | java.lang.String]) | java.lang.String | phaserLib.PhaserNs.TexturesNs.Frame
  ] = js.undefined
  /**
    * The number of consecutive particles receiving each texture frame, when `cycle` is true.
    */
  var quantity: js.UndefOr[phaserLib.integer] = js.undefined
}

object ParticleEmitterFrameConfig {
  @scala.inline
  def apply(
    cycle: js.UndefOr[scala.Boolean] = js.undefined,
    frames: scala.Double | (js.Array[scala.Double | phaserLib.PhaserNs.TexturesNs.Frame | java.lang.String]) | java.lang.String | phaserLib.PhaserNs.TexturesNs.Frame = null,
    quantity: js.UndefOr[phaserLib.integer] = js.undefined
  ): ParticleEmitterFrameConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle)
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity)
    __obj.asInstanceOf[ParticleEmitterFrameConfig]
  }
}

