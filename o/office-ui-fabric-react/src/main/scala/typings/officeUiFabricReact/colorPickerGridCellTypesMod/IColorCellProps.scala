package typings.officeUiFabricReact.colorPickerGridCellTypesMod

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
    * Tooltip and aria label for this item
    */
  var label: js.UndefOr[String] = js.undefined
}

object IColorCellProps {
  @scala.inline
  def apply(id: String, color: String = null, index: js.UndefOr[Double] = js.undefined, label: String = null): IColorCellProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorCellProps]
  }
}

