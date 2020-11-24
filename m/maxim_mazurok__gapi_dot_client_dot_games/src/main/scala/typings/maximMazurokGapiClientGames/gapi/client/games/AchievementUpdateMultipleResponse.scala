package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementUpdateMultipleResponse extends js.Object {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateMultipleResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The updated state of the achievements. */
  var updatedAchievements: js.UndefOr[js.Array[AchievementUpdateResponse]] = js.native
}
object AchievementUpdateMultipleResponse {
  
  @scala.inline
  def apply(): AchievementUpdateMultipleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateMultipleResponse]
  }
  
  @scala.inline
  implicit class AchievementUpdateMultipleResponseOps[Self <: AchievementUpdateMultipleResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setUpdatedAchievementsVarargs(value: AchievementUpdateResponse*): Self = this.set("updatedAchievements", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedAchievements(value: js.Array[AchievementUpdateResponse]): Self = this.set("updatedAchievements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAchievements: Self = this.set("updatedAchievements", js.undefined)
  }
}
