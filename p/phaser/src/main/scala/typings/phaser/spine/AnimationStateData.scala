package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationStateData extends js.Object {
  var animationToMixTime: Map[Double] = js.native
  var defaultMix: Double = js.native
  var skeletonData: SkeletonData = js.native
  def getMix(from: Animation, to: Animation): Double = js.native
  def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  def setMixWith(from: Animation, to: Animation, duration: Double): Unit = js.native
}

object AnimationStateData {
  @scala.inline
  def apply(
    animationToMixTime: Map[Double],
    defaultMix: Double,
    getMix: (Animation, Animation) => Double,
    setMix: (String, String, Double) => Unit,
    setMixWith: (Animation, Animation, Double) => Unit,
    skeletonData: SkeletonData
  ): AnimationStateData = {
    val __obj = js.Dynamic.literal(animationToMixTime = animationToMixTime.asInstanceOf[js.Any], defaultMix = defaultMix.asInstanceOf[js.Any], getMix = js.Any.fromFunction2(getMix), setMix = js.Any.fromFunction3(setMix), setMixWith = js.Any.fromFunction3(setMixWith), skeletonData = skeletonData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStateData]
  }
  @scala.inline
  implicit class AnimationStateDataOps[Self <: AnimationStateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationToMixTime(value: Map[Double]): Self = this.set("animationToMixTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultMix(value: Double): Self = this.set("defaultMix", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMix(value: (Animation, Animation) => Double): Self = this.set("getMix", js.Any.fromFunction2(value))
    @scala.inline
    def setSetMix(value: (String, String, Double) => Unit): Self = this.set("setMix", js.Any.fromFunction3(value))
    @scala.inline
    def setSetMixWith(value: (Animation, Animation, Double) => Unit): Self = this.set("setMixWith", js.Any.fromFunction3(value))
    @scala.inline
    def setSkeletonData(value: SkeletonData): Self = this.set("skeletonData", value.asInstanceOf[js.Any])
  }
  
}

