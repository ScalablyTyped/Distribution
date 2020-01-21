package typings.obeliskJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "Point3D")
@js.native
class Point3D () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def toGlobalCoordinates(): Point = js.native
  def toGlobalCoordinates(offset: Point): Point = js.native
}

