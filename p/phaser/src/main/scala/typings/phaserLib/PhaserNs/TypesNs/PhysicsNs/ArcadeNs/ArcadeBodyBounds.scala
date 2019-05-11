package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcadeBodyBounds extends js.Object {
  /**
    * The lower edge.
    */
  var bottom: scala.Double
  /**
    * The right edge.
    */
  var right: scala.Double
  /**
    * The left edge.
    */
  var x: scala.Double
  /**
    * The upper edge.
    */
  var y: scala.Double
}

object ArcadeBodyBounds {
  @scala.inline
  def apply(bottom: scala.Double, right: scala.Double, x: scala.Double, y: scala.Double): ArcadeBodyBounds = {
    val __obj = js.Dynamic.literal(bottom = bottom, right = right, x = x, y = y)
  
    __obj.asInstanceOf[ArcadeBodyBounds]
  }
}

