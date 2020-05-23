package typings.openjscad.anon

import typings.three.mod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundLen extends js.Object {
  var boundLen: Double
  var colorMesh: Mesh
  var wireframe: Mesh
}

object BoundLen {
  @scala.inline
  def apply(boundLen: Double, colorMesh: Mesh, wireframe: Mesh): BoundLen = {
    val __obj = js.Dynamic.literal(boundLen = boundLen.asInstanceOf[js.Any], colorMesh = colorMesh.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundLen]
  }
}

