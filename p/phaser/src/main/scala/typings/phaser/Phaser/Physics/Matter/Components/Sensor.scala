package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables a Matter-enabled Game Object to be a sensor. Should be used as a mixin and not directly.
  */
trait Sensor extends js.Object {
  /**
    * Is the body belonging to this Game Object a sensor or not?
    */
  def isSensor(): Boolean
  /**
    * Set the body belonging to this Game Object to be a sensor.
    * Sensors trigger collision events, but don't react with colliding body physically.
    * @param value `true` to set the body as a sensor, or `false` to disable it.
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

