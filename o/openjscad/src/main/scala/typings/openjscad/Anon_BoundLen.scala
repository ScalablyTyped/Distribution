package typings.openjscad

import typings.three.threeMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundLen extends js.Object {
  var boundLen: Double
  var colorMesh: Mesh
  var wireframe: Mesh
}

object Anon_BoundLen {
  @scala.inline
  def apply(boundLen: Double, colorMesh: Mesh, wireframe: Mesh): Anon_BoundLen = {
    val __obj = js.Dynamic.literal(boundLen = boundLen.asInstanceOf[js.Any], colorMesh = colorMesh.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BoundLen]
  }
}

