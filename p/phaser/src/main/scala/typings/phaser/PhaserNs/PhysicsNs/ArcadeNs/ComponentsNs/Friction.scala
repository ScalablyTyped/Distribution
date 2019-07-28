package typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the friction (e.g. the amount of velocity reduced over time) of the physics body when moving horizontally in the X axis. The higher than friction, the faster the body will slow down once force stops being applied to it.
  */
@js.native
trait Friction extends js.Object {
  /**
    * Sets the friction (e.g. the amount of velocity reduced over time) of the physics body when moving.
    * The higher than friction, the faster the body will slow down once force stops being applied to it.
    * @param x The amount of horizontal friction to apply.
    * @param y The amount of vertical friction to apply. Default x.
    */
  def setFriction(x: Double): this.type = js.native
  def setFriction(x: Double, y: Double): this.type = js.native
  /**
    * Sets the friction (e.g. the amount of velocity reduced over time) of the physics body when moving horizontally in the X axis.
    * The higher than friction, the faster the body will slow down once force stops being applied to it.
    * @param x The amount of friction to apply.
    */
  def setFrictionX(x: Double): this.type = js.native
  /**
    * Sets the friction (e.g. the amount of velocity reduced over time) of the physics body when moving vertically in the Y axis.
    * The higher than friction, the faster the body will slow down once force stops being applied to it.
    * @param x The amount of friction to apply.
    */
  def setFrictionY(x: Double): this.type = js.native
}

