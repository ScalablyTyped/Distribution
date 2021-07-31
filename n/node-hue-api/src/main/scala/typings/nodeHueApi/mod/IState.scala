package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IState extends StObject {
  
  var config: IBridgeConfig
  
  var groups: StringDictionary[ILightGroup]
  
  var lights: StringDictionary[ILight]
  
  var schedules: StringDictionary[ISchedule]
}
object IState {
  
  @scala.inline
  def apply(
    config: IBridgeConfig,
    groups: StringDictionary[ILightGroup],
    lights: StringDictionary[ILight],
    schedules: StringDictionary[ISchedule]
  ): IState = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
  
  @scala.inline
  implicit class IStateMutableBuilder[Self <: IState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: IBridgeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: StringDictionary[ILightGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLights(value: StringDictionary[ILight]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedules(value: StringDictionary[ISchedule]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
  }
}
