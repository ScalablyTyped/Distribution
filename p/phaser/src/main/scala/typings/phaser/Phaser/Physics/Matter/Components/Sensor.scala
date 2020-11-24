package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables a Matter-enabled Game Object to be a sensor. Should be used as a mixin and not directly.
  */
@js.native
trait Sensor extends js.Object {
  
  /**
    * Is the body belonging to this Game Object a sensor or not?
    */
  def isSensor(): Boolean = js.native
  
  /**
    * Set the body belonging to this Game Object to be a sensor.
    * Sensors trigger collision events, but don't react with colliding body physically.
    * @param value `true` to set the body as a sensor, or `false` to disable it.
    */
  def setSensor(value: Boolean): GameObject = js.native
}
object Sensor {
  
  @scala.inline
  def apply(isSensor: () => Boolean, setSensor: Boolean => GameObject): Sensor = {
    val __obj = js.Dynamic.literal(isSensor = js.Any.fromFunction0(isSensor), setSensor = js.Any.fromFunction1(setSensor))
    __obj.asInstanceOf[Sensor]
  }
  
  @scala.inline
  implicit class SensorOps[Self <: Sensor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsSensor(value: () => Boolean): Self = this.set("isSensor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSensor(value: Boolean => GameObject): Self = this.set("setSensor", js.Any.fromFunction1(value))
  }
}
