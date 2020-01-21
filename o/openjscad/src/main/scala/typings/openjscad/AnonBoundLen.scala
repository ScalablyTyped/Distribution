package typings.openjscad

import typings.three.mod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoundLen extends js.Object {
  var boundLen: Double
  var colorMesh: Mesh
  var wireframe: Mesh
}

object AnonBoundLen {
  @scala.inline
  def apply(boundLen: Double, colorMesh: Mesh, wireframe: Mesh): AnonBoundLen = {
    val __obj = js.Dynamic.literal(boundLen = boundLen.asInstanceOf[js.Any], colorMesh = colorMesh.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBoundLen]
  }
}

