package typings.pixiSpine.global.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.TransformConstraint")
@js.native
class TransformConstraint protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.TransformConstraint {
  def this(
    data: typings.pixiSpine.PIXI.spine.core.TransformConstraintData,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton
  ) = this()
  
  /* CompleteClass */
  var active: Boolean = js.native
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  
  /* CompleteClass */
  override def applyAbsoluteLocal(): Unit = js.native
  
  /* CompleteClass */
  override def applyAbsoluteWorld(): Unit = js.native
  
  /* CompleteClass */
  override def applyRelativeLocal(): Unit = js.native
  
  /* CompleteClass */
  override def applyRelativeWorld(): Unit = js.native
  
  /* CompleteClass */
  var bones: js.Array[typings.pixiSpine.PIXI.spine.core.Bone] = js.native
  
  /* CompleteClass */
  var data: typings.pixiSpine.PIXI.spine.core.TransformConstraintData = js.native
  
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /* CompleteClass */
  var rotateMix: Double = js.native
  
  /* CompleteClass */
  var scaleMix: Double = js.native
  
  /* CompleteClass */
  var shearMix: Double = js.native
  
  /* CompleteClass */
  var target: typings.pixiSpine.PIXI.spine.core.Bone = js.native
  
  /* CompleteClass */
  var temp: typings.pixiSpine.PIXI.spine.core.Vector2 = js.native
  
  /* CompleteClass */
  var translateMix: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
