package typings
package obeliskDotJsLib.obeliskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("obelisk.Point3D")
@js.native
class Point3D () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def toGlobalCoordinates(): Point = js.native
  def toGlobalCoordinates(offset: Point): Point = js.native
}

