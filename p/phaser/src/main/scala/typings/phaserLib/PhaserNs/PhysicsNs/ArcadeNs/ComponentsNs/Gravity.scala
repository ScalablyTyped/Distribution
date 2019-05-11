package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods for setting the gravity properties of an Arcade Physics Game Object.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait Gravity extends js.Object {
  /**
    * Set the X and Y values of the gravitational pull to act upon this Arcade Physics Game Object. Values can be positive or negative. Larger values result in a stronger effect.
    * 
    * If only one value is provided, this value will be used for both the X and Y axis.
    * @param x The gravitational force to be applied to the X-axis.
    * @param y The gravitational force to be applied to the Y-axis. If this is not specified, the X value will be used. Default x.
    */
  def setGravity(x: scala.Double): this.type = js.native
  def setGravity(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Set the gravitational force to be applied to the X axis. Value can be positive or negative. Larger values result in a stronger effect.
    * @param x The gravitational force to be applied to the X-axis.
    */
  def setGravityX(x: scala.Double): this.type = js.native
  /**
    * Set the gravitational force to be applied to the Y axis. Value can be positive or negative. Larger values result in a stronger effect.
    * @param y The gravitational force to be applied to the Y-axis.
    */
  def setGravityY(y: scala.Double): this.type = js.native
}

