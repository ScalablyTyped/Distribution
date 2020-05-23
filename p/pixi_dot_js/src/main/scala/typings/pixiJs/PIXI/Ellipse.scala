package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Ellipse object is used to help draw graphics and can also be used to specify a hit area for displayObjects.
  *
  * @class
  * @memberof PIXI
  */
trait Ellipse extends js.Object {
  /**
    * @member {number} PIXI.Ellipse#height
    * @default 0
    */
  var height: Double
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Ellipse#type
    * @readOnly
    * @default PIXI.SHAPES.ELIP
    * @see PIXI.SHAPES
    */
  val `type`: Double
  /**
    * @member {number} PIXI.Ellipse#width
    * @default 0
    */
  var width: Double
  /**
    * @member {number} PIXI.Ellipse#x
    * @default 0
    */
  var x: Double
  /**
    * @member {number} PIXI.Ellipse#y
    * @default 0
    */
  var y: Double
  /**
    * Checks whether the x and y coordinates given are contained within this ellipse
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coords are within this ellipse
    */
  def contains(x: Double, y: Double): Boolean
  /**
    * Returns the framing rectangle of the ellipse as a Rectangle object
    *
    * @return {PIXI.Rectangle} the framing rectangle
    */
  def getBounds(): Rectangle
}

object Ellipse {
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    getBounds: () => Rectangle,
    height: Double,
    `type`: Double,
    width: Double,
    x: Double,
    y: Double
  ): Ellipse = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), getBounds = js.Any.fromFunction0(getBounds), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipse]
  }
}

