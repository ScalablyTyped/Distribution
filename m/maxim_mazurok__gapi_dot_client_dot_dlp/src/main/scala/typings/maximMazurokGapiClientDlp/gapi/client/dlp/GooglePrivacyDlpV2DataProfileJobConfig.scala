package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DataProfileJobConfig extends StObject {
  
  /** Actions to execute at the completion of the job. */
  var dataProfileActions: js.UndefOr[js.Array[GooglePrivacyDlpV2DataProfileAction]] = js.undefined
  
  /**
    * Detection logic for profile generation. Not all template features are used by profiles. FindingLimits, include_quote and exclude_info_types have no impact on data profiling.
    * Multiple templates may be provided if there is data in multiple regions. At most one template must be specified per-region (including "global"). Each region is scanned using the
    * applicable template. If no region-specific template is specified, but a "global" template is specified, it will be copied to that region and used instead. If no global or
    * region-specific template is provided for a region with data, that region's data will not be scanned. For more information, see
    * https://cloud.google.com/dlp/docs/data-profiles#data_residency.
    */
  var inspectTemplates: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The data to scan. */
  var location: js.UndefOr[GooglePrivacyDlpV2DataProfileLocation] = js.undefined
  
  /**
    * The project that will run the scan. The DLP service account that exists within this project must have access to all resources that are profiled, and the Cloud DLP API must be
    * enabled.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2DataProfileJobConfig {
  
  inline def apply(): GooglePrivacyDlpV2DataProfileJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DataProfileJobConfig]
  }
  
  extension [Self <: GooglePrivacyDlpV2DataProfileJobConfig](x: Self) {
    
    inline def setDataProfileActions(value: js.Array[GooglePrivacyDlpV2DataProfileAction]): Self = StObject.set(x, "dataProfileActions", value.asInstanceOf[js.Any])
    
    inline def setDataProfileActionsUndefined: Self = StObject.set(x, "dataProfileActions", js.undefined)
    
    inline def setDataProfileActionsVarargs(value: GooglePrivacyDlpV2DataProfileAction*): Self = StObject.set(x, "dataProfileActions", js.Array(value*))
    
    inline def setInspectTemplates(value: js.Array[String]): Self = StObject.set(x, "inspectTemplates", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplatesUndefined: Self = StObject.set(x, "inspectTemplates", js.undefined)
    
    inline def setInspectTemplatesVarargs(value: String*): Self = StObject.set(x, "inspectTemplates", js.Array(value*))
    
    inline def setLocation(value: GooglePrivacyDlpV2DataProfileLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
