package typings.node.dnsMod

import typings.node.nodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupOneOptions extends LookupOptions {
  @JSName("all")
  var all_LookupOneOptions: js.UndefOr[`false`] = js.native
}

object LookupOneOptions {
  @scala.inline
  def apply(): LookupOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOneOptions]
  }
  @scala.inline
  implicit class LookupOneOptionsOps[Self <: LookupOneOptions] (val x: Self) extends AnyVal {
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
    def setAll(value: `false`): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
  }
  
}

