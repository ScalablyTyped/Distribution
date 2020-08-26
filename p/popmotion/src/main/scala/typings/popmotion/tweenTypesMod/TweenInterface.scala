package typings.popmotion.tweenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenInterface[V] extends js.Object {
  def getElapsed(): V = js.native
  def getProgress(): V = js.native
  def isActive(): Boolean = js.native
  def pause(): TweenInterface[V] = js.native
  def resume(): TweenInterface[V] = js.native
  def reverse(): TweenInterface[V] = js.native
  def seek(progress: Double): TweenInterface[V] = js.native
  def stop(): Unit = js.native
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
  @scala.inline
  implicit class TweenInterfaceOps[Self <: TweenInterface[_], V] (val x: Self with TweenInterface[V]) extends AnyVal {
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
    def setGetElapsed(value: () => V): Self = this.set("getElapsed", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProgress(value: () => V): Self = this.set("getProgress", js.Any.fromFunction0(value))
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    @scala.inline
    def setPause(value: () => TweenInterface[V]): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setResume(value: () => TweenInterface[V]): Self = this.set("resume", js.Any.fromFunction0(value))
    @scala.inline
    def setReverse(value: () => TweenInterface[V]): Self = this.set("reverse", js.Any.fromFunction0(value))
    @scala.inline
    def setSeek(value: Double => TweenInterface[V]): Self = this.set("seek", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

