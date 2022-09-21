package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "PathConstraint")
@js.native
open class PathConstraint protected ()
  extends StObject
     with Updatable {
  def this(data: PathConstraintData, skeleton: Skeleton) = this()
  
  var active: Boolean = js.native
  
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
  
  /** The bones that will be modified by this path constraint. */
  var bones: js.Array[Bone] = js.native
  
  def computeWorldPositions(path: PathAttachment, spacesCount: Double, tangents: Boolean): js.Array[Double] = js.native
  
  var curves: js.Array[Double] = js.native
  
  /** The path constraint's setup pose data. */
  var data: PathConstraintData = js.native
  
  /** Returns false when this item has not been updated because a skin is required and the {@link Skeleton#skin active skin}
    * does not contain this item.
    * @see Skin#getBones()
    * @see Skin#getConstraints() */
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  var lengths: js.Array[Double] = js.native
  
  var mixRotate: Double = js.native
  
  var mixX: Double = js.native
  
  var mixY: Double = js.native
  
  /** The position along the path. */
  var position: Double = js.native
  
  var positions: js.Array[Double] = js.native
  
  var segments: js.Array[Double] = js.native
  
  var spaces: js.Array[Double] = js.native
  
  /** The spacing between bones. */
  var spacing: Double = js.native
  
  /** The slot whose path attachment will be used to constrained the bones. */
  var target: Slot = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  var world: js.Array[Double] = js.native
}
/* static members */
object PathConstraint {
  
  @JSImport("@pixi-spine/runtime-4.1", "PathConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-4.1", "PathConstraint.AFTER")
  @js.native
  def AFTER: Double = js.native
  inline def AFTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AFTER")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-4.1", "PathConstraint.BEFORE")
  @js.native
  def BEFORE: Double = js.native
  inline def BEFORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEFORE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-4.1", "PathConstraint.NONE")
  @js.native
  def NONE: Double = js.native
  inline def NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-4.1", "PathConstraint.epsilon")
  @js.native
  def epsilon: Double = js.native
  inline def epsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epsilon")(x.asInstanceOf[js.Any])
}
