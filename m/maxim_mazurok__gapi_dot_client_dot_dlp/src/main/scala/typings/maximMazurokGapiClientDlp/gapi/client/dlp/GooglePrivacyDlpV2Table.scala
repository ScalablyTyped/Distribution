package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Table extends StObject {
  
  /** Headers of the table. */
  var headers: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.undefined
  
  /** Rows of the table. */
  var rows: js.UndefOr[js.Array[GooglePrivacyDlpV2Row]] = js.undefined
}
object GooglePrivacyDlpV2Table {
  
  inline def apply(): GooglePrivacyDlpV2Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Table]
  }
  
  extension [Self <: GooglePrivacyDlpV2Table](x: Self) {
    
    inline def setHeaders(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: GooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setRows(value: js.Array[GooglePrivacyDlpV2Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: GooglePrivacyDlpV2Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
