package typings.physijs.Physijs

import typings.three.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.BoxMesh")
@js.native
class BoxMesh protected () extends Mesh {
  def this(geometry: Geometry, material: typings.three.mod.Material) = this()
  def this(geometry: Geometry, material: typings.three.mod.Material, mass: Double) = this()
}

