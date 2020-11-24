package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.ContentControlAppearance
import typings.officeJsPreview.Word.ContentControlType
import typings.officeJsPreview.officeJsPreviewStrings.BoundingBox
import typings.officeJsPreview.officeJsPreviewStrings.BuildingBlockGallery
import typings.officeJsPreview.officeJsPreviewStrings.CheckBox
import typings.officeJsPreview.officeJsPreviewStrings.ComboBox
import typings.officeJsPreview.officeJsPreviewStrings.DatePicker
import typings.officeJsPreview.officeJsPreviewStrings.DropDownList
import typings.officeJsPreview.officeJsPreviewStrings.Hidden
import typings.officeJsPreview.officeJsPreviewStrings.Picture
import typings.officeJsPreview.officeJsPreviewStrings.PlainText
import typings.officeJsPreview.officeJsPreviewStrings.PlainTextInline
import typings.officeJsPreview.officeJsPreviewStrings.PlainTextParagraph
import typings.officeJsPreview.officeJsPreviewStrings.RepeatingSection
import typings.officeJsPreview.officeJsPreviewStrings.RichText
import typings.officeJsPreview.officeJsPreviewStrings.RichTextInline
import typings.officeJsPreview.officeJsPreviewStrings.RichTextParagraphs
import typings.officeJsPreview.officeJsPreviewStrings.RichTextTable
import typings.officeJsPreview.officeJsPreviewStrings.RichTextTableCell
import typings.officeJsPreview.officeJsPreviewStrings.RichTextTableRow
import typings.officeJsPreview.officeJsPreviewStrings.Tags
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `contentControl.toJSON()`. */
@js.native
trait ContentControlData extends js.Object {
  
  /**
    *
    * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * [Api set: WordApi 1.1]
    */
  var appearance: js.UndefOr[ContentControlAppearance | BoundingBox | Tags | Hidden] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the collection of content control objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.native
  
  /**
    *
    * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.native
  
  /**
    *
    * Gets an integer that represents the content control identifier. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets the collection of inlinePicture objects in the content control. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.native
  
  /**
    *
    * Gets the collection of list objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var lists: js.UndefOr[js.Array[ListData]] = js.native
  
  /**
    *
    * Get the collection of paragraph objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.native
  
  /**
    *
    * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
    *
    * [Api set: WordApi 1.1]
    */
  var placeholderText: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.native
  
  /**
    *
    * Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var subtype: js.UndefOr[
    ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
  ] = js.native
  
  /**
    *
    * Gets the collection of table objects in the content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.native
  
  /**
    *
    * Gets or sets a tag to identify a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var tag: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the text of the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets or sets the title for a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the content control type. Only rich text content controls are supported currently. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var `type`: js.UndefOr[
    ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
  ] = js.native
}
object ContentControlData {
  
  @scala.inline
  def apply(): ContentControlData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlData]
  }
  
  @scala.inline
  implicit class ContentControlDataOps[Self <: ContentControlData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppearance(value: ContentControlAppearance | BoundingBox | Tags | Hidden): Self = this.set("appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    
    @scala.inline
    def setCannotDelete(value: Boolean): Self = this.set("cannotDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCannotDelete: Self = this.set("cannotDelete", js.undefined)
    
    @scala.inline
    def setCannotEdit(value: Boolean): Self = this.set("cannotEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCannotEdit: Self = this.set("cannotEdit", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContentControlsVarargs(value: ContentControlData*): Self = this.set("contentControls", js.Array(value :_*))
    
    @scala.inline
    def setContentControls(value: js.Array[ContentControlData]): Self = this.set("contentControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentControls: Self = this.set("contentControls", js.undefined)
    
    @scala.inline
    def setFont(value: FontData): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInlinePicturesVarargs(value: InlinePictureData*): Self = this.set("inlinePictures", js.Array(value :_*))
    
    @scala.inline
    def setInlinePictures(value: js.Array[InlinePictureData]): Self = this.set("inlinePictures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlinePictures: Self = this.set("inlinePictures", js.undefined)
    
    @scala.inline
    def setListsVarargs(value: ListData*): Self = this.set("lists", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: js.Array[ListData]): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    
    @scala.inline
    def setParagraphsVarargs(value: ParagraphData*): Self = this.set("paragraphs", js.Array(value :_*))
    
    @scala.inline
    def setParagraphs(value: js.Array[ParagraphData]): Self = this.set("paragraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraphs: Self = this.set("paragraphs", js.undefined)
    
    @scala.inline
    def setPlaceholderText(value: String): Self = this.set("placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderText: Self = this.set("placeholderText", js.undefined)
    
    @scala.inline
    def setRemoveWhenEdited(value: Boolean): Self = this.set("removeWhenEdited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveWhenEdited: Self = this.set("removeWhenEdited", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleBuiltIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any): Self = this.set("styleBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleBuiltIn: Self = this.set("styleBuiltIn", js.undefined)
    
    @scala.inline
    def setSubtype(
      value: ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
    ): Self = this.set("subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: TableData*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[TableData]): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(
      value: ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
