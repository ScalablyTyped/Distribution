package typings.physijs.Physijs

import typings.three.threeMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.CapsuleMesh")
@js.native
class CapsuleMesh protected () extends Mesh {
  def this(geometry: Geometry, material: typings.three.threeMod.Material) = this()
  def this(geometry: Geometry, material: typings.three.threeMod.Material, mass: Double) = this()
}

