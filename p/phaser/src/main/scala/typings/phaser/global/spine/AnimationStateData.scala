package typings.phaser.global.spine

import typings.phaser.spine.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.AnimationStateData")
@js.native
class AnimationStateData protected ()
  extends StObject
     with typings.phaser.spine.AnimationStateData {
  def this(skeletonData: typings.phaser.spine.SkeletonData) = this()
  
  /* CompleteClass */
  var animationToMixTime: Map[Double] = js.native
  
  /* CompleteClass */
  var defaultMix: Double = js.native
  
  /* CompleteClass */
  override def getMix(from: typings.phaser.spine.Animation, to: typings.phaser.spine.Animation): Double = js.native
  
  /* CompleteClass */
  override def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  
  /* CompleteClass */
  override def setMixWith(from: typings.phaser.spine.Animation, to: typings.phaser.spine.Animation, duration: Double): Unit = js.native
  
  /* CompleteClass */
  var skeletonData: typings.phaser.spine.SkeletonData = js.native
}
