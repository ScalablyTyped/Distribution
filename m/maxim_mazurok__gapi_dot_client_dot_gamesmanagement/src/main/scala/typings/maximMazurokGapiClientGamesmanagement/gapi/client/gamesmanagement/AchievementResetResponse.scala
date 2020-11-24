package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievementResetResponse extends js.Object {
  
  /**
    * The current state of the achievement. This is the same as the initial state of the achievement. Possible values are: - "`HIDDEN`"- Achievement is hidden. - "`REVEALED`" -
    * Achievement is revealed. - "`UNLOCKED`" - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  
  /** The ID of an achievement for which player state has been updated. */
  var definitionId: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#achievementResetResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Flag to indicate if the requested update actually occurred. */
  var updateOccurred: js.UndefOr[Boolean] = js.native
}
object AchievementResetResponse {
  
  @scala.inline
  def apply(): AchievementResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementResetResponse]
  }
  
  @scala.inline
  implicit class AchievementResetResponseOps[Self <: AchievementResetResponse] (val x: Self) extends AnyVal {
    
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
    def setCurrentState(value: String): Self = this.set("currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentState: Self = this.set("currentState", js.undefined)
    
    @scala.inline
    def setDefinitionId(value: String): Self = this.set("definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitionId: Self = this.set("definitionId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setUpdateOccurred(value: Boolean): Self = this.set("updateOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOccurred: Self = this.set("updateOccurred", js.undefined)
  }
}
