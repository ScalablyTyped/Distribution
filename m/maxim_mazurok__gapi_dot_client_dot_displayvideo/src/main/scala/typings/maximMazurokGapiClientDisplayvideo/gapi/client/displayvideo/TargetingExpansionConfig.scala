package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingExpansionConfig extends js.Object {
  
  /**
    * Required. Whether to exclude first party audiences from targeting. Similar audiences of the excluded first party lists will not be excluded. Only applicable when a first-party
    * audience is positively targeted (directly or included in a combined audience), otherwise this selection will be ignored.
    */
  var excludeFirstPartyAudience: js.UndefOr[Boolean] = js.native
  
  /** Required. Magnitude of expansion for applicable targeting under this line item. */
  var targetingExpansionLevel: js.UndefOr[String] = js.native
}
object TargetingExpansionConfig {
  
  @scala.inline
  def apply(): TargetingExpansionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingExpansionConfig]
  }
  
  @scala.inline
  implicit class TargetingExpansionConfigOps[Self <: TargetingExpansionConfig] (val x: Self) extends AnyVal {
    
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
    def setExcludeFirstPartyAudience(value: Boolean): Self = this.set("excludeFirstPartyAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeFirstPartyAudience: Self = this.set("excludeFirstPartyAudience", js.undefined)
    
    @scala.inline
    def setTargetingExpansionLevel(value: String): Self = this.set("targetingExpansionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingExpansionLevel: Self = this.set("targetingExpansionLevel", js.undefined)
  }
}
