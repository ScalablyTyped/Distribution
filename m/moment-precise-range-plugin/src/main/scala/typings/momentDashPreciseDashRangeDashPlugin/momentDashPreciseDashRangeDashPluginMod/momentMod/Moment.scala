package typings.momentDashPreciseDashRangeDashPlugin.momentDashPreciseDashRangeDashPluginMod.momentMod

import typings.momentDashPreciseDashRangeDashPlugin.momentDashPreciseDashRangeDashPluginNumbers.`false`
import typings.momentDashPreciseDashRangeDashPlugin.momentDashPreciseDashRangeDashPluginNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment extends js.Object {
  def preciseDiff(d2: Moment): String = js.native
  @JSName("preciseDiff")
  def preciseDiff_false(d2: Moment, returnValueObject: `false`): String = js.native
  @JSName("preciseDiff")
  def preciseDiff_true(d2: Moment, returnValueObject: `true`): PreciseRangeValueObject = js.native
}

