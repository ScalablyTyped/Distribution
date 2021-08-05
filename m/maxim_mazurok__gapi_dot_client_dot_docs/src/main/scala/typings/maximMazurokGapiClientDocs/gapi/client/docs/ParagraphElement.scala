package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphElement extends StObject {
  
  /** An auto text paragraph element. */
  var autoText: js.UndefOr[AutoText] = js.undefined
  
  /** A column break paragraph element. */
  var columnBreak: js.UndefOr[ColumnBreak] = js.undefined
  
  /** The zero-base end index of this paragraph element, exclusive, in UTF-16 code units. */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /** An equation paragraph element. */
  var equation: js.UndefOr[Equation] = js.undefined
  
  /** A footnote reference paragraph element. */
  var footnoteReference: js.UndefOr[FootnoteReference] = js.undefined
  
  /** A horizontal rule paragraph element. */
  var horizontalRule: js.UndefOr[HorizontalRule] = js.undefined
  
  /** An inline object paragraph element. */
  var inlineObjectElement: js.UndefOr[InlineObjectElement] = js.undefined
  
  /** A page break paragraph element. */
  var pageBreak: js.UndefOr[PageBreak] = js.undefined
  
  /** The zero-based start index of this paragraph element, in UTF-16 code units. */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /** A text run paragraph element. */
  var textRun: js.UndefOr[TextRun] = js.undefined
}
object ParagraphElement {
  
  inline def apply(): ParagraphElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphElement]
  }
  
  extension [Self <: ParagraphElement](x: Self) {
    
    inline def setAutoText(value: AutoText): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    inline def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    inline def setColumnBreak(value: ColumnBreak): Self = StObject.set(x, "columnBreak", value.asInstanceOf[js.Any])
    
    inline def setColumnBreakUndefined: Self = StObject.set(x, "columnBreak", js.undefined)
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setEquation(value: Equation): Self = StObject.set(x, "equation", value.asInstanceOf[js.Any])
    
    inline def setEquationUndefined: Self = StObject.set(x, "equation", js.undefined)
    
    inline def setFootnoteReference(value: FootnoteReference): Self = StObject.set(x, "footnoteReference", value.asInstanceOf[js.Any])
    
    inline def setFootnoteReferenceUndefined: Self = StObject.set(x, "footnoteReference", js.undefined)
    
    inline def setHorizontalRule(value: HorizontalRule): Self = StObject.set(x, "horizontalRule", value.asInstanceOf[js.Any])
    
    inline def setHorizontalRuleUndefined: Self = StObject.set(x, "horizontalRule", js.undefined)
    
    inline def setInlineObjectElement(value: InlineObjectElement): Self = StObject.set(x, "inlineObjectElement", value.asInstanceOf[js.Any])
    
    inline def setInlineObjectElementUndefined: Self = StObject.set(x, "inlineObjectElement", js.undefined)
    
    inline def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
    
    inline def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTextRun(value: TextRun): Self = StObject.set(x, "textRun", value.asInstanceOf[js.Any])
    
    inline def setTextRunUndefined: Self = StObject.set(x, "textRun", js.undefined)
  }
}
