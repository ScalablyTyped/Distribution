package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
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
    val __obj = js.Dynamic.literal(config = config, groups = groups, lights = lights, schedules = schedules)
  
    __obj.asInstanceOf[IState]
  }
}

