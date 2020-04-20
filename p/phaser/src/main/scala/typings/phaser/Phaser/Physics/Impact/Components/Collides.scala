package typings.phaser.Phaser.Physics.Impact.Components

import typings.phaser.CollideCallback
import typings.phaser.Phaser.GameObjects.GameObject
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
  var collides: Double
  /**
    * [description]
    */
  def setActiveCollision(): GameObject
  /**
    * [description]
    * @param callback [description]
    * @param scope [description]
    */
  def setCollideCallback(callback: CollideCallback, scope: js.Any): GameObject
  /**
    * [description]
    */
  def setCollidesNever(): GameObject
  /**
    * [description]
    */
  def setFixedCollision(): GameObject
  /**
    * [description]
    */
  def setLiteCollision(): GameObject
  /**
    * [description]
    */
  def setPassiveCollision(): GameObject
}

object Collides {
  @scala.inline
  def apply(
    collides: Double,
    setActiveCollision: () => GameObject,
    setCollideCallback: (CollideCallback, js.Any) => GameObject,
    setCollidesNever: () => GameObject,
    setFixedCollision: () => GameObject,
    setLiteCollision: () => GameObject,
    setPassiveCollision: () => GameObject
  ): Collides = {
    val __obj = js.Dynamic.literal(collides = collides.asInstanceOf[js.Any], setActiveCollision = js.Any.fromFunction0(setActiveCollision), setCollideCallback = js.Any.fromFunction2(setCollideCallback), setCollidesNever = js.Any.fromFunction0(setCollidesNever), setFixedCollision = js.Any.fromFunction0(setFixedCollision), setLiteCollision = js.Any.fromFunction0(setLiteCollision), setPassiveCollision = js.Any.fromFunction0(setPassiveCollision))
    __obj.asInstanceOf[Collides]
  }
}

