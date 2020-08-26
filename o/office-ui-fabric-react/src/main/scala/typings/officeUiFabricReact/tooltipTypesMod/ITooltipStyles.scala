package typings.officeUiFabricReact.tooltipTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipStyles extends js.Object {
  /**
    * Style for the content element.
    */
  var content: IStyle = js.native
  /**
    * Style for the root element.
    */
  var root: IStyle = js.native
  /**
    * Style for the subtext element.
    */
  var subText: IStyle = js.native
}

object ITooltipStyles {
  @scala.inline
  def apply(): ITooltipStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipStyles]
  }
  @scala.inline
  implicit class ITooltipStylesOps[Self <: ITooltipStyles] (val x: Self) extends AnyVal {
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
    def setContent(value: IStyle): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setSubText(value: IStyle): Self = this.set("subText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubText: Self = this.set("subText", js.undefined)
    @scala.inline
    def setSubTextNull: Self = this.set("subText", null)
  }
  
}

