package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Friction component.
  * Should be applied as a mixin.
  */
trait Friction extends js.Object {
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  def setFriction(x: scala.Double, y: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    * @param x [description]
    */
  def setFrictionX(x: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    * @param y [description]
    */
  def setFrictionY(y: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object Friction {
  @scala.inline
  def apply(
    setFriction: (scala.Double, scala.Double) => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setFrictionX: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setFrictionY: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Friction = {
    val __obj = js.Dynamic.literal(setFriction = js.Any.fromFunction2(setFriction), setFrictionX = js.Any.fromFunction1(setFrictionX), setFrictionY = js.Any.fromFunction1(setFrictionY))
  
    __obj.asInstanceOf[Friction]
  }
}

