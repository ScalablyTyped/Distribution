package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.AnimationStateData")
@js.native
class AnimationStateData protected () extends js.Object {
  def this(skeletonData: SkeletonData) = this()
  var animationToMixTime: Map[Double] = js.native
  var defaultMix: Double = js.native
  var skeletonData: SkeletonData = js.native
  def getMix(from: Animation, to: Animation): Double = js.native
  def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  def setMixByName(fromName: String, toName: String, duration: Double): Unit = js.native
  def setMixWith(from: Animation, to: Animation, duration: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.AnimationStateData")
@js.native
object AnimationStateData extends js.Object {
  var deprecatedWarning1: js.Any = js.native
}

