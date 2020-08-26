package typings.officeUiFabricReact.overflowSetTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowSetStyles extends js.Object {
  /** The style that is layered onto each individual item in the overflow set. */
  var item: js.UndefOr[IStyle] = js.native
  /** The style that is layered onto the overflow button for the overflow set. */
  var overflowButton: js.UndefOr[IStyle] = js.native
  /** The style that is layered onto the root element of OverflowSet. */
  var root: js.UndefOr[IStyle] = js.native
}

object IOverflowSetStyles {
  @scala.inline
  def apply(): IOverflowSetStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverflowSetStyles]
  }
  @scala.inline
  implicit class IOverflowSetStylesOps[Self <: IOverflowSetStyles] (val x: Self) extends AnyVal {
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
    def setItem(value: IStyle): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setItemNull: Self = this.set("item", null)
    @scala.inline
    def setOverflowButton(value: IStyle): Self = this.set("overflowButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowButton: Self = this.set("overflowButton", js.undefined)
    @scala.inline
    def setOverflowButtonNull: Self = this.set("overflowButton", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

