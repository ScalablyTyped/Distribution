package typings.officeUiFabricReact.pivotTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPivotStyles extends js.Object {
  var count: IStyle
  var icon: IStyle
  var itemContainer: js.UndefOr[IStyle] = js.undefined
  var link: IStyle
  var linkContent: IStyle
  var linkIsSelected: IStyle
  /**
    * Style for the root element.
    */
  var root: IStyle
  var text: IStyle
}

object IPivotStyles {
  @scala.inline
  def apply(
    count: js.UndefOr[Null | IStyle] = js.undefined,
    icon: js.UndefOr[Null | IStyle] = js.undefined,
    itemContainer: js.UndefOr[Null | IStyle] = js.undefined,
    link: js.UndefOr[Null | IStyle] = js.undefined,
    linkContent: js.UndefOr[Null | IStyle] = js.undefined,
    linkIsSelected: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    text: js.UndefOr[Null | IStyle] = js.undefined
  ): IPivotStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(itemContainer)) __obj.updateDynamic("itemContainer")(itemContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(linkContent)) __obj.updateDynamic("linkContent")(linkContent.asInstanceOf[js.Any])
    if (!js.isUndefined(linkIsSelected)) __obj.updateDynamic("linkIsSelected")(linkIsSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPivotStyles]
  }
}

