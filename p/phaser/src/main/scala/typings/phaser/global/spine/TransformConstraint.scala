package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.TransformConstraint")
@js.native
class TransformConstraint protected ()
  extends StObject
     with typings.phaser.spine.TransformConstraint {
  def this(data: typings.phaser.spine.TransformConstraintData, skeleton: typings.phaser.spine.Skeleton) = this()
  
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
  var bones: js.Array[typings.phaser.spine.Bone] = js.native
  
  /* CompleteClass */
  var data: typings.phaser.spine.TransformConstraintData = js.native
  
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /* CompleteClass */
  var rotateMix: Double = js.native
  
  /* CompleteClass */
  var scaleMix: Double = js.native
  
  /* CompleteClass */
  var shearMix: Double = js.native
  
  /* CompleteClass */
  var target: typings.phaser.spine.Bone = js.native
  
  /* CompleteClass */
  var temp: typings.phaser.spine.Vector2 = js.native
  
  /* CompleteClass */
  var translateMix: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
