package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.MeshAttachment")
@js.native
class MeshAttachment protected ()
  extends typings.pixiSpine.PIXI.spine.core.MeshAttachment {
  def this(name: String) = this()
  /* CompleteClass */
  override var bones: js.Array[Double] = js.native
  /* CompleteClass */
  override var color: typings.pixiSpine.PIXI.spine.core.Color = js.native
  /* CompleteClass */
  override var deformAttachment: typings.pixiSpine.PIXI.spine.core.VertexAttachment = js.native
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
  override var region: typings.pixiSpine.PIXI.spine.core.TextureRegion = js.native
  /* CompleteClass */
  override var regionUVs: Float32Array = js.native
  /* CompleteClass */
  override var tempColor: typings.pixiSpine.PIXI.spine.core.Color = js.native
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
    slot: typings.pixiSpine.PIXI.spine.core.Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  /* CompleteClass */
  override def computeWorldVerticesOld(slot: typings.pixiSpine.PIXI.spine.core.Slot, worldVertices: ArrayLike[Double]): Unit = js.native
  /* CompleteClass */
  override def copy(): typings.pixiSpine.PIXI.spine.core.Attachment = js.native
  /* CompleteClass */
  override def copyTo(attachment: typings.pixiSpine.PIXI.spine.core.VertexAttachment): Unit = js.native
  /* CompleteClass */
  override def getParentMesh(): typings.pixiSpine.PIXI.spine.core.MeshAttachment = js.native
  /* CompleteClass */
  override def newLinkedMesh(): typings.pixiSpine.PIXI.spine.core.MeshAttachment = js.native
  /* CompleteClass */
  override def setParentMesh(parentMesh: typings.pixiSpine.PIXI.spine.core.MeshAttachment): Unit = js.native
}

