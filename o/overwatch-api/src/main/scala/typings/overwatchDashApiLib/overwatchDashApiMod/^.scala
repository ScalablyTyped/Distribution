package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("overwatch-api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getProfile(
    platform: overwatchDashApiLib.overwatchDashApiMod.OverwatchPlatform,
    region: overwatchDashApiLib.overwatchDashApiMod.OverwatchServerRegion,
    tag: java.lang.String,
    callback: overwatchDashApiLib.overwatchDashApiMod.callbackFunc[overwatchDashApiLib.overwatchDashApiMod.ProfileApiResponse]
  ): scala.Unit = js.native
  def getStats(
    platform: overwatchDashApiLib.overwatchDashApiMod.OverwatchPlatform,
    region: overwatchDashApiLib.overwatchDashApiMod.OverwatchServerRegion,
    tag: java.lang.String,
    callback: overwatchDashApiLib.overwatchDashApiMod.callbackFunc[overwatchDashApiLib.overwatchDashApiMod.StatsApiResponse]
  ): scala.Unit = js.native
}

