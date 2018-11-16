package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.AnimationStateData")
@js.native
class AnimationStateData protected () extends js.Object {
  def this(skeletonData: SkeletonData) = this()
  var animationToMixTime: Map[scala.Double] = js.native
  var defaultMix: scala.Double = js.native
  var skeletonData: SkeletonData = js.native
  def getMix(from: Animation, to: Animation): scala.Double = js.native
  def setMix(fromName: java.lang.String, toName: java.lang.String, duration: scala.Double): scala.Unit = js.native
  def setMixWith(from: Animation, to: Animation, duration: scala.Double): scala.Unit = js.native
}

