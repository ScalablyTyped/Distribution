package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameServerDeploymentRollout extends StObject {
  
  /** Output only. The creation time. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The default game server config is applied to all realms unless overridden in the rollout. For example,
    * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
    */
  var defaultGameServerConfig: js.UndefOr[String] = js.undefined
  
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Contains the game server config rollout overrides. Overrides are processed in the order they are listed. Once a match is found for a realm, the rest of the list is not processed. */
  var gameServerConfigOverrides: js.UndefOr[js.Array[GameServerConfigOverride]] = js.undefined
  
  /**
    * The resource name of the game server deployment rollout, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/rollout`. For example,
    * `projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The last-modified time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GameServerDeploymentRollout {
  
  inline def apply(): GameServerDeploymentRollout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerDeploymentRollout]
  }
  
  extension [Self <: GameServerDeploymentRollout](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDefaultGameServerConfig(value: String): Self = StObject.set(x, "defaultGameServerConfig", value.asInstanceOf[js.Any])
    
    inline def setDefaultGameServerConfigUndefined: Self = StObject.set(x, "defaultGameServerConfig", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setGameServerConfigOverrides(value: js.Array[GameServerConfigOverride]): Self = StObject.set(x, "gameServerConfigOverrides", value.asInstanceOf[js.Any])
    
    inline def setGameServerConfigOverridesUndefined: Self = StObject.set(x, "gameServerConfigOverrides", js.undefined)
    
    inline def setGameServerConfigOverridesVarargs(value: GameServerConfigOverride*): Self = StObject.set(x, "gameServerConfigOverrides", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
