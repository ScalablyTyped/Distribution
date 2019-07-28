package typings.phaser.PhaserNs.PhysicsNs.ImpactNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Body Scale component.
  * Should be applied as a mixin.
  */
@js.native
trait BodyScale extends js.Object {
  /**
    * Sets the scale of the physics body.
    * @param scaleX The horizontal scale of the body.
    * @param scaleY The vertical scale of the body. If not given, will use the horizontal scale value.
    */
  def setBodyScale(scaleX: Double): this.type = js.native
  def setBodyScale(scaleX: Double, scaleY: Double): this.type = js.native
  /**
    * Sets the size of the physics body.
    * @param width The width of the body in pixels.
    * @param height The height of the body in pixels. Default width.
    */
  def setBodySize(width: Double): this.type = js.native
  def setBodySize(width: Double, height: Double): this.type = js.native
}

