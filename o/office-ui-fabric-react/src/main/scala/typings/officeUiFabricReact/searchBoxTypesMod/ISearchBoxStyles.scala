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
    clearButton: js.UndefOr[Null | IStyle] = js.undefined,
    field: js.UndefOr[Null | IStyle] = js.undefined,
    icon: js.UndefOr[Null | IStyle] = js.undefined,
    iconContainer: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): ISearchBoxStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(field)) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconContainer)) __obj.updateDynamic("iconContainer")(iconContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchBoxStyles]
  }
}

