package typings.officeUiFabricReact.groupHeaderTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupHeaderStyles extends js.Object {
  var check: IStyle
  var dropIcon: IStyle
  var expand: IStyle
  var expandIsCollapsed: IStyle
  var groupHeaderContainer: IStyle
  var headerCount: IStyle
  var root: IStyle
  var title: IStyle
}

object IGroupHeaderStyles {
  @scala.inline
  def apply(
    check: js.UndefOr[Null | IStyle] = js.undefined,
    dropIcon: js.UndefOr[Null | IStyle] = js.undefined,
    expand: js.UndefOr[Null | IStyle] = js.undefined,
    expandIsCollapsed: js.UndefOr[Null | IStyle] = js.undefined,
    groupHeaderContainer: js.UndefOr[Null | IStyle] = js.undefined,
    headerCount: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    title: js.UndefOr[Null | IStyle] = js.undefined
  ): IGroupHeaderStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (!js.isUndefined(dropIcon)) __obj.updateDynamic("dropIcon")(dropIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(expandIsCollapsed)) __obj.updateDynamic("expandIsCollapsed")(expandIsCollapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(groupHeaderContainer)) __obj.updateDynamic("groupHeaderContainer")(groupHeaderContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(headerCount)) __obj.updateDynamic("headerCount")(headerCount.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupHeaderStyles]
  }
}

