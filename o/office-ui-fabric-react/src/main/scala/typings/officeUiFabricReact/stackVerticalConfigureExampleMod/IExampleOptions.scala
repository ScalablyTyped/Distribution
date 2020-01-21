package typings.officeUiFabricReact.stackVerticalConfigureExampleMod

import typings.officeUiFabricReact.stackTypesMod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExampleOptions extends js.Object {
  var autoHeight: Boolean
  var childrenGap: Double
  var disableShrink: Boolean
  var emptyChildren: js.Array[String]
  var hideEmptyChildren: Boolean
  var horizontalAlignment: js.UndefOr[Alignment] = js.undefined
  var numItems: Double
  var paddingBottom: Double
  var paddingLeft: Double
  var paddingRight: Double
  var paddingTop: Double
  var preventOverflow: Boolean
  var showBoxShadow: Boolean
  var stackHeight: Double
  var verticalAlignment: js.UndefOr[Alignment] = js.undefined
  var wrap: Boolean
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
    wrap: Boolean,
    horizontalAlignment: Alignment = null,
    verticalAlignment: Alignment = null
  ): IExampleOptions = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], childrenGap = childrenGap.asInstanceOf[js.Any], disableShrink = disableShrink.asInstanceOf[js.Any], emptyChildren = emptyChildren.asInstanceOf[js.Any], hideEmptyChildren = hideEmptyChildren.asInstanceOf[js.Any], numItems = numItems.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], preventOverflow = preventOverflow.asInstanceOf[js.Any], showBoxShadow = showBoxShadow.asInstanceOf[js.Any], stackHeight = stackHeight.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExampleOptions]
  }
}

