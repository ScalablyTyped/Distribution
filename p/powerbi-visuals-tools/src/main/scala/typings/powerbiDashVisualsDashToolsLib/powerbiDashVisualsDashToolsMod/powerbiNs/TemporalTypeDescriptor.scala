package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporalTypeDescriptor extends js.Object {
  val day: js.UndefOr[scala.Boolean] = js.undefined
  val month: js.UndefOr[scala.Boolean] = js.undefined
  val paddedDateTableDate: js.UndefOr[scala.Boolean] = js.undefined
  val quarter: js.UndefOr[scala.Boolean] = js.undefined
  val year: js.UndefOr[scala.Boolean] = js.undefined
}

object TemporalTypeDescriptor {
  @scala.inline
  def apply(
    day: js.UndefOr[scala.Boolean] = js.undefined,
    month: js.UndefOr[scala.Boolean] = js.undefined,
    paddedDateTableDate: js.UndefOr[scala.Boolean] = js.undefined,
    quarter: js.UndefOr[scala.Boolean] = js.undefined,
    year: js.UndefOr[scala.Boolean] = js.undefined
  ): TemporalTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day)
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month)
    if (!js.isUndefined(paddedDateTableDate)) __obj.updateDynamic("paddedDateTableDate")(paddedDateTableDate)
    if (!js.isUndefined(quarter)) __obj.updateDynamic("quarter")(quarter)
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[TemporalTypeDescriptor]
  }
}

