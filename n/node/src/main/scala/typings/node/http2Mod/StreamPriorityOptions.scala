package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamPriorityOptions extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.native
  var parent: js.UndefOr[Double] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object StreamPriorityOptions {
  @scala.inline
  def apply(): StreamPriorityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamPriorityOptions]
  }
  @scala.inline
  implicit class StreamPriorityOptionsOps[Self <: StreamPriorityOptions] (val x: Self) extends AnyVal {
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
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    @scala.inline
    def setParent(value: Double): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

