package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2RecordKey extends StObject {
  
  var bigQueryKey: js.UndefOr[GooglePrivacyDlpV2BigQueryKey] = js.undefined
  
  var datastoreKey: js.UndefOr[GooglePrivacyDlpV2DatastoreKey] = js.undefined
  
  /** Values of identifying columns in the given row. Order of values matches the order of `identifying_fields` specified in the scanning request. */
  var idValues: js.UndefOr[js.Array[String]] = js.undefined
}
object GooglePrivacyDlpV2RecordKey {
  
  inline def apply(): GooglePrivacyDlpV2RecordKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordKey]
  }
  
  extension [Self <: GooglePrivacyDlpV2RecordKey](x: Self) {
    
    inline def setBigQueryKey(value: GooglePrivacyDlpV2BigQueryKey): Self = StObject.set(x, "bigQueryKey", value.asInstanceOf[js.Any])
    
    inline def setBigQueryKeyUndefined: Self = StObject.set(x, "bigQueryKey", js.undefined)
    
    inline def setDatastoreKey(value: GooglePrivacyDlpV2DatastoreKey): Self = StObject.set(x, "datastoreKey", value.asInstanceOf[js.Any])
    
    inline def setDatastoreKeyUndefined: Self = StObject.set(x, "datastoreKey", js.undefined)
    
    inline def setIdValues(value: js.Array[String]): Self = StObject.set(x, "idValues", value.asInstanceOf[js.Any])
    
    inline def setIdValuesUndefined: Self = StObject.set(x, "idValues", js.undefined)
    
    inline def setIdValuesVarargs(value: String*): Self = StObject.set(x, "idValues", js.Array(value :_*))
  }
}
