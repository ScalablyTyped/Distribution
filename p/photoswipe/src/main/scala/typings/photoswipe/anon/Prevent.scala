package typings.photoswipe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prevent extends js.Object {
  var prevent: Boolean = js.native
}

object Prevent {
  @scala.inline
  def apply(prevent: Boolean): Prevent = {
    val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prevent]
  }
  @scala.inline
  implicit class PreventOps[Self <: Prevent] (val x: Self) extends AnyVal {
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
    def setPrevent(value: Boolean): Self = this.set("prevent", value.asInstanceOf[js.Any])
  }
  
}

