package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerDeploymentRollout extends js.Object {
  
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
  implicit class GameServerDeploymentRolloutOps[Self <: GameServerDeploymentRollout] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDefaultGameServerConfig(value: String): Self = this.set("defaultGameServerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultGameServerConfig: Self = this.set("defaultGameServerConfig", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setGameServerConfigOverridesVarargs(value: GameServerConfigOverride*): Self = this.set("gameServerConfigOverrides", js.Array(value :_*))
    
    @scala.inline
    def setGameServerConfigOverrides(value: js.Array[GameServerConfigOverride]): Self = this.set("gameServerConfigOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerConfigOverrides: Self = this.set("gameServerConfigOverrides", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
