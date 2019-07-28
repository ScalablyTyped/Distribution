package typings.pixiDashSpine.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.PathConstraint")
@js.native
class PathConstraint protected () extends Constraint {
  def this(data: PathConstraintData, skeleton: Skeleton) = this()
  var bones: js.Array[Bone] = js.native
  var curves: js.Array[Double] = js.native
  var data: PathConstraintData = js.native
  var lengths: js.Array[Double] = js.native
  var position: Double = js.native
  var positions: js.Array[Double] = js.native
  var rotateMix: Double = js.native
  var segments: js.Array[Double] = js.native
  var spaces: js.Array[Double] = js.native
  var spacing: Double = js.native
  var target: Slot = js.native
  var translateMix: Double = js.native
  var world: js.Array[Double] = js.native
  def addAfterPosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  def addBeforePosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  def addCurvePosition(
    p: Double,
    x1: Double,
    y1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    x2: Double,
    y2: Double,
    out: js.Array[Double],
    o: Double,
    tangents: Boolean
  ): Unit = js.native
  @JSName("apply")
  def apply(): Unit = js.native
  def computeWorldPositions(
    path: PathAttachment,
    spacesCount: Double,
    tangents: Boolean,
    percentPosition: Boolean,
    percentSpacing: Boolean
  ): js.Array[Double] = js.native
  /* CompleteClass */
  override def getOrder(): Double = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.PathConstraint")
@js.native
object PathConstraint extends js.Object {
  var AFTER: Double = js.native
  var BEFORE: Double = js.native
  var NONE: Double = js.native
  var epsilon: Double = js.native
}

