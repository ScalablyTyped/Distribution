package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Gravity component.
  * Should be applied as a mixin.
  */
trait Gravity extends js.Object {
  /**
    * [description]
    */
  var gravity: scala.Double
  /**
    * [description]
    * @param value [description]
    */
  def setGravity(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object Gravity {
  @scala.inline
  def apply(gravity: scala.Double, setGravity: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject): Gravity = {
    val __obj = js.Dynamic.literal(gravity = gravity, setGravity = js.Any.fromFunction1(setGravity))
  
    __obj.asInstanceOf[Gravity]
  }
}

