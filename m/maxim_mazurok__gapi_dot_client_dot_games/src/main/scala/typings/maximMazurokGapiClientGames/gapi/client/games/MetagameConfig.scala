package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetagameConfig extends StObject {
  
  /** Current version of the metagame configuration data. When this data is updated, the version number will be increased by one. */
  var currentVersion: js.UndefOr[Double] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#metagameConfig`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The list of player levels. */
  var playerLevels: js.UndefOr[js.Array[PlayerLevel]] = js.native
}
object MetagameConfig {
  
  @scala.inline
  def apply(): MetagameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetagameConfig]
  }
  
  @scala.inline
  implicit class MetagameConfigMutableBuilder[Self <: MetagameConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPlayerLevels(value: js.Array[PlayerLevel]): Self = StObject.set(x, "playerLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerLevelsUndefined: Self = StObject.set(x, "playerLevels", js.undefined)
    
    @scala.inline
    def setPlayerLevelsVarargs(value: PlayerLevel*): Self = StObject.set(x, "playerLevels", js.Array(value :_*))
  }
}
