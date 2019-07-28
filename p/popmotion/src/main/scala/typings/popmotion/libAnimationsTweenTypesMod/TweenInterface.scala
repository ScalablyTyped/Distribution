package typings.popmotion.libAnimationsTweenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenInterface extends js.Object {
  def getElapsed(): Double
  def getProgress(): Double
  def isActive(): Boolean
  def pause(): TweenInterface
  def resume(): TweenInterface
  def reverse(): TweenInterface
  def seek(progress: Double): TweenInterface
  def stop(): Unit
}

object TweenInterface {
  @scala.inline
  def apply(
    getElapsed: () => Double,
    getProgress: () => Double,
    isActive: () => Boolean,
    pause: () => TweenInterface,
    resume: () => TweenInterface,
    reverse: () => TweenInterface,
    seek: Double => TweenInterface,
    stop: () => Unit
  ): TweenInterface = {
    val __obj = js.Dynamic.literal(getElapsed = js.Any.fromFunction0(getElapsed), getProgress = js.Any.fromFunction0(getProgress), isActive = js.Any.fromFunction0(isActive), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), reverse = js.Any.fromFunction0(reverse), seek = js.Any.fromFunction1(seek), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[TweenInterface]
  }
}

