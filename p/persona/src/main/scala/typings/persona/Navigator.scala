package typings.persona

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  var id: typings.persona.Persona.Persona = js.native
}

object Navigator {
  @scala.inline
  def apply(id: typings.persona.Persona.Persona): Navigator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
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
    def setId(value: typings.persona.Persona.Persona): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

