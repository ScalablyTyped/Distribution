package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IState extends js.Object {
  
  var config: IBridgeConfig = js.native
  
  var groups: StringDictionary[ILightGroup] = js.native
  
  var lights: StringDictionary[ILight] = js.native
  
  var schedules: StringDictionary[ISchedule] = js.native
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
  implicit class IStateOps[Self <: IState] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: IBridgeConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: StringDictionary[ILightGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLights(value: StringDictionary[ILight]): Self = this.set("lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedules(value: StringDictionary[ISchedule]): Self = this.set("schedules", value.asInstanceOf[js.Any])
  }
}
