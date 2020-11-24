package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2StatisticalTable extends js.Object {
  
  /** Required. Quasi-identifier columns. */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2QuasiIdentifierField]] = js.native
  
  /** Required. The relative frequency column must contain a floating-point number between 0 and 1 (inclusive). Null values are assumed to be zero. */
  var relativeFrequency: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
  
  /** Required. Auxiliary table location. */
  var table: js.UndefOr[GooglePrivacyDlpV2BigQueryTable] = js.native
}
object GooglePrivacyDlpV2StatisticalTable {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2StatisticalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StatisticalTable]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2StatisticalTableOps[Self <: GooglePrivacyDlpV2StatisticalTable] (val x: Self) extends AnyVal {
    
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
    def setQuasiIdsVarargs(value: GooglePrivacyDlpV2QuasiIdentifierField*): Self = this.set("quasiIds", js.Array(value :_*))
    
    @scala.inline
    def setQuasiIds(value: js.Array[GooglePrivacyDlpV2QuasiIdentifierField]): Self = this.set("quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuasiIds: Self = this.set("quasiIds", js.undefined)
    
    @scala.inline
    def setRelativeFrequency(value: GooglePrivacyDlpV2FieldId): Self = this.set("relativeFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeFrequency: Self = this.set("relativeFrequency", js.undefined)
    
    @scala.inline
    def setTable(value: GooglePrivacyDlpV2BigQueryTable): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
}
