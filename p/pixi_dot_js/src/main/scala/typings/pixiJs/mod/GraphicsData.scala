package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class to contain data useful for Graphics objects
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "GraphicsData")
@js.native
class GraphicsData protected ()
  extends typings.pixiJs.PIXI.GraphicsData {
  def this(shape: typings.pixiJs.PIXI.Circle) = this()
  def this(shape: typings.pixiJs.PIXI.Ellipse) = this()
  def this(shape: typings.pixiJs.PIXI.Polygon) = this()
  def this(shape: typings.pixiJs.PIXI.Rectangle) = this()
  def this(shape: typings.pixiJs.PIXI.Circle, fillStyle: typings.pixiJs.PIXI.FillStyle) = this()
  def this(shape: typings.pixiJs.PIXI.Ellipse, fillStyle: typings.pixiJs.PIXI.FillStyle) = this()
  def this(shape: typings.pixiJs.PIXI.Polygon, fillStyle: typings.pixiJs.PIXI.FillStyle) = this()
  def this(shape: typings.pixiJs.PIXI.Rectangle, fillStyle: typings.pixiJs.PIXI.FillStyle) = this()
  def this(
    shape: typings.pixiJs.PIXI.Circle,
    fillStyle: typings.pixiJs.PIXI.FillStyle,
    lineStyle: typings.pixiJs.PIXI.LineStyle
  ) = this()
  def this(
    shape: typings.pixiJs.PIXI.Ellipse,
    fillStyle: typings.pixiJs.PIXI.FillStyle,
    lineStyle: typings.pixiJs.PIXI.LineStyle
  ) = this()
  def this(
    shape: typings.pixiJs.PIXI.Polygon,
    fillStyle: typings.pixiJs.PIXI.FillStyle,
    lineStyle: typings.pixiJs.PIXI.LineStyle
  ) = this()
  def this(
    shape: typings.pixiJs.PIXI.Rectangle,
    fillStyle: typings.pixiJs.PIXI.FillStyle,
    lineStyle: typings.pixiJs.PIXI.LineStyle
  ) = this()
  def this(
    shape: typings.pixiJs.PIXI.Circle,
    fillStyle: typings.pixiJs.PIXI.FillStyle,
    lineStyle: typings.pixiJs.PIXI.LineStyle,
    matrix: typings.pixiJs.PIXI.Matrix
  ) = this()
  def this(
    shape: typings.pixiJs.PIXI.Ellipse,
    fillStyle: typings.pixiJs.PIXI.FillStyle,
    lineStyle: typings.pixiJs.PIXI.LineStyle,
    matrix: typings.pixiJs.PIXI.Matrix
  ) = this()
  def this(
    shape: typings.pixiJs.PIXI.Polygon,
    fillStyle: typings.pixiJs.PIXI.FillStyle,
    lineStyle: typings.pixiJs.PIXI.LineStyle,
    matrix: typings.pixiJs.PIXI.Matrix
  ) = this()
  def this(
    shape: typings.pixiJs.PIXI.Rectangle,
    fillStyle: typings.pixiJs.PIXI.FillStyle,
    lineStyle: typings.pixiJs.PIXI.LineStyle,
    matrix: typings.pixiJs.PIXI.Matrix
  ) = this()
  /**
    * The style of the fill.
    * @member {PIXI.FillStyle} PIXI.GraphicsData#fillStyle
    */
  /* CompleteClass */
  override var fillStyle: typings.pixiJs.PIXI.FillStyle = js.native
  /**
    * The collection of holes.
    * @member {PIXI.GraphicsData[]} PIXI.GraphicsData#holes
    */
  /* CompleteClass */
  override var holes: js.Array[typings.pixiJs.PIXI.GraphicsData] = js.native
  /**
    * The style of the line.
    * @member {PIXI.LineStyle} PIXI.GraphicsData#lineStyle
    */
  /* CompleteClass */
  override var lineStyle: typings.pixiJs.PIXI.LineStyle = js.native
  /**
    * The transform matrix.
    * @member {PIXI.Matrix} PIXI.GraphicsData#matrix
    */
  /* CompleteClass */
  override var matrix: typings.pixiJs.PIXI.Matrix = js.native
  /**
    * The collection of points.
    * @member {number[]} PIXI.GraphicsData#points
    */
  /* CompleteClass */
  override var points: js.Array[Double] = js.native
  /**
    * The shape object to draw.
    * @member {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} PIXI.GraphicsData#shape
    */
  /* CompleteClass */
  override var shape: typings.pixiJs.PIXI.Circle | typings.pixiJs.PIXI.Ellipse | typings.pixiJs.PIXI.Polygon | typings.pixiJs.PIXI.Rectangle | typings.pixiJs.PIXI.RoundedRectangle = js.native
  /**
    * The type of the shape, see the Const.Shapes file for all the existing types,
    * @member {number} PIXI.GraphicsData#type
    */
  /* CompleteClass */
  override var `type`: Double = js.native
  /**
    * Destroys the Graphics data.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

