package typings.nano.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait External extends js.Object {
  var active: Double = js.native
  var external: Double = js.native
}

object External {
  @scala.inline
  def apply(active: Double, external: Double): External = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any])
    __obj.asInstanceOf[External]
  }
  @scala.inline
  implicit class ExternalOps[Self <: External] (val x: Self) extends AnyVal {
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
    def setActive(value: Double): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternal(value: Double): Self = this.set("external", value.asInstanceOf[js.Any])
  }
  
}

