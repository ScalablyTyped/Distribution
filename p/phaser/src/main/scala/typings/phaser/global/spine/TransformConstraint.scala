package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.TransformConstraint")
@js.native
class TransformConstraint protected ()
  extends typings.phaser.spine.TransformConstraint {
  def this(data: typings.phaser.spine.TransformConstraintData, skeleton: typings.phaser.spine.Skeleton) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var bones: js.Array[typings.phaser.spine.Bone] = js.native
  /* CompleteClass */
  override var data: typings.phaser.spine.TransformConstraintData = js.native
  /* CompleteClass */
  override var rotateMix: Double = js.native
  /* CompleteClass */
  override var scaleMix: Double = js.native
  /* CompleteClass */
  override var shearMix: Double = js.native
  /* CompleteClass */
  override var target: typings.phaser.spine.Bone = js.native
  /* CompleteClass */
  override var temp: typings.phaser.spine.Vector2 = js.native
  /* CompleteClass */
  override var translateMix: Double = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  /* CompleteClass */
  override def applyAbsoluteLocal(): Unit = js.native
  /* CompleteClass */
  override def applyAbsoluteWorld(): Unit = js.native
  /* CompleteClass */
  override def applyRelativeLocal(): Unit = js.native
  /* CompleteClass */
  override def applyRelativeWorld(): Unit = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

