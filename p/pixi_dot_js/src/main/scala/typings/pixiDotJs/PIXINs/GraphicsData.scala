package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// graphics
/**
  * A GraphicsData object.
  */
@JSGlobal("PIXI.GraphicsData")
@js.native
class GraphicsData protected () extends js.Object {
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: js.Any
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: Circle
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: Ellipse
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: Polygon
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: Rectangle
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: RoundedRectangle
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: js.Any,
    lineAlignment: Double
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: Circle,
    lineAlignment: Double
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: Ellipse,
    lineAlignment: Double
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: Polygon,
    lineAlignment: Double
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: Rectangle,
    lineAlignment: Double
  ) = this()
  def this(
    lineWidth: Double,
    lineColor: Double,
    lineAlpha: Double,
    fillColor: Double,
    fillAlpha: Double,
    fill: Boolean,
    nativeLines: Boolean,
    shape: RoundedRectangle,
    lineAlignment: Double
  ) = this()
  var _fillTint: Double = js.native
  var _lineTint: Double = js.native
  var fill: Boolean = js.native
  var fillAlpha: Double = js.native
  var fillColor: Double = js.native
  var holes: js.Array[_ | Circle | Ellipse | Polygon | Rectangle | RoundedRectangle] = js.native
  var lineAlignment: Double = js.native
  var lineAlpha: Double = js.native
  var lineColor: Double = js.native
  var lineWidth: Double = js.native
  var nativeLines: Boolean = js.native
  var shape: Circle | Rectangle | Ellipse | Polygon | RoundedRectangle | js.Any = js.native
  var `type`: js.UndefOr[Double] = js.native
  def addHole(shape: js.Any): Unit = js.native
  /**
    * Adds a hole to the shape.
    *
    * @param shape - The shape of the hole.
    */
  def addHole(shape: Circle): Unit = js.native
  def addHole(shape: Ellipse): Unit = js.native
  def addHole(shape: Polygon): Unit = js.native
  def addHole(shape: Rectangle): Unit = js.native
  def addHole(shape: RoundedRectangle): Unit = js.native
  /**
    * Destroys the Graphics data.
    */
  def destroy(): Unit = js.native
  def destroy(options: Boolean): Unit = js.native
  def destroy(options: DestroyOptions): Unit = js.native
}

