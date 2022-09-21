package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.NoteItemType
import typings.officeJsPreview.officeJsPreviewStrings.Endnote
import typings.officeJsPreview.officeJsPreviewStrings.Footnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `noteItem.toJSON()`. */
trait NoteItemData extends StObject {
  
  /**
    * Represents the body object of the note item. It's the portion of the text within the footnote or endnote.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var body: js.UndefOr[BodyData] = js.undefined
  
  /**
    * Represents a footnote or endnote reference in the main document.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var reference: js.UndefOr[RangeData] = js.undefined
  
  /**
    * Represents the note item type: footnote or endnote.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var `type`: js.UndefOr[NoteItemType | Footnote | Endnote] = js.undefined
}
object NoteItemData {
  
  inline def apply(): NoteItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteItemData]
  }
  
  extension [Self <: NoteItemData](x: Self) {
    
    inline def setBody(value: BodyData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setReference(value: RangeData): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setType(value: NoteItemType | Footnote | Endnote): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
