package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegralAdScience extends StObject {
  
  /** The custom segment ID provided by Integral Ad Science. The ID must be between `1000001` and `1999999`, inclusive. */
  var customSegmentId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Display Viewability section (applicable to display line items only). */
  var displayViewability: js.UndefOr[String] = js.undefined
  
  /** Brand Safety - **Unrateable**. */
  var excludeUnrateable: js.UndefOr[Boolean] = js.undefined
  
  /** Ad Fraud settings. */
  var excludedAdFraudRisk: js.UndefOr[String] = js.undefined
  
  /** Brand Safety - **Adult content**. */
  var excludedAdultRisk: js.UndefOr[String] = js.undefined
  
  /** Brand Safety - **Alcohol**. */
  var excludedAlcoholRisk: js.UndefOr[String] = js.undefined
  
  /** Brand Safety - **Drugs**. */
  var excludedDrugsRisk: js.UndefOr[String] = js.undefined
  
  /** Brand Safety - **Gambling**. */
  var excludedGamblingRisk: js.UndefOr[String] = js.undefined
  
  /** Brand Safety - **Hate speech**. */
  var excludedHateSpeechRisk: js.UndefOr[String] = js.undefined
  
  /** Brand Safety - **Illegal downloads**. */
  var excludedIllegalDownloadsRisk: js.UndefOr[String] = js.undefined
  
  /** Brand Safety - **Offensive language**. */
  var excludedOffensiveLanguageRisk: js.UndefOr[String] = js.undefined
  
  /** Brand Safety - **Violence**. */
  var excludedViolenceRisk: js.UndefOr[String] = js.undefined
  
  /** True advertising quality (applicable to Display line items only). */
  var traqScoreOption: js.UndefOr[String] = js.undefined
  
  /** Video Viewability Section (applicable to video line items only). */
  var videoViewability: js.UndefOr[String] = js.undefined
}
object IntegralAdScience {
  
  inline def apply(): IntegralAdScience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegralAdScience]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegralAdScience] (val x: Self) extends AnyVal {
    
    inline def setCustomSegmentId(value: js.Array[String]): Self = StObject.set(x, "customSegmentId", value.asInstanceOf[js.Any])
    
    inline def setCustomSegmentIdUndefined: Self = StObject.set(x, "customSegmentId", js.undefined)
    
    inline def setCustomSegmentIdVarargs(value: String*): Self = StObject.set(x, "customSegmentId", js.Array(value*))
    
    inline def setDisplayViewability(value: String): Self = StObject.set(x, "displayViewability", value.asInstanceOf[js.Any])
    
    inline def setDisplayViewabilityUndefined: Self = StObject.set(x, "displayViewability", js.undefined)
    
    inline def setExcludeUnrateable(value: Boolean): Self = StObject.set(x, "excludeUnrateable", value.asInstanceOf[js.Any])
    
    inline def setExcludeUnrateableUndefined: Self = StObject.set(x, "excludeUnrateable", js.undefined)
    
    inline def setExcludedAdFraudRisk(value: String): Self = StObject.set(x, "excludedAdFraudRisk", value.asInstanceOf[js.Any])
    
    inline def setExcludedAdFraudRiskUndefined: Self = StObject.set(x, "excludedAdFraudRisk", js.undefined)
    
    inline def setExcludedAdultRisk(value: String): Self = StObject.set(x, "excludedAdultRisk", value.asInstanceOf[js.Any])
    
    inline def setExcludedAdultRiskUndefined: Self = StObject.set(x, "excludedAdultRisk", js.undefined)
    
    inline def setExcludedAlcoholRisk(value: String): Self = StObject.set(x, "excludedAlcoholRisk", value.asInstanceOf[js.Any])
    
    inline def setExcludedAlcoholRiskUndefined: Self = StObject.set(x, "excludedAlcoholRisk", js.undefined)
    
    inline def setExcludedDrugsRisk(value: String): Self = StObject.set(x, "excludedDrugsRisk", value.asInstanceOf[js.Any])
    
    inline def setExcludedDrugsRiskUndefined: Self = StObject.set(x, "excludedDrugsRisk", js.undefined)
    
    inline def setExcludedGamblingRisk(value: String): Self = StObject.set(x, "excludedGamblingRisk", value.asInstanceOf[js.Any])
    
    inline def setExcludedGamblingRiskUndefined: Self = StObject.set(x, "excludedGamblingRisk", js.undefined)
    
    inline def setExcludedHateSpeechRisk(value: String): Self = StObject.set(x, "excludedHateSpeechRisk", value.asInstanceOf[js.Any])
    
    inline def setExcludedHateSpeechRiskUndefined: Self = StObject.set(x, "excludedHateSpeechRisk", js.undefined)
    
    inline def setExcludedIllegalDownloadsRisk(value: String): Self = StObject.set(x, "excludedIllegalDownloadsRisk", value.asInstanceOf[js.Any])
    
    inline def setExcludedIllegalDownloadsRiskUndefined: Self = StObject.set(x, "excludedIllegalDownloadsRisk", js.undefined)
    
    inline def setExcludedOffensiveLanguageRisk(value: String): Self = StObject.set(x, "excludedOffensiveLanguageRisk", value.asInstanceOf[js.Any])
    
    inline def setExcludedOffensiveLanguageRiskUndefined: Self = StObject.set(x, "excludedOffensiveLanguageRisk", js.undefined)
    
    inline def setExcludedViolenceRisk(value: String): Self = StObject.set(x, "excludedViolenceRisk", value.asInstanceOf[js.Any])
    
    inline def setExcludedViolenceRiskUndefined: Self = StObject.set(x, "excludedViolenceRisk", js.undefined)
    
    inline def setTraqScoreOption(value: String): Self = StObject.set(x, "traqScoreOption", value.asInstanceOf[js.Any])
    
    inline def setTraqScoreOptionUndefined: Self = StObject.set(x, "traqScoreOption", js.undefined)
    
    inline def setVideoViewability(value: String): Self = StObject.set(x, "videoViewability", value.asInstanceOf[js.Any])
    
    inline def setVideoViewabilityUndefined: Self = StObject.set(x, "videoViewability", js.undefined)
  }
}
