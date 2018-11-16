package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Vertex")
@js.native
class Vertex protected ()
  extends openjscadLib.CxG {
  def this(pos: Vector3D) = this()
  var pos: Vector3D = js.native
  var tag: scala.Double = js.native
  def flipped(): Vertex = js.native
  def getTag(): scala.Double = js.native
  def interpolate(other: Vertex, t: scala.Double): Vertex = js.native
}

@JSGlobal("CSG.Vertex")
@js.native
object Vertex extends js.Object {
  def fromObject(obj: js.Any): openjscadLib.CSGNs.Vertex = js.native
}

