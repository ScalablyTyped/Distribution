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
    chevron: IStyle = null,
    item: IStyle = null,
    itemLink: IStyle = null,
    list: IStyle = null,
    listItem: IStyle = null,
    overflow: IStyle = null,
    overflowButton: IStyle = null,
    root: IStyle = null
  ): IBreadcrumbStyles = {
    val __obj = js.Dynamic.literal()
    if (chevron != null) __obj.updateDynamic("chevron")(chevron.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (itemLink != null) __obj.updateDynamic("itemLink")(itemLink.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (listItem != null) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overflowButton != null) __obj.updateDynamic("overflowButton")(overflowButton.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbStyles]
  }
}

