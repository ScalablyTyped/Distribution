package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
trait Sensor extends js.Object {
  /**
    * [description]
    */
  def isSensor(): Boolean
  /**
    * [description]
    * @param value [description]
    */
  def setSensor(value: Boolean): GameObject
}

object Sensor {
  @scala.inline
  def apply(isSensor: () => Boolean, setSensor: Boolean => GameObject): Sensor = {
    val __obj = js.Dynamic.literal(isSensor = js.Any.fromFunction0(isSensor), setSensor = js.Any.fromFunction1(setSensor))
  
    __obj.asInstanceOf[Sensor]
  }
}

