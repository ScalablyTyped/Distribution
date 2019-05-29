package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// graphics
@JSGlobal("PIXI.GraphicsData")
@js.native
class GraphicsData protected () extends js.Object {
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: js.Any) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: Circle) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: Ellipse) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: Polygon) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: Rectangle) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: RoundedRectangle) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: js.Any, lineAlignment: scala.Double) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: Circle, lineAlignment: scala.Double) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: Ellipse, lineAlignment: scala.Double) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: Polygon, lineAlignment: scala.Double) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: Rectangle, lineAlignment: scala.Double) = this()
  def this(lineWidth: scala.Double, lineColor: scala.Double, lineAlpha: scala.Double, fillColor: scala.Double, fillAlpha: scala.Double, fill: scala.Boolean, nativeLines: scala.Boolean, shape: RoundedRectangle, lineAlignment: scala.Double) = this()
  var _fillTint: scala.Double = js.native
  var _lineTint: scala.Double = js.native
  var fill: scala.Boolean = js.native
  var fillAlpha: scala.Double = js.native
  var fillColor: scala.Double = js.native
  var holes: js.Array[_ | Circle | Ellipse | Polygon | Rectangle | RoundedRectangle] = js.native
  var lineAlignment: scala.Double = js.native
  var lineAlpha: scala.Double = js.native
  var lineColor: scala.Double = js.native
  var lineWidth: scala.Double = js.native
  var nativeLines: scala.Boolean = js.native
  var shape: Circle | Rectangle | Ellipse | Polygon | RoundedRectangle | js.Any = js.native
  var `type`: js.UndefOr[scala.Double] = js.native
  def addHole(shape: js.Any): scala.Unit = js.native
  def addHole(shape: Circle): scala.Unit = js.native
  def addHole(shape: Ellipse): scala.Unit = js.native
  def addHole(shape: Polygon): scala.Unit = js.native
  def addHole(shape: Rectangle): scala.Unit = js.native
  def addHole(shape: RoundedRectangle): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(options: DestroyOptions): scala.Unit = js.native
  def destroy(options: scala.Boolean): scala.Unit = js.native
}

