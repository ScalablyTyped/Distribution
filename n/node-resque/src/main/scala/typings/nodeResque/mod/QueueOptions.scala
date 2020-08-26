package typings.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueOptions extends js.Object {
  var connection: js.UndefOr[ConnectionOptions] = js.native
}

object QueueOptions {
  @scala.inline
  def apply(): QueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueOptions]
  }
  @scala.inline
  implicit class QueueOptionsOps[Self <: QueueOptions] (val x: Self) extends AnyVal {
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
    def setConnection(value: ConnectionOptions): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
  }
  
}

