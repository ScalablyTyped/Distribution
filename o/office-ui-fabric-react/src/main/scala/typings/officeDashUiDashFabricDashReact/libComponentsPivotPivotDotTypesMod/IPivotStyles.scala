package typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
    count: IStyle,
    icon: IStyle,
    link: IStyle,
    linkContent: IStyle,
    linkIsSelected: IStyle,
    root: IStyle,
    text: IStyle,
    itemContainer: IStyle = null
  ): IPivotStyles = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkContent = linkContent.asInstanceOf[js.Any], linkIsSelected = linkIsSelected.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (itemContainer != null) __obj.updateDynamic("itemContainer")(itemContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPivotStyles]
  }
}

