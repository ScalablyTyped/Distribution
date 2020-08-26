package typings.metismenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetisMenuOptions extends js.Object {
  var parentTrigger: js.UndefOr[String] = js.native
  var preventDefault: js.UndefOr[Boolean] = js.native
  var subMenu: js.UndefOr[String] = js.native
  var toggle: js.UndefOr[Boolean] = js.native
  var triggerElement: js.UndefOr[String] = js.native
}

object MetisMenuOptions {
  @scala.inline
  def apply(): MetisMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetisMenuOptions]
  }
  @scala.inline
  implicit class MetisMenuOptionsOps[Self <: MetisMenuOptions] (val x: Self) extends AnyVal {
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
    def setParentTrigger(value: String): Self = this.set("parentTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTrigger: Self = this.set("parentTrigger", js.undefined)
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    @scala.inline
    def setSubMenu(value: String): Self = this.set("subMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenu: Self = this.set("subMenu", js.undefined)
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setTriggerElement(value: String): Self = this.set("triggerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerElement: Self = this.set("triggerElement", js.undefined)
  }
  
}

