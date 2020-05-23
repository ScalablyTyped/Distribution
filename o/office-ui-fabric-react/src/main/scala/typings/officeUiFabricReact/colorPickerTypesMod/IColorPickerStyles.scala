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
    colorRectangle: js.UndefOr[Null | IStyle] = js.undefined,
    colorSquare: js.UndefOr[Null | IStyle] = js.undefined,
    flexContainer: js.UndefOr[Null | IStyle] = js.undefined,
    flexPreviewBox: js.UndefOr[Null | IStyle] = js.undefined,
    flexSlider: js.UndefOr[Null | IStyle] = js.undefined,
    input: js.UndefOr[Null | IStyle] = js.undefined,
    panel: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    table: js.UndefOr[Null | IStyle] = js.undefined,
    tableAlphaCell: js.UndefOr[Null | IStyle] = js.undefined,
    tableHeader: js.UndefOr[Null | IStyle] = js.undefined,
    tableHexCell: js.UndefOr[Null | IStyle] = js.undefined
  ): IColorPickerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorRectangle)) __obj.updateDynamic("colorRectangle")(colorRectangle.asInstanceOf[js.Any])
    if (!js.isUndefined(colorSquare)) __obj.updateDynamic("colorSquare")(colorSquare.asInstanceOf[js.Any])
    if (!js.isUndefined(flexContainer)) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(flexPreviewBox)) __obj.updateDynamic("flexPreviewBox")(flexPreviewBox.asInstanceOf[js.Any])
    if (!js.isUndefined(flexSlider)) __obj.updateDynamic("flexSlider")(flexSlider.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(panel)) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(table)) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (!js.isUndefined(tableAlphaCell)) __obj.updateDynamic("tableAlphaCell")(tableAlphaCell.asInstanceOf[js.Any])
    if (!js.isUndefined(tableHeader)) __obj.updateDynamic("tableHeader")(tableHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(tableHexCell)) __obj.updateDynamic("tableHexCell")(tableHexCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerStyles]
  }
}

