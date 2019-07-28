package typings.phaser.PhaserNs.TypesNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcadeBodyBounds extends js.Object {
  /**
    * The lower edge.
    */
  var bottom: Double
  /**
    * The right edge.
    */
  var right: Double
  /**
    * The left edge.
    */
  var x: Double
  /**
    * The upper edge.
    */
  var y: Double
}

object ArcadeBodyBounds {
  @scala.inline
  def apply(bottom: Double, right: Double, x: Double, y: Double): ArcadeBodyBounds = {
    val __obj = js.Dynamic.literal(bottom = bottom, right = right, x = x, y = y)
  
    __obj.asInstanceOf[ArcadeBodyBounds]
  }
}

