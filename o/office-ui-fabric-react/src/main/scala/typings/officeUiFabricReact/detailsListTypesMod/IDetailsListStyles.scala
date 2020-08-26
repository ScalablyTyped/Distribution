package typings.officeUiFabricReact.detailsListTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListStyles extends js.Object {
  var contentWrapper: IStyle = js.native
  var focusZone: IStyle = js.native
  var headerWrapper: IStyle = js.native
  var root: IStyle = js.native
}

object IDetailsListStyles {
  @scala.inline
  def apply(): IDetailsListStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsListStyles]
  }
  @scala.inline
  implicit class IDetailsListStylesOps[Self <: IDetailsListStyles] (val x: Self) extends AnyVal {
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
    def setContentWrapper(value: IStyle): Self = this.set("contentWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentWrapper: Self = this.set("contentWrapper", js.undefined)
    @scala.inline
    def setContentWrapperNull: Self = this.set("contentWrapper", null)
    @scala.inline
    def setFocusZone(value: IStyle): Self = this.set("focusZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusZone: Self = this.set("focusZone", js.undefined)
    @scala.inline
    def setFocusZoneNull: Self = this.set("focusZone", null)
    @scala.inline
    def setHeaderWrapper(value: IStyle): Self = this.set("headerWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderWrapper: Self = this.set("headerWrapper", js.undefined)
    @scala.inline
    def setHeaderWrapperNull: Self = this.set("headerWrapper", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

