package typings.overwatchDashApi.overwatchDashApiMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("overwatch-api", "getStats")
@js.native
object getStats extends js.Object {
  def apply(
    platform: PLATFORM,
    region: REGION,
    tag: String,
    callback: js.Function2[/* err */ Error, /* data */ Stats, Unit]
  ): Unit = js.native
}

