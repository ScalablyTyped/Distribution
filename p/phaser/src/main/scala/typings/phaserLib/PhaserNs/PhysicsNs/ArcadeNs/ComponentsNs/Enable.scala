package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the enable properties of an Arcade Physics Body.
  */
@js.native
trait Enable extends js.Object {
  /**
    * Stops and disables this Game Object's Body.
    * @param disableGameObject Also deactivate this Game Object. Default false.
    * @param hideGameObject Also hide this Game Object. Default false.
    */
  def disableBody(): this.type = js.native
  def disableBody(disableGameObject: scala.Boolean): this.type = js.native
  def disableBody(disableGameObject: scala.Boolean, hideGameObject: scala.Boolean): this.type = js.native
  /**
    * Enables this Game Object's Body.
    * @param reset Also reset the Body and place it at (x, y).
    * @param x The horizontal position to place the Game Object and Body.
    * @param y The horizontal position to place the Game Object and Body.
    * @param enableGameObject Also activate this Game Object.
    * @param showGameObject Also show this Game Object.
    */
  def enableBody(
    reset: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    enableGameObject: scala.Boolean,
    showGameObject: scala.Boolean
  ): this.type = js.native
  /**
    * Syncs the Body's position and size with its parent Game Object.
    * You don't need to call this for Dynamic Bodies, as it happens automatically.
    * But for Static bodies it's a useful way of modifying the position of a Static Body
    * in the Physics World, based on its Game Object.
    */
  def refreshBody(): this.type = js.native
}

