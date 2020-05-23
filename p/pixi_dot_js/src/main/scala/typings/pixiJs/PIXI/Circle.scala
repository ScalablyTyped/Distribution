package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Circle object is used to help draw graphics and can also be used to specify a hit area for displayObjects.
  *
  * @class
  * @memberof PIXI
  */
trait Circle extends js.Object {
  /**
    * @member {number} PIXI.Circle#radius
    * @default 0
    */
  var radius: Double
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Circle#type
    * @readOnly
    * @default PIXI.SHAPES.CIRC
    * @see PIXI.SHAPES
    */
  val `type`: Double
  /**
    * @member {number} PIXI.Circle#x
    * @default 0
    */
  var x: Double
  /**
    * @member {number} PIXI.Circle#y
    * @default 0
    */
  var y: Double
  /**
    * Checks whether the x and y coordinates given are contained within this circle
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this Circle
    */
  def contains(x: Double, y: Double): Boolean
  /**
    * Returns the framing rectangle of the circle as a Rectangle object
    *
    * @return {PIXI.Rectangle} the framing rectangle
    */
  def getBounds(): Rectangle
}

object Circle {
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    getBounds: () => Rectangle,
    radius: Double,
    `type`: Double,
    x: Double,
    y: Double
  ): Circle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), getBounds = js.Any.fromFunction0(getBounds), radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
}

