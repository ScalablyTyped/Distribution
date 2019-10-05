package typings.phaser.Phaser.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Arcade.GetOverlapY")
@js.native
object GetOverlapY extends js.Object {
  /**
    * Calculates and returns the vertical overlap between two arcade physics bodies and sets their properties
    * accordingly, including: `touching.up`, `touching.down`, `touching.none` and `overlapY'.
    * @param body1 The first Body to separate.
    * @param body2 The second Body to separate.
    * @param overlapOnly Is this an overlap only check, or part of separation?
    * @param bias A value added to the delta values during collision checks. Increase it to prevent sprite tunneling(sprites passing through another instead of colliding).
    */
  def apply(body1: Body, body2: Body, overlapOnly: Boolean, bias: Double): Double = js.native
}

