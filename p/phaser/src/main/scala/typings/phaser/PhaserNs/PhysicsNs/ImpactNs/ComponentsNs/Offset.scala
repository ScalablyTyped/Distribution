package typings.phaser.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Offset component.
  * Should be applied as a mixin.
  */
@js.native
trait Offset extends js.Object {
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    * @param width [description]
    * @param height [description]
    */
  def setOffset(x: Double, y: Double): GameObject = js.native
  def setOffset(x: Double, y: Double, width: Double): GameObject = js.native
  def setOffset(x: Double, y: Double, width: Double, height: Double): GameObject = js.native
}

