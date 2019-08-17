package typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorCellProps extends js.Object {
  /**
    * The CSS-compatible string to describe the color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Arbitrary unique string associated with this option
    */
  var id: String
  /**
    * Index for this option
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * The label for this item.
    * Visible text if this item is a header,
    * tooltip if is this item is normal
    */
  var label: js.UndefOr[String] = js.undefined
}

object IColorCellProps {
  @scala.inline
  def apply(id: String, color: String = null, index: Int | Double = null, label: String = null): IColorCellProps = {
    val __obj = js.Dynamic.literal(id = id)
    if (color != null) __obj.updateDynamic("color")(color)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[IColorCellProps]
  }
}

