package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.MeshAttachment")
@js.native
class MeshAttachment protected () extends VertexAttachment {
  def this(name: java.lang.String) = this()
  var color: Color = js.native
  var hullLength: scala.Double = js.native
  var inheritDeform: scala.Boolean = js.native
  var parentMesh: js.Any = js.native
  var path: java.lang.String = js.native
  var region: TextureRegion = js.native
  var regionUVs: ArrayLike[scala.Double] = js.native
  var tempColor: Color = js.native
  var triangles: js.Array[scala.Double] = js.native
  var uvs: ArrayLike[scala.Double] = js.native
  def getParentMesh(): MeshAttachment = js.native
  def setParentMesh(parentMesh: MeshAttachment): scala.Unit = js.native
  def updateUVs(): scala.Unit = js.native
}

