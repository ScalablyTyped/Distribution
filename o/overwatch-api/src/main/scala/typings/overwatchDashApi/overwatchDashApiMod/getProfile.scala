package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("overwatch-api", "getProfile")
@js.native
object getProfile extends js.Object {
  def apply(
    platform: OverwatchPlatform,
    region: OverwatchServerRegion,
    tag: String,
    callback: callbackFunc[ProfileApiResponse]
  ): Unit = js.native
}

