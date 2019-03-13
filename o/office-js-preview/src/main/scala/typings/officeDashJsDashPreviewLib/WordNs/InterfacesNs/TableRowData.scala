package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableRow.toJSON()". */
trait TableRowData extends js.Object {
  /**
    *
    * Gets the number of cells in the row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cellCount: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets cells. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cells: js.UndefOr[js.Array[TableCellData]] = js.undefined
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontData] = js.undefined
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[
    officeDashJsDashPreviewLib.WordNs.Alignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Centered | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justified
  ] = js.undefined
  /**
    *
    * Checks whether the row is a header row. Read-only. To set the number of header rows, use HeaderRowCount on the Table object.
    *
    * [Api set: WordApi 1.3]
    */
  var isHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets and sets the preferred height of the row in points.
    *
    * [Api set: WordApi 1.3]
    */
  var preferredHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets and sets the text values in the row, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
    *
    * Gets and sets the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[
    officeDashJsDashPreviewLib.WordNs.VerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom
  ] = js.undefined
}

object TableRowData {
  @scala.inline
  def apply(
    cellCount: scala.Int | scala.Double = null,
    cells: js.Array[TableCellData] = null,
    font: FontData = null,
    horizontalAlignment: officeDashJsDashPreviewLib.WordNs.Alignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Centered | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justified = null,
    isHeader: js.UndefOr[scala.Boolean] = js.undefined,
    preferredHeight: scala.Int | scala.Double = null,
    rowIndex: scala.Int | scala.Double = null,
    shadingColor: java.lang.String = null,
    values: js.Array[js.Array[java.lang.String]] = null,
    verticalAlignment: officeDashJsDashPreviewLib.WordNs.VerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom = null
  ): TableRowData = {
    val __obj = js.Dynamic.literal()
    if (cellCount != null) __obj.updateDynamic("cellCount")(cellCount.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells)
    if (font != null) __obj.updateDynamic("font")(font)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader)
    if (preferredHeight != null) __obj.updateDynamic("preferredHeight")(preferredHeight.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (shadingColor != null) __obj.updateDynamic("shadingColor")(shadingColor)
    if (values != null) __obj.updateDynamic("values")(values)
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowData]
  }
}

