package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var config: IBridgeConfig
  var groups: org.scalablytyped.runtime.StringDictionary[ILightGroup]
  var lights: org.scalablytyped.runtime.StringDictionary[ILight]
  var schedules: org.scalablytyped.runtime.StringDictionary[ISchedule]
}

object IState {
  @scala.inline
  def apply(
    config: IBridgeConfig,
    groups: org.scalablytyped.runtime.StringDictionary[ILightGroup],
    lights: org.scalablytyped.runtime.StringDictionary[ILight],
    schedules: org.scalablytyped.runtime.StringDictionary[ISchedule]
  ): IState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("lights")(lights)
    __obj.updateDynamic("schedules")(schedules)
    __obj.asInstanceOf[IState]
  }
}

