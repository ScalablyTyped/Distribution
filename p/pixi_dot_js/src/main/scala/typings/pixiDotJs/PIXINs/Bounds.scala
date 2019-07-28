package typings.pixiDotJs.PIXINs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Bounds")
@js.native
class Bounds () extends js.Object {
  var maxX: Double = js.native
  var maxY: Double = js.native
  var minX: Double = js.native
  var minY: Double = js.native
  var rect: Rectangle = js.native
  def addBounds(bounds: Bounds): Unit = js.native
  def addBoundsArea(bounds: Bounds, area: Rectangle): Unit = js.native
  def addBoundsMask(bounds: Bounds, mask: Bounds): Unit = js.native
  def addFrame(transform: Transform, x0: Double, y0: Double, x1: Double, y1: Double): Unit = js.native
  def addPoint(point: Point): Unit = js.native
  def addQuad(vertices: ArrayLike[Double]): js.UndefOr[Bounds] = js.native
  def addVertices(transform: Transform, vertices: ArrayLike[Double], beginOffset: Double, endOffset: Double): Unit = js.native
  def clear(): Unit = js.native
  def getRectangle(): Rectangle = js.native
  def getRectangle(rect: Rectangle): Rectangle = js.native
  def isEmpty(): Boolean = js.native
}

