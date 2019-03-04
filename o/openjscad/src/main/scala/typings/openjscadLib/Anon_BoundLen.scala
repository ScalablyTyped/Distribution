package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundLen extends js.Object {
  var boundLen: scala.Double
  var colorMesh: threeLib.threeMod.Mesh
  var wireframe: threeLib.threeMod.Mesh
}

object Anon_BoundLen {
  @scala.inline
  def apply(boundLen: scala.Double, colorMesh: threeLib.threeMod.Mesh, wireframe: threeLib.threeMod.Mesh): Anon_BoundLen = {
    val __obj = js.Dynamic.literal(boundLen = boundLen, colorMesh = colorMesh, wireframe = wireframe)
  
    __obj.asInstanceOf[Anon_BoundLen]
  }
}

