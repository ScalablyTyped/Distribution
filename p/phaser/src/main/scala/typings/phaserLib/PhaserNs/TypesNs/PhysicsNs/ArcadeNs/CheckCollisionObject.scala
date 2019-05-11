package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckCollisionObject extends js.Object {
  /**
    * Will bodies collide with the bottom side of the world bounds?
    */
  var down: scala.Boolean
  /**
    * Will bodies collide with the left side of the world bounds?
    */
  var left: scala.Boolean
  /**
    * Will bodies collide with the right side of the world bounds?
    */
  var right: scala.Boolean
  /**
    * Will bodies collide with the top side of the world bounds?
    */
  var up: scala.Boolean
}

object CheckCollisionObject {
  @scala.inline
  def apply(down: scala.Boolean, left: scala.Boolean, right: scala.Boolean, up: scala.Boolean): CheckCollisionObject = {
    val __obj = js.Dynamic.literal(down = down, left = left, right = right, up = up)
  
    __obj.asInstanceOf[CheckCollisionObject]
  }
}

