package typings.pendoIoBrowser.pendo

import typings.pendoIoBrowser.anon.AutoHeight
import typings.pendoIoBrowser.pendoIoBrowserStrings.button
import typings.pendoIoBrowser.pendoIoBrowserStrings.element
import typings.pendoIoBrowser.pendoIoBrowserStrings.programatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GuideStep extends js.Object {
  
  var advanceMethod: button | programatic | element = js.native
  
  var attributes: AutoHeight = js.native
  
  var contentType: String = js.native
  
  var contentUrl: js.UndefOr[String] = js.native
  
  var contentUrlCss: js.UndefOr[String] = js.native
  
  var contentUrlJs: js.UndefOr[String] = js.native
  
  var elementPathRule: String = js.native
  
  var guideId: String = js.native
  
  var id: String = js.native
  
  var lastUpdatedAt: Double = js.native
  
  var rank: Double = js.native
  
  var resetAt: Double = js.native
  
  var thumbnailUrls: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object GuideStep {
  
  @scala.inline
  def apply(
    advanceMethod: button | programatic | element,
    attributes: AutoHeight,
    contentType: String,
    elementPathRule: String,
    guideId: String,
    id: String,
    lastUpdatedAt: Double,
    rank: Double,
    resetAt: Double,
    `type`: String
  ): GuideStep = {
    val __obj = js.Dynamic.literal(advanceMethod = advanceMethod.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], elementPathRule = elementPathRule.asInstanceOf[js.Any], guideId = guideId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], resetAt = resetAt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuideStep]
  }
  
  @scala.inline
  implicit class GuideStepOps[Self <: GuideStep] (val x: Self) extends AnyVal {
    
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
    def setAdvanceMethod(value: button | programatic | element): Self = this.set("advanceMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: AutoHeight): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPathRule(value: String): Self = this.set("elementPathRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuideId(value: String): Self = this.set("guideId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAt(value: Double): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetAt(value: Double): Self = this.set("resetAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
    @scala.inline
    def setContentUrlCss(value: String): Self = this.set("contentUrlCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrlCss: Self = this.set("contentUrlCss", js.undefined)
    
    @scala.inline
    def setContentUrlJs(value: String): Self = this.set("contentUrlJs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrlJs: Self = this.set("contentUrlJs", js.undefined)
    
    @scala.inline
    def setThumbnailUrls(value: String): Self = this.set("thumbnailUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailUrls: Self = this.set("thumbnailUrls", js.undefined)
  }
}
