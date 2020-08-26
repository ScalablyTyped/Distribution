package typings.officeUiFabricReact.detailsListGroupedExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListGroupedExampleItem extends js.Object {
  var color: String = js.native
  var key: String = js.native
  var name: String = js.native
}

object IDetailsListGroupedExampleItem {
  @scala.inline
  def apply(color: String, key: String, name: String): IDetailsListGroupedExampleItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListGroupedExampleItem]
  }
  @scala.inline
  implicit class IDetailsListGroupedExampleItemOps[Self <: IDetailsListGroupedExampleItem] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

