package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.AnimationStateData")
@js.native
class AnimationStateData protected () extends js.Object {
  def this(skeletonData: SkeletonData) = this()
  var animationToMixTime: Map[Double] = js.native
  var defaultMix: Double = js.native
  var skeletonData: SkeletonData = js.native
  def getMix(from: Animation, to: Animation): Double = js.native
  def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  def setMixWith(from: Animation, to: Animation, duration: Double): Unit = js.native
}

