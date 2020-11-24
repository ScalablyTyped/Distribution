package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2KMapEstimationConfig extends js.Object {
  
  /** Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers column must appear in exactly one column of one auxiliary table. */
  var auxiliaryTables: js.UndefOr[js.Array[GooglePrivacyDlpV2AuxiliaryTable]] = js.native
  
  /** Required. Fields considered to be quasi-identifiers. No two columns can have the same tag. */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2TaggedField]] = js.native
  
  /** ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code. */
  var regionCode: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2KMapEstimationConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2KMapEstimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KMapEstimationConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2KMapEstimationConfigOps[Self <: GooglePrivacyDlpV2KMapEstimationConfig] (val x: Self) extends AnyVal {
    
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
    def setAuxiliaryTablesVarargs(value: GooglePrivacyDlpV2AuxiliaryTable*): Self = this.set("auxiliaryTables", js.Array(value :_*))
    
    @scala.inline
    def setAuxiliaryTables(value: js.Array[GooglePrivacyDlpV2AuxiliaryTable]): Self = this.set("auxiliaryTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuxiliaryTables: Self = this.set("auxiliaryTables", js.undefined)
    
    @scala.inline
    def setQuasiIdsVarargs(value: GooglePrivacyDlpV2TaggedField*): Self = this.set("quasiIds", js.Array(value :_*))
    
    @scala.inline
    def setQuasiIds(value: js.Array[GooglePrivacyDlpV2TaggedField]): Self = this.set("quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuasiIds: Self = this.set("quasiIds", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
  }
}
