package typings.popmotion.tweenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenInterface[V] extends js.Object {
  def getElapsed(): V
  def getProgress(): V
  def isActive(): Boolean
  def pause(): TweenInterface[V]
  def resume(): TweenInterface[V]
  def reverse(): TweenInterface[V]
  def seek(progress: Double): TweenInterface[V]
  def stop(): Unit
}

object TweenInterface {
  @scala.inline
  def apply[V](
    getElapsed: () => V,
    getProgress: () => V,
    isActive: () => Boolean,
    pause: () => TweenInterface[V],
    resume: () => TweenInterface[V],
    reverse: () => TweenInterface[V],
    seek: Double => TweenInterface[V],
    stop: () => Unit
  ): TweenInterface[V] = {
    val __obj = js.Dynamic.literal(getElapsed = js.Any.fromFunction0(getElapsed), getProgress = js.Any.fromFunction0(getProgress), isActive = js.Any.fromFunction0(isActive), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), reverse = js.Any.fromFunction0(reverse), seek = js.Any.fromFunction1(seek), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[TweenInterface[V]]
  }
}

