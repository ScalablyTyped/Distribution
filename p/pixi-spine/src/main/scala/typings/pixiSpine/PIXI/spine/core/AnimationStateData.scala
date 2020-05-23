package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStateData extends js.Object {
  var animationToMixTime: Map[Double]
  var defaultMix: Double
  var skeletonData: SkeletonData
  def getMix(from: Animation, to: Animation): Double
  def setMix(fromName: String, toName: String, duration: Double): Unit
  def setMixByName(fromName: String, toName: String, duration: Double): Unit
  def setMixWith(from: Animation, to: Animation, duration: Double): Unit
}

object AnimationStateData {
  @scala.inline
  def apply(
    animationToMixTime: Map[Double],
    defaultMix: Double,
    getMix: (Animation, Animation) => Double,
    setMix: (String, String, Double) => Unit,
    setMixByName: (String, String, Double) => Unit,
    setMixWith: (Animation, Animation, Double) => Unit,
    skeletonData: SkeletonData
  ): AnimationStateData = {
    val __obj = js.Dynamic.literal(animationToMixTime = animationToMixTime.asInstanceOf[js.Any], defaultMix = defaultMix.asInstanceOf[js.Any], getMix = js.Any.fromFunction2(getMix), setMix = js.Any.fromFunction3(setMix), setMixByName = js.Any.fromFunction3(setMixByName), setMixWith = js.Any.fromFunction3(setMixWith), skeletonData = skeletonData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStateData]
  }
}

