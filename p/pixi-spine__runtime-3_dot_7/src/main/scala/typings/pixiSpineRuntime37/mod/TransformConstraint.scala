package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "TransformConstraint")
@js.native
open class TransformConstraint protected ()
  extends StObject
     with Constraint {
  def this(data: TransformConstraintData, skeleton: Skeleton) = this()
  
  @JSName("apply")
  def apply(): Unit = js.native
  
  def applyAbsoluteLocal(): Unit = js.native
  
  def applyAbsoluteWorld(): Unit = js.native
  
  def applyRelativeLocal(): Unit = js.native
  
  def applyRelativeWorld(): Unit = js.native
  
  var bones: js.Array[Bone] = js.native
  
  var data: TransformConstraintData = js.native
  
  /* CompleteClass */
  override def getOrder(): Double = js.native
  
  var rotateMix: Double = js.native
  
  var scaleMix: Double = js.native
  
  var shearMix: Double = js.native
  
  var target: Bone = js.native
  
  var temp: Vector2 = js.native
  
  var translateMix: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
