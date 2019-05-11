package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Set Game Object component.
  * Should be applied as a mixin.
  */
@js.native
trait SetGameObject extends js.Object {
  /**
    * [description]
    * @param gameObject [description]
    * @param sync [description] Default true.
    */
  def setGameObject(gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setGameObject(gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject, sync: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    */
  def syncGameObject(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
}

