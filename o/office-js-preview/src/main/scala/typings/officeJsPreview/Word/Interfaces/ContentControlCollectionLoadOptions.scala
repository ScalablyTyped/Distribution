package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains a collection of {@link Word.ContentControl} objects. Content controls are bounded and potentially labeled regions in a document that serve as containers for specific types of content. Individual content controls may contain contents such as images, tables, or paragraphs of formatted text. Currently, only rich text content controls are supported.
  *
  * [Api set: WordApi 1.1]
  */
trait ContentControlCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * [Api set: WordApi 1.1]
    */
  var appearance: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the text format of the content control. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets an integer that represents the content control identifier. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the parent body of the content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the content control. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the content control. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the content control. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the content control. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the content control. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the content control. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
    *
    * [Api set: WordApi 1.1]
    */
  var placeholderText: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var subtype: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a tag to identify a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var tag: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the text of the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the title for a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the content control type. Only rich text content controls are supported currently. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object ContentControlCollectionLoadOptions {
  
  @scala.inline
  def apply(): ContentControlCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class ContentControlCollectionLoadOptionsMutableBuilder[Self <: ContentControlCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAppearance(value: Boolean): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setCannotDelete(value: Boolean): Self = StObject.set(x, "cannotDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannotDeleteUndefined: Self = StObject.set(x, "cannotDelete", js.undefined)
    
    @scala.inline
    def setCannotEdit(value: Boolean): Self = StObject.set(x, "cannotEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannotEditUndefined: Self = StObject.set(x, "cannotEdit", js.undefined)
    
    @scala.inline
    def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: FontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setParentBody(value: BodyLoadOptions): Self = StObject.set(x, "parentBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentBodyUndefined: Self = StObject.set(x, "parentBody", js.undefined)
    
    @scala.inline
    def setParentContentControl(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControlOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentContentControlOrNullObjectUndefined: Self = StObject.set(x, "parentContentControlOrNullObject", js.undefined)
    
    @scala.inline
    def setParentContentControlUndefined: Self = StObject.set(x, "parentContentControl", js.undefined)
    
    @scala.inline
    def setParentTable(value: TableLoadOptions): Self = StObject.set(x, "parentTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTableCell(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTableCellOrNullObject(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCellOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTableCellOrNullObjectUndefined: Self = StObject.set(x, "parentTableCellOrNullObject", js.undefined)
    
    @scala.inline
    def setParentTableCellUndefined: Self = StObject.set(x, "parentTableCell", js.undefined)
    
    @scala.inline
    def setParentTableOrNullObject(value: TableLoadOptions): Self = StObject.set(x, "parentTableOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTableOrNullObjectUndefined: Self = StObject.set(x, "parentTableOrNullObject", js.undefined)
    
    @scala.inline
    def setParentTableUndefined: Self = StObject.set(x, "parentTable", js.undefined)
    
    @scala.inline
    def setPlaceholderText(value: Boolean): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
    
    @scala.inline
    def setRemoveWhenEdited(value: Boolean): Self = StObject.set(x, "removeWhenEdited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveWhenEditedUndefined: Self = StObject.set(x, "removeWhenEdited", js.undefined)
    
    @scala.inline
    def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBuiltIn(value: Boolean): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubtype(value: Boolean): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    @scala.inline
    def setTag(value: Boolean): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
