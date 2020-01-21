package typings.officeUiFabricReact.searchBoxTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchBoxStyles extends js.Object {
  var clearButton: js.UndefOr[IStyle] = js.undefined
  var field: js.UndefOr[IStyle] = js.undefined
  var icon: js.UndefOr[IStyle] = js.undefined
  var iconContainer: js.UndefOr[IStyle] = js.undefined
  var root: js.UndefOr[IStyle] = js.undefined
}

object ISearchBoxStyles {
  @scala.inline
  def apply(
    clearButton: IStyle = null,
    field: IStyle = null,
    icon: IStyle = null,
    iconContainer: IStyle = null,
    root: IStyle = null
  ): ISearchBoxStyles = {
    val __obj = js.Dynamic.literal()
    if (clearButton != null) __obj.updateDynamic("clearButton")(clearButton.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconContainer != null) __obj.updateDynamic("iconContainer")(iconContainer.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchBoxStyles]
  }
}

