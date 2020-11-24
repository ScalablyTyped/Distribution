package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementUpdateRequest extends js.Object {
  
  /** The achievement this update is being applied to. */
  var achievementId: js.UndefOr[String] = js.native
  
  /** The payload if an update of type `INCREMENT` was requested for the achievement. */
  var incrementPayload: js.UndefOr[GamesAchievementIncrement] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateRequest`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The payload if an update of type `SET_STEPS_AT_LEAST` was requested for the achievement. */
  var setStepsAtLeastPayload: js.UndefOr[GamesAchievementSetStepsAtLeast] = js.native
  
  /** The type of update being applied. */
  var updateType: js.UndefOr[String] = js.native
}
object AchievementUpdateRequest {
  
  @scala.inline
  def apply(): AchievementUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateRequest]
  }
  
  @scala.inline
  implicit class AchievementUpdateRequestOps[Self <: AchievementUpdateRequest] (val x: Self) extends AnyVal {
    
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
    def setAchievementId(value: String): Self = this.set("achievementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAchievementId: Self = this.set("achievementId", js.undefined)
    
    @scala.inline
    def setIncrementPayload(value: GamesAchievementIncrement): Self = this.set("incrementPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementPayload: Self = this.set("incrementPayload", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSetStepsAtLeastPayload(value: GamesAchievementSetStepsAtLeast): Self = this.set("setStepsAtLeastPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetStepsAtLeastPayload: Self = this.set("setStepsAtLeastPayload", js.undefined)
    
    @scala.inline
    def setUpdateType(value: String): Self = this.set("updateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateType: Self = this.set("updateType", js.undefined)
  }
}
