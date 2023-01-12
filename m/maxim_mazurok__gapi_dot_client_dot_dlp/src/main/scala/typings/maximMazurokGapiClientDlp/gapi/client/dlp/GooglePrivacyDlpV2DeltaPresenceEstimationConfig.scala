package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DeltaPresenceEstimationConfig extends StObject {
  
  /** Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers field must appear in exactly one field of one auxiliary table. */
  var auxiliaryTables: js.UndefOr[js.Array[GooglePrivacyDlpV2StatisticalTable]] = js.undefined
  
  /** Required. Fields considered to be quasi-identifiers. No two fields can have the same tag. */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2QuasiId]] = js.undefined
  
  /** ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code. */
  var regionCode: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2DeltaPresenceEstimationConfig {
  
  inline def apply(): GooglePrivacyDlpV2DeltaPresenceEstimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeltaPresenceEstimationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2DeltaPresenceEstimationConfig] (val x: Self) extends AnyVal {
    
    inline def setAuxiliaryTables(value: js.Array[GooglePrivacyDlpV2StatisticalTable]): Self = StObject.set(x, "auxiliaryTables", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryTablesUndefined: Self = StObject.set(x, "auxiliaryTables", js.undefined)
    
    inline def setAuxiliaryTablesVarargs(value: GooglePrivacyDlpV2StatisticalTable*): Self = StObject.set(x, "auxiliaryTables", js.Array(value*))
    
    inline def setQuasiIds(value: js.Array[GooglePrivacyDlpV2QuasiId]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    inline def setQuasiIdsVarargs(value: GooglePrivacyDlpV2QuasiId*): Self = StObject.set(x, "quasiIds", js.Array(value*))
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
