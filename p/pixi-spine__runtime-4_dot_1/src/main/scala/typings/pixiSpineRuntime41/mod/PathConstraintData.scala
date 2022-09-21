package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.PositionMode
import typings.pixiSpineBase.mod.RotateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "PathConstraintData")
@js.native
open class PathConstraintData protected () extends ConstraintData {
  def this(name: String) = this()
  
  /** The slot whose path attachment will be used to constrained the bones. */
  /* private */ var _target: Any = js.native
  
  /** The bones that will be modified by this path constraint. */
  var bones: js.Array[BoneData] = js.native
  
  var mixRotate: Double = js.native
  
  var mixX: Double = js.native
  
  var mixY: Double = js.native
  
  /** An offset added to the constrained bone rotation. */
  var offsetRotation: Double = js.native
  
  /** The position along the path. */
  var position: Double = js.native
  
  /** The mode for positioning the first bone on the path. */
  var positionMode: PositionMode = js.native
  
  /** The mode for adjusting the rotation of the bones. */
  var rotateMode: RotateMode = js.native
  
  /** The spacing between bones. */
  var spacing: Double = js.native
  
  /** The mode for positioning the bones after the first bone on the path. */
  var spacingMode: SpacingMode = js.native
  
  def target: SlotData = js.native
  def target_=(slotData: SlotData): Unit = js.native
}
