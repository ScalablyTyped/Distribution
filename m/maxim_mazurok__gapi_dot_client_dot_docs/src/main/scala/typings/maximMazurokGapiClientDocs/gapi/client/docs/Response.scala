package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends js.Object {
  
  /** The result of creating a footer. */
  var createFooter: js.UndefOr[CreateFooterResponse] = js.native
  
  /** The result of creating a footnote. */
  var createFootnote: js.UndefOr[CreateFootnoteResponse] = js.native
  
  /** The result of creating a header. */
  var createHeader: js.UndefOr[CreateHeaderResponse] = js.native
  
  /** The result of creating a named range. */
  var createNamedRange: js.UndefOr[CreateNamedRangeResponse] = js.native
  
  /** The result of inserting an inline image. */
  var insertInlineImage: js.UndefOr[InsertInlineImageResponse] = js.native
  
  /** The result of inserting an inline Google Sheets chart. */
  var insertInlineSheetsChart: js.UndefOr[InsertInlineSheetsChartResponse] = js.native
  
  /** The result of replacing text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.native
}
object Response {
  
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    
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
    def setCreateFooter(value: CreateFooterResponse): Self = this.set("createFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFooter: Self = this.set("createFooter", js.undefined)
    
    @scala.inline
    def setCreateFootnote(value: CreateFootnoteResponse): Self = this.set("createFootnote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFootnote: Self = this.set("createFootnote", js.undefined)
    
    @scala.inline
    def setCreateHeader(value: CreateHeaderResponse): Self = this.set("createHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateHeader: Self = this.set("createHeader", js.undefined)
    
    @scala.inline
    def setCreateNamedRange(value: CreateNamedRangeResponse): Self = this.set("createNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateNamedRange: Self = this.set("createNamedRange", js.undefined)
    
    @scala.inline
    def setInsertInlineImage(value: InsertInlineImageResponse): Self = this.set("insertInlineImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertInlineImage: Self = this.set("insertInlineImage", js.undefined)
    
    @scala.inline
    def setInsertInlineSheetsChart(value: InsertInlineSheetsChartResponse): Self = this.set("insertInlineSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertInlineSheetsChart: Self = this.set("insertInlineSheetsChart", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: ReplaceAllTextResponse): Self = this.set("replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllText: Self = this.set("replaceAllText", js.undefined)
  }
}
