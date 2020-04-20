package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A component to manipulate world gravity for Matter.js bodies.
  */
trait Gravity extends js.Object {
  /**
    * A togglable function for ignoring world gravity in real-time on the current body.
    * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
    */
  def setIgnoreGravity(value: Boolean): GameObject
}

object Gravity {
  @scala.inline
  def apply(setIgnoreGravity: Boolean => GameObject): Gravity = {
    val __obj = js.Dynamic.literal(setIgnoreGravity = js.Any.fromFunction1(setIgnoreGravity))
    __obj.asInstanceOf[Gravity]
  }
}

