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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `contentControl.toJSON()`. */
trait ContentControlData extends StObject {
  
  /**
    * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var appearance: js.UndefOr[ContentControlAppearance | BoundingBox | Tags | Hidden] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the collection of content control objects in the content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.undefined
  
  /**
    * Gets the collection of field objects in the content control.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var fields: js.UndefOr[js.Array[FieldData]] = js.undefined
  
  /**
    * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.undefined
  
  /**
    * Gets an integer that represents the content control identifier.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the collection of InlinePicture objects in the content control. The collection does not include floating images.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
  
  /**
    * Gets the collection of list objects in the content control.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var lists: js.UndefOr[js.Array[ListData]] = js.undefined
  
  /**
    * Gets the collection of paragraph objects in the content control. **Important**: For requirement sets 1.1 and 1.2, paragraphs in tables wholly contained within this content control are not returned. From requirement set 1.3, paragraphs in such tables are also returned.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
  
  /**
    * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty. **Note**: The set operation for this property is not supported in Word on the web.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var placeholderText: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJsPreview.Word.Style, typings.officeJsPreview.officeJsPreviewStrings.Other, typings.officeJsPreview.officeJsPreviewStrings.Normal */ Any
  ] = js.undefined
  
  /**
    * Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var subtype: js.UndefOr[
    ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
  ] = js.undefined
  
  /**
    * Gets the collection of table objects in the content control.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  
  /**
    * Gets or sets a tag to identify a content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var tag: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the text of the content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the title for a content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the content control type. Only rich text content controls are supported currently.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var `type`: js.UndefOr[
    ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
  ] = js.undefined
}
object ContentControlData {
  
  inline def apply(): ContentControlData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentControlData] (val x: Self) extends AnyVal {
    
    inline def setAppearance(value: ContentControlAppearance | BoundingBox | Tags | Hidden): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    inline def setCannotDelete(value: Boolean): Self = StObject.set(x, "cannotDelete", value.asInstanceOf[js.Any])
    
    inline def setCannotDeleteUndefined: Self = StObject.set(x, "cannotDelete", js.undefined)
    
    inline def setCannotEdit(value: Boolean): Self = StObject.set(x, "cannotEdit", value.asInstanceOf[js.Any])
    
    inline def setCannotEditUndefined: Self = StObject.set(x, "cannotEdit", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContentControls(value: js.Array[ContentControlData]): Self = StObject.set(x, "contentControls", value.asInstanceOf[js.Any])
    
    inline def setContentControlsUndefined: Self = StObject.set(x, "contentControls", js.undefined)
    
    inline def setContentControlsVarargs(value: ContentControlData*): Self = StObject.set(x, "contentControls", js.Array(value*))
    
    inline def setFields(value: js.Array[FieldData]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldData*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFont(value: FontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlinePictures(value: js.Array[InlinePictureData]): Self = StObject.set(x, "inlinePictures", value.asInstanceOf[js.Any])
    
    inline def setInlinePicturesUndefined: Self = StObject.set(x, "inlinePictures", js.undefined)
    
    inline def setInlinePicturesVarargs(value: InlinePictureData*): Self = StObject.set(x, "inlinePictures", js.Array(value*))
    
    inline def setLists(value: js.Array[ListData]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    inline def setListsVarargs(value: ListData*): Self = StObject.set(x, "lists", js.Array(value*))
    
    inline def setParagraphs(value: js.Array[ParagraphData]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    inline def setParagraphsVarargs(value: ParagraphData*): Self = StObject.set(x, "paragraphs", js.Array(value*))
    
    inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
    
    inline def setRemoveWhenEdited(value: Boolean): Self = StObject.set(x, "removeWhenEdited", value.asInstanceOf[js.Any])
    
    inline def setRemoveWhenEditedUndefined: Self = StObject.set(x, "removeWhenEdited", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltIn(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJsPreview.Word.Style, typings.officeJsPreview.officeJsPreviewStrings.Other, typings.officeJsPreview.officeJsPreviewStrings.Normal */ Any
    ): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubtype(
      value: ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
    ): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setTables(value: js.Array[TableData]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: TableData*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(
      value: ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
