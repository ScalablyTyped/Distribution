package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerLevel extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerLevel`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The level for the user. */
  var level: js.UndefOr[Double] = js.native
  
  /** The maximum experience points for this level. */
  var maxExperiencePoints: js.UndefOr[String] = js.native
  
  /** The minimum experience points for this level. */
  var minExperiencePoints: js.UndefOr[String] = js.native
}
object PlayerLevel {
  
  @scala.inline
  def apply(): PlayerLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerLevel]
  }
  
  @scala.inline
  implicit class PlayerLevelMutableBuilder[Self <: PlayerLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
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
