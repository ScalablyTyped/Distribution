package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

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
    officeDashJsDashPreviewLib.WordNs.ContentControlAppearance | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BoundingBox | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Tags | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Hidden
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
    * Gets the parent body of the content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyData] = js.undefined
  /**
    *
    * Gets the content control that contains the content control. Throws if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlData] = js.undefined
  /**
    *
    * Gets the content control that contains the content control. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlData] = js.undefined
  /**
    *
    * Gets the table that contains the content control. Throws if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableData] = js.undefined
  /**
    *
    * Gets the table cell that contains the content control. Throws if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellData] = js.undefined
  /**
    *
    * Gets the table cell that contains the content control. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellData] = js.undefined
  /**
    *
    * Gets the table that contains the content control. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableData] = js.undefined
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
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var subtype: js.UndefOr[
    officeDashJsDashPreviewLib.WordNs.ContentControlType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextInline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextParagraphs | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTableCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTableRow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTable | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainTextInline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainTextParagraph | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Picture | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BuildingBlockGallery | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CheckBox | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ComboBox | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DropDownList | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DatePicker | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RepeatingSection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichText | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainText
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
    officeDashJsDashPreviewLib.WordNs.ContentControlType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextInline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextParagraphs | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTableCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTableRow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTable | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainTextInline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainTextParagraph | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Picture | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BuildingBlockGallery | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CheckBox | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ComboBox | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DropDownList | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DatePicker | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RepeatingSection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichText | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainText
  ] = js.undefined
}

