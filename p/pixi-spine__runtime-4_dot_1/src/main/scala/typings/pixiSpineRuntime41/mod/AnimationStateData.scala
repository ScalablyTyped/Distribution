package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.IAnimationStateData
import typings.pixiSpineBase.mod.Map2
import typings.pixiSpineBase.mod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "AnimationStateData")
@js.native
open class AnimationStateData protected ()
  extends StObject
     with IAnimationStateData[SkeletonData, Animation2] {
  def this(skeletonData: SkeletonData) = this()
  
  /* CompleteClass */
  var animationToMixTime: Map2[Double] = js.native
  @JSName("animationToMixTime")
  var animationToMixTime_AnimationStateData: StringMap[Double] = js.native
  
  /* CompleteClass */
  var defaultMix: Double = js.native
  
  /* CompleteClass */
  override def getMix(from: Animation2, to: Animation2): Double = js.native
  
  /* CompleteClass */
  override def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  
  /* CompleteClass */
  override def setMixWith(from: Animation2, to: Animation2, duration: Double): Unit = js.native
  
  /* CompleteClass */
  var skeletonData: SkeletonData = js.native
}
