package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Path2D")
@js.native
class Path2D protected ()
  extends openjscadLib.CxG {
  def this(points: js.Array[Vector2D | scala.Double]) = this()
  def this(points: js.Array[Vector2D | scala.Double], closed: scala.Boolean) = this()
  var closed: scala.Boolean = js.native
  var lastBezierControlPoint: Vector2D = js.native
  var points: js.Array[Vector2D] = js.native
  def appendArc(endpoint: Vector2D, options: IEllpiticalArcOptions): Path2D = js.native
  def appendBezier(controlpoints: js.Any, options: js.Any): Path2D = js.native
  def appendPoint(point: Vector2D): Path2D = js.native
  def appendPoints(points: js.Array[Vector2D]): Path2D = js.native
  def close(): Path2D = js.native
  def concat(otherpath: Path2D): Path2D = js.native
  def expandToCAG(pathradius: scala.Double, resolution: scala.Double): openjscadLib.CAG = js.native
  def innerToCAG(): openjscadLib.CAG = js.native
  def rectangularExtrude(width: scala.Double, height: scala.Double, resolution: scala.Double): openjscadLib.CSG = js.native
}

@JSGlobal("CSG.Path2D")
@js.native
object Path2D extends js.Object {
  def arc(options: openjscadLib.CSGNs.IArcOptions): openjscadLib.CSGNs.Path2D = js.native
}

