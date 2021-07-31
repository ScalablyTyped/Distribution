package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamesPlayerLevelResource extends StObject {
  
  /** The level for the user. */
  var level: js.UndefOr[Double] = js.undefined
  
  /** The maximum experience points for this level. */
  var maxExperiencePoints: js.UndefOr[String] = js.undefined
  
  /** The minimum experience points for this level. */
  var minExperiencePoints: js.UndefOr[String] = js.undefined
}
object GamesPlayerLevelResource {
  
  @scala.inline
  def apply(): GamesPlayerLevelResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesPlayerLevelResource]
  }
  
  @scala.inline
  implicit class GamesPlayerLevelResourceMutableBuilder[Self <: GamesPlayerLevelResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMaxExperiencePoints(value: String): Self = StObject.set(x, "maxExperiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxExperiencePointsUndefined: Self = StObject.set(x, "maxExperiencePoints", js.undefined)
    
    @scala.inline
    def setMinExperiencePoints(value: String): Self = StObject.set(x, "minExperiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinExperiencePointsUndefined: Self = StObject.set(x, "minExperiencePoints", js.undefined)
  }
}
