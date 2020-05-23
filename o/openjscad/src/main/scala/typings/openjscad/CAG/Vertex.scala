package typings.openjscad.CAG

import typings.openjscad.CSG.Vector2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vertex extends js.Object {
  var pos: Vector2D
  var tag: Double
  def getTag(): Double
}

object Vertex {
  @scala.inline
  def apply(getTag: () => Double, pos: Vector2D, tag: Double): Vertex = {
    val __obj = js.Dynamic.literal(getTag = js.Any.fromFunction0(getTag), pos = pos.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertex]
  }
}

