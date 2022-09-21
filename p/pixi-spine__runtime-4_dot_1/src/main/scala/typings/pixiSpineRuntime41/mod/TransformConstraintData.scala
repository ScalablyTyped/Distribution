package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "TransformConstraintData")
@js.native
open class TransformConstraintData protected () extends ConstraintData {
  def this(name: String) = this()
  
  /** The target bone whose world transform will be copied to the constrained bones. */
  /* private */ var _target: Any = js.native
  
  /** The bones that will be modified by this transform constraint. */
  var bones: js.Array[BoneData] = js.native
  
  var local: Boolean = js.native
  
  var mixRotate: Double = js.native
  
  var mixScaleX: Double = js.native
  
  var mixScaleY: Double = js.native
  
  var mixShearY: Double = js.native
  
  var mixX: Double = js.native
  
  var mixY: Double = js.native
  
  /** An offset added to the constrained bone rotation. */
  var offsetRotation: Double = js.native
  
  /** An offset added to the constrained bone scaleX. */
  var offsetScaleX: Double = js.native
  
  /** An offset added to the constrained bone scaleY. */
  var offsetScaleY: Double = js.native
  
  /** An offset added to the constrained bone shearY. */
  var offsetShearY: Double = js.native
  
  /** An offset added to the constrained bone X translation. */
  var offsetX: Double = js.native
  
  /** An offset added to the constrained bone Y translation. */
  var offsetY: Double = js.native
  
  var relative: Boolean = js.native
  
  def target: BoneData = js.native
  def target_=(boneData: BoneData): Unit = js.native
}
