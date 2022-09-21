package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetagameConfig extends StObject {
  
  /** Current version of the metagame configuration data. When this data is updated, the version number will be increased by one. */
  var currentVersion: js.UndefOr[Double] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#metagameConfig`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The list of player levels. */
  var playerLevels: js.UndefOr[js.Array[PlayerLevel]] = js.undefined
}
object MetagameConfig {
  
  inline def apply(): MetagameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetagameConfig]
  }
  
  extension [Self <: MetagameConfig](x: Self) {
    
    inline def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlayerLevels(value: js.Array[PlayerLevel]): Self = StObject.set(x, "playerLevels", value.asInstanceOf[js.Any])
    
    inline def setPlayerLevelsUndefined: Self = StObject.set(x, "playerLevels", js.undefined)
    
    inline def setPlayerLevelsVarargs(value: PlayerLevel*): Self = StObject.set(x, "playerLevels", js.Array(value*))
  }
}
