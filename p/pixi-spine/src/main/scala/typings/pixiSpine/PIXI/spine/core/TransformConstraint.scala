package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TransformConstraint")
@js.native
class TransformConstraint protected () extends Updatable {
  def this(data: TransformConstraintData, skeleton: Skeleton) = this()
  var active: Boolean = js.native
  var bones: js.Array[Bone] = js.native
  var data: TransformConstraintData = js.native
  var rotateMix: Double = js.native
  var scaleMix: Double = js.native
  var shearMix: Double = js.native
  var target: Bone = js.native
  var temp: Vector2 = js.native
  var translateMix: Double = js.native
  @JSName("apply")
  def apply(): Unit = js.native
  def applyAbsoluteLocal(): Unit = js.native
  def applyAbsoluteWorld(): Unit = js.native
  def applyRelativeLocal(): Unit = js.native
  def applyRelativeWorld(): Unit = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

