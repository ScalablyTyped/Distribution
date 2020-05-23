package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GravityWellConfig extends js.Object {
  /**
    * The minimum distance for which the gravity force is calculated.
    */
  var epsilon: js.UndefOr[Double] = js.undefined
  /**
    * The gravitational force of this Gravity Well.
    */
  var gravity: js.UndefOr[Double] = js.undefined
  /**
    * The strength of the gravity force - larger numbers produce a stronger force.
    */
  var power: js.UndefOr[Double] = js.undefined
  /**
    * The x coordinate of the Gravity Well, in world space.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y coordinate of the Gravity Well, in world space.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object GravityWellConfig {
  @scala.inline
  def apply(
    epsilon: js.UndefOr[Double] = js.undefined,
    gravity: js.UndefOr[Double] = js.undefined,
    power: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): GravityWellConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(epsilon)) __obj.updateDynamic("epsilon")(epsilon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gravity)) __obj.updateDynamic("gravity")(gravity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(power)) __obj.updateDynamic("power")(power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GravityWellConfig]
  }
}

