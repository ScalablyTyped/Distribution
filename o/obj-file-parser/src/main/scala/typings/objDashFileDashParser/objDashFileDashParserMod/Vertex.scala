package typings.objDashFileDashParser.objDashFileDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vertex extends js.Object {
  var x: Double
  var y: Double
  var z: Double
}

object Vertex {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): Vertex = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[Vertex]
  }
}

