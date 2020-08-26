package typings.node.dnsMod

import typings.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupAllOptions extends LookupOptions {
  @JSName("all")
  var all_LookupAllOptions: `true` = js.native
}

object LookupAllOptions {
  @scala.inline
  def apply(all: `true`): LookupAllOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupAllOptions]
  }
  @scala.inline
  implicit class LookupAllOptionsOps[Self <: LookupAllOptions] (val x: Self) extends AnyVal {
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
    def setAll(value: `true`): Self = this.set("all", value.asInstanceOf[js.Any])
  }
  
}

