package typings.maximMazurokGapiClientGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementConfigurationDetail extends js.Object {
  
  /** Localized strings for the achievement description. */
  var description: js.UndefOr[LocalizedStringBundle] = js.native
  
  /** The icon url of this achievement. Writes to this field are ignored. */
  var iconUrl: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#achievementConfigurationDetail`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Localized strings for the achievement name. */
  var name: js.UndefOr[LocalizedStringBundle] = js.native
  
  /** Point value for the achievement. */
  var pointValue: js.UndefOr[Double] = js.native
  
  /** The sort rank of this achievement. Writes to this field are ignored. */
  var sortRank: js.UndefOr[Double] = js.native
}
object AchievementConfigurationDetail {
  
  @scala.inline
  def apply(): AchievementConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementConfigurationDetail]
  }
  
  @scala.inline
  implicit class AchievementConfigurationDetailOps[Self <: AchievementConfigurationDetail] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: LocalizedStringBundle): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: LocalizedStringBundle): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPointValue(value: Double): Self = this.set("pointValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointValue: Self = this.set("pointValue", js.undefined)
    
    @scala.inline
    def setSortRank(value: Double): Self = this.set("sortRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortRank: Self = this.set("sortRank", js.undefined)
  }
}
