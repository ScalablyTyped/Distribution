package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Draw a star shape with an arbitrary number of points.
  *
  * @class
  * @extends PIXI.Polygon
  * @memberof PIXI
  * @param {number} x - Center X position of the star
  * @param {number} y - Center Y position of the star
  * @param {number} points - The number of points of the star, must be > 1
  * @param {number} radius - The outer radius of the star
  * @param {number} [innerRadius] - The inner radius between points, default half `radius`
  * @param {number} [rotation=0] - The rotation of the star in radians, where 0 is vertical
  * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
  */
trait Star extends Polygon

object Star {
  @scala.inline
  def apply(
    closeStroke: Boolean,
    contains: (Double, Double) => Boolean,
    points: js.Array[Double],
    `type`: Double
  ): Star = {
    val __obj = js.Dynamic.literal(closeStroke = closeStroke.asInstanceOf[js.Any], contains = js.Any.fromFunction2(contains), points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Star]
  }
}

