package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("overwatch-api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getProfile(
    platform: OverwatchPlatform,
    region: OverwatchServerRegion,
    tag: String,
    callback: callbackFunc[ProfileApiResponse]
  ): Unit = js.native
  def getStats(
    platform: OverwatchPlatform,
    region: OverwatchServerRegion,
    tag: String,
    callback: callbackFunc[StatsApiResponse]
  ): Unit = js.native
}

