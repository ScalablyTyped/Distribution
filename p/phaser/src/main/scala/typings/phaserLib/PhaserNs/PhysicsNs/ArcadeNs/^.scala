package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Arcade")
@js.native
object ^ extends js.Object {
  /**
    * Dynamic Body.
    */
  var DYNAMIC_BODY: scala.Double = js.native
  /**
    * Facing down.
    */
  var FACING_DOWN: scala.Double = js.native
  /**
    * Facing left.
    */
  var FACING_LEFT: scala.Double = js.native
  /**
    * Facing no direction (initial value).
    */
  var FACING_NONE: scala.Double = js.native
  /**
    * Facing right.
    */
  var FACING_RIGHT: scala.Double = js.native
  /**
    * Facing up.
    */
  var FACING_UP: scala.Double = js.native
  /**
    * Arcade Physics Group containing Dynamic Bodies.
    */
  var GROUP: scala.Double = js.native
  /**
    * Static Body.
    */
  var STATIC_BODY: scala.Double = js.native
  /**
    * A Tilemap Layer.
    */
  var TILEMAPLAYER: scala.Double = js.native
  /**
    * Calculates and returns the horizontal overlap between two arcade physics bodies and sets their properties
    * accordingly, including: `touching.left`, `touching.right`, `touching.none` and `overlapX'.
    * @param body1 The first Body to separate.
    * @param body2 The second Body to separate.
    * @param overlapOnly Is this an overlap only check, or part of separation?
    * @param bias A value added to the delta values during collision checks. Increase it to prevent sprite tunneling(sprites passing through another instead of colliding).
    */
  def GetOverlapX(body1: Body, body2: Body, overlapOnly: scala.Boolean, bias: scala.Double): scala.Double = js.native
  /**
    * Calculates and returns the vertical overlap between two arcade physics bodies and sets their properties
    * accordingly, including: `touching.up`, `touching.down`, `touching.none` and `overlapY'.
    * @param body1 The first Body to separate.
    * @param body2 The second Body to separate.
    * @param overlapOnly Is this an overlap only check, or part of separation?
    * @param bias A value added to the delta values during collision checks. Increase it to prevent sprite tunneling(sprites passing through another instead of colliding).
    */
  def GetOverlapY(body1: Body, body2: Body, overlapOnly: scala.Boolean, bias: scala.Double): scala.Double = js.native
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
  def SeparateX(body1: Body, body2: Body, overlapOnly: scala.Boolean, bias: scala.Double): scala.Boolean = js.native
  /**
    * Separates two overlapping bodies on the Y-axis (vertically).
    * 
    * Separation involves moving two overlapping bodies so they don't overlap anymore and adjusting their velocities based on their mass. This is a core part of collision detection.
    * 
    * The bodies won't be separated if there is no vertical overlap between them, if they are static, or if either one uses custom logic for its separation.
    * @param body1 The first Body to separate.
    * @param body2 The second Body to separate.
    * @param overlapOnly If `true`, the bodies will only have their overlap data set and no separation will take place.
    * @param bias A value to add to the delta value during overlap checking. Used to prevent sprite tunneling.
    */
  def SeparateY(body1: Body, body2: Body, overlapOnly: scala.Boolean, bias: scala.Double): scala.Boolean = js.native
}

