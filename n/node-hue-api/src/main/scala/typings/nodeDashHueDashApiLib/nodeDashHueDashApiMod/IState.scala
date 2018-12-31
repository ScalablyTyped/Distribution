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

