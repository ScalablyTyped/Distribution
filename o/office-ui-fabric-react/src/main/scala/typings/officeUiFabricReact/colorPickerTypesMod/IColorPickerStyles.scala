package typings.officeUiFabricReact.colorPickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerStyles extends js.Object {
  /**
    * Style set for the panel element that contains the color rectangle
    */
  var colorRectangle: js.UndefOr[IStyle] = js.undefined
  /**
    * Color Square
    */
  var colorSquare: js.UndefOr[IStyle] = js.undefined
  /**
    * flexContainer
    */
  var flexContainer: js.UndefOr[IStyle] = js.undefined
  /**
    * flexPreviewBox
    */
  var flexPreviewBox: js.UndefOr[IStyle] = js.undefined
  /**
    * flexSlider
    */
  var flexSlider: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for each text field input.
    */
  var input: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the panel element that contains the color rectangle, color sliders and inputs .
    */
  var panel: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the table element that contains the color sliders and inputs.
    */
  var table: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the table cell that contains the alpha or transparency label.
    */
  var tableAlphaCell: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the table header that contains the labels.
    */
  var tableHeader: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the table cell that contains the hex label.
    */
  var tableHexCell: js.UndefOr[IStyle] = js.undefined
}

object IColorPickerStyles {
  @scala.inline
  def apply(
    colorRectangle: IStyle = null,
    colorSquare: IStyle = null,
    flexContainer: IStyle = null,
    flexPreviewBox: IStyle = null,
    flexSlider: IStyle = null,
    input: IStyle = null,
    panel: IStyle = null,
    root: IStyle = null,
    table: IStyle = null,
    tableAlphaCell: IStyle = null,
    tableHeader: IStyle = null,
    tableHexCell: IStyle = null
  ): IColorPickerStyles = {
    val __obj = js.Dynamic.literal()
    if (colorRectangle != null) __obj.updateDynamic("colorRectangle")(colorRectangle.asInstanceOf[js.Any])
    if (colorSquare != null) __obj.updateDynamic("colorSquare")(colorSquare.asInstanceOf[js.Any])
    if (flexContainer != null) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (flexPreviewBox != null) __obj.updateDynamic("flexPreviewBox")(flexPreviewBox.asInstanceOf[js.Any])
    if (flexSlider != null) __obj.updateDynamic("flexSlider")(flexSlider.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (tableAlphaCell != null) __obj.updateDynamic("tableAlphaCell")(tableAlphaCell.asInstanceOf[js.Any])
    if (tableHeader != null) __obj.updateDynamic("tableHeader")(tableHeader.asInstanceOf[js.Any])
    if (tableHexCell != null) __obj.updateDynamic("tableHexCell")(tableHexCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerStyles]
  }
}

