package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Collides component.
  * Should be applied as a mixin.
  */
trait Collides extends js.Object {
  /**
    * [description]
    */
  var collides: scala.Double
  /**
    * [description]
    */
  def setActiveCollision(): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    * @param callback [description]
    * @param scope [description]
    */
  def setCollideCallback(callback: phaserLib.CollideCallback, scope: js.Any): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    */
  def setCollidesNever(): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    */
  def setFixedCollision(): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    */
  def setLiteCollision(): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * [description]
    */
  def setPassiveCollision(): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object Collides {
  @scala.inline
  def apply(
    collides: scala.Double,
    setActiveCollision: () => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setCollideCallback: (phaserLib.CollideCallback, js.Any) => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setCollidesNever: () => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setFixedCollision: () => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setLiteCollision: () => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setPassiveCollision: () => phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Collides = {
    val __obj = js.Dynamic.literal(collides = collides, setActiveCollision = js.Any.fromFunction0(setActiveCollision), setCollideCallback = js.Any.fromFunction2(setCollideCallback), setCollidesNever = js.Any.fromFunction0(setCollidesNever), setFixedCollision = js.Any.fromFunction0(setFixedCollision), setLiteCollision = js.Any.fromFunction0(setLiteCollision), setPassiveCollision = js.Any.fromFunction0(setPassiveCollision))
  
    __obj.asInstanceOf[Collides]
  }
}

