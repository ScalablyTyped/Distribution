package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Bounds")
@js.native
class Bounds () extends js.Object {
  var maxX: scala.Double = js.native
  var maxY: scala.Double = js.native
  var minX: scala.Double = js.native
  var minY: scala.Double = js.native
  var rect: Rectangle = js.native
  def addBounds(bounds: Bounds): scala.Unit = js.native
  def addBoundsArea(bounds: Bounds, area: Rectangle): scala.Unit = js.native
  def addBoundsMask(bounds: Bounds, mask: Bounds): scala.Unit = js.native
  def addFrame(transform: Transform, x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): scala.Unit = js.native
  def addPoint(point: Point): scala.Unit = js.native
  def addQuad(vertices: stdLib.ArrayLike[scala.Double]): js.UndefOr[Bounds] = js.native
  def addVertices(
    transform: Transform,
    vertices: stdLib.ArrayLike[scala.Double],
    beginOffset: scala.Double,
    endOffset: scala.Double
  ): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def getRectangle(): Rectangle = js.native
  def getRectangle(rect: Rectangle): Rectangle = js.native
  def isEmpty(): scala.Boolean = js.native
}

