package typings.phaser.Phaser.Physics.Impact.Components

import typings.phaser.Phaser.GameObjects.GameObject
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
  var gravity: Double
  /**
    * [description]
    * @param value [description]
    */
  def setGravity(value: Double): GameObject
}

object Gravity {
  @scala.inline
  def apply(gravity: Double, setGravity: Double => GameObject): Gravity = {
    val __obj = js.Dynamic.literal(gravity = gravity.asInstanceOf[js.Any], setGravity = js.Any.fromFunction1(setGravity))
  
    __obj.asInstanceOf[Gravity]
  }
}

