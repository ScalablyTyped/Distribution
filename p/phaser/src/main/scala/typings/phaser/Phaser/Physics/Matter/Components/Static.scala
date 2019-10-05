package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
trait Static extends js.Object {
  /**
    * [description]
    */
  def isStatic(): Boolean
  /**
    * [description]
    * @param value [description]
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

