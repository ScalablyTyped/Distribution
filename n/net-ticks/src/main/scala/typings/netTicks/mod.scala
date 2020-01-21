package typings.netTicks

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net-ticks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def netTicksToDate(ticks: Double, timezoneOffsetHours: Double): Date = js.native
}

