package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a content control. Content controls are bounded and potentially labeled regions in a document that serve as containers for specific types of content. Individual content controls may contain contents such as images, tables, or paragraphs of formatted text. Currently, only rich text content controls are supported.
  *
  * [Api set: WordApi 1.1]
  */
trait ContentControlLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * [Api set: WordApi 1.1]
    */
  var appearance: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  /**
    *
    * Gets an integer that represents the content control identifier. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the parent body of the content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  /**
    *
    * Gets the content control that contains the content control. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
    *
    * Gets the content control that contains the content control. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
    *
    * Gets the table that contains the content control. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * Gets the table cell that contains the content control. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
    *
    * Gets the table cell that contains the content control. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
    *
    * Gets the table that contains the content control. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
    *
    * [Api set: WordApi 1.1]
    */
  var placeholderText: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var subtype: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a tag to identify a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var tag: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the text of the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the title for a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the content control type. Only rich text content controls are supported currently. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}

object ContentControlLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    appearance: js.UndefOr[Boolean] = js.undefined,
    cannotDelete: js.UndefOr[Boolean] = js.undefined,
    cannotEdit: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Boolean] = js.undefined,
    font: FontLoadOptions = null,
    id: js.UndefOr[Boolean] = js.undefined,
    parentBody: BodyLoadOptions = null,
    parentContentControl: ContentControlLoadOptions = null,
    parentContentControlOrNullObject: ContentControlLoadOptions = null,
    parentTable: TableLoadOptions = null,
    parentTableCell: TableCellLoadOptions = null,
    parentTableCellOrNullObject: TableCellLoadOptions = null,
    parentTableOrNullObject: TableLoadOptions = null,
    placeholderText: js.UndefOr[Boolean] = js.undefined,
    removeWhenEdited: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined,
    styleBuiltIn: js.UndefOr[Boolean] = js.undefined,
    subtype: js.UndefOr[Boolean] = js.undefined,
    tag: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Boolean] = js.undefined
  ): ContentControlLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(appearance)) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (!js.isUndefined(cannotDelete)) __obj.updateDynamic("cannotDelete")(cannotDelete.asInstanceOf[js.Any])
    if (!js.isUndefined(cannotEdit)) __obj.updateDynamic("cannotEdit")(cannotEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parentBody != null) __obj.updateDynamic("parentBody")(parentBody.asInstanceOf[js.Any])
    if (parentContentControl != null) __obj.updateDynamic("parentContentControl")(parentContentControl.asInstanceOf[js.Any])
    if (parentContentControlOrNullObject != null) __obj.updateDynamic("parentContentControlOrNullObject")(parentContentControlOrNullObject.asInstanceOf[js.Any])
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable.asInstanceOf[js.Any])
    if (parentTableCell != null) __obj.updateDynamic("parentTableCell")(parentTableCell.asInstanceOf[js.Any])
    if (parentTableCellOrNullObject != null) __obj.updateDynamic("parentTableCellOrNullObject")(parentTableCellOrNullObject.asInstanceOf[js.Any])
    if (parentTableOrNullObject != null) __obj.updateDynamic("parentTableOrNullObject")(parentTableOrNullObject.asInstanceOf[js.Any])
    if (!js.isUndefined(placeholderText)) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    if (!js.isUndefined(removeWhenEdited)) __obj.updateDynamic("removeWhenEdited")(removeWhenEdited.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(styleBuiltIn)) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn.asInstanceOf[js.Any])
    if (!js.isUndefined(subtype)) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    if (!js.isUndefined(tag)) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlLoadOptions]
  }
}

