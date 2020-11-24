package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamesPlayerExperienceInfoResource extends js.Object {
  
  /** The current number of experience points for the player. */
  var currentExperiencePoints: js.UndefOr[String] = js.native
  
  /** The current level of the player. */
  var currentLevel: js.UndefOr[GamesPlayerLevelResource] = js.native
  
  /** The timestamp when the player was leveled up, in millis since Unix epoch UTC. */
  var lastLevelUpTimestampMillis: js.UndefOr[String] = js.native
  
  /** The next level of the player. If the current level is the maximum level, this should be same as the current level. */
  var nextLevel: js.UndefOr[GamesPlayerLevelResource] = js.native
}
object GamesPlayerExperienceInfoResource {
  
  @scala.inline
  def apply(): GamesPlayerExperienceInfoResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesPlayerExperienceInfoResource]
  }
  
  @scala.inline
  implicit class GamesPlayerExperienceInfoResourceOps[Self <: GamesPlayerExperienceInfoResource] (val x: Self) extends AnyVal {
    
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
    def setCurrentExperiencePoints(value: String): Self = this.set("currentExperiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentExperiencePoints: Self = this.set("currentExperiencePoints", js.undefined)
    
    @scala.inline
    def setCurrentLevel(value: GamesPlayerLevelResource): Self = this.set("currentLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentLevel: Self = this.set("currentLevel", js.undefined)
    
    @scala.inline
    def setLastLevelUpTimestampMillis(value: String): Self = this.set("lastLevelUpTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastLevelUpTimestampMillis: Self = this.set("lastLevelUpTimestampMillis", js.undefined)
    
    @scala.inline
    def setNextLevel(value: GamesPlayerLevelResource): Self = this.set("nextLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextLevel: Self = this.set("nextLevel", js.undefined)
  }
}
