package typings.nodePgMigrate.generalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascadeOption extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.native
}

object CascadeOption {
  @scala.inline
  def apply(): CascadeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascadeOption]
  }
  @scala.inline
  implicit class CascadeOptionOps[Self <: CascadeOption] (val x: Self) extends AnyVal {
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
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
  }
  
}

