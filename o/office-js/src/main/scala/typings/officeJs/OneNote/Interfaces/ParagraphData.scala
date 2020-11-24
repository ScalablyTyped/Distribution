package typings.officeJs.OneNote.Interfaces

import typings.officeJs.OneNote.ParagraphType
import typings.officeJs.officeJsStrings.Image
import typings.officeJs.officeJsStrings.Ink
import typings.officeJs.officeJsStrings.Other
import typings.officeJs.officeJsStrings.RichText
import typings.officeJs.officeJsStrings.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "paragraph.toJSON()". */
@js.native
trait ParagraphData extends js.Object {
  
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
  implicit class ParagraphDataOps[Self <: ParagraphData] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImage(value: ImageData): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setInkWordsVarargs(value: InkWordData*): Self = this.set("inkWords", js.Array(value :_*))
    
    @scala.inline
    def setInkWords(value: js.Array[InkWordData]): Self = this.set("inkWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInkWords: Self = this.set("inkWords", js.undefined)
    
    @scala.inline
    def setParagraphsVarargs(value: ParagraphData*): Self = this.set("paragraphs", js.Array(value :_*))
    
    @scala.inline
    def setParagraphs(value: js.Array[ParagraphData]): Self = this.set("paragraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraphs: Self = this.set("paragraphs", js.undefined)
    
    @scala.inline
    def setRichText(value: RichTextData): Self = this.set("richText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRichText: Self = this.set("richText", js.undefined)
    
    @scala.inline
    def setTable(value: TableData): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setType(value: ParagraphType | RichText | Image | Table | Ink | Other): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
