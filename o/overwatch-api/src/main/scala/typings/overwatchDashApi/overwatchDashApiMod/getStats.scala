package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("overwatch-api", "getStats")
@js.native
object getStats extends js.Object {
  def apply(
    platform: OverwatchPlatform,
    region: OverwatchServerRegion,
    tag: String,
    callback: callbackFunc[StatsApiResponse]
  ): Unit = js.native
}

