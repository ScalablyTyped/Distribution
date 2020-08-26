package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait End extends js.Object {
  var end: Double | String = js.native
  var size: Double | String = js.native
  var start: Double | String = js.native
}

object End {
  @scala.inline
  def apply(end: Double | String, size: Double | String, start: Double | String): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  @scala.inline
  implicit class EndOps[Self <: End] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double | String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double | String): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

