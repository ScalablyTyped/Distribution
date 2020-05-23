package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathConstraint extends Updatable {
  var active: Boolean
  var bones: js.Array[Bone]
  var curves: js.Array[Double]
  var data: PathConstraintData
  var lengths: js.Array[Double]
  var position: Double
  var positions: js.Array[Double]
  var rotateMix: Double
  var segments: js.Array[Double]
  var spaces: js.Array[Double]
  var spacing: Double
  var target: Slot
  var translateMix: Double
  var world: js.Array[Double]
  def addAfterPosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit
  def addBeforePosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit
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
  ): Unit
  @JSName("apply")
  def apply(): Unit
  def computeWorldPositions(
    path: PathAttachment,
    spacesCount: Double,
    tangents: Boolean,
    percentPosition: Boolean,
    percentSpacing: Boolean
  ): js.Array[Double]
}

object PathConstraint {
  @scala.inline
  def apply(
    active: Boolean,
    addAfterPosition: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit,
    addBeforePosition: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit,
    addCurvePosition: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.Array[Double], Double, Boolean) => Unit,
    apply: () => Unit,
    bones: js.Array[Bone],
    computeWorldPositions: (PathAttachment, Double, Boolean, Boolean, Boolean) => js.Array[Double],
    curves: js.Array[Double],
    data: PathConstraintData,
    isActive: () => Boolean,
    lengths: js.Array[Double],
    position: Double,
    positions: js.Array[Double],
    rotateMix: Double,
    segments: js.Array[Double],
    spaces: js.Array[Double],
    spacing: Double,
    target: Slot,
    translateMix: Double,
    update: () => Unit,
    world: js.Array[Double]
  ): PathConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addAfterPosition = js.Any.fromFunction5(addAfterPosition), addBeforePosition = js.Any.fromFunction5(addBeforePosition), addCurvePosition = js.Any.fromFunction12(addCurvePosition), apply = js.Any.fromFunction0(apply), bones = bones.asInstanceOf[js.Any], computeWorldPositions = js.Any.fromFunction5(computeWorldPositions), curves = curves.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), lengths = lengths.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], rotateMix = rotateMix.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathConstraint]
  }
}

