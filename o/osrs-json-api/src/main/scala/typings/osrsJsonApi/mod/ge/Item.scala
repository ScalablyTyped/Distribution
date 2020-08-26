package typings.osrsJsonApi.mod.ge

import typings.osrsJsonApi.anon.Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  var item: Current = js.native
}

object Item {
  @scala.inline
  def apply(item: Current): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
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
    def setItem(value: Current): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

