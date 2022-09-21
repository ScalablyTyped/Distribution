package typings.officeJs.OneNote.Interfaces

import typings.officeJs.OneNote.ParagraphType
import typings.officeJs.officeJsStrings.Image
import typings.officeJs.officeJsStrings.Ink
import typings.officeJs.officeJsStrings.Other
import typings.officeJs.officeJsStrings.RichText
import typings.officeJs.officeJsStrings.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `paragraph.toJSON()`. */
trait ParagraphData extends StObject {
  
  /**
    * Gets the ID of the Paragraph object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageData] = js.undefined
  
  /**
    * Gets the Ink collection in the Paragraph. Throws an exception if ParagraphType is not Ink. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var inkWords: js.UndefOr[js.Array[InkWordData]] = js.undefined
  
  /**
    * The collection of paragraphs under this paragraph. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
  
  /**
    * Gets the RichText object in the Paragraph. Throws an exception if ParagraphType is not RichText. Read-only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var richText: js.UndefOr[RichTextData] = js.undefined
  
  /**
    * Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var table: js.UndefOr[TableData] = js.undefined
  
  /**
    * Gets the type of the Paragraph object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[ParagraphType | RichText | Image | Table | Ink | Other] = js.undefined
}
object ParagraphData {
  
  inline def apply(): ParagraphData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphData]
  }
  
  extension [Self <: ParagraphData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: ImageData): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInkWords(value: js.Array[InkWordData]): Self = StObject.set(x, "inkWords", value.asInstanceOf[js.Any])
    
    inline def setInkWordsUndefined: Self = StObject.set(x, "inkWords", js.undefined)
    
    inline def setInkWordsVarargs(value: InkWordData*): Self = StObject.set(x, "inkWords", js.Array(value*))
    
    inline def setParagraphs(value: js.Array[ParagraphData]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    inline def setParagraphsVarargs(value: ParagraphData*): Self = StObject.set(x, "paragraphs", js.Array(value*))
    
    inline def setRichText(value: RichTextData): Self = StObject.set(x, "richText", value.asInstanceOf[js.Any])
    
    inline def setRichTextUndefined: Self = StObject.set(x, "richText", js.undefined)
    
    inline def setTable(value: TableData): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setType(value: ParagraphType | RichText | Image | Table | Ink | Other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
