package typings.officeUiFabricReact.detailsListTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListStyles extends js.Object {
  var contentWrapper: IStyle
  var focusZone: IStyle
  var headerWrapper: IStyle
  var root: IStyle
}

object IDetailsListStyles {
  @scala.inline
  def apply(
    contentWrapper: IStyle = null,
    focusZone: IStyle = null,
    headerWrapper: IStyle = null,
    root: IStyle = null
  ): IDetailsListStyles = {
    val __obj = js.Dynamic.literal()
    if (contentWrapper != null) __obj.updateDynamic("contentWrapper")(contentWrapper.asInstanceOf[js.Any])
    if (focusZone != null) __obj.updateDynamic("focusZone")(focusZone.asInstanceOf[js.Any])
    if (headerWrapper != null) __obj.updateDynamic("headerWrapper")(headerWrapper.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListStyles]
  }
}

