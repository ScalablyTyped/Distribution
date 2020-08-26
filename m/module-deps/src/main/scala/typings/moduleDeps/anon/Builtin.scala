package typings.moduleDeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builtin extends js.Object {
  var builtin: js.UndefOr[Boolean] = js.native
  var inNodeModules: js.UndefOr[Boolean] = js.native
}

object Builtin {
  @scala.inline
  def apply(): Builtin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Builtin]
  }
  @scala.inline
  implicit class BuiltinOps[Self <: Builtin] (val x: Self) extends AnyVal {
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
    def setBuiltin(value: Boolean): Self = this.set("builtin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltin: Self = this.set("builtin", js.undefined)
    @scala.inline
    def setInNodeModules(value: Boolean): Self = this.set("inNodeModules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInNodeModules: Self = this.set("inNodeModules", js.undefined)
  }
  
}

