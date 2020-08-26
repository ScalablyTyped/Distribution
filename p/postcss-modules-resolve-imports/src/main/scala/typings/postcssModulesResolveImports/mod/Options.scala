package typings.postcssModulesResolveImports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var icssExports: js.UndefOr[Boolean] = js.native
  var resolve: js.UndefOr[Resolve] = js.native
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
    def setIcssExports(value: Boolean): Self = this.set("icssExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcssExports: Self = this.set("icssExports", js.undefined)
    @scala.inline
    def setResolve(value: Resolve): Self = this.set("resolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
  }
  
}

