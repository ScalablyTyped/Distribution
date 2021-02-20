package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DeltaPresenceEstimationConfig extends StObject {
  
  /** Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers field must appear in exactly one field of one auxiliary table. */
  var auxiliaryTables: js.UndefOr[js.Array[GooglePrivacyDlpV2StatisticalTable]] = js.native
  
  /** Required. Fields considered to be quasi-identifiers. No two fields can have the same tag. */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2QuasiId]] = js.native
  
  /** ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code. */
  var regionCode: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2DeltaPresenceEstimationConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DeltaPresenceEstimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeltaPresenceEstimationConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DeltaPresenceEstimationConfigMutableBuilder[Self <: GooglePrivacyDlpV2DeltaPresenceEstimationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuxiliaryTables(value: js.Array[GooglePrivacyDlpV2StatisticalTable]): Self = StObject.set(x, "auxiliaryTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuxiliaryTablesUndefined: Self = StObject.set(x, "auxiliaryTables", js.undefined)
    
    @scala.inline
    def setAuxiliaryTablesVarargs(value: GooglePrivacyDlpV2StatisticalTable*): Self = StObject.set(x, "auxiliaryTables", js.Array(value :_*))
    
    @scala.inline
    def setQuasiIds(value: js.Array[GooglePrivacyDlpV2QuasiId]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    @scala.inline
    def setQuasiIdsVarargs(value: GooglePrivacyDlpV2QuasiId*): Self = StObject.set(x, "quasiIds", js.Array(value :_*))
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
