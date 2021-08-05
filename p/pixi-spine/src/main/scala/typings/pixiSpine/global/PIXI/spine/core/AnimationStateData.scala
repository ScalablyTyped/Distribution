package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.AnimationStateData")
@js.native
class AnimationStateData protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.AnimationStateData {
  def this(skeletonData: typings.pixiSpine.PIXI.spine.core.SkeletonData) = this()
  
  /* CompleteClass */
  var animationToMixTime: Map[Double] = js.native
  
  /* CompleteClass */
  var defaultMix: Double = js.native
  
  /* CompleteClass */
  override def getMix(from: typings.pixiSpine.PIXI.spine.core.Animation, to: typings.pixiSpine.PIXI.spine.core.Animation): Double = js.native
  
  /* CompleteClass */
  override def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  
  /* CompleteClass */
  override def setMixByName(fromName: String, toName: String, duration: Double): Unit = js.native
  
  /* CompleteClass */
  override def setMixWith(
    from: typings.pixiSpine.PIXI.spine.core.Animation,
    to: typings.pixiSpine.PIXI.spine.core.Animation,
    duration: Double
  ): Unit = js.native
  
  /* CompleteClass */
  var skeletonData: typings.pixiSpine.PIXI.spine.core.SkeletonData = js.native
}
object AnimationStateData {
  
  @JSGlobal("PIXI.spine.core.AnimationStateData")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.core.AnimationStateData.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: js.Any = js.native
  inline def deprecatedWarning1_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
}
