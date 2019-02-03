package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.PathConstraint")
@js.native
class PathConstraint protected () extends Constraint {
  def this(data: PathConstraintData, skeleton: Skeleton) = this()
  var bones: js.Array[Bone] = js.native
  var curves: js.Array[scala.Double] = js.native
  var data: PathConstraintData = js.native
  var lengths: js.Array[scala.Double] = js.native
  var position: scala.Double = js.native
  var positions: js.Array[scala.Double] = js.native
  var rotateMix: scala.Double = js.native
  var segments: js.Array[scala.Double] = js.native
  var spaces: js.Array[scala.Double] = js.native
  var spacing: scala.Double = js.native
  var target: Slot = js.native
  var translateMix: scala.Double = js.native
  var world: js.Array[scala.Double] = js.native
  def addAfterPosition(
    p: scala.Double,
    temp: js.Array[scala.Double],
    i: scala.Double,
    out: js.Array[scala.Double],
    o: scala.Double
  ): scala.Unit = js.native
  def addBeforePosition(
    p: scala.Double,
    temp: js.Array[scala.Double],
    i: scala.Double,
    out: js.Array[scala.Double],
    o: scala.Double
  ): scala.Unit = js.native
  def addCurvePosition(
    p: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    cx1: scala.Double,
    cy1: scala.Double,
    cx2: scala.Double,
    cy2: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    out: js.Array[scala.Double],
    o: scala.Double,
    tangents: scala.Boolean
  ): scala.Unit = js.native
  @JSName("apply")
  def apply(): scala.Unit = js.native
  def computeWorldPositions(
    path: PathAttachment,
    spacesCount: scala.Double,
    tangents: scala.Boolean,
    percentPosition: scala.Boolean,
    percentSpacing: scala.Boolean
  ): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getOrder(): scala.Double = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

/* static members */
@JSGlobal("spine.PathConstraint")
@js.native
object PathConstraint extends js.Object {
  var AFTER: scala.Double = js.native
  var BEFORE: scala.Double = js.native
  var NONE: scala.Double = js.native
  var epsilon: scala.Double = js.native
}

