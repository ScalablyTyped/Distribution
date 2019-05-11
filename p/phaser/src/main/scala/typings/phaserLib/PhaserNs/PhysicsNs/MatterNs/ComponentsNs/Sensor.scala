package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

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
  def isSensor(): scala.Boolean
  /**
    * [description]
    * @param value [description]
    */
  def setSensor(value: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object Sensor {
  @scala.inline
  def apply(
    isSensor: () => scala.Boolean,
    setSensor: scala.Boolean => phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Sensor = {
    val __obj = js.Dynamic.literal(isSensor = js.Any.fromFunction0(isSensor), setSensor = js.Any.fromFunction1(setSensor))
  
    __obj.asInstanceOf[Sensor]
  }
}

