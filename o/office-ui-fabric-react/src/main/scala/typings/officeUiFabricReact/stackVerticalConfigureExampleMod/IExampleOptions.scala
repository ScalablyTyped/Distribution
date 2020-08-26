package typings.officeUiFabricReact.stackVerticalConfigureExampleMod

import typings.officeUiFabricReact.stackTypesMod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExampleOptions extends js.Object {
  var autoHeight: Boolean = js.native
  var childrenGap: Double = js.native
  var disableShrink: Boolean = js.native
  var emptyChildren: js.Array[String] = js.native
  var hideEmptyChildren: Boolean = js.native
  var horizontalAlignment: js.UndefOr[Alignment] = js.native
  var numItems: Double = js.native
  var paddingBottom: Double = js.native
  var paddingLeft: Double = js.native
  var paddingRight: Double = js.native
  var paddingTop: Double = js.native
  var preventOverflow: Boolean = js.native
  var showBoxShadow: Boolean = js.native
  var stackHeight: Double = js.native
  var verticalAlignment: js.UndefOr[Alignment] = js.native
  var wrap: Boolean = js.native
}

object IExampleOptions {
  @scala.inline
  def apply(
    autoHeight: Boolean,
    childrenGap: Double,
    disableShrink: Boolean,
    emptyChildren: js.Array[String],
    hideEmptyChildren: Boolean,
    numItems: Double,
    paddingBottom: Double,
    paddingLeft: Double,
    paddingRight: Double,
    paddingTop: Double,
    preventOverflow: Boolean,
    showBoxShadow: Boolean,
    stackHeight: Double,
    wrap: Boolean
  ): IExampleOptions = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], childrenGap = childrenGap.asInstanceOf[js.Any], disableShrink = disableShrink.asInstanceOf[js.Any], emptyChildren = emptyChildren.asInstanceOf[js.Any], hideEmptyChildren = hideEmptyChildren.asInstanceOf[js.Any], numItems = numItems.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], preventOverflow = preventOverflow.asInstanceOf[js.Any], showBoxShadow = showBoxShadow.asInstanceOf[js.Any], stackHeight = stackHeight.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExampleOptions]
  }
  @scala.inline
  implicit class IExampleOptionsOps[Self <: IExampleOptions] (val x: Self) extends AnyVal {
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
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenGap(value: Double): Self = this.set("childrenGap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableShrink(value: Boolean): Self = this.set("disableShrink", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmptyChildrenVarargs(value: String*): Self = this.set("emptyChildren", js.Array(value :_*))
    @scala.inline
    def setEmptyChildren(value: js.Array[String]): Self = this.set("emptyChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideEmptyChildren(value: Boolean): Self = this.set("hideEmptyChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumItems(value: Double): Self = this.set("numItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingBottom(value: Double): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingTop(value: Double): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventOverflow(value: Boolean): Self = this.set("preventOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowBoxShadow(value: Boolean): Self = this.set("showBoxShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackHeight(value: Double): Self = this.set("stackHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalAlignment(value: Alignment): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: Alignment): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
  
}

