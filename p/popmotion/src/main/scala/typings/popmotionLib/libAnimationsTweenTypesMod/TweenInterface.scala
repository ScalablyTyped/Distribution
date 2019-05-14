package typings
package popmotionLib.libAnimationsTweenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenInterface extends js.Object {
  def getElapsed(): scala.Double
  def getProgress(): scala.Double
  def isActive(): scala.Boolean
  def pause(): TweenInterface
  def resume(): TweenInterface
  def reverse(): TweenInterface
  def seek(progress: scala.Double): TweenInterface
  def stop(): scala.Unit
}

object TweenInterface {
  @scala.inline
  def apply(
    getElapsed: () => scala.Double,
    getProgress: () => scala.Double,
    isActive: () => scala.Boolean,
    pause: () => TweenInterface,
    resume: () => TweenInterface,
    reverse: () => TweenInterface,
    seek: scala.Double => TweenInterface,
    stop: () => scala.Unit
  ): TweenInterface = {
    val __obj = js.Dynamic.literal(getElapsed = js.Any.fromFunction0(getElapsed), getProgress = js.Any.fromFunction0(getProgress), isActive = js.Any.fromFunction0(isActive), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), reverse = js.Any.fromFunction0(reverse), seek = js.Any.fromFunction1(seek), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[TweenInterface]
  }
}

