package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.IkConstraint")
@js.native
class IkConstraint protected ()
  extends typings.phaser.spine.IkConstraint {
  def this(data: typings.phaser.spine.IkConstraintData, skeleton: typings.phaser.spine.Skeleton) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var bendDirection: Double = js.native
  /* CompleteClass */
  override var bones: js.Array[typings.phaser.spine.Bone] = js.native
  /* CompleteClass */
  override var compress: Boolean = js.native
  /* CompleteClass */
  override var data: typings.phaser.spine.IkConstraintData = js.native
  /* CompleteClass */
  override var mix: Double = js.native
  /* CompleteClass */
  override var softness: Double = js.native
  /* CompleteClass */
  override var stretch: Boolean = js.native
  /* CompleteClass */
  override var target: typings.phaser.spine.Bone = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  /* CompleteClass */
  override def apply1(
    bone: typings.phaser.spine.Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit = js.native
  /* CompleteClass */
  override def apply2(
    parent: typings.phaser.spine.Bone,
    child: typings.phaser.spine.Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    softness: Double,
    alpha: Double
  ): Unit = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

