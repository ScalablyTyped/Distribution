package typings.overwatchApi.mod

import typings.overwatchApi.anon.Assists
import typings.overwatchApi.anon.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stats extends StObject {
  
  var endorsement: Frame = js.native
  
  var level: Double = js.native
  
  var portrait: String = js.native
  
  var `private`: Boolean = js.native
  
  var stats: Assists = js.native
  
  var username: String = js.native
}
object Stats {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndorsement(value: Frame): Self = StObject.set(x, "endorsement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortrait(value: String): Self = StObject.set(x, "portrait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Assists): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
