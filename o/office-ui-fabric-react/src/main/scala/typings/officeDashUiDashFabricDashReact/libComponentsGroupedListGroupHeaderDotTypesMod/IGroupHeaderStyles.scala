package typings.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupHeaderDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
    check: IStyle = null,
    dropIcon: IStyle = null,
    expand: IStyle = null,
    expandIsCollapsed: IStyle = null,
    groupHeaderContainer: IStyle = null,
    headerCount: IStyle = null,
    root: IStyle = null,
    title: IStyle = null
  ): IGroupHeaderStyles = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (dropIcon != null) __obj.updateDynamic("dropIcon")(dropIcon.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (expandIsCollapsed != null) __obj.updateDynamic("expandIsCollapsed")(expandIsCollapsed.asInstanceOf[js.Any])
    if (groupHeaderContainer != null) __obj.updateDynamic("groupHeaderContainer")(groupHeaderContainer.asInstanceOf[js.Any])
    if (headerCount != null) __obj.updateDynamic("headerCount")(headerCount.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupHeaderStyles]
  }
}

