package typings.officeJsPreview.OneNote.Interfaces

import typings.officeJsPreview.OneNote.ParagraphType
import typings.officeJsPreview.officeJsPreviewStrings.Image
import typings.officeJsPreview.officeJsPreviewStrings.Ink
import typings.officeJsPreview.officeJsPreviewStrings.Other
import typings.officeJsPreview.officeJsPreviewStrings.RichText
import typings.officeJsPreview.officeJsPreviewStrings.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "paragraph.toJSON()". */
@js.native
trait ParagraphData extends StObject {
  
  /**
    *
    * Gets the ID of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageData] = js.native
  
  /**
    *
    * Gets the Ink collection in the Paragraph. Throws an exception if ParagraphType is not Ink. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkWords: js.UndefOr[js.Array[InkWordData]] = js.native
  
  /**
    *
    * The collection of paragraphs under this paragraph. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.native
  
  /**
    *
    * Gets the RichText object in the Paragraph. Throws an exception if ParagraphType is not RichText. Read-only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var richText: js.UndefOr[RichTextData] = js.native
  
  /**
    *
    * Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var table: js.UndefOr[TableData] = js.native
  
  /**
    *
    * Gets the type of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[ParagraphType | RichText | Image | Table | Ink | Other] = js.native
}
object ParagraphData {
  
  @scala.inline
  def apply(): ParagraphData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphData]
  }
  
  @scala.inline
  implicit class ParagraphDataMutableBuilder[Self <: ParagraphData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImage(value: ImageData): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setInkWords(value: js.Array[InkWordData]): Self = StObject.set(x, "inkWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInkWordsUndefined: Self = StObject.set(x, "inkWords", js.undefined)
    
    @scala.inline
    def setInkWordsVarargs(value: InkWordData*): Self = StObject.set(x, "inkWords", js.Array(value :_*))
    
    @scala.inline
    def setParagraphs(value: js.Array[ParagraphData]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    @scala.inline
    def setParagraphsVarargs(value: ParagraphData*): Self = StObject.set(x, "paragraphs", js.Array(value :_*))
    
    @scala.inline
    def setRichText(value: RichTextData): Self = StObject.set(x, "richText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichTextUndefined: Self = StObject.set(x, "richText", js.undefined)
    
    @scala.inline
    def setTable(value: TableData): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    @scala.inline
    def setType(value: ParagraphType | RichText | Image | Table | Ink | Other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
