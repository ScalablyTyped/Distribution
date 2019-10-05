package typings.phaser.Phaser.Physics.Impact.Components

import typings.phaser.Phaser.GameObjects.GameObject
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
  def setGameObject(gameObject: GameObject): GameObject = js.native
  def setGameObject(gameObject: GameObject, sync: Boolean): GameObject = js.native
  /**
    * [description]
    */
  def syncGameObject(): GameObject = js.native
}

