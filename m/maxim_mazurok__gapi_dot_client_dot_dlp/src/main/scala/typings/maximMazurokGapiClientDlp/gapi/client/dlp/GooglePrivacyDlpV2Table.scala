package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Table extends js.Object {
  
  /** Headers of the table. */
  var headers: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.native
  
  /** Rows of the table. */
  var rows: js.UndefOr[js.Array[GooglePrivacyDlpV2Row]] = js.native
}
object GooglePrivacyDlpV2Table {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Table]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TableOps[Self <: GooglePrivacyDlpV2Table] (val x: Self) extends AnyVal {
    
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
    def setHeadersVarargs(value: GooglePrivacyDlpV2FieldId*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: GooglePrivacyDlpV2Row*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[GooglePrivacyDlpV2Row]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
