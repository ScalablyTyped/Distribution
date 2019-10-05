package typings.phaser.Phaser.Physics.Impact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Impact.GetVelocity")
@js.native
object GetVelocity extends js.Object {
  /**
    * [description]
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    * @param vel [description]
    * @param accel [description]
    * @param friction [description]
    * @param max [description]
    */
  def apply(delta: Double, vel: Double, accel: Double, friction: Double, max: Double): Double = js.native
}

