package typings.phaser.Phaser.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Arcade.SeparateX")
@js.native
object SeparateX extends js.Object {
  /**
    * Separates two overlapping bodies on the X-axis (horizontally).
    * 
    * Separation involves moving two overlapping bodies so they don't overlap anymore and adjusting their velocities based on their mass. This is a core part of collision detection.
    * 
    * The bodies won't be separated if there is no horizontal overlap between them, if they are static, or if either one uses custom logic for its separation.
    * @param body1 The first Body to separate.
    * @param body2 The second Body to separate.
    * @param overlapOnly If `true`, the bodies will only have their overlap data set and no separation will take place.
    * @param bias A value to add to the delta value during overlap checking. Used to prevent sprite tunneling.
    */
  def apply(body1: Body, body2: Body, overlapOnly: Boolean, bias: Double): Boolean = js.native
}

