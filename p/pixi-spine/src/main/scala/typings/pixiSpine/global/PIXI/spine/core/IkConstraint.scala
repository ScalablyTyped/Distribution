package typings.pixiSpine.global.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.IkConstraint")
@js.native
class IkConstraint protected ()
  extends typings.pixiSpine.PIXI.spine.core.IkConstraint {
  def this(
    data: typings.pixiSpine.PIXI.spine.core.IkConstraintData,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton
  ) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var bendDirection: Double = js.native
  /* CompleteClass */
  override var bones: js.Array[typings.pixiSpine.PIXI.spine.core.Bone] = js.native
  /* CompleteClass */
  override var compress: Boolean = js.native
  /* CompleteClass */
  override var data: typings.pixiSpine.PIXI.spine.core.IkConstraintData = js.native
  /* CompleteClass */
  override var mix: Double = js.native
  /* CompleteClass */
  override var softness: Double = js.native
  /* CompleteClass */
  override var stretch: Boolean = js.native
  /* CompleteClass */
  override var target: typings.pixiSpine.PIXI.spine.core.Bone = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  /* CompleteClass */
  override def apply1(
    bone: typings.pixiSpine.PIXI.spine.core.Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit = js.native
  /* CompleteClass */
  override def apply2(
    parent: typings.pixiSpine.PIXI.spine.core.Bone,
    child: typings.pixiSpine.PIXI.spine.core.Bone,
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

