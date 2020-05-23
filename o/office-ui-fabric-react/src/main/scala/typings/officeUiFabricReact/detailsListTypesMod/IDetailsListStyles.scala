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
    contentWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    focusZone: js.UndefOr[Null | IStyle] = js.undefined,
    headerWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IDetailsListStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentWrapper)) __obj.updateDynamic("contentWrapper")(contentWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(focusZone)) __obj.updateDynamic("focusZone")(focusZone.asInstanceOf[js.Any])
    if (!js.isUndefined(headerWrapper)) __obj.updateDynamic("headerWrapper")(headerWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListStyles]
  }
}

