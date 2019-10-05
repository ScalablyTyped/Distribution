package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
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
  def setSleepEndEvent(value: Boolean): GameObject = js.native
  /**
    * [description]
    * @param start [description]
    * @param end [description]
    */
  def setSleepEvents(start: Boolean, end: Boolean): GameObject = js.native
  /**
    * [description]
    * @param value [description]
    */
  def setSleepStartEvent(value: Boolean): GameObject = js.native
  /**
    * [description]
    * @param value [description] Default 60.
    */
  def setSleepThreshold(): GameObject = js.native
  def setSleepThreshold(value: Double): GameObject = js.native
}

