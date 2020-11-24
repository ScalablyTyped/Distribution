package typings.phaser.Phaser.Physics.Arcade.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods used for setting the bounce properties of an Arcade Physics Body.
  */
@js.native
trait Bounce extends js.Object {
  
  /**
    * Sets the bounce values of this body.
    * 
    * Bounce is the amount of restitution, or elasticity, the body has when it collides with another object.
    * A value of 1 means that it will retain its full velocity after the rebound. A value of 0 means it will not rebound at all.
    * @param x The amount of horizontal bounce to apply on collision. A float, typically between 0 and 1.
    * @param y The amount of vertical bounce to apply on collision. A float, typically between 0 and 1. Default x.
    */
  def setBounce(x: Double): this.type = js.native
  def setBounce(x: Double, y: Double): this.type = js.native
  
  /**
    * Sets the horizontal bounce value for this body.
    * @param value The amount of horizontal bounce to apply on collision. A float, typically between 0 and 1.
    */
  def setBounceX(value: Double): this.type = js.native
  
  /**
    * Sets the vertical bounce value for this body.
    * @param value The amount of vertical bounce to apply on collision. A float, typically between 0 and 1.
    */
  def setBounceY(value: Double): this.type = js.native
  
  /**
    * Sets whether this Body collides with the world boundary.
    * 
    * Optionally also sets the World Bounce values. If the `Body.worldBounce` is null, it's set to a new Phaser.Math.Vector2 first.
    * @param value `true` if this body should collide with the world bounds, otherwise `false`. Default true.
    * @param bounceX If given this will be replace the `worldBounce.x` value.
    * @param bounceY If given this will be replace the `worldBounce.y` value.
    */
  def setCollideWorldBounds(): this.type = js.native
  def setCollideWorldBounds(value: js.UndefOr[scala.Nothing], bounceX: js.UndefOr[scala.Nothing], bounceY: Double): this.type = js.native
  def setCollideWorldBounds(value: js.UndefOr[scala.Nothing], bounceX: Double): this.type = js.native
  def setCollideWorldBounds(value: js.UndefOr[scala.Nothing], bounceX: Double, bounceY: Double): this.type = js.native
  def setCollideWorldBounds(value: Boolean): this.type = js.native
  def setCollideWorldBounds(value: Boolean, bounceX: js.UndefOr[scala.Nothing], bounceY: Double): this.type = js.native
  def setCollideWorldBounds(value: Boolean, bounceX: Double): this.type = js.native
  def setCollideWorldBounds(value: Boolean, bounceX: Double, bounceY: Double): this.type = js.native
}
