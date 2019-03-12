package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("overwatch-api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getProfile(
    platform: OverwatchPlatform,
    region: OverwatchServerRegion,
    tag: java.lang.String,
    callback: callbackFunc[ProfileApiResponse]
  ): scala.Unit = js.native
  def getStats(
    platform: OverwatchPlatform,
    region: OverwatchServerRegion,
    tag: java.lang.String,
    callback: callbackFunc[StatsApiResponse]
  ): scala.Unit = js.native
}

