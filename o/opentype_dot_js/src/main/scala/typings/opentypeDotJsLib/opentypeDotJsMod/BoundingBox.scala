package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", "BoundingBox")
@js.native
class BoundingBox () extends js.Object {
  var x1: scala.Double = js.native
  var x2: scala.Double = js.native
  var y1: scala.Double = js.native
  var y2: scala.Double = js.native
  def addBezier(
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def addPoint(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def addQuad(
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def addX(x: scala.Double): scala.Unit = js.native
  def addY(y: scala.Double): scala.Unit = js.native
  def isEmpty(): scala.Boolean = js.native
}

