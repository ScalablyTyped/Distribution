package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@js.native
trait Sleep extends js.Object {
  /**
    * [description]
    * @param value [description]
    */
  def setSleepEndEvent(value: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param start [description]
    * @param end [description]
    */
  def setSleepEvents(start: scala.Boolean, end: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param value [description]
    */
  def setSleepStartEvent(value: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param value [description] Default 60.
    */
  def setSleepThreshold(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setSleepThreshold(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
}

