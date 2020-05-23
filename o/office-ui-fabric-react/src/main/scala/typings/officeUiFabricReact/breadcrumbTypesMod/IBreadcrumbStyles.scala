package typings.officeUiFabricReact.breadcrumbTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBreadcrumbStyles extends js.Object {
  var chevron: IStyle
  var item: IStyle
  var itemLink: IStyle
  var list: IStyle
  var listItem: IStyle
  var overflow: IStyle
  var overflowButton: IStyle
  var root: IStyle
}

object IBreadcrumbStyles {
  @scala.inline
  def apply(
    chevron: js.UndefOr[Null | IStyle] = js.undefined,
    item: js.UndefOr[Null | IStyle] = js.undefined,
    itemLink: js.UndefOr[Null | IStyle] = js.undefined,
    list: js.UndefOr[Null | IStyle] = js.undefined,
    listItem: js.UndefOr[Null | IStyle] = js.undefined,
    overflow: js.UndefOr[Null | IStyle] = js.undefined,
    overflowButton: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IBreadcrumbStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chevron)) __obj.updateDynamic("chevron")(chevron.asInstanceOf[js.Any])
    if (!js.isUndefined(item)) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (!js.isUndefined(itemLink)) __obj.updateDynamic("itemLink")(itemLink.asInstanceOf[js.Any])
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(listItem)) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowButton)) __obj.updateDynamic("overflowButton")(overflowButton.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbStyles]
  }
}

