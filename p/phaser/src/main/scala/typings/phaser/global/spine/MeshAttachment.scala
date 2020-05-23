package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.MeshAttachment")
@js.native
class MeshAttachment protected ()
  extends typings.phaser.spine.MeshAttachment {
  def this(name: String) = this()
  /* CompleteClass */
  override var bones: js.Array[Double] = js.native
  /* CompleteClass */
  override var color: typings.phaser.spine.Color = js.native
  /* CompleteClass */
  override var deformAttachment: typings.phaser.spine.VertexAttachment = js.native
  /* CompleteClass */
  override var edges: js.Array[Double] = js.native
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var hullLength: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var parentMesh: js.Any = js.native
  /* CompleteClass */
  override var path: String = js.native
  /* CompleteClass */
  override var region: typings.phaser.spine.TextureRegion = js.native
  /* CompleteClass */
  override var regionUVs: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var tempColor: typings.phaser.spine.Color = js.native
  /* CompleteClass */
  override var triangles: js.Array[Double] = js.native
  /* CompleteClass */
  override var uvs: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var vertices: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var width: Double = js.native
  /* CompleteClass */
  override var worldVerticesLength: Double = js.native
  /* CompleteClass */
  override def computeWorldVertices(
    slot: typings.phaser.spine.Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  /* CompleteClass */
  override def copy(): typings.phaser.spine.Attachment = js.native
  /* CompleteClass */
  override def copyTo(attachment: typings.phaser.spine.VertexAttachment): Unit = js.native
  /* CompleteClass */
  override def getParentMesh(): typings.phaser.spine.MeshAttachment = js.native
  /* CompleteClass */
  override def newLinkedMesh(): typings.phaser.spine.MeshAttachment = js.native
  /* CompleteClass */
  override def setParentMesh(parentMesh: typings.phaser.spine.MeshAttachment): Unit = js.native
  /* CompleteClass */
  override def updateUVs(): Unit = js.native
}

