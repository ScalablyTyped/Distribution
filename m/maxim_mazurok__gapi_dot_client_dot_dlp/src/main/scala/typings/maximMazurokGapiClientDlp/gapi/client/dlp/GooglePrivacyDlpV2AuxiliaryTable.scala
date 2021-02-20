package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2AuxiliaryTable extends StObject {
  
  /** Required. Quasi-identifier columns. */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2QuasiIdField]] = js.native
  
  /** Required. The relative frequency column must contain a floating-point number between 0 and 1 (inclusive). Null values are assumed to be zero. */
  var relativeFrequency: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
  
  /** Required. Auxiliary table location. */
  var table: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.native
}
object GooglePrivacyDlpV2AuxiliaryTable {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2AuxiliaryTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2AuxiliaryTable]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2AuxiliaryTableMutableBuilder[Self <: GooglePrivacyDlpV2AuxiliaryTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuasiIds(value: js.Array[GooglePrivacyDlpV2QuasiIdField]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    @scala.inline
    def setQuasiIdsVarargs(value: GooglePrivacyDlpV2QuasiIdField*): Self = StObject.set(x, "quasiIds", js.Array(value :_*))
    
    @scala.inline
    def setRelativeFrequency(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "relativeFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeFrequencyUndefined: Self = StObject.set(x, "relativeFrequency", js.undefined)
    
    @scala.inline
    def setTable(value: GooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
