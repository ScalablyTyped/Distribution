package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamesPlayerLevelResource extends js.Object {
  
  /** The level for the user. */
  var level: js.UndefOr[Double] = js.native
  
  /** The maximum experience points for this level. */
  var maxExperiencePoints: js.UndefOr[String] = js.native
  
  /** The minimum experience points for this level. */
  var minExperiencePoints: js.UndefOr[String] = js.native
}
object GamesPlayerLevelResource {
  
  @scala.inline
  def apply(): GamesPlayerLevelResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesPlayerLevelResource]
  }
  
  @scala.inline
  implicit class GamesPlayerLevelResourceOps[Self <: GamesPlayerLevelResource] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMaxExperiencePoints(value: String): Self = this.set("maxExperiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxExperiencePoints: Self = this.set("maxExperiencePoints", js.undefined)
    
    @scala.inline
    def setMinExperiencePoints(value: String): Self = this.set("minExperiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinExperiencePoints: Self = this.set("minExperiencePoints", js.undefined)
  }
}
