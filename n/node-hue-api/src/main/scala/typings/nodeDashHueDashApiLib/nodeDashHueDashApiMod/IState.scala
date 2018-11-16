package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IState extends js.Object {
  var config: IBridgeConfig
  var groups: ScalablyTyped.runtime.StringDictionary[ILightGroup]
  var lights: ScalablyTyped.runtime.StringDictionary[ILight]
  var schedules: ScalablyTyped.runtime.StringDictionary[ISchedule]
}

