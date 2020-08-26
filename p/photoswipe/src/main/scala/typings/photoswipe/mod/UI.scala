package typings.photoswipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UI[T /* <: Options */] extends js.Object {
  /**
    * Called by PhotoSwipe after it constructs the UI.
    */
  def init(): Unit = js.native
}

object UI {
  @scala.inline
  def apply[/* <: typings.photoswipe.mod.Options */ T](init: () => Unit): UI[T] = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[UI[T]]
  }
  @scala.inline
  implicit class UIOps[Self <: UI[_], /* <: typings.photoswipe.mod.Options */ T] (val x: Self with UI[T]) extends AnyVal {
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
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
  }
  
}

