package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rectangle object is an area defined by its position, as indicated by its top-left corner
  * point (x, y) and by its width and its height.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Rectangle extends js.Object {
  /**
    * returns the bottom edge of the rectangle
    *
    * @member {number}
    */
  var bottom: Double = js.native
  /**
    * @member {number} PIXI.Rectangle#height
    * @default 0
    */
  var height: Double = js.native
  /**
    * returns the left edge of the rectangle
    *
    * @member {number}
    */
  var left: Double = js.native
  /**
    * returns the right edge of the rectangle
    *
    * @member {number}
    */
  var right: Double = js.native
  /**
    * returns the top edge of the rectangle
    *
    * @member {number}
    */
  var top: Double = js.native
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Rectangle#type
    * @readOnly
    * @default PIXI.SHAPES.RECT
    * @see PIXI.SHAPES
    */
  val `type`: Double = js.native
  /**
    * @member {number} PIXI.Rectangle#width
    * @default 0
    */
  var width: Double = js.native
  /**
    * @member {number} PIXI.Rectangle#x
    * @default 0
    */
  var x: Double = js.native
  /**
    * @member {number} PIXI.Rectangle#y
    * @default 0
    */
  var y: Double = js.native
  /**
    * Enlarges rectangle that way its corners lie on grid
    *
    * @param {number} [resolution=1] resolution
    * @param {number} [eps=0.001] precision
    * @return {PIXI.Rectangle} Returns itself.
    */
  def ceil(): Rectangle = js.native
  def ceil(resolution: Double): Rectangle = js.native
  def ceil(resolution: Double, eps: Double): Rectangle = js.native
  /**
    * Checks whether the x and y coordinates given are contained within this Rectangle
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this Rectangle
    */
  def contains(x: Double, y: Double): Boolean = js.native
  /**
    * Copies another rectangle to this one.
    *
    * @param {PIXI.Rectangle} rectangle - The rectangle to copy from.
    * @return {PIXI.Rectangle} Returns itself.
    */
  def copyFrom(rectangle: Rectangle): Rectangle = js.native
  /**
    * Copies this rectangle to another one.
    *
    * @param {PIXI.Rectangle} rectangle - The rectangle to copy to.
    * @return {PIXI.Rectangle} Returns given parameter.
    */
  def copyTo(rectangle: Rectangle): Rectangle = js.native
  /**
    * Enlarges this rectangle to include the passed rectangle.
    *
    * @param {PIXI.Rectangle} rectangle - The rectangle to include.
    * @return {PIXI.Rectangle} Returns itself.
    */
  def enlarge(rectangle: Rectangle): Rectangle = js.native
  /**
    * Fits this rectangle around the passed one.
    *
    * @param {PIXI.Rectangle} rectangle - The rectangle to fit.
    * @return {PIXI.Rectangle} Returns itself.
    */
  def fit(rectangle: Rectangle): Rectangle = js.native
  /**
    * Pads the rectangle making it grow in all directions.
    * If paddingY is omitted, both paddingX and paddingY will be set to paddingX.
    *
    * @param {number} [paddingX=0] - The horizontal padding amount.
    * @param {number} [paddingY=0] - The vertical padding amount.
    * @return {PIXI.Rectangle} Returns itself.
    */
  def pad(): Rectangle = js.native
  def pad(paddingX: Double): Rectangle = js.native
  def pad(paddingX: Double, paddingY: Double): Rectangle = js.native
}

