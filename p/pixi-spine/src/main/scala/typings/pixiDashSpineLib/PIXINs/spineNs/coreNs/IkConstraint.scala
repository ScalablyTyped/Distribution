package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.IkConstraint")
@js.native
class IkConstraint protected () extends Constraint {
  def this(data: IkConstraintData, skeleton: Skeleton) = this()
  var bendDirection: scala.Double = js.native
  var bones: js.Array[Bone] = js.native
  var data: IkConstraintData = js.native
  var mix: scala.Double = js.native
  var target: Bone = js.native
  @JSName("apply")
  def apply(): scala.Unit = js.native
  def apply1(bone: Bone, targetX: scala.Double, targetY: scala.Double, alpha: scala.Double): scala.Unit = js.native
  def apply2(
    parent: Bone,
    child: Bone,
    targetX: scala.Double,
    targetY: scala.Double,
    bendDir: scala.Double,
    alpha: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def getOrder(): scala.Double = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

