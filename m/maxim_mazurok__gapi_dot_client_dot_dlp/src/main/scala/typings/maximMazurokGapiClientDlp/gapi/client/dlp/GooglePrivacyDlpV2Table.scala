package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Table extends StObject {
  
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
  implicit class GooglePrivacyDlpV2TableMutableBuilder[Self <: GooglePrivacyDlpV2Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: GooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[GooglePrivacyDlpV2Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: GooglePrivacyDlpV2Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
