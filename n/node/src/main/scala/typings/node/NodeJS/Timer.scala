package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// compatibility with older typings
@js.native
trait Timer extends RefCounted {
  def hasRef(): Boolean = js.native
  def refresh(): this.type = js.native
}

object Timer {
  @scala.inline
  def apply(hasRef: () => Boolean, ref: () => Timer, refresh: () => Timer, unref: () => Timer): Timer = {
    val __obj = js.Dynamic.literal(hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), refresh = js.Any.fromFunction0(refresh), unref = js.Any.fromFunction0(unref))
    __obj.asInstanceOf[Timer]
  }
  @scala.inline
  implicit class TimerOps[Self <: Timer] (val x: Self) extends AnyVal {
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
    def setHasRef(value: () => Boolean): Self = this.set("hasRef", js.Any.fromFunction0(value))
    @scala.inline
    def setRefresh(value: () => Timer): Self = this.set("refresh", js.Any.fromFunction0(value))
  }
  
}

