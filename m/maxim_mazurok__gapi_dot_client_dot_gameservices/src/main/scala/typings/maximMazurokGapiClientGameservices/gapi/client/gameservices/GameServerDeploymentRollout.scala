package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerDeploymentRollout extends StObject {
  
  /** Output only. The creation time. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The default game server config is applied to all realms unless overridden in the rollout. For example,
    * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
    */
  var defaultGameServerConfig: js.UndefOr[String] = js.native
  
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** Contains the game server config rollout overrides. Overrides are processed in the order they are listed. Once a match is found for a realm, the rest of the list is not processed. */
  var gameServerConfigOverrides: js.UndefOr[js.Array[GameServerConfigOverride]] = js.native
  
  /**
    * The resource name of the game server deployment rollout, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/rollout`. For example,
    * `projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout`.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The last-modified time. */
  var updateTime: js.UndefOr[String] = js.native
}
object GameServerDeploymentRollout {
  
  @scala.inline
  def apply(): GameServerDeploymentRollout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerDeploymentRollout]
  }
  
  @scala.inline
  implicit class GameServerDeploymentRolloutMutableBuilder[Self <: GameServerDeploymentRollout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDefaultGameServerConfig(value: String): Self = StObject.set(x, "defaultGameServerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultGameServerConfigUndefined: Self = StObject.set(x, "defaultGameServerConfig", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setGameServerConfigOverrides(value: js.Array[GameServerConfigOverride]): Self = StObject.set(x, "gameServerConfigOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerConfigOverridesUndefined: Self = StObject.set(x, "gameServerConfigOverrides", js.undefined)
    
    @scala.inline
    def setGameServerConfigOverridesVarargs(value: GameServerConfigOverride*): Self = StObject.set(x, "gameServerConfigOverrides", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
