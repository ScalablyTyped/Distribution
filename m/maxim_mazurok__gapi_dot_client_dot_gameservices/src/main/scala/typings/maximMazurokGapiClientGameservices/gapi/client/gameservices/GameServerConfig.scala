package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerConfig extends js.Object {
  
  /** Output only. The creation time. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The description of the game server config. */
  var description: js.UndefOr[String] = js.native
  
  /** FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed. */
  var fleetConfigs: js.UndefOr[js.Array[FleetConfig]] = js.native
  
  /** The labels associated with this game server config. Each label is a key-value pair. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.GameServerConfig with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The resource name of the game server config, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`. For example,
    * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The autoscaling settings. */
  var scalingConfigs: js.UndefOr[js.Array[ScalingConfig]] = js.native
  
  /** Output only. The last-modified time. */
  var updateTime: js.UndefOr[String] = js.native
}
object GameServerConfig {
  
  @scala.inline
  def apply(): GameServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerConfig]
  }
  
  @scala.inline
  implicit class GameServerConfigOps[Self <: GameServerConfig] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFleetConfigsVarargs(value: FleetConfig*): Self = this.set("fleetConfigs", js.Array(value :_*))
    
    @scala.inline
    def setFleetConfigs(value: js.Array[FleetConfig]): Self = this.set("fleetConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetConfigs: Self = this.set("fleetConfigs", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.GameServerConfig with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScalingConfigsVarargs(value: ScalingConfig*): Self = this.set("scalingConfigs", js.Array(value :_*))
    
    @scala.inline
    def setScalingConfigs(value: js.Array[ScalingConfig]): Self = this.set("scalingConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingConfigs: Self = this.set("scalingConfigs", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
