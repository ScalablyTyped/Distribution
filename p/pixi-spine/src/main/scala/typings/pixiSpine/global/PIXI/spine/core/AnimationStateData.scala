package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.AnimationStateData")
@js.native
class AnimationStateData protected ()
  extends typings.pixiSpine.PIXI.spine.core.AnimationStateData {
  def this(skeletonData: typings.pixiSpine.PIXI.spine.core.SkeletonData) = this()
  /* CompleteClass */
  override var animationToMixTime: Map[Double] = js.native
  /* CompleteClass */
  override var defaultMix: Double = js.native
  /* CompleteClass */
  override var skeletonData: typings.pixiSpine.PIXI.spine.core.SkeletonData = js.native
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
}

/* static members */
@JSGlobal("PIXI.spine.core.AnimationStateData")
@js.native
object AnimationStateData extends js.Object {
  var deprecatedWarning1: js.Any = js.native
}

