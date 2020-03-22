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
@JSGlobal("PIXI.GraphicsData")
@js.native
class GraphicsData protected () extends js.Object {
  def this(shape: Circle) = this()
  def this(shape: Ellipse) = this()
  def this(shape: Polygon) = this()
  def this(shape: Rectangle) = this()
  def this(shape: Circle, fillStyle: FillStyle) = this()
  def this(shape: Ellipse, fillStyle: FillStyle) = this()
  def this(shape: Polygon, fillStyle: FillStyle) = this()
  def this(shape: Rectangle, fillStyle: FillStyle) = this()
  def this(shape: Circle, fillStyle: FillStyle, lineStyle: LineStyle) = this()
  def this(shape: Ellipse, fillStyle: FillStyle, lineStyle: LineStyle) = this()
  def this(shape: Polygon, fillStyle: FillStyle, lineStyle: LineStyle) = this()
  def this(shape: Rectangle, fillStyle: FillStyle, lineStyle: LineStyle) = this()
  def this(shape: Circle, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix) = this()
  def this(shape: Ellipse, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix) = this()
  def this(shape: Polygon, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix) = this()
  def this(shape: Rectangle, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix) = this()
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
    */
  def destroy(): Unit = js.native
}

