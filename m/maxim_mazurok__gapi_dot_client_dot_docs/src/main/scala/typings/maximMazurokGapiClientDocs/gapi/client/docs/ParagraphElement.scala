package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParagraphElement extends StObject {
  
  /** An auto text paragraph element. */
  var autoText: js.UndefOr[AutoText] = js.native
  
  /** A column break paragraph element. */
  var columnBreak: js.UndefOr[ColumnBreak] = js.native
  
  /** The zero-base end index of this paragraph element, exclusive, in UTF-16 code units. */
  var endIndex: js.UndefOr[Double] = js.native
  
  /** An equation paragraph element. */
  var equation: js.UndefOr[Equation] = js.native
  
  /** A footnote reference paragraph element. */
  var footnoteReference: js.UndefOr[FootnoteReference] = js.native
  
  /** A horizontal rule paragraph element. */
  var horizontalRule: js.UndefOr[HorizontalRule] = js.native
  
  /** An inline object paragraph element. */
  var inlineObjectElement: js.UndefOr[InlineObjectElement] = js.native
  
  /** A page break paragraph element. */
  var pageBreak: js.UndefOr[PageBreak] = js.native
  
  /** The zero-based start index of this paragraph element, in UTF-16 code units. */
  var startIndex: js.UndefOr[Double] = js.native
  
  /** A text run paragraph element. */
  var textRun: js.UndefOr[TextRun] = js.native
}
object ParagraphElement {
  
  @scala.inline
  def apply(): ParagraphElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphElement]
  }
  
  @scala.inline
  implicit class ParagraphElementMutableBuilder[Self <: ParagraphElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoText(value: AutoText): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    @scala.inline
    def setColumnBreak(value: ColumnBreak): Self = StObject.set(x, "columnBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnBreakUndefined: Self = StObject.set(x, "columnBreak", js.undefined)
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setEquation(value: Equation): Self = StObject.set(x, "equation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquationUndefined: Self = StObject.set(x, "equation", js.undefined)
    
    @scala.inline
    def setFootnoteReference(value: FootnoteReference): Self = StObject.set(x, "footnoteReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteReferenceUndefined: Self = StObject.set(x, "footnoteReference", js.undefined)
    
    @scala.inline
    def setHorizontalRule(value: HorizontalRule): Self = StObject.set(x, "horizontalRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalRuleUndefined: Self = StObject.set(x, "horizontalRule", js.undefined)
    
    @scala.inline
    def setInlineObjectElement(value: InlineObjectElement): Self = StObject.set(x, "inlineObjectElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineObjectElementUndefined: Self = StObject.set(x, "inlineObjectElement", js.undefined)
    
    @scala.inline
    def setPageBreak(value: PageBreak): Self = StObject.set(x, "pageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBreakUndefined: Self = StObject.set(x, "pageBreak", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setTextRun(value: TextRun): Self = StObject.set(x, "textRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRunUndefined: Self = StObject.set(x, "textRun", js.undefined)
  }
}
