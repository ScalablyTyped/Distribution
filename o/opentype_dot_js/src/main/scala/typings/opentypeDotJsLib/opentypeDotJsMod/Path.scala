package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", "Path")
@js.native
class Path () extends js.Object {
  var commands: js.Array[PathCommand] = js.native
  var fill: js.Any = js.native
  var stroke: js.Any = js.native
  var strokeWidth: js.Any = js.native
  var unitsPerEm: scala.Double = js.native
  def bezierCurveTo(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def closePath(): scala.Unit = js.native
  def curveTo(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  def extend(pathOrCommands: js.Array[PathCommand]): scala.Unit = js.native
  def extend(pathOrCommands: BoundingBox): scala.Unit = js.native
  def extend(pathOrCommands: Path): scala.Unit = js.native
  def getBoundingBox(): BoundingBox = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def quadTo(x1: scala.Double, y1: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def quadraticCurveTo(x1: scala.Double, y1: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def toDOMElement(decimalPlaces: scala.Double): stdLib.SVGPathElement = js.native
  def toPathData(decimalPlaces: scala.Double): java.lang.String = js.native
  def toSVG(decimalPlaces: scala.Double): java.lang.String = js.native
}

