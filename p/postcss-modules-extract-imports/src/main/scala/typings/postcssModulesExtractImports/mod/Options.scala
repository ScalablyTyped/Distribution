package typings.postcssModulesExtractImports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var createImportedName: js.UndefOr[js.Function2[/* importName */ String, /* importPath */ String, String]] = js.native
  var failOnWrongOrder: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCreateImportedName(value: (/* importName */ String, /* importPath */ String) => String): Self = this.set("createImportedName", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreateImportedName: Self = this.set("createImportedName", js.undefined)
    @scala.inline
    def setFailOnWrongOrder(value: Boolean): Self = this.set("failOnWrongOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailOnWrongOrder: Self = this.set("failOnWrongOrder", js.undefined)
  }
  
}

