package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.IAnimationStateData
import typings.pixiSpineBase.mod.Map2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "AnimationStateData")
@js.native
open class AnimationStateData protected ()
  extends StObject
     with IAnimationStateData[SkeletonData, Animation2] {
  def this(skeletonData: SkeletonData) = this()
  
  /* CompleteClass */
  var animationToMixTime: Map2[Double] = js.native
  
  /* CompleteClass */
  var defaultMix: Double = js.native
  
  /* CompleteClass */
  override def getMix(from: Animation2, to: Animation2): Double = js.native
  
  /* CompleteClass */
  override def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  
  def setMixByName(fromName: String, toName: String, duration: Double): Unit = js.native
  
  /* CompleteClass */
  override def setMixWith(from: Animation2, to: Animation2, duration: Double): Unit = js.native
  
  /* CompleteClass */
  var skeletonData: SkeletonData = js.native
}
/* static members */
object AnimationStateData {
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationStateData")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationStateData.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: Any = js.native
  inline def deprecatedWarning1_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
}
