package typings.officeUiFabricReact.stackHorizontalConfigureExampleMod

import typings.officeUiFabricReact.stackTypesMod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExampleOptions extends js.Object {
  var columnGap: Double
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
  var rowGap: Double
  var showBoxShadow: Boolean
  var verticalAlignment: js.UndefOr[Alignment] = js.undefined
  var wrap: Boolean
  var wrapperWidth: Double
}

object IExampleOptions {
  @scala.inline
  def apply(
    columnGap: Double,
    disableShrink: Boolean,
    emptyChildren: js.Array[String],
    hideEmptyChildren: Boolean,
    numItems: Double,
    paddingBottom: Double,
    paddingLeft: Double,
    paddingRight: Double,
    paddingTop: Double,
    preventOverflow: Boolean,
    rowGap: Double,
    showBoxShadow: Boolean,
    wrap: Boolean,
    wrapperWidth: Double,
    horizontalAlignment: Alignment = null,
    verticalAlignment: Alignment = null
  ): IExampleOptions = {
    val __obj = js.Dynamic.literal(columnGap = columnGap.asInstanceOf[js.Any], disableShrink = disableShrink.asInstanceOf[js.Any], emptyChildren = emptyChildren.asInstanceOf[js.Any], hideEmptyChildren = hideEmptyChildren.asInstanceOf[js.Any], numItems = numItems.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], preventOverflow = preventOverflow.asInstanceOf[js.Any], rowGap = rowGap.asInstanceOf[js.Any], showBoxShadow = showBoxShadow.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapperWidth = wrapperWidth.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExampleOptions]
  }
}

