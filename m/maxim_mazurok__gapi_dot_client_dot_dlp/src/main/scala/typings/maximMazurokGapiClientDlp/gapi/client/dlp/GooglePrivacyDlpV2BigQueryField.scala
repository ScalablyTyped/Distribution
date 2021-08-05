package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2BigQueryField extends StObject {
  
  /** Designated field in the BigQuery table. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.undefined
  
  /** Source table of the field. */
  var table: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object GooglePrivacyDlpV2BigQueryField {
  
  inline def apply(): GooglePrivacyDlpV2BigQueryField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2BigQueryField]
  }
  
  extension [Self <: GooglePrivacyDlpV2BigQueryField](x: Self) {
    
    inline def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setTable(value: GooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
