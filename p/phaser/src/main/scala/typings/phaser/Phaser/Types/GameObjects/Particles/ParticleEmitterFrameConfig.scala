package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterFrameConfig extends js.Object {
  /**
    * Whether texture frames will be assigned consecutively (true) or at random (false).
    */
  var cycle: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more texture frames.
    */
  var frames: js.UndefOr[Double | (js.Array[Double | Frame | String]) | String | Frame] = js.undefined
  /**
    * The number of consecutive particles receiving each texture frame, when `cycle` is true.
    */
  var quantity: js.UndefOr[integer] = js.undefined
}

object ParticleEmitterFrameConfig {
  @scala.inline
  def apply(
    cycle: js.UndefOr[Boolean] = js.undefined,
    frames: Double | (js.Array[Double | Frame | String]) | String | Frame = null,
    quantity: Int | Double = null
  ): ParticleEmitterFrameConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cycle)) __obj.updateDynamic("cycle")(cycle)
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterFrameConfig]
  }
}

