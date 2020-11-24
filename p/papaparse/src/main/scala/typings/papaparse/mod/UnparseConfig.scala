package typings.papaparse.mod

import typings.papaparse.papaparseStrings.greedy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnparseConfig extends js.Object {
  
   // default: false
  var columns: js.UndefOr[js.Array[String]] = js.native
  
   // default: false
  var delimiter: js.UndefOr[String] = js.native
  
   // default: ","
  /**
    * If defined and the download property is true,
    * a POST request will be made instead of a GET request and the passed argument will be set as the body of the request.
    * @default undefined
    */
  var downloadRequestBody: js.UndefOr[Boolean] = js.native
  
   // default: '"'
  var escapeChar: js.UndefOr[String] = js.native
  
   // default: '"'
  var escapeFormulae: js.UndefOr[Boolean] = js.native
  
  var header: js.UndefOr[Boolean] = js.native
  
   // default: true
  var newline: js.UndefOr[String] = js.native
  
   // default: false
  var quoteChar: js.UndefOr[String] = js.native
  
  var quotes: js.UndefOr[Boolean | js.Array[Boolean] | (js.Function1[/* value */ js.Any, Boolean])] = js.native
  
   // default: "\r\n"
  var skipEmptyLines: js.UndefOr[Boolean | greedy] = js.native
}
object UnparseConfig {
  
  @scala.inline
  def apply(): UnparseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnparseConfig]
  }
  
  @scala.inline
  implicit class UnparseConfigOps[Self <: UnparseConfig] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDownloadRequestBody(value: Boolean): Self = this.set("downloadRequestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadRequestBody: Self = this.set("downloadRequestBody", js.undefined)
    
    @scala.inline
    def setEscapeChar(value: String): Self = this.set("escapeChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeChar: Self = this.set("escapeChar", js.undefined)
    
    @scala.inline
    def setEscapeFormulae(value: Boolean): Self = this.set("escapeFormulae", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeFormulae: Self = this.set("escapeFormulae", js.undefined)
    
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    
    @scala.inline
    def setQuoteChar(value: String): Self = this.set("quoteChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteChar: Self = this.set("quoteChar", js.undefined)
    
    @scala.inline
    def setQuotesVarargs(value: Boolean*): Self = this.set("quotes", js.Array(value :_*))
    
    @scala.inline
    def setQuotesFunction1(value: /* value */ js.Any => Boolean): Self = this.set("quotes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuotes(value: Boolean | js.Array[Boolean] | (js.Function1[/* value */ js.Any, Boolean])): Self = this.set("quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
    
    @scala.inline
    def setSkipEmptyLines(value: Boolean | greedy): Self = this.set("skipEmptyLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipEmptyLines: Self = this.set("skipEmptyLines", js.undefined)
  }
}
