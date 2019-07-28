package typings.openjscad.CSGNs

import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Vertex")
@js.native
class Vertex protected () extends CxG {
  def this(pos: Vector3D) = this()
  var pos: Vector3D = js.native
  var tag: Double = js.native
  def flipped(): Vertex = js.native
  def getTag(): Double = js.native
  def interpolate(other: Vertex, t: Double): Vertex = js.native
}

/* static members */
@JSGlobal("CSG.Vertex")
@js.native
object Vertex extends js.Object {
  def fromObject(obj: js.Any): Vertex = js.native
}

