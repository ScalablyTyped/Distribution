package typings.nodePgMigrate.viewsTypesMod

import typings.nodePgMigrate.nodePgMigrateStrings.CASCADED
import typings.nodePgMigrate.nodePgMigrateStrings.LOCAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterViewOptions extends js.Object {
  var checkOption: js.UndefOr[Null | CASCADED | LOCAL] = js.native
  var options: js.UndefOr[js.Object] = js.native
}

object AlterViewOptions {
  @scala.inline
  def apply(): AlterViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlterViewOptions]
  }
  @scala.inline
  implicit class AlterViewOptionsOps[Self <: AlterViewOptions] (val x: Self) extends AnyVal {
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
    def setCheckOption(value: CASCADED | LOCAL): Self = this.set("checkOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckOption: Self = this.set("checkOption", js.undefined)
    @scala.inline
    def setCheckOptionNull: Self = this.set("checkOption", null)
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

