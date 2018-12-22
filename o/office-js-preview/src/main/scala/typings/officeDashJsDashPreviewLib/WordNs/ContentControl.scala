package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a content control. Content controls are bounded and potentially labeled regions in a document that serve as containers for specific types of content. Individual content controls may contain contents such as images, tables, or paragraphs of formatted text. Currently, only rich text content controls are supported.
     *
     * [Api set: WordApi 1.1]
     */
@JSGlobal("Word.ContentControl")
@js.native
class ContentControl ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
           *
           * [Api set: WordApi 1.1]
           */
  var appearance: ContentControlAppearance | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BoundingBox | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Tags | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Hidden = js.native
  /**
           *
           * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
           *
           * [Api set: WordApi 1.1]
           */
  var cannotDelete: scala.Boolean = js.native
  /**
           *
           * Gets or sets a value that indicates whether the user can edit the contents of the content control.
           *
           * [Api set: WordApi 1.1]
           */
  var cannotEdit: scala.Boolean = js.native
  /**
           *
           * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
           *
           * [Api set: WordApi 1.1]
           */
  var color: java.lang.String = js.native
  /**
           *
           * Gets the collection of content control objects in the content control. Read-only.
           *
           * [Api set: WordApi 1.1]
           */
  val contentControls: ContentControlCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ContentControl: RequestContext = js.native
  /**
           *
           * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties. Read-only.
           *
           * [Api set: WordApi 1.1]
           */
  val font: Font = js.native
  /**
           *
           * Gets an integer that represents the content control identifier. Read-only.
           *
           * [Api set: WordApi 1.1]
           */
  val id: scala.Double = js.native
  /**
           *
           * Gets the collection of inlinePicture objects in the content control. The collection does not include floating images. Read-only.
           *
           * [Api set: WordApi 1.1]
           */
  val inlinePictures: InlinePictureCollection = js.native
  /**
           *
           * Gets the collection of list objects in the content control. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val lists: ListCollection = js.native
  /**
           *
           * Occurs when data within the content control are changed. To get the new text, load this content control in the handler. To get the old text, do not load it.
           *
           * [Api set: WordApi BETA (PREVIEW ONLY)]
           * @beta
           *
           * @eventproperty
           */
  val onDataChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ContentControlEventArgs] = js.native
  /**
           *
           * Occurs when the content control is deleted. Do not load this content control in the handler, otherwise you won't be able to get its original properties.
           *
           * [Api set: WordApi BETA (PREVIEW ONLY)]
           * @beta
           *
           * @eventproperty
           */
  val onDeleted: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ContentControlEventArgs] = js.native
  /**
           *
           * Occurs when selection within the content control is changed.
           *
           * [Api set: WordApi BETA (PREVIEW ONLY)]
           * @beta
           *
           * @eventproperty
           */
  val onSelectionChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ContentControlEventArgs] = js.native
  /**
           *
           * Get the collection of paragraph objects in the content control. Read-only.
           *
           * [Api set: WordApi 1.1]
           */
  val paragraphs: ParagraphCollection = js.native
  /**
           *
           * Gets the parent body of the content control. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentBody: Body = js.native
  /**
           *
           * Gets the content control that contains the content control. Throws if there isn't a parent content control. Read-only.
           *
           * [Api set: WordApi 1.1]
           */
  val parentContentControl: ContentControl = js.native
  /**
           *
           * Gets the content control that contains the content control. Returns a null object if there isn't a parent content control. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentContentControlOrNullObject: ContentControl = js.native
  /**
           *
           * Gets the table that contains the content control. Throws if it is not contained in a table. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentTable: Table = js.native
  /**
           *
           * Gets the table cell that contains the content control. Throws if it is not contained in a table cell. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentTableCell: TableCell = js.native
  /**
           *
           * Gets the table cell that contains the content control. Returns a null object if it is not contained in a table cell. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentTableCellOrNullObject: TableCell = js.native
  /**
           *
           * Gets the table that contains the content control. Returns a null object if it is not contained in a table. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val parentTableOrNullObject: Table = js.native
  /**
           *
           * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
           *
           * [Api set: WordApi 1.1]
           */
  var placeholderText: java.lang.String = js.native
  /**
           *
           * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
           *
           * [Api set: WordApi 1.1]
           */
  var removeWhenEdited: scala.Boolean = js.native
  /**
           *
           * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
           *
           * [Api set: WordApi 1.1]
           */
  var style: java.lang.String = js.native
  /**
           *
           * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
           *
           * [Api set: WordApi 1.3]
           */
  var styleBuiltIn: /* LimitUnionLength: was union type with length 149 */js.Any = js.native
  /**
           *
           * Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val subtype: ContentControlType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextInline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextParagraphs | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTableCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTableRow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTable | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainTextInline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainTextParagraph | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Picture | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BuildingBlockGallery | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CheckBox | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ComboBox | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DropDownList | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DatePicker | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RepeatingSection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichText | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainText = js.native
  /**
           *
           * Gets the collection of table objects in the content control. Read-only.
           *
           * [Api set: WordApi 1.3]
           */
  val tables: TableCollection = js.native
  /**
           *
           * Gets or sets a tag to identify a content control.
           *
           * [Api set: WordApi 1.1]
           */
  var tag: java.lang.String = js.native
  /**
           *
           * Gets the text of the content control. Read-only.
           *
           * [Api set: WordApi 1.1]
           */
  val text: java.lang.String = js.native
  /**
           *
           * Gets or sets the title for a content control.
           *
           * [Api set: WordApi 1.1]
           */
  var title: java.lang.String = js.native
  /**
           *
           * Gets the content control type. Only rich text content controls are supported currently. Read-only.
           *
           * [Api set: WordApi 1.1]
           */
  val `type`: ContentControlType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextInline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextParagraphs | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTableCell | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTableRow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichTextTable | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainTextInline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainTextParagraph | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Picture | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BuildingBlockGallery | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CheckBox | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ComboBox | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DropDownList | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DatePicker | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RepeatingSection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RichText | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlainText = js.native
  /**
           *
           * Clears the contents of the content control. The user can perform the undo operation on the cleared content.
           *
           * [Api set: WordApi 1.1]
           */
  def clear(): scala.Unit = js.native
  /**
           *
           * Deletes the content control and its content. If keepContent is set to true, the content is not deleted.
           *
           * [Api set: WordApi 1.1]
           *
           * @param keepContent Required. Indicates whether the content should be deleted with the content control. If keepContent is set to true, the content is not deleted.
           */
  def delete(keepContent: scala.Boolean): scala.Unit = js.native
  /**
           *
           * Gets an HTML representation of the content control object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match for of the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, Word Online, etc.). If you need exact fidelity, or consistency across platforms, use `ContentControl.getOoxml()` and convert the returned XML to HTML.
           *
           * [Api set: WordApi 1.1]
           */
  def getHtml(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
           *
           * Gets the Office Open XML (OOXML) representation of the content control object.
           *
           * [Api set: WordApi 1.1]
           */
  def getOoxml(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
           *
           * Gets the whole content control, or the starting or ending point of the content control, as a range.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Before', 'Start', 'End', 'After', or 'Content'.
           */
  def getRange(): Range = js.native
  /**
           *
           * Gets the whole content control, or the starting or ending point of the content control, as a range.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Before', 'Start', 'End', 'After', or 'Content'.
           */
  def getRange(rangeLocation: RangeLocation): Range = js.native
  /**
           *
           * Gets the whole content control, or the starting or ending point of the content control, as a range.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Before', 'Start', 'End', 'After', or 'Content'.
           */
  @JSName("getRange")
  def getRange_After(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After): Range = js.native
  /**
           *
           * Gets the whole content control, or the starting or ending point of the content control, as a range.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Before', 'Start', 'End', 'After', or 'Content'.
           */
  @JSName("getRange")
  def getRange_Before(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before): Range = js.native
  /**
           *
           * Gets the whole content control, or the starting or ending point of the content control, as a range.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Before', 'Start', 'End', 'After', or 'Content'.
           */
  @JSName("getRange")
  def getRange_Content(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Content): Range = js.native
  /**
           *
           * Gets the whole content control, or the starting or ending point of the content control, as a range.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Before', 'Start', 'End', 'After', or 'Content'.
           */
  @JSName("getRange")
  def getRange_End(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End): Range = js.native
  /**
           *
           * Gets the whole content control, or the starting or ending point of the content control, as a range.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Before', 'Start', 'End', 'After', or 'Content'.
           */
  @JSName("getRange")
  def getRange_Start(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start): Range = js.native
  /**
           *
           * Gets the whole content control, or the starting or ending point of the content control, as a range.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rangeLocation Optional. The range location can be 'Whole', 'Before', 'Start', 'End', 'After', or 'Content'.
           */
  @JSName("getRange")
  def getRange_Whole(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Whole): Range = js.native
  /**
           *
           * Gets the text ranges in the content control by using punctuation marks and/or other ending marks.
           *
           * [Api set: WordApi 1.3]
           *
           * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
           * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
           */
  def getTextRanges(endingMarks: js.Array[java.lang.String]): RangeCollection = js.native
  /**
           *
           * Gets the text ranges in the content control by using punctuation marks and/or other ending marks.
           *
           * [Api set: WordApi 1.3]
           *
           * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
           * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
           */
  def getTextRanges(endingMarks: js.Array[java.lang.String], trimSpacing: scala.Boolean): RangeCollection = js.native
  /**
           *
           * Inserts a break at the specified location in the main document. The insertLocation value can be 'Start', 'End', 'Before', or 'After'. This method cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           *
           * [Api set: WordApi 1.1]
           *
           * @param breakType Required. Type of break.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'.
           */
  def insertBreak(
    breakType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Page | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Next | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionNext | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionContinuous | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionEven | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionOdd | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Line,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): scala.Unit = js.native
  /**
           *
           * Inserts a break at the specified location in the main document. The insertLocation value can be 'Start', 'End', 'Before', or 'After'. This method cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           *
           * [Api set: WordApi 1.1]
           *
           * @param breakType Required. Type of break.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'.
           */
  def insertBreak(breakType: BreakType, insertLocation: InsertLocation): scala.Unit = js.native
  /**
           *
           * Inserts a document into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param base64File Required. The base64 encoded content of a .docx file.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  def insertFileFromBase64(base64File: java.lang.String, insertLocation: InsertLocation): Range = js.native
  /**
           *
           * Inserts a document into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param base64File Required. The base64 encoded content of a .docx file.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_After(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
           *
           * Inserts a document into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param base64File Required. The base64 encoded content of a .docx file.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Before(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  /**
           *
           * Inserts a document into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param base64File Required. The base64 encoded content of a .docx file.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_End(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  /**
           *
           * Inserts a document into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param base64File Required. The base64 encoded content of a .docx file.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Replace(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  /**
           *
           * Inserts a document into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param base64File Required. The base64 encoded content of a .docx file.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Start(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
           *
           * Inserts HTML into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param html Required. The HTML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  def insertHtml(html: java.lang.String, insertLocation: InsertLocation): Range = js.native
  /**
           *
           * Inserts HTML into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param html Required. The HTML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertHtml")
  def insertHtml_After(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
           *
           * Inserts HTML into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param html Required. The HTML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertHtml")
  def insertHtml_Before(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  /**
           *
           * Inserts HTML into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param html Required. The HTML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertHtml")
  def insertHtml_End(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  /**
           *
           * Inserts HTML into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param html Required. The HTML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertHtml")
  def insertHtml_Replace(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  /**
           *
           * Inserts HTML into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param html Required. The HTML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertHtml")
  def insertHtml_Start(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
           *
           * Inserts an inline picture into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.2]
           *
           * @param base64EncodedImage Required. The base64 encoded image to be inserted in the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  def insertInlinePictureFromBase64(base64EncodedImage: java.lang.String, insertLocation: InsertLocation): InlinePicture = js.native
  /**
           *
           * Inserts an inline picture into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.2]
           *
           * @param base64EncodedImage Required. The base64 encoded image to be inserted in the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_After(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): InlinePicture = js.native
  /**
           *
           * Inserts an inline picture into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.2]
           *
           * @param base64EncodedImage Required. The base64 encoded image to be inserted in the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Before(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): InlinePicture = js.native
  /**
           *
           * Inserts an inline picture into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.2]
           *
           * @param base64EncodedImage Required. The base64 encoded image to be inserted in the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_End(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): InlinePicture = js.native
  /**
           *
           * Inserts an inline picture into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.2]
           *
           * @param base64EncodedImage Required. The base64 encoded image to be inserted in the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Replace(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): InlinePicture = js.native
  /**
           *
           * Inserts an inline picture into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.2]
           *
           * @param base64EncodedImage Required. The base64 encoded image to be inserted in the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Start(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): InlinePicture = js.native
  /**
           *
           * Inserts OOXML into the content control at the specified location.  The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param ooxml Required. The OOXML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  def insertOoxml(ooxml: java.lang.String, insertLocation: InsertLocation): Range = js.native
  /**
           *
           * Inserts OOXML into the content control at the specified location.  The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param ooxml Required. The OOXML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertOoxml")
  def insertOoxml_After(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
           *
           * Inserts OOXML into the content control at the specified location.  The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param ooxml Required. The OOXML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertOoxml")
  def insertOoxml_Before(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  /**
           *
           * Inserts OOXML into the content control at the specified location.  The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param ooxml Required. The OOXML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertOoxml")
  def insertOoxml_End(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  /**
           *
           * Inserts OOXML into the content control at the specified location.  The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param ooxml Required. The OOXML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertOoxml")
  def insertOoxml_Replace(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  /**
           *
           * Inserts OOXML into the content control at the specified location.  The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param ooxml Required. The OOXML to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertOoxml")
  def insertOoxml_Start(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           */
  def insertParagraph(paragraphText: java.lang.String, insertLocation: InsertLocation): Paragraph = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           */
  @JSName("insertParagraph")
  def insertParagraph_After(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Paragraph = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           */
  @JSName("insertParagraph")
  def insertParagraph_Before(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Paragraph = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           */
  @JSName("insertParagraph")
  def insertParagraph_End(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Paragraph = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           */
  @JSName("insertParagraph")
  def insertParagraph_Replace(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Paragraph = js.native
  /**
           *
           * Inserts a paragraph at the specified location. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param paragraphText Required. The paragraph text to be inserted.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           */
  @JSName("insertParagraph")
  def insertParagraph_Start(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Paragraph = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def insertTable(rowCount: scala.Double, columnCount: scala.Double, insertLocation: InsertLocation): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  def insertTable(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: InsertLocation,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_After(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_After(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Before(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Before(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_End(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_End(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Replace(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Replace(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Start(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Table = js.native
  /**
           *
           * Inserts a table with the specified number of rows and columns into, or next to, a content control. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
           *
           * [Api set: WordApi 1.3]
           *
           * @param rowCount Required. The number of rows in the table.
           * @param columnCount Required. The number of columns in the table.
           * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
           * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
           */
  @JSName("insertTable")
  def insertTable_Start(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
           *
           * Inserts text into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param text Required. The text to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  def insertText(text: java.lang.String, insertLocation: InsertLocation): Range = js.native
  /**
           *
           * Inserts text into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param text Required. The text to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertText")
  def insertText_After(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
           *
           * Inserts text into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param text Required. The text to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertText")
  def insertText_Before(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  /**
           *
           * Inserts text into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param text Required. The text to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertText")
  def insertText_End(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  /**
           *
           * Inserts text into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param text Required. The text to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertText")
  def insertText_Replace(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  /**
           *
           * Inserts text into the content control at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
           *
           * [Api set: WordApi 1.1]
           *
           * @param text Required. The text to be inserted in to the content control.
           * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
           */
  @JSName("insertText")
  def insertText_Start(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Word.ContentControl` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Word.ContentControl` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.ContentControl` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ContentControl = js.native
  def load(option: java.lang.String): ContentControl = js.native
  def load(option: js.Array[java.lang.String]): ContentControl = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): ContentControl = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Word.ContentControl` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Word.ContentControl` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.ContentControl` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsDashPreviewLib.WordNs.InterfacesNs.ContentControlLoadOptions): ContentControl = js.native
  /**
           *
           * Performs a search with the specified SearchOptions on the scope of the content control object. The search results are a collection of range objects.
           *
           * [Api set: WordApi 1.1]
           *
           * @param searchText Required. The search text.
           * @param searchOptions Optional. Options for the search.
           */
  def search(searchText: java.lang.String): RangeCollection = js.native
  /**
           *
           * Performs a search with the specified SearchOptions on the scope of the content control object. The search results are a collection of range objects.
           *
           * [Api set: WordApi 1.1]
           *
           * @param searchText Required. The search text.
           * @param searchOptions Optional. Options for the search.
           */
  def search(searchText: java.lang.String, searchOptions: officeDashJsDashPreviewLib.Anon_MatchSuffix): RangeCollection = js.native
  /**
           *
           * Performs a search with the specified SearchOptions on the scope of the content control object. The search results are a collection of range objects.
           *
           * [Api set: WordApi 1.1]
           *
           * @param searchText Required. The search text.
           * @param searchOptions Optional. Options for the search.
           */
  def search(searchText: java.lang.String, searchOptions: SearchOptions): RangeCollection = js.native
  /**
           *
           * Selects the content control. This causes Word to scroll to the selection.
           *
           * [Api set: WordApi 1.1]
           *
           * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
           */
  def select(): scala.Unit = js.native
  /**
           *
           * Selects the content control. This causes Word to scroll to the selection.
           *
           * [Api set: WordApi 1.1]
           *
           * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
           */
  def select(selectionMode: SelectionMode): scala.Unit = js.native
  /**
           *
           * Selects the content control. This causes Word to scroll to the selection.
           *
           * [Api set: WordApi 1.1]
           *
           * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
           */
  @JSName("select")
  def select_End(selectionMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End): scala.Unit = js.native
  /**
           *
           * Selects the content control. This causes Word to scroll to the selection.
           *
           * [Api set: WordApi 1.1]
           *
           * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
           */
  @JSName("select")
  def select_Select(selectionMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Select): scala.Unit = js.native
  /**
           *
           * Selects the content control. This causes Word to scroll to the selection.
           *
           * [Api set: WordApi 1.1]
           *
           * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
           */
  @JSName("select")
  def select_Start(selectionMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ContentControl): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Word.ContentControl): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsDashPreviewLib.WordNs.InterfacesNs.ContentControlUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Word.ContentControl): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsDashPreviewLib.WordNs.InterfacesNs.ContentControlUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
           *
           * Splits the content control into child ranges by using delimiters.
           *
           * [Api set: WordApi 1.3]
           *
           * @param delimiters Required. The delimiters as an array of strings.
           * @param multiParagraphs Optional. Indicates whether a returned child range can cover multiple paragraphs. Default is false which indicates that the paragraph boundaries are also used as delimiters.
           * @param trimDelimiters Optional. Indicates whether to trim delimiters from the ranges in the range collection. Default is false which indicates that the delimiters are included in the ranges returned in the range collection.
           * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
           */
  def split(delimiters: js.Array[java.lang.String]): RangeCollection = js.native
  /**
           *
           * Splits the content control into child ranges by using delimiters.
           *
           * [Api set: WordApi 1.3]
           *
           * @param delimiters Required. The delimiters as an array of strings.
           * @param multiParagraphs Optional. Indicates whether a returned child range can cover multiple paragraphs. Default is false which indicates that the paragraph boundaries are also used as delimiters.
           * @param trimDelimiters Optional. Indicates whether to trim delimiters from the ranges in the range collection. Default is false which indicates that the delimiters are included in the ranges returned in the range collection.
           * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
           */
  def split(delimiters: js.Array[java.lang.String], multiParagraphs: scala.Boolean): RangeCollection = js.native
  /**
           *
           * Splits the content control into child ranges by using delimiters.
           *
           * [Api set: WordApi 1.3]
           *
           * @param delimiters Required. The delimiters as an array of strings.
           * @param multiParagraphs Optional. Indicates whether a returned child range can cover multiple paragraphs. Default is false which indicates that the paragraph boundaries are also used as delimiters.
           * @param trimDelimiters Optional. Indicates whether to trim delimiters from the ranges in the range collection. Default is false which indicates that the delimiters are included in the ranges returned in the range collection.
           * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
           */
  def split(
    delimiters: js.Array[java.lang.String],
    multiParagraphs: scala.Boolean,
    trimDelimiters: scala.Boolean
  ): RangeCollection = js.native
  /**
           *
           * Splits the content control into child ranges by using delimiters.
           *
           * [Api set: WordApi 1.3]
           *
           * @param delimiters Required. The delimiters as an array of strings.
           * @param multiParagraphs Optional. Indicates whether a returned child range can cover multiple paragraphs. Default is false which indicates that the paragraph boundaries are also used as delimiters.
           * @param trimDelimiters Optional. Indicates whether to trim delimiters from the ranges in the range collection. Default is false which indicates that the delimiters are included in the ranges returned in the range collection.
           * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
           */
  def split(
    delimiters: js.Array[java.lang.String],
    multiParagraphs: scala.Boolean,
    trimDelimiters: scala.Boolean,
    trimSpacing: scala.Boolean
  ): RangeCollection = js.native
  def toJSON(): officeDashJsDashPreviewLib.WordNs.InterfacesNs.ContentControlData = js.native
  /**
           * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
           */
  def track(): ContentControl = js.native
  /**
           * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
           */
  def untrack(): ContentControl = js.native
}

