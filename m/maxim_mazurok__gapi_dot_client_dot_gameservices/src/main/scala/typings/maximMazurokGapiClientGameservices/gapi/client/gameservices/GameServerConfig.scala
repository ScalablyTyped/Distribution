package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameServerConfig extends StObject {
  
  /** Output only. The creation time. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The description of the game server config. */
  var description: js.UndefOr[String] = js.undefined
  
  /** FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed. */
  var fleetConfigs: js.UndefOr[js.Array[FleetConfig]] = js.undefined
  
  /** The labels associated with this game server config. Each label is a key-value pair. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.GameServerConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The resource name of the game server config, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`. For example,
    * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The autoscaling settings. */
  var scalingConfigs: js.UndefOr[js.Array[ScalingConfig]] = js.undefined
  
  /** Output only. The last-modified time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GameServerConfig {
  
  inline def apply(): GameServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerConfig]
  }
  
  extension [Self <: GameServerConfig](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFleetConfigs(value: js.Array[FleetConfig]): Self = StObject.set(x, "fleetConfigs", value.asInstanceOf[js.Any])
    
    inline def setFleetConfigsUndefined: Self = StObject.set(x, "fleetConfigs", js.undefined)
    
    inline def setFleetConfigsVarargs(value: FleetConfig*): Self = StObject.set(x, "fleetConfigs", js.Array(value :_*))
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.GameServerConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScalingConfigs(value: js.Array[ScalingConfig]): Self = StObject.set(x, "scalingConfigs", value.asInstanceOf[js.Any])
    
    inline def setScalingConfigsUndefined: Self = StObject.set(x, "scalingConfigs", js.undefined)
    
    inline def setScalingConfigsVarargs(value: ScalingConfig*): Self = StObject.set(x, "scalingConfigs", js.Array(value :_*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
