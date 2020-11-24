package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.Math.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods used for getting and setting the position, scale and rotation of a Game Object.
  */
@js.native
trait Transform extends js.Object {
  
  /**
    * Use `angle` to set or get rotation of the physics body associated to this GameObject.
    * Unlike rotation, when using set the value can be in degrees, which will be converted to radians internally.
    */
  var angle: Double = js.native
  
  /**
    * Use `rotation` to set or get the rotation of the physics body associated with this GameObject.
    * The value when set must be in radians.
    */
  var rotation: Double = js.native
  
  /**
    * The horizontal scale of this Game Object.
    */
  var scaleX: Double = js.native
  
  /**
    * The vertical scale of this Game Object.
    */
  var scaleY: Double = js.native
  
  /**
    * Immediately sets the angle of the Body.
    * Angular velocity, position, force etc. are unchanged.
    * @param degrees The angle to set, in degrees. Default 0.
    */
  def setAngle(): this.type = js.native
  def setAngle(degrees: Double): this.type = js.native
  
  /**
    * Setting fixed rotation sets the Body inertia to Infinity, which stops it
    * from being able to rotate when forces are applied to it.
    */
  def setFixedRotation(): this.type = js.native
  
  /**
    * Sets the position of the physics body along x and y axes.
    * Both the parameters to this function are optional and if not passed any they default to 0.
    * Velocity, angle, force etc. are unchanged.
    * @param x The horizontal position of the body. Default 0.
    * @param y The vertical position of the body. Default x.
    */
  def setPosition(): this.type = js.native
  def setPosition(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def setPosition(x: Double): this.type = js.native
  def setPosition(x: Double, y: Double): this.type = js.native
  
  /**
    * Immediately sets the angle of the Body.
    * Angular velocity, position, force etc. are unchanged.
    * @param radians The angle of the body, in radians. Default 0.
    */
  def setRotation(): this.type = js.native
  def setRotation(radians: Double): this.type = js.native
  
  /**
    * Sets the scale of this Game Object.
    * @param x The horizontal scale of this Game Object. Default 1.
    * @param y The vertical scale of this Game Object. If not set it will use the x value. Default x.
    * @param point The point (Vector2) from which scaling will occur.
    */
  def setScale(): this.type = js.native
  def setScale(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], point: Vector2): this.type = js.native
  def setScale(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def setScale(x: js.UndefOr[scala.Nothing], y: Double, point: Vector2): this.type = js.native
  def setScale(x: Double): this.type = js.native
  def setScale(x: Double, y: js.UndefOr[scala.Nothing], point: Vector2): this.type = js.native
  def setScale(x: Double, y: Double): this.type = js.native
  def setScale(x: Double, y: Double, point: Vector2): this.type = js.native
  
  /**
    * The x position of this Game Object.
    */
  var x: Double = js.native
  
  /**
    * The y position of this Game Object.
    */
  var y: Double = js.native
}
