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
@js.native
trait RoundedRectangle extends js.Object {
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

object RoundedRectangle {
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    height: Double,
    radius: Double,
    `type`: Double,
    width: Double,
    x: Double,
    y: Double
  ): RoundedRectangle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRectangle]
  }
  @scala.inline
  implicit class RoundedRectangleOps[Self <: RoundedRectangle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContains(value: (Double, Double) => Boolean): Self = this.set("contains", js.Any.fromFunction2(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

