package typings.officeUiFabricReact.scrollablePaneDefaultExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollablePaneExampleItem extends js.Object {
  var color: String = js.native
  var index: Double = js.native
  var text: String = js.native
}

object IScrollablePaneExampleItem {
  @scala.inline
  def apply(color: String, index: Double, text: String): IScrollablePaneExampleItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneExampleItem]
  }
  @scala.inline
  implicit class IScrollablePaneExampleItemOps[Self <: IScrollablePaneExampleItem] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

