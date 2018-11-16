package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Line2D")
@js.native
class Line2D protected ()
  extends openjscadLib.CxG {
  def this(normal: Vector2D, w: scala.Double) = this()
  var normal: Vector2D = js.native
  var w: scala.Double = js.native
  def absDistanceToPoint(point: Vector2D): scala.Double = js.native
  def direction(): Vector2D = js.native
  def equals(l: Line2D): scala.Boolean = js.native
  def intersectWithLine(line2d: Line2D): Vector2D = js.native
  def origin(): Vector2D = js.native
  def reverse(): Line2D = js.native
  def xAtY(y: scala.Double): scala.Double = js.native
}

@JSGlobal("CSG.Line2D")
@js.native
object Line2D extends js.Object {
  def fromPoints(p1: openjscadLib.CSGNs.Vector2D, p2: openjscadLib.CSGNs.Vector2D): openjscadLib.CSGNs.Line2D = js.native
}

