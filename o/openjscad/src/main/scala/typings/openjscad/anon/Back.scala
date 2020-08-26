package typings.openjscad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Back extends js.Object {
  var back: js.Any = js.native
  var front: js.Any = js.native
  var `type`: js.Any = js.native
}

object Back {
  @scala.inline
  def apply(back: js.Any, front: js.Any, `type`: js.Any): Back = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Back]
  }
  @scala.inline
  implicit class BackOps[Self <: Back] (val x: Self) extends AnyVal {
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
    def setBack(value: js.Any): Self = this.set("back", value.asInstanceOf[js.Any])
    @scala.inline
    def setFront(value: js.Any): Self = this.set("front", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

