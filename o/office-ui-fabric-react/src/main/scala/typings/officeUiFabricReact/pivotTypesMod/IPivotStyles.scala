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
    count: IStyle = null,
    icon: IStyle = null,
    itemContainer: IStyle = null,
    link: IStyle = null,
    linkContent: IStyle = null,
    linkIsSelected: IStyle = null,
    root: IStyle = null,
    text: IStyle = null
  ): IPivotStyles = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (itemContainer != null) __obj.updateDynamic("itemContainer")(itemContainer.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (linkContent != null) __obj.updateDynamic("linkContent")(linkContent.asInstanceOf[js.Any])
    if (linkIsSelected != null) __obj.updateDynamic("linkIsSelected")(linkIsSelected.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPivotStyles]
  }
}

