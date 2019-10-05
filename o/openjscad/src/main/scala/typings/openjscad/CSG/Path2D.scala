package typings.openjscad.CSG

import typings.openjscad.CAG
import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Path2D")
@js.native
class Path2D protected () extends CxG {
  def this(points: js.Array[Double | Vector2D]) = this()
  def this(points: js.Array[Double | Vector2D], closed: Boolean) = this()
  var closed: Boolean = js.native
  var lastBezierControlPoint: Vector2D = js.native
  var points: js.Array[Vector2D] = js.native
  def appendArc(endpoint: Vector2D, options: IEllpiticalArcOptions): Path2D = js.native
  def appendBezier(controlpoints: js.Any, options: js.Any): Path2D = js.native
  def appendPoint(point: Vector2D): Path2D = js.native
  def appendPoints(points: js.Array[Vector2D]): Path2D = js.native
  def close(): Path2D = js.native
  def concat(otherpath: Path2D): Path2D = js.native
  def expandToCAG(pathradius: Double, resolution: Double): CAG = js.native
  def innerToCAG(): CAG = js.native
  def rectangularExtrude(width: Double, height: Double, resolution: Double): typings.openjscad.CSG = js.native
}

/* static members */
@JSGlobal("CSG.Path2D")
@js.native
object Path2D extends js.Object {
  def arc(options: IArcOptions): Path2D = js.native
}

