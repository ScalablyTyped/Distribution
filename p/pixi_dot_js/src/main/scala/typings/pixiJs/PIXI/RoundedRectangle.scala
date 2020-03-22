package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Rounded Rectangle object is an area that has nice rounded corners, as indicated by its
  * top-left corner point (x, y) and by its width and its height and its radius.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.RoundedRectangle")
@js.native
class RoundedRectangle () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double, radius: Double) = this()
  /**
    * @member {number} PIXI.RoundedRectangle#height
    * @default 0
    */
  var height: Double = js.native
  /**
    * @member {number} PIXI.RoundedRectangle#radius
    * @default 20
    */
  var radius: Double = js.native
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.RoundedRectangle#type
    * @readonly
    * @default PIXI.SHAPES.RREC
    * @see PIXI.SHAPES
    */
  val `type`: Double = js.native
  /**
    * @member {number} PIXI.RoundedRectangle#width
    * @default 0
    */
  var width: Double = js.native
  /**
    * @member {number} PIXI.RoundedRectangle#x
    * @default 0
    */
  var x: Double = js.native
  /**
    * @member {number} PIXI.RoundedRectangle#y
    * @default 0
    */
  var y: Double = js.native
  /**
    * Checks whether the x and y coordinates given are contained within this Rounded Rectangle
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this Rounded Rectangle
    */
  def contains(x: Double, y: Double): Boolean = js.native
}

