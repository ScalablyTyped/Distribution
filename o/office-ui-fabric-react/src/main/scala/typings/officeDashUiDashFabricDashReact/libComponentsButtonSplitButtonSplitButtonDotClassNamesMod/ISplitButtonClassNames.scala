package typings.officeDashUiDashFabricDashReact.libComponentsButtonSplitButtonSplitButtonDotClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplitButtonClassNames extends js.Object {
  var divider: js.UndefOr[String] = js.undefined
  var flexContainer: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var splitButtonContainer: js.UndefOr[String] = js.undefined
}

object ISplitButtonClassNames {
  @scala.inline
  def apply(
    divider: String = null,
    flexContainer: String = null,
    icon: String = null,
    root: String = null,
    splitButtonContainer: String = null
  ): ISplitButtonClassNames = {
    val __obj = js.Dynamic.literal()
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (flexContainer != null) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (splitButtonContainer != null) __obj.updateDynamic("splitButtonContainer")(splitButtonContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplitButtonClassNames]
  }
}

