package typings.overwatchApi.mod

import typings.overwatchApi.anon.Assists
import typings.overwatchApi.anon.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  var endorsement: Frame
  
  var level: Double
  
  var portrait: String
  
  var `private`: Boolean
  
  var stats: Assists
  
  var username: String
}
object Stats {
  
  inline def apply(
    endorsement: Frame,
    level: Double,
    portrait: String,
    `private`: Boolean,
    stats: Assists,
    username: String
  ): Stats = {
    val __obj = js.Dynamic.literal(endorsement = endorsement.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], portrait = portrait.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  extension [Self <: Stats](x: Self) {
    
    inline def setEndorsement(value: Frame): Self = StObject.set(x, "endorsement", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setPortrait(value: String): Self = StObject.set(x, "portrait", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Assists): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
