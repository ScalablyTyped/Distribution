package typings.pixiJs.mod

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
@JSImport("pixi.js", "Star")
@js.native
class Star protected ()
  extends typings.pixiJs.PIXI.Star {
  def this(x: Double, y: Double, points: Double, radius: Double) = this()
  def this(x: Double, y: Double, points: Double, radius: Double, innerRadius: Double) = this()
  def this(x: Double, y: Double, points: Double, radius: Double, innerRadius: Double, rotation: Double) = this()
}

