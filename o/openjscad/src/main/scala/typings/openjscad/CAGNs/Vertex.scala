package typings.openjscad.CAGNs

import typings.openjscad.CSGNs.Vector2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CAG.Vertex")
@js.native
class Vertex protected () extends js.Object {
  def this(pos: Vector2D) = this()
  var pos: Vector2D = js.native
  var tag: Double = js.native
  def getTag(): Double = js.native
}

