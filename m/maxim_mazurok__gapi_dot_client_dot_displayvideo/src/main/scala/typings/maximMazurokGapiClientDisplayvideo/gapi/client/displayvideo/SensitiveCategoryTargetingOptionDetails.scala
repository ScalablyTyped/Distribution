package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SensitiveCategoryTargetingOptionDetails extends js.Object {
  
  /** Output only. An enum for the DV360 Sensitive category content classifier. */
  var sensitiveCategory: js.UndefOr[String] = js.native
}
object SensitiveCategoryTargetingOptionDetails {
  
  @scala.inline
  def apply(): SensitiveCategoryTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitiveCategoryTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class SensitiveCategoryTargetingOptionDetailsOps[Self <: SensitiveCategoryTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setSensitiveCategory(value: String): Self = this.set("sensitiveCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiveCategory: Self = this.set("sensitiveCategory", js.undefined)
  }
}
