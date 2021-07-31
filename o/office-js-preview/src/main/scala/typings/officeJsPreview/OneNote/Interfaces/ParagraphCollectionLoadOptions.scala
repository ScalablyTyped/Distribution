package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of Paragraph objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait ParagraphCollectionLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the Ink collection in the Paragraph. Throws an exception if ParagraphType is not Ink.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkWords: js.UndefOr[InkWordCollectionLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the Outline object that contains the Paragraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var outline: js.UndefOr[OutlineLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The collection of paragraphs under this paragraph. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the parent paragraph object. Throws if a parent paragraph does not exist.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentParagraph: js.UndefOr[ParagraphLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the parent paragraph object. Returns null if a parent paragraph does not exist.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentParagraphOrNull: js.UndefOr[ParagraphLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, throws ItemNotFound.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, returns null.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentTableCellOrNull: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the RichText object in the Paragraph. Throws an exception if ParagraphType is not RichText.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var richText: js.UndefOr[RichTextLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var table: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the type of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object ParagraphCollectionLoadOptions {
  
  @scala.inline
  def apply(): ParagraphCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class ParagraphCollectionLoadOptionsMutableBuilder[Self <: ParagraphCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImage(value: ImageLoadOptions): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setInkWords(value: InkWordCollectionLoadOptions): Self = StObject.set(x, "inkWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInkWordsUndefined: Self = StObject.set(x, "inkWords", js.undefined)
    
    @scala.inline
    def setOutline(value: OutlineLoadOptions): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setParagraphs(value: ParagraphCollectionLoadOptions): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    @scala.inline
    def setParentParagraph(value: ParagraphLoadOptions): Self = StObject.set(x, "parentParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentParagraphOrNull(value: ParagraphLoadOptions): Self = StObject.set(x, "parentParagraphOrNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentParagraphOrNullUndefined: Self = StObject.set(x, "parentParagraphOrNull", js.undefined)
    
    @scala.inline
    def setParentParagraphUndefined: Self = StObject.set(x, "parentParagraph", js.undefined)
    
    @scala.inline
    def setParentTableCell(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTableCellOrNull(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCellOrNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTableCellOrNullUndefined: Self = StObject.set(x, "parentTableCellOrNull", js.undefined)
    
    @scala.inline
    def setParentTableCellUndefined: Self = StObject.set(x, "parentTableCell", js.undefined)
    
    @scala.inline
    def setRichText(value: RichTextLoadOptions): Self = StObject.set(x, "richText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichTextUndefined: Self = StObject.set(x, "richText", js.undefined)
    
    @scala.inline
    def setTable(value: TableLoadOptions): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    @scala.inline
    def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
