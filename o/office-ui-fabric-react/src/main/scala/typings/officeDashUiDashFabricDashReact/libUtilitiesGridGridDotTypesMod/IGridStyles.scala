package typings.officeDashUiDashFabricDashReact.libUtilitiesGridGridDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridStyles extends js.Object {
  /**
    * Optional, style for the FocusZone container for the grid
    */
  var focusedContainer: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for the table container of a grid.
    */
  var root: IStyle
  /**
    * Style for the table cells of the grid.
    */
  var tableCell: IStyle
}

object IGridStyles {
  @scala.inline
  def apply(root: IStyle, tableCell: IStyle, focusedContainer: IStyle = null): IGridStyles = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], tableCell = tableCell.asInstanceOf[js.Any])
    if (focusedContainer != null) __obj.updateDynamic("focusedContainer")(focusedContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridStyles]
  }
}

