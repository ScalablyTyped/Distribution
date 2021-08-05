package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TableLocation extends StObject {
  
  /**
    * The zero-based index of the row where the finding is located. Only populated for resources that have a natural ordering, not BigQuery. In BigQuery, to identify the row a finding
    * came from, populate BigQueryOptions.identifying_fields with your primary key column names and when you store the findings the value of those columns will be stored inside of
    * Finding.
    */
  var rowIndex: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2TableLocation {
  
  inline def apply(): GooglePrivacyDlpV2TableLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TableLocation]
  }
  
  extension [Self <: GooglePrivacyDlpV2TableLocation](x: Self) {
    
    inline def setRowIndex(value: String): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
