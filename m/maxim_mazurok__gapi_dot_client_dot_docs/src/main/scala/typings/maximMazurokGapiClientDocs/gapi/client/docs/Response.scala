package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  /** The result of creating a footer. */
  var createFooter: js.UndefOr[CreateFooterResponse] = js.undefined
  
  /** The result of creating a footnote. */
  var createFootnote: js.UndefOr[CreateFootnoteResponse] = js.undefined
  
  /** The result of creating a header. */
  var createHeader: js.UndefOr[CreateHeaderResponse] = js.undefined
  
  /** The result of creating a named range. */
  var createNamedRange: js.UndefOr[CreateNamedRangeResponse] = js.undefined
  
  /** The result of inserting an inline image. */
  var insertInlineImage: js.UndefOr[InsertInlineImageResponse] = js.undefined
  
  /** The result of inserting an inline Google Sheets chart. */
  var insertInlineSheetsChart: js.UndefOr[InsertInlineSheetsChartResponse] = js.undefined
  
  /** The result of replacing text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.undefined
}
object Response {
  
  inline def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setCreateFooter(value: CreateFooterResponse): Self = StObject.set(x, "createFooter", value.asInstanceOf[js.Any])
    
    inline def setCreateFooterUndefined: Self = StObject.set(x, "createFooter", js.undefined)
    
    inline def setCreateFootnote(value: CreateFootnoteResponse): Self = StObject.set(x, "createFootnote", value.asInstanceOf[js.Any])
    
    inline def setCreateFootnoteUndefined: Self = StObject.set(x, "createFootnote", js.undefined)
    
    inline def setCreateHeader(value: CreateHeaderResponse): Self = StObject.set(x, "createHeader", value.asInstanceOf[js.Any])
    
    inline def setCreateHeaderUndefined: Self = StObject.set(x, "createHeader", js.undefined)
    
    inline def setCreateNamedRange(value: CreateNamedRangeResponse): Self = StObject.set(x, "createNamedRange", value.asInstanceOf[js.Any])
    
    inline def setCreateNamedRangeUndefined: Self = StObject.set(x, "createNamedRange", js.undefined)
    
    inline def setInsertInlineImage(value: InsertInlineImageResponse): Self = StObject.set(x, "insertInlineImage", value.asInstanceOf[js.Any])
    
    inline def setInsertInlineImageUndefined: Self = StObject.set(x, "insertInlineImage", js.undefined)
    
    inline def setInsertInlineSheetsChart(value: InsertInlineSheetsChartResponse): Self = StObject.set(x, "insertInlineSheetsChart", value.asInstanceOf[js.Any])
    
    inline def setInsertInlineSheetsChartUndefined: Self = StObject.set(x, "insertInlineSheetsChart", js.undefined)
    
    inline def setReplaceAllText(value: ReplaceAllTextResponse): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
  }
}
