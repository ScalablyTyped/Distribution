package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InspectConfig extends StObject {
  
  /** List of options defining data content to scan. If empty, text, images, and other content will be included. */
  var contentOptions: js.UndefOr[js.Array[String]] = js.native
  
  /** CustomInfoTypes provided by the user. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more. */
  var customInfoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2CustomInfoType]] = js.native
  
  /** When true, excludes type information of the findings. */
  var excludeInfoTypes: js.UndefOr[Boolean] = js.native
  
  /** When true, a contextual quote from the data that triggered a finding is included in the response; see Finding.quote. */
  var includeQuote: js.UndefOr[Boolean] = js.native
  
  /**
    * Restricts what info_types to look for. The values must correspond to InfoType values returned by ListInfoTypes or listed at https://cloud.google.com/dlp/docs/infotypes-reference.
    * When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically choose what detectors to run. By default this may be all types, but may change over
    * time as detectors are updated. If you need precise control and predictability as to what detectors are run you should specify specific InfoTypes listed in the reference, otherwise a
    * default list will be used, which may change over time.
    */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoType]] = js.native
  
  /** Configuration to control the number of findings returned. */
  var limits: js.UndefOr[GooglePrivacyDlpV2FindingLimits] = js.native
  
  /** Only returns findings equal or above this threshold. The default is POSSIBLE. See https://cloud.google.com/dlp/docs/likelihood to learn more. */
  var minLikelihood: js.UndefOr[String] = js.native
  
  /**
    * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end, other rules are executed in the order they are specified
    * for each info type.
    */
  var ruleSet: js.UndefOr[js.Array[GooglePrivacyDlpV2InspectionRuleSet]] = js.native
}
object GooglePrivacyDlpV2InspectConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectConfigMutableBuilder[Self <: GooglePrivacyDlpV2InspectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentOptions(value: js.Array[String]): Self = StObject.set(x, "contentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOptionsUndefined: Self = StObject.set(x, "contentOptions", js.undefined)
    
    @scala.inline
    def setContentOptionsVarargs(value: String*): Self = StObject.set(x, "contentOptions", js.Array(value :_*))
    
    @scala.inline
    def setCustomInfoTypes(value: js.Array[GooglePrivacyDlpV2CustomInfoType]): Self = StObject.set(x, "customInfoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomInfoTypesUndefined: Self = StObject.set(x, "customInfoTypes", js.undefined)
    
    @scala.inline
    def setCustomInfoTypesVarargs(value: GooglePrivacyDlpV2CustomInfoType*): Self = StObject.set(x, "customInfoTypes", js.Array(value :_*))
    
    @scala.inline
    def setExcludeInfoTypes(value: Boolean): Self = StObject.set(x, "excludeInfoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeInfoTypesUndefined: Self = StObject.set(x, "excludeInfoTypes", js.undefined)
    
    @scala.inline
    def setIncludeQuote(value: Boolean): Self = StObject.set(x, "includeQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeQuoteUndefined: Self = StObject.set(x, "includeQuote", js.undefined)
    
    @scala.inline
    def setInfoTypes(value: js.Array[GooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    @scala.inline
    def setInfoTypesVarargs(value: GooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
    
    @scala.inline
    def setLimits(value: GooglePrivacyDlpV2FindingLimits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    @scala.inline
    def setMinLikelihood(value: String): Self = StObject.set(x, "minLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLikelihoodUndefined: Self = StObject.set(x, "minLikelihood", js.undefined)
    
    @scala.inline
    def setRuleSet(value: js.Array[GooglePrivacyDlpV2InspectionRuleSet]): Self = StObject.set(x, "ruleSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleSetUndefined: Self = StObject.set(x, "ruleSet", js.undefined)
    
    @scala.inline
    def setRuleSetVarargs(value: GooglePrivacyDlpV2InspectionRuleSet*): Self = StObject.set(x, "ruleSet", js.Array(value :_*))
  }
}
