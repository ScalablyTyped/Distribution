package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class to contain data useful for Graphics objects
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait GraphicsData extends js.Object {
  /**
    * The style of the fill.
    * @member {PIXI.FillStyle} PIXI.GraphicsData#fillStyle
    */
  var fillStyle: FillStyle = js.native
  /**
    * The collection of holes.
    * @member {PIXI.GraphicsData[]} PIXI.GraphicsData#holes
    */
  var holes: js.Array[GraphicsData] = js.native
  /**
    * The style of the line.
    * @member {PIXI.LineStyle} PIXI.GraphicsData#lineStyle
    */
  var lineStyle: LineStyle = js.native
  /**
    * The transform matrix.
    * @member {PIXI.Matrix} PIXI.GraphicsData#matrix
    */
  var matrix: Matrix = js.native
  /**
    * The collection of points.
    * @member {number[]} PIXI.GraphicsData#points
    */
  var points: js.Array[Double] = js.native
  /**
    * The shape object to draw.
    * @member {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} PIXI.GraphicsData#shape
    */
  var shape: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle = js.native
  /**
    * The type of the shape, see the Const.Shapes file for all the existing types,
    * @member {number} PIXI.GraphicsData#type
    */
  var `type`: Double = js.native
  /**
    * Destroys the Graphics data.
    *
    */
  def destroy(): Unit = js.native
}

object GraphicsData {
  @scala.inline
  def apply(
    destroy: () => Unit,
    fillStyle: FillStyle,
    holes: js.Array[GraphicsData],
    lineStyle: LineStyle,
    matrix: Matrix,
    points: js.Array[Double],
    shape: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle,
    `type`: Double
  ): GraphicsData = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), fillStyle = fillStyle.asInstanceOf[js.Any], holes = holes.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsData]
  }
  @scala.inline
  implicit class GraphicsDataOps[Self <: GraphicsData] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setFillStyle(value: FillStyle): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setHolesVarargs(value: GraphicsData*): Self = this.set("holes", js.Array(value :_*))
    @scala.inline
    def setHoles(value: js.Array[GraphicsData]): Self = this.set("holes", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineStyle(value: LineStyle): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrix(value: Matrix): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: Double*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Double]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

