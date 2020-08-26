package typings.nodePgMigrate.generalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfNotExistsOption extends js.Object {
  var ifNotExists: js.UndefOr[Boolean] = js.native
}

object IfNotExistsOption {
  @scala.inline
  def apply(): IfNotExistsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfNotExistsOption]
  }
  @scala.inline
  implicit class IfNotExistsOptionOps[Self <: IfNotExistsOption] (val x: Self) extends AnyVal {
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
    def setIfNotExists(value: Boolean): Self = this.set("ifNotExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfNotExists: Self = this.set("ifNotExists", js.undefined)
  }
  
}

