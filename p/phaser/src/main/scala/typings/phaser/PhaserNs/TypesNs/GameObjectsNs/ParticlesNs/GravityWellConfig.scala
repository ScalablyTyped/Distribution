package typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

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
    epsilon: Int | Double = null,
    gravity: Int | Double = null,
    power: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): GravityWellConfig = {
    val __obj = js.Dynamic.literal()
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (power != null) __obj.updateDynamic("power")(power.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GravityWellConfig]
  }
}

