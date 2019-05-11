package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcadeBodyCollision extends js.Object {
  /**
    * True if the Body is colliding on its lower edge.
    */
  var down: scala.Boolean
  /**
    * True if the Body is colliding on its left edge.
    */
  var left: scala.Boolean
  /**
    * True if the Body is not colliding.
    */
  var none: scala.Boolean
  /**
    * True if the Body is colliding on its right edge.
    */
  var right: scala.Boolean
  /**
    * True if the Body is colliding on its upper edge.
    */
  var up: scala.Boolean
}

object ArcadeBodyCollision {
  @scala.inline
  def apply(
    down: scala.Boolean,
    left: scala.Boolean,
    none: scala.Boolean,
    right: scala.Boolean,
    up: scala.Boolean
  ): ArcadeBodyCollision = {
    val __obj = js.Dynamic.literal(down = down, left = left, none = none, right = right, up = up)
  
    __obj.asInstanceOf[ArcadeBodyCollision]
  }
}

