package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegralAdScience extends js.Object {
  
  /** The custom segment ID provided by Integral Ad Science. The ID must be between `1000001` and `1999999`, inclusive. */
  var customSegmentId: js.UndefOr[js.Array[String]] = js.native
  
  /** Display Viewability section (applicable to display line items only). */
  var displayViewability: js.UndefOr[String] = js.native
  
  /** Brand Safety - **Unrateable**. */
  var excludeUnrateable: js.UndefOr[Boolean] = js.native
  
  /** Ad Fraud settings. */
  var excludedAdFraudRisk: js.UndefOr[String] = js.native
  
  /** Brand Safety - **Adult content**. */
  var excludedAdultRisk: js.UndefOr[String] = js.native
  
  /** Brand Safety - **Alcohol**. */
  var excludedAlcoholRisk: js.UndefOr[String] = js.native
  
  /** Brand Safety - **Drugs**. */
  var excludedDrugsRisk: js.UndefOr[String] = js.native
  
  /** Brand Safety - **Gambling**. */
  var excludedGamblingRisk: js.UndefOr[String] = js.native
  
  /** Brand Safety - **Hate speech**. */
  var excludedHateSpeechRisk: js.UndefOr[String] = js.native
  
  /** Brand Safety - **Illegal downloads**. */
  var excludedIllegalDownloadsRisk: js.UndefOr[String] = js.native
  
  /** Brand Safety - **Offensive language**. */
  var excludedOffensiveLanguageRisk: js.UndefOr[String] = js.native
  
  /** Brand Safety - **Violence**. */
  var excludedViolenceRisk: js.UndefOr[String] = js.native
  
  /** True advertising quality (applicable to Display line items only). */
  var traqScoreOption: js.UndefOr[String] = js.native
  
  /** Video Viewability Section (applicable to video line items only). */
  var videoViewability: js.UndefOr[String] = js.native
}
object IntegralAdScience {
  
  @scala.inline
  def apply(): IntegralAdScience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegralAdScience]
  }
  
  @scala.inline
  implicit class IntegralAdScienceOps[Self <: IntegralAdScience] (val x: Self) extends AnyVal {
    
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
    def setCustomSegmentIdVarargs(value: String*): Self = this.set("customSegmentId", js.Array(value :_*))
    
    @scala.inline
    def setCustomSegmentId(value: js.Array[String]): Self = this.set("customSegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSegmentId: Self = this.set("customSegmentId", js.undefined)
    
    @scala.inline
    def setDisplayViewability(value: String): Self = this.set("displayViewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayViewability: Self = this.set("displayViewability", js.undefined)
    
    @scala.inline
    def setExcludeUnrateable(value: Boolean): Self = this.set("excludeUnrateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeUnrateable: Self = this.set("excludeUnrateable", js.undefined)
    
    @scala.inline
    def setExcludedAdFraudRisk(value: String): Self = this.set("excludedAdFraudRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedAdFraudRisk: Self = this.set("excludedAdFraudRisk", js.undefined)
    
    @scala.inline
    def setExcludedAdultRisk(value: String): Self = this.set("excludedAdultRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedAdultRisk: Self = this.set("excludedAdultRisk", js.undefined)
    
    @scala.inline
    def setExcludedAlcoholRisk(value: String): Self = this.set("excludedAlcoholRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedAlcoholRisk: Self = this.set("excludedAlcoholRisk", js.undefined)
    
    @scala.inline
    def setExcludedDrugsRisk(value: String): Self = this.set("excludedDrugsRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedDrugsRisk: Self = this.set("excludedDrugsRisk", js.undefined)
    
    @scala.inline
    def setExcludedGamblingRisk(value: String): Self = this.set("excludedGamblingRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedGamblingRisk: Self = this.set("excludedGamblingRisk", js.undefined)
    
    @scala.inline
    def setExcludedHateSpeechRisk(value: String): Self = this.set("excludedHateSpeechRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedHateSpeechRisk: Self = this.set("excludedHateSpeechRisk", js.undefined)
    
    @scala.inline
    def setExcludedIllegalDownloadsRisk(value: String): Self = this.set("excludedIllegalDownloadsRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedIllegalDownloadsRisk: Self = this.set("excludedIllegalDownloadsRisk", js.undefined)
    
    @scala.inline
    def setExcludedOffensiveLanguageRisk(value: String): Self = this.set("excludedOffensiveLanguageRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedOffensiveLanguageRisk: Self = this.set("excludedOffensiveLanguageRisk", js.undefined)
    
    @scala.inline
    def setExcludedViolenceRisk(value: String): Self = this.set("excludedViolenceRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedViolenceRisk: Self = this.set("excludedViolenceRisk", js.undefined)
    
    @scala.inline
    def setTraqScoreOption(value: String): Self = this.set("traqScoreOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraqScoreOption: Self = this.set("traqScoreOption", js.undefined)
    
    @scala.inline
    def setVideoViewability(value: String): Self = this.set("videoViewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoViewability: Self = this.set("videoViewability", js.undefined)
  }
}
