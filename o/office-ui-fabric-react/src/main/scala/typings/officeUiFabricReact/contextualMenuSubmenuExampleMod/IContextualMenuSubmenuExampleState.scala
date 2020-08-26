package typings.officeUiFabricReact.contextualMenuSubmenuExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuSubmenuExampleState extends js.Object {
  var hoverDelay: Double = js.native
}

object IContextualMenuSubmenuExampleState {
  @scala.inline
  def apply(hoverDelay: Double): IContextualMenuSubmenuExampleState = {
    val __obj = js.Dynamic.literal(hoverDelay = hoverDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuSubmenuExampleState]
  }
  @scala.inline
  implicit class IContextualMenuSubmenuExampleStateOps[Self <: IContextualMenuSubmenuExampleState] (val x: Self) extends AnyVal {
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
    def setHoverDelay(value: Double): Self = this.set("hoverDelay", value.asInstanceOf[js.Any])
  }
  
}

