package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2AuxiliaryTable extends StObject {
  
  /** Required. Quasi-identifier columns. */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2QuasiIdField]] = js.undefined
  
  /** Required. The relative frequency column must contain a floating-point number between 0 and 1 (inclusive). Null values are assumed to be zero. */
  var relativeFrequency: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.undefined
  
  /** Required. Auxiliary table location. */
  var table: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object GooglePrivacyDlpV2AuxiliaryTable {
  
  inline def apply(): GooglePrivacyDlpV2AuxiliaryTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2AuxiliaryTable]
  }
  
  extension [Self <: GooglePrivacyDlpV2AuxiliaryTable](x: Self) {
    
    inline def setQuasiIds(value: js.Array[GooglePrivacyDlpV2QuasiIdField]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    inline def setQuasiIdsVarargs(value: GooglePrivacyDlpV2QuasiIdField*): Self = StObject.set(x, "quasiIds", js.Array(value*))
    
    inline def setRelativeFrequency(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "relativeFrequency", value.asInstanceOf[js.Any])
    
    inline def setRelativeFrequencyUndefined: Self = StObject.set(x, "relativeFrequency", js.undefined)
    
    inline def setTable(value: GooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
