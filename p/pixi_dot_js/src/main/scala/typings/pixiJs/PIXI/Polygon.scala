package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class to define a shape via user defined co-orinates.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Polygon extends js.Object {
  
  /**
    * `false` after moveTo, `true` after `closePath`. In all other cases it is `true`.
    * @member {boolean} PIXI.Polygon#closeStroke
    * @default true
    */
  var closeStroke: Boolean = js.native
  
  /**
    * Checks whether the x and y coordinates passed to this function are contained within this polygon
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this polygon
    */
  def contains(x: Double, y: Double): Boolean = js.native
  
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
}
object Polygon {
  
  @scala.inline
  def apply(
    closeStroke: Boolean,
    contains: (Double, Double) => Boolean,
    points: js.Array[Double],
    `type`: Double
  ): Polygon = {
    val __obj = js.Dynamic.literal(closeStroke = closeStroke.asInstanceOf[js.Any], contains = js.Any.fromFunction2(contains), points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon]
  }
  
  @scala.inline
  implicit class PolygonOps[Self <: Polygon] (val x: Self) extends AnyVal {
    
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
    def setCloseStroke(value: Boolean): Self = this.set("closeStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: (Double, Double) => Boolean): Self = this.set("contains", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPointsVarargs(value: Double*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Double]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
