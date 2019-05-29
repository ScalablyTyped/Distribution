package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "contentControl.toJSON()". */
trait ContentControlData extends js.Object {
  /**
    *
    * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * [Api set: WordApi 1.1]
    */
  var appearance: js.UndefOr[
    officeDashJsLib.WordNs.ContentControlAppearance | officeDashJsLib.officeDashJsLibStrings.BoundingBox | officeDashJsLib.officeDashJsLibStrings.Tags | officeDashJsLib.officeDashJsLibStrings.Hidden
  ] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the collection of content control objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.undefined
  /**
    *
    * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.undefined
  /**
    *
    * Gets an integer that represents the content control identifier. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var id: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets the collection of inlinePicture objects in the content control. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
  /**
    *
    * Gets the collection of list objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var lists: js.UndefOr[js.Array[ListData]] = js.undefined
  /**
    *
    * Get the collection of paragraph objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
  /**
    *
    * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
    *
    * [Api set: WordApi 1.1]
    */
  var placeholderText: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 150 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var subtype: js.UndefOr[
    officeDashJsLib.WordNs.ContentControlType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.RichTextInline | officeDashJsLib.officeDashJsLibStrings.RichTextParagraphs | officeDashJsLib.officeDashJsLibStrings.RichTextTableCell | officeDashJsLib.officeDashJsLibStrings.RichTextTableRow | officeDashJsLib.officeDashJsLibStrings.RichTextTable | officeDashJsLib.officeDashJsLibStrings.PlainTextInline | officeDashJsLib.officeDashJsLibStrings.PlainTextParagraph | officeDashJsLib.officeDashJsLibStrings.Picture | officeDashJsLib.officeDashJsLibStrings.BuildingBlockGallery | officeDashJsLib.officeDashJsLibStrings.CheckBox | officeDashJsLib.officeDashJsLibStrings.ComboBox | officeDashJsLib.officeDashJsLibStrings.DropDownList | officeDashJsLib.officeDashJsLibStrings.DatePicker | officeDashJsLib.officeDashJsLibStrings.RepeatingSection | officeDashJsLib.officeDashJsLibStrings.RichText | officeDashJsLib.officeDashJsLibStrings.PlainText
  ] = js.undefined
  /**
    *
    * Gets the collection of table objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  /**
    *
    * Gets or sets a tag to identify a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the text of the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the title for a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the content control type. Only rich text content controls are supported currently. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var `type`: js.UndefOr[
    officeDashJsLib.WordNs.ContentControlType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.RichTextInline | officeDashJsLib.officeDashJsLibStrings.RichTextParagraphs | officeDashJsLib.officeDashJsLibStrings.RichTextTableCell | officeDashJsLib.officeDashJsLibStrings.RichTextTableRow | officeDashJsLib.officeDashJsLibStrings.RichTextTable | officeDashJsLib.officeDashJsLibStrings.PlainTextInline | officeDashJsLib.officeDashJsLibStrings.PlainTextParagraph | officeDashJsLib.officeDashJsLibStrings.Picture | officeDashJsLib.officeDashJsLibStrings.BuildingBlockGallery | officeDashJsLib.officeDashJsLibStrings.CheckBox | officeDashJsLib.officeDashJsLibStrings.ComboBox | officeDashJsLib.officeDashJsLibStrings.DropDownList | officeDashJsLib.officeDashJsLibStrings.DatePicker | officeDashJsLib.officeDashJsLibStrings.RepeatingSection | officeDashJsLib.officeDashJsLibStrings.RichText | officeDashJsLib.officeDashJsLibStrings.PlainText
  ] = js.undefined
}

object ContentControlData {
  @scala.inline
  def apply(
    appearance: officeDashJsLib.WordNs.ContentControlAppearance | officeDashJsLib.officeDashJsLibStrings.BoundingBox | officeDashJsLib.officeDashJsLibStrings.Tags | officeDashJsLib.officeDashJsLibStrings.Hidden = null,
    cannotDelete: js.UndefOr[scala.Boolean] = js.undefined,
    cannotEdit: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    contentControls: js.Array[ContentControlData] = null,
    font: FontData = null,
    id: scala.Int | scala.Double = null,
    inlinePictures: js.Array[InlinePictureData] = null,
    lists: js.Array[ListData] = null,
    paragraphs: js.Array[ParagraphData] = null,
    placeholderText: java.lang.String = null,
    removeWhenEdited: js.UndefOr[scala.Boolean] = js.undefined,
    style: java.lang.String = null,
    styleBuiltIn: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 150 */ js.Any = null,
    subtype: officeDashJsLib.WordNs.ContentControlType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.RichTextInline | officeDashJsLib.officeDashJsLibStrings.RichTextParagraphs | officeDashJsLib.officeDashJsLibStrings.RichTextTableCell | officeDashJsLib.officeDashJsLibStrings.RichTextTableRow | officeDashJsLib.officeDashJsLibStrings.RichTextTable | officeDashJsLib.officeDashJsLibStrings.PlainTextInline | officeDashJsLib.officeDashJsLibStrings.PlainTextParagraph | officeDashJsLib.officeDashJsLibStrings.Picture | officeDashJsLib.officeDashJsLibStrings.BuildingBlockGallery | officeDashJsLib.officeDashJsLibStrings.CheckBox | officeDashJsLib.officeDashJsLibStrings.ComboBox | officeDashJsLib.officeDashJsLibStrings.DropDownList | officeDashJsLib.officeDashJsLibStrings.DatePicker | officeDashJsLib.officeDashJsLibStrings.RepeatingSection | officeDashJsLib.officeDashJsLibStrings.RichText | officeDashJsLib.officeDashJsLibStrings.PlainText = null,
    tables: js.Array[TableData] = null,
    tag: java.lang.String = null,
    text: java.lang.String = null,
    title: java.lang.String = null,
    `type`: officeDashJsLib.WordNs.ContentControlType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.RichTextInline | officeDashJsLib.officeDashJsLibStrings.RichTextParagraphs | officeDashJsLib.officeDashJsLibStrings.RichTextTableCell | officeDashJsLib.officeDashJsLibStrings.RichTextTableRow | officeDashJsLib.officeDashJsLibStrings.RichTextTable | officeDashJsLib.officeDashJsLibStrings.PlainTextInline | officeDashJsLib.officeDashJsLibStrings.PlainTextParagraph | officeDashJsLib.officeDashJsLibStrings.Picture | officeDashJsLib.officeDashJsLibStrings.BuildingBlockGallery | officeDashJsLib.officeDashJsLibStrings.CheckBox | officeDashJsLib.officeDashJsLibStrings.ComboBox | officeDashJsLib.officeDashJsLibStrings.DropDownList | officeDashJsLib.officeDashJsLibStrings.DatePicker | officeDashJsLib.officeDashJsLibStrings.RepeatingSection | officeDashJsLib.officeDashJsLibStrings.RichText | officeDashJsLib.officeDashJsLibStrings.PlainText = null
  ): ContentControlData = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (!js.isUndefined(cannotDelete)) __obj.updateDynamic("cannotDelete")(cannotDelete)
    if (!js.isUndefined(cannotEdit)) __obj.updateDynamic("cannotEdit")(cannotEdit)
    if (color != null) __obj.updateDynamic("color")(color)
    if (contentControls != null) __obj.updateDynamic("contentControls")(contentControls)
    if (font != null) __obj.updateDynamic("font")(font)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlinePictures != null) __obj.updateDynamic("inlinePictures")(inlinePictures)
    if (lists != null) __obj.updateDynamic("lists")(lists)
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs)
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText)
    if (!js.isUndefined(removeWhenEdited)) __obj.updateDynamic("removeWhenEdited")(removeWhenEdited)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn)
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlData]
  }
}

