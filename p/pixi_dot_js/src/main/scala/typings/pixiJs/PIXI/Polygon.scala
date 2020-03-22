package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class to define a shape via user defined co-orinates.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Polygon")
@js.native
class Polygon protected () extends js.Object {
  def this(points: (js.Array[js.Array[Double] | Double | Point])*) = this()
  /**
    * `false` after moveTo, `true` after `closePath`. In all other cases it is `true`.
    * @member {boolean} PIXI.Polygon#closeStroke
    * @default true
    */
  var closeStroke: Boolean = js.native
  /**
    * An array of the points of this polygon
    *
    * @member {number[]} PIXI.Polygon#points
    */
  var points: js.Array[Double] = js.native
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Polygon#type
    * @readOnly
    * @default PIXI.SHAPES.POLY
    * @see PIXI.SHAPES
    */
  val `type`: Double = js.native
  /**
    * Checks whether the x and y coordinates passed to this function are contained within this polygon
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this polygon
    */
  def contains(x: Double, y: Double): Boolean = js.native
}

