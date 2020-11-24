package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SensitiveCategoryAssignedTargetingOptionDetails extends js.Object {
  
  /** Required. ID of the sensitive category to be EXCLUDED. */
  var excludedTargetingOptionId: js.UndefOr[String] = js.native
  
  /** Output only. An enum for the DV360 Sensitive category content classifier. */
  var sensitiveCategory: js.UndefOr[String] = js.native
}
object SensitiveCategoryAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): SensitiveCategoryAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitiveCategoryAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class SensitiveCategoryAssignedTargetingOptionDetailsOps[Self <: SensitiveCategoryAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setExcludedTargetingOptionId(value: String): Self = this.set("excludedTargetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedTargetingOptionId: Self = this.set("excludedTargetingOptionId", js.undefined)
    
    @scala.inline
    def setSensitiveCategory(value: String): Self = this.set("sensitiveCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiveCategory: Self = this.set("sensitiveCategory", js.undefined)
  }
}
