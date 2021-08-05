package typings.overwatchApi.mod

import typings.overwatchApi.anon.Competitive
import typings.overwatchApi.anon.Damage
import typings.overwatchApi.anon.Frame
import typings.overwatchApi.anon.Quickplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profile extends StObject {
  
  var competitive: Damage
  
  var endorsement: Frame
  
  var games: Competitive
  
  var level: Double
  
  var levelFrame: String
  
  var playtime: Quickplay
  
  var portrait: String
  
  var `private`: Boolean
  
  var star: String
  
  var username: String
}
object Profile {
  
  inline def apply(
    competitive: Damage,
    endorsement: Frame,
    games: Competitive,
    level: Double,
    levelFrame: String,
    playtime: Quickplay,
    portrait: String,
    `private`: Boolean,
    star: String,
    username: String
  ): Profile = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], endorsement = endorsement.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], levelFrame = levelFrame.asInstanceOf[js.Any], playtime = playtime.asInstanceOf[js.Any], portrait = portrait.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setCompetitive(value: Damage): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
    
    inline def setEndorsement(value: Frame): Self = StObject.set(x, "endorsement", value.asInstanceOf[js.Any])
    
    inline def setGames(value: Competitive): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelFrame(value: String): Self = StObject.set(x, "levelFrame", value.asInstanceOf[js.Any])
    
    inline def setPlaytime(value: Quickplay): Self = StObject.set(x, "playtime", value.asInstanceOf[js.Any])
    
    inline def setPortrait(value: String): Self = StObject.set(x, "portrait", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setStar(value: String): Self = StObject.set(x, "star", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
