package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods for setting the size of an Arcade Physics Game Object.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait Size extends js.Object {
  /**
    * Sets this physics body to use a circle for collision instead of a rectangle.
    * @param radius The radius of the physics body, in pixels.
    * @param offsetX The amount to offset the body from the parent Game Object along the x-axis.
    * @param offsetY The amount to offset the body from the parent Game Object along the y-axis.
    */
  def setCircle(radius: scala.Double): this.type = js.native
  def setCircle(radius: scala.Double, offsetX: scala.Double): this.type = js.native
  def setCircle(radius: scala.Double, offsetX: scala.Double, offsetY: scala.Double): this.type = js.native
  /**
    * Sets the body offset. This allows you to adjust the difference between the center of the body
    * and the x and y coordinates of the parent Game Object.
    * @param x The amount to offset the body from the parent Game Object along the x-axis.
    * @param y The amount to offset the body from the parent Game Object along the y-axis. Defaults to the value given for the x-axis. Default x.
    */
  def setOffset(x: scala.Double): this.type = js.native
  def setOffset(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the size of this physics body. Setting the size does not adjust the dimensions
    * of the parent Game Object.
    * @param width The new width of the physics body, in pixels.
    * @param height The new height of the physics body, in pixels.
    * @param center Should the body be re-positioned so its center aligns with the parent Game Object? Default true.
    */
  def setSize(width: scala.Double, height: scala.Double): this.type = js.native
  def setSize(width: scala.Double, height: scala.Double, center: scala.Boolean): this.type = js.native
}

