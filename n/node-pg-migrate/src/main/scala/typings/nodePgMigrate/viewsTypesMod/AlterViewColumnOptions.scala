package typings.nodePgMigrate.viewsTypesMod

import typings.nodePgMigrate.generalTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterViewColumnOptions extends js.Object {
  var default: js.UndefOr[Value] = js.native
}

object AlterViewColumnOptions {
  @scala.inline
  def apply(): AlterViewColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlterViewColumnOptions]
  }
  @scala.inline
  implicit class AlterViewColumnOptionsOps[Self <: AlterViewColumnOptions] (val x: Self) extends AnyVal {
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
    def setDefaultVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
    ): Self = this.set("default", js.Array(value :_*))
    @scala.inline
    def setDefault(value: Value): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
  }
  
}

