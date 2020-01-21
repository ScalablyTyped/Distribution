package typings.physijs.Physijs

import typings.three.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.CylinderMesh")
@js.native
class CylinderMesh protected () extends Mesh {
  def this(geometry: Geometry, material: typings.three.mod.Material) = this()
  def this(geometry: Geometry, material: typings.three.mod.Material, mass: Double) = this()
}

