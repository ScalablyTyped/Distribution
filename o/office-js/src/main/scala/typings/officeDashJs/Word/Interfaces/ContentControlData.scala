package typings.officeDashJs.Word.Interfaces

import typings.officeDashJs.Word.ContentControlAppearance
import typings.officeDashJs.Word.ContentControlType
import typings.officeDashJs.officeDashJsStrings.BoundingBox
import typings.officeDashJs.officeDashJsStrings.BuildingBlockGallery
import typings.officeDashJs.officeDashJsStrings.CheckBox
import typings.officeDashJs.officeDashJsStrings.ComboBox
import typings.officeDashJs.officeDashJsStrings.DatePicker
import typings.officeDashJs.officeDashJsStrings.DropDownList
import typings.officeDashJs.officeDashJsStrings.Hidden
import typings.officeDashJs.officeDashJsStrings.Picture
import typings.officeDashJs.officeDashJsStrings.PlainText
import typings.officeDashJs.officeDashJsStrings.PlainTextInline
import typings.officeDashJs.officeDashJsStrings.PlainTextParagraph
import typings.officeDashJs.officeDashJsStrings.RepeatingSection
import typings.officeDashJs.officeDashJsStrings.RichText
import typings.officeDashJs.officeDashJsStrings.RichTextInline
import typings.officeDashJs.officeDashJsStrings.RichTextParagraphs
import typings.officeDashJs.officeDashJsStrings.RichTextTable
import typings.officeDashJs.officeDashJsStrings.RichTextTableCell
import typings.officeDashJs.officeDashJsStrings.RichTextTableRow
import typings.officeDashJs.officeDashJsStrings.Tags
import typings.officeDashJs.officeDashJsStrings.Unknown
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
  var appearance: js.UndefOr[ContentControlAppearance | BoundingBox | Tags | Hidden] = js.undefined
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
  var color: js.UndefOr[String] = js.undefined
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
  var id: js.UndefOr[Double] = js.undefined
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
  var placeholderText: js.UndefOr[String] = js.undefined
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
  var style: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var subtype: js.UndefOr[
    ContentControlType | Unknown | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
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
  var tag: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the text of the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the title for a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the content control type. Only rich text content controls are supported currently. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var `type`: js.UndefOr[
    ContentControlType | Unknown | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
  ] = js.undefined
}

object ContentControlData {
  @scala.inline
  def apply(
    appearance: ContentControlAppearance | BoundingBox | Tags | Hidden = null,
    cannotDelete: js.UndefOr[Boolean] = js.undefined,
    cannotEdit: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    contentControls: js.Array[ContentControlData] = null,
    font: FontData = null,
    id: Int | Double = null,
    inlinePictures: js.Array[InlinePictureData] = null,
    lists: js.Array[ListData] = null,
    paragraphs: js.Array[ParagraphData] = null,
    placeholderText: String = null,
    removeWhenEdited: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any = null,
    subtype: ContentControlType | Unknown | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText = null,
    tables: js.Array[TableData] = null,
    tag: String = null,
    text: String = null,
    title: String = null,
    `type`: ContentControlType | Unknown | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText = null
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

