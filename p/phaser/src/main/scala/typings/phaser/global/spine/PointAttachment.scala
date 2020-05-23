package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.PointAttachment")
@js.native
class PointAttachment protected ()
  extends typings.phaser.spine.PointAttachment {
  def this(name: String) = this()
  /* CompleteClass */
  override var bones: js.Array[Double] = js.native
  /* CompleteClass */
  override var color: typings.phaser.spine.Color = js.native
  /* CompleteClass */
  override var deformAttachment: typings.phaser.spine.VertexAttachment = js.native
  /* CompleteClass */
  override var id: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var rotation: Double = js.native
  /* CompleteClass */
  override var vertices: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var worldVerticesLength: Double = js.native
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
  /* CompleteClass */
  override def computeWorldPosition(bone: typings.phaser.spine.Bone, point: typings.phaser.spine.Vector2): typings.phaser.spine.Vector2 = js.native
  /* CompleteClass */
  override def computeWorldRotation(bone: typings.phaser.spine.Bone): Double = js.native
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
}

