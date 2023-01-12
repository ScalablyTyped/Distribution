package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuralElement extends StObject {
  
  /** The zero-based end index of this structural element, exclusive, in UTF-16 code units. */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /** A paragraph type of structural element. */
  var paragraph: js.UndefOr[Paragraph] = js.undefined
  
  /** A section break type of structural element. */
  var sectionBreak: js.UndefOr[SectionBreak] = js.undefined
  
  /** The zero-based start index of this structural element, in UTF-16 code units. */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /** A table type of structural element. */
  var table: js.UndefOr[Table] = js.undefined
  
  /** A table of contents type of structural element. */
  var tableOfContents: js.UndefOr[TableOfContents] = js.undefined
}
object StructuralElement {
  
  inline def apply(): StructuralElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuralElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructuralElement] (val x: Self) extends AnyVal {
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setParagraph(value: Paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    inline def setSectionBreak(value: SectionBreak): Self = StObject.set(x, "sectionBreak", value.asInstanceOf[js.Any])
    
    inline def setSectionBreakUndefined: Self = StObject.set(x, "sectionBreak", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableOfContents(value: TableOfContents): Self = StObject.set(x, "tableOfContents", value.asInstanceOf[js.Any])
    
    inline def setTableOfContentsUndefined: Self = StObject.set(x, "tableOfContents", js.undefined)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
