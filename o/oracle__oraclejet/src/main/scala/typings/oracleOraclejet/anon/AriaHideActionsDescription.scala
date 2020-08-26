package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AriaHideActionsDescription extends js.Object {
  var ariaHideActionsDescription: js.UndefOr[String] = js.native
  var ariaShowEndActionsDescription: js.UndefOr[String] = js.native
  var ariaShowStartActionsDescription: js.UndefOr[String] = js.native
}

object AriaHideActionsDescription {
  @scala.inline
  def apply(): AriaHideActionsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaHideActionsDescription]
  }
  @scala.inline
  implicit class AriaHideActionsDescriptionOps[Self <: AriaHideActionsDescription] (val x: Self) extends AnyVal {
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
    def setAriaHideActionsDescription(value: String): Self = this.set("ariaHideActionsDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaHideActionsDescription: Self = this.set("ariaHideActionsDescription", js.undefined)
    @scala.inline
    def setAriaShowEndActionsDescription(value: String): Self = this.set("ariaShowEndActionsDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaShowEndActionsDescription: Self = this.set("ariaShowEndActionsDescription", js.undefined)
    @scala.inline
    def setAriaShowStartActionsDescription(value: String): Self = this.set("ariaShowStartActionsDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaShowStartActionsDescription: Self = this.set("ariaShowStartActionsDescription", js.undefined)
  }
  
}

