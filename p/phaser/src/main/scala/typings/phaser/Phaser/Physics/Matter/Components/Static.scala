package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for getting and setting the static state of a physics body.
  */
trait Static extends js.Object {
  /**
    * Returns `true` if the body is static, otherwise `false` for a dynamic body.
    */
  def isStatic(): Boolean
  /**
    * Changes the physics body to be either static `true` or dynamic `false`.
    * @param value `true` to set the body as being static, or `false` to make it dynamic.
    */
  def setStatic(value: Boolean): GameObject
}

object Static {
  @scala.inline
  def apply(isStatic: () => Boolean, setStatic: Boolean => GameObject): Static = {
    val __obj = js.Dynamic.literal(isStatic = js.Any.fromFunction0(isStatic), setStatic = js.Any.fromFunction1(setStatic))
  
    __obj.asInstanceOf[Static]
  }
}

