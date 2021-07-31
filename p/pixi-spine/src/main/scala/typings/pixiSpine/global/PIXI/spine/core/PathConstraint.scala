package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.PathConstraint")
@js.native
class PathConstraint protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.PathConstraint {
  def this(
    data: typings.pixiSpine.PIXI.spine.core.PathConstraintData,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton
  ) = this()
  
  /* CompleteClass */
  var active: Boolean = js.native
  
  /* CompleteClass */
  override def addAfterPosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  
  /* CompleteClass */
  override def addBeforePosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  
  /* CompleteClass */
  override def addCurvePosition(
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
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  
  /* CompleteClass */
  var bones: js.Array[typings.pixiSpine.PIXI.spine.core.Bone] = js.native
  
  /* CompleteClass */
  override def computeWorldPositions(
    path: typings.pixiSpine.PIXI.spine.core.PathAttachment,
    spacesCount: Double,
    tangents: Boolean,
    percentPosition: Boolean,
    percentSpacing: Boolean
  ): js.Array[Double] = js.native
  
  /* CompleteClass */
  var curves: js.Array[Double] = js.native
  
  /* CompleteClass */
  var data: typings.pixiSpine.PIXI.spine.core.PathConstraintData = js.native
  
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /* CompleteClass */
  var lengths: js.Array[Double] = js.native
  
  /* CompleteClass */
  var position: Double = js.native
  
  /* CompleteClass */
  var positions: js.Array[Double] = js.native
  
  /* CompleteClass */
  var rotateMix: Double = js.native
  
  /* CompleteClass */
  var segments: js.Array[Double] = js.native
  
  /* CompleteClass */
  var spaces: js.Array[Double] = js.native
  
  /* CompleteClass */
  var spacing: Double = js.native
  
  /* CompleteClass */
  var target: typings.pixiSpine.PIXI.spine.core.Slot = js.native
  
  /* CompleteClass */
  var translateMix: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /* CompleteClass */
  var world: js.Array[Double] = js.native
}
object PathConstraint {
  
  @JSGlobal("PIXI.spine.core.PathConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraint.AFTER")
  @js.native
  def AFTER: Double = js.native
  @scala.inline
  def AFTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AFTER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraint.BEFORE")
  @js.native
  def BEFORE: Double = js.native
  @scala.inline
  def BEFORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEFORE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraint.NONE")
  @js.native
  def NONE: Double = js.native
  @scala.inline
  def NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.core.PathConstraint.epsilon")
  @js.native
  def epsilon: Double = js.native
  @scala.inline
  def epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(x.asInstanceOf[js.Any])
}
