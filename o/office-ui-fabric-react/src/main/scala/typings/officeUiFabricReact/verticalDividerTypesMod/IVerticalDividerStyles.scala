package typings.officeUiFabricReact.verticalDividerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVerticalDividerStyles extends js.Object {
  /**
    * Styling for the divider.
    */
  var divider: IStyle = js.native
  /**
    * Styling for the div that wraps the actual divider
    */
  var wrapper: IStyle = js.native
}

object IVerticalDividerStyles {
  @scala.inline
  def apply(): IVerticalDividerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVerticalDividerStyles]
  }
  @scala.inline
  implicit class IVerticalDividerStylesOps[Self <: IVerticalDividerStyles] (val x: Self) extends AnyVal {
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
    def setDivider(value: IStyle): Self = this.set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    @scala.inline
    def setDividerNull: Self = this.set("divider", null)
    @scala.inline
    def setWrapper(value: IStyle): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
    @scala.inline
    def setWrapperNull: Self = this.set("wrapper", null)
  }
  
}

