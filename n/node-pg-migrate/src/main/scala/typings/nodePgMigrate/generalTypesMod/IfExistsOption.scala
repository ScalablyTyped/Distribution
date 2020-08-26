package typings.nodePgMigrate.generalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfExistsOption extends js.Object {
  var ifExists: js.UndefOr[Boolean] = js.native
}

object IfExistsOption {
  @scala.inline
  def apply(): IfExistsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfExistsOption]
  }
  @scala.inline
  implicit class IfExistsOptionOps[Self <: IfExistsOption] (val x: Self) extends AnyVal {
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
    def setIfExists(value: Boolean): Self = this.set("ifExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfExists: Self = this.set("ifExists", js.undefined)
  }
  
}

