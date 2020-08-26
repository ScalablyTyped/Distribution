package typings.natsHemera.mod

import typings.natsHemera.natsHemeraStrings.pubsub
import typings.natsHemera.natsHemeraStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request$ extends js.Object {
  var id: String = js.native
  var `type`: pubsub | request = js.native
}

object Request$ {
  @scala.inline
  def apply(id: String, `type`: pubsub | request): Request$ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request$]
  }
  @scala.inline
  implicit class Request$Ops[Self <: Request$] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: pubsub | request): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

