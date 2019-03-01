package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "range.toJSON()". */
trait RangeData extends js.Object {
  /**
    *
    * Gets the collection of content control objects in the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.undefined
  /**
    *
    * Gets the text format of the range. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.undefined
  /**
    *
    * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.3]
    */
  var hyperlink: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the collection of inline picture objects in the range. Read-only.
    *
    * [Api set: WordApi 1.2]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
  /**
    *
    * Checks whether the range length is zero. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the collection of list objects in the range. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var lists: js.UndefOr[js.Array[ListData]] = js.undefined
  /**
    *
    * Gets the collection of paragraph objects in the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
  /**
    *
    * Gets the parent body of the range. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyData] = js.undefined
  /**
    *
    * Gets the content control that contains the range. Throws if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlData] = js.undefined
  /**
    *
    * Gets the content control that contains the range. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlData] = js.undefined
  /**
    *
    * Gets the table that contains the range. Throws if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableData] = js.undefined
  /**
    *
    * Gets the table cell that contains the range. Throws if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellData] = js.undefined
  /**
    *
    * Gets the table cell that contains the range. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellData] = js.undefined
  /**
    *
    * Gets the table that contains the range. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableData] = js.undefined
  /**
    *
    * Gets or sets the style name for the range. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the range. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets the collection of table objects in the range. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  /**
    *
    * Gets the text of the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object RangeData {
  @scala.inline
  def apply(
    contentControls: js.Array[ContentControlData] = null,
    font: FontData = null,
    hyperlink: java.lang.String = null,
    inlinePictures: js.Array[InlinePictureData] = null,
    isEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    lists: js.Array[ListData] = null,
    paragraphs: js.Array[ParagraphData] = null,
    parentBody: BodyData = null,
    parentContentControl: ContentControlData = null,
    parentContentControlOrNullObject: ContentControlData = null,
    parentTable: TableData = null,
    parentTableCell: TableCellData = null,
    parentTableCellOrNullObject: TableCellData = null,
    parentTableOrNullObject: TableData = null,
    style: java.lang.String = null,
    styleBuiltIn: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any = null,
    tables: js.Array[TableData] = null,
    text: java.lang.String = null
  ): RangeData = {
    val __obj = js.Dynamic.literal()
    if (contentControls != null) __obj.updateDynamic("contentControls")(contentControls)
    if (font != null) __obj.updateDynamic("font")(font)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (inlinePictures != null) __obj.updateDynamic("inlinePictures")(inlinePictures)
    if (!js.isUndefined(isEmpty)) __obj.updateDynamic("isEmpty")(isEmpty)
    if (lists != null) __obj.updateDynamic("lists")(lists)
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs)
    if (parentBody != null) __obj.updateDynamic("parentBody")(parentBody)
    if (parentContentControl != null) __obj.updateDynamic("parentContentControl")(parentContentControl)
    if (parentContentControlOrNullObject != null) __obj.updateDynamic("parentContentControlOrNullObject")(parentContentControlOrNullObject)
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable)
    if (parentTableCell != null) __obj.updateDynamic("parentTableCell")(parentTableCell)
    if (parentTableCellOrNullObject != null) __obj.updateDynamic("parentTableCellOrNullObject")(parentTableCellOrNullObject)
    if (parentTableOrNullObject != null) __obj.updateDynamic("parentTableOrNullObject")(parentTableOrNullObject)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[RangeData]
  }
}

