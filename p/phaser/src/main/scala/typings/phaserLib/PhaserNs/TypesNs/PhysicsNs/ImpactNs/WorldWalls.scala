package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldWalls extends js.Object {
  /**
    * The bottom wall of the world bounds.
    */
  var bottom: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body
  /**
    * The left-side wall of the world bounds.
    */
  var left: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body
  /**
    * The right-side wall of the world bounds.
    */
  var right: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body
  /**
    * The top wall of the world bounds.
    */
  var top: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body
}

object WorldWalls {
  @scala.inline
  def apply(
    bottom: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body,
    left: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body,
    right: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body,
    top: phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body
  ): WorldWalls = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[WorldWalls]
  }
}

