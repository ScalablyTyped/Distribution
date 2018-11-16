package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.TransformConstraint")
@js.native
class TransformConstraint protected () extends Constraint {
  def this(data: TransformConstraintData, skeleton: Skeleton) = this()
  var bones: js.Array[Bone] = js.native
  var data: TransformConstraintData = js.native
  var rotateMix: scala.Double = js.native
  var scaleMix: scala.Double = js.native
  var shearMix: scala.Double = js.native
  var target: Bone = js.native
  var temp: Vector2 = js.native
  var translateMix: scala.Double = js.native
  @JSName("apply")
  def apply(): scala.Unit = js.native
  def applyAbsoluteLocal(): scala.Unit = js.native
  def applyAbsoluteWorld(): scala.Unit = js.native
  def applyRelativeLocal(): scala.Unit = js.native
  def applyRelativeWorld(): scala.Unit = js.native
  /* CompleteClass */
  override def getOrder(): scala.Double = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

