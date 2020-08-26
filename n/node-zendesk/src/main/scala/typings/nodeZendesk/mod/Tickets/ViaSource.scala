package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViaSource extends js.Object {
  var from: js.Object = js.native
  var rel: String | Null = js.native
  var to: js.Object = js.native
}

object ViaSource {
  @scala.inline
  def apply(from: js.Object, to: js.Object): ViaSource = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViaSource]
  }
  @scala.inline
  implicit class ViaSourceOps[Self <: ViaSource] (val x: Self) extends AnyVal {
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
    def setFrom(value: js.Object): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: js.Object): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelNull: Self = this.set("rel", null)
  }
  
}

