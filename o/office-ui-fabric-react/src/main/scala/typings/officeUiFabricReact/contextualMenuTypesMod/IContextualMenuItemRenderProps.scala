package typings.officeUiFabricReact.contextualMenuTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuItemRenderProps extends IContextualMenuItem {
  var focusableElementIndex: Double = js.native
  var hasCheckmarks: Boolean = js.native
  var hasIcons: Boolean = js.native
  var index: Double = js.native
  var totalItemCount: Double = js.native
}

object IContextualMenuItemRenderProps {
  @scala.inline
  def apply(
    focusableElementIndex: Double,
    hasCheckmarks: Boolean,
    hasIcons: Boolean,
    index: Double,
    key: String,
    totalItemCount: Double
  ): IContextualMenuItemRenderProps = {
    val __obj = js.Dynamic.literal(focusableElementIndex = focusableElementIndex.asInstanceOf[js.Any], hasCheckmarks = hasCheckmarks.asInstanceOf[js.Any], hasIcons = hasIcons.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItemRenderProps]
  }
  @scala.inline
  implicit class IContextualMenuItemRenderPropsOps[Self <: IContextualMenuItemRenderProps] (val x: Self) extends AnyVal {
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
    def setFocusableElementIndex(value: Double): Self = this.set("focusableElementIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasCheckmarks(value: Boolean): Self = this.set("hasCheckmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasIcons(value: Boolean): Self = this.set("hasIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalItemCount(value: Double): Self = this.set("totalItemCount", value.asInstanceOf[js.Any])
  }
  
}

