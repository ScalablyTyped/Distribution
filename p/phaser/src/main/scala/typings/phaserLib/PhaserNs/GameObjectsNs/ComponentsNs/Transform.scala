package typings
package phaserLib.PhaserNs.GameObjectsNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for getting and setting the position, scale and rotation of a Game Object.
  */
@js.native
trait Transform extends js.Object {
  /**
    * The angle of this Game Object as expressed in degrees.
    * 
    * Where 0 is to the right, 90 is down, 180 is left.
    * 
    * If you prefer to work in radians, see the `rotation` property instead.
    */
  var angle: phaserLib.integer = js.native
  /**
    * The angle of this Game Object in radians.
    * 
    * If you prefer to work in degrees, see the `angle` property instead.
    */
  var rotation: scala.Double = js.native
  /**
    * This is a special setter that allows you to set both the horizontal and vertical scale of this Game Object
    * to the same value, at the same time. When reading this value the result returned is `(scaleX + scaleY) / 2`.
    * 
    * Use of this property implies you wish the horizontal and vertical scales to be equal to each other. If this
    * isn't the case, use the `scaleX` or `scaleY` properties instead.
    */
  var scale: scala.Double = js.native
  /**
    * The horizontal scale of this Game Object.
    */
  var scaleX: scala.Double = js.native
  /**
    * The vertical scale of this Game Object.
    */
  var scaleY: scala.Double = js.native
  /**
    * The w position of this Game Object.
    */
  var w: scala.Double = js.native
  /**
    * The x position of this Game Object.
    */
  var x: scala.Double = js.native
  /**
    * The y position of this Game Object.
    */
  var y: scala.Double = js.native
  /**
    * The z position of this Game Object.
    * Note: Do not use this value to set the z-index, instead see the `depth` property.
    */
  var z: scala.Double = js.native
  /**
    * Gets the local transform matrix for this Game Object.
    * @param tempMatrix The matrix to populate with the values from this Game Object.
    */
  def getLocalTransformMatrix(): TransformMatrix = js.native
  def getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix = js.native
  /**
    * Gets the sum total rotation of all of this Game Objects parent Containers.
    * 
    * The returned value is in radians and will be zero if this Game Object has no parent container.
    */
  def getParentRotation(): scala.Double = js.native
  /**
    * Gets the world transform matrix for this Game Object, factoring in any parent Containers.
    * @param tempMatrix The matrix to populate with the values from this Game Object.
    * @param parentMatrix A temporary matrix to hold parent values during the calculations.
    */
  def getWorldTransformMatrix(): TransformMatrix = js.native
  def getWorldTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix = js.native
  def getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix = js.native
  /**
    * Sets the angle of this Game Object.
    * @param degrees The rotation of this Game Object, in degrees. Default 0.
    */
  def setAngle(): this.type = js.native
  def setAngle(degrees: scala.Double): this.type = js.native
  /**
    * Sets the position of this Game Object.
    * @param x The x position of this Game Object. Default 0.
    * @param y The y position of this Game Object. If not set it will use the `x` value. Default x.
    * @param z The z position of this Game Object. Default 0.
    * @param w The w position of this Game Object. Default 0.
    */
  def setPosition(): this.type = js.native
  def setPosition(x: scala.Double): this.type = js.native
  def setPosition(x: scala.Double, y: scala.Double): this.type = js.native
  def setPosition(x: scala.Double, y: scala.Double, z: scala.Double): this.type = js.native
  def setPosition(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): this.type = js.native
  /**
    * Sets the position of this Game Object to be a random position within the confines of
    * the given area.
    * 
    * If no area is specified a random position between 0 x 0 and the game width x height is used instead.
    * 
    * The position does not factor in the size of this Game Object, meaning that only the origin is
    * guaranteed to be within the area.
    * @param x The x position of the top-left of the random area. Default 0.
    * @param y The y position of the top-left of the random area. Default 0.
    * @param width The width of the random area.
    * @param height The height of the random area.
    */
  def setRandomPosition(): this.type = js.native
  def setRandomPosition(x: scala.Double): this.type = js.native
  def setRandomPosition(x: scala.Double, y: scala.Double): this.type = js.native
  def setRandomPosition(x: scala.Double, y: scala.Double, width: scala.Double): this.type = js.native
  def setRandomPosition(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): this.type = js.native
  /**
    * Sets the rotation of this Game Object.
    * @param radians The rotation of this Game Object, in radians. Default 0.
    */
  def setRotation(): this.type = js.native
  def setRotation(radians: scala.Double): this.type = js.native
  /**
    * Sets the scale of this Game Object.
    * @param x The horizontal scale of this Game Object.
    * @param y The vertical scale of this Game Object. If not set it will use the `x` value. Default x.
    */
  def setScale(x: scala.Double): this.type = js.native
  def setScale(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the w position of this Game Object.
    * @param value The w position of this Game Object. Default 0.
    */
  def setW(): this.type = js.native
  def setW(value: scala.Double): this.type = js.native
  /**
    * Sets the x position of this Game Object.
    * @param value The x position of this Game Object. Default 0.
    */
  def setX(): this.type = js.native
  def setX(value: scala.Double): this.type = js.native
  /**
    * Sets the y position of this Game Object.
    * @param value The y position of this Game Object. Default 0.
    */
  def setY(): this.type = js.native
  def setY(value: scala.Double): this.type = js.native
  /**
    * Sets the z position of this Game Object.
    * @param value The z position of this Game Object. Default 0.
    */
  def setZ(): this.type = js.native
  def setZ(value: scala.Double): this.type = js.native
}

