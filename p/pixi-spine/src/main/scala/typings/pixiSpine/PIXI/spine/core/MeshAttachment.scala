package typings.pixiSpine.PIXI.spine.core

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.MeshAttachment")
@js.native
class MeshAttachment protected () extends VertexAttachment {
  def this(name: String) = this()
  var color: Color = js.native
  var edges: js.Array[Double] = js.native
  var height: Double = js.native
  var hullLength: Double = js.native
  var parentMesh: js.Any = js.native
  var path: String = js.native
  var region: TextureRegion = js.native
  var regionUVs: Float32Array = js.native
  var tempColor: Color = js.native
  var triangles: js.Array[Double] = js.native
  var uvs: ArrayLike[Double] = js.native
  var width: Double = js.native
  def getParentMesh(): MeshAttachment = js.native
  def newLinkedMesh(): MeshAttachment = js.native
  def setParentMesh(parentMesh: MeshAttachment): Unit = js.native
}

