package typings.minappEnv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Updated extends js.Object {
  var updated: Double = js.native
}

object Updated {
  @scala.inline
  def apply(updated: Double): Updated = {
    val __obj = js.Dynamic.literal(updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Updated]
  }
  @scala.inline
  implicit class UpdatedOps[Self <: Updated] (val x: Self) extends AnyVal {
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
    def setUpdated(value: Double): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
  
}

