package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Vertex")
@js.native
class Vertex protected ()
  extends typings.openjscad.CSG.Vertex {
  def this(pos: typings.openjscad.CSG.Vector3D) = this()
}

/* static members */
@JSGlobal("CSG.Vertex")
@js.native
object Vertex extends js.Object {
  def fromObject(obj: js.Any): typings.openjscad.CSG.Vertex = js.native
}

