package typings.officeUiFabricReact.suggestionsItemTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsItemStyles extends js.Object {
  /** Refers to the remove button in case it's rendered. */
  var closeButton: IStyle
  /** Refers to the CommandButton holding the content of the suggested item. */
  var itemButton: IStyle
  /** Root element of the suggested item. */
  var root: IStyle
}

object ISuggestionsItemStyles {
  @scala.inline
  def apply(
    closeButton: js.UndefOr[Null | IStyle] = js.undefined,
    itemButton: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): ISuggestionsItemStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(itemButton)) __obj.updateDynamic("itemButton")(itemButton.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsItemStyles]
  }
}

