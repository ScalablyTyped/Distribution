package typings.onionoo.anon

import typings.onionoo.mod.Onionoo.Histogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<'3_days' | '1_week' | '1_month' | '6_months' | '1_year' | '5_years', onionoo.onionoo.Onionoo.Histogram>> */
trait PartialRecord3days1week1m extends js.Object {
  var `1_month`: js.UndefOr[Histogram] = js.undefined
  var `1_week`: js.UndefOr[Histogram] = js.undefined
  var `1_year`: js.UndefOr[Histogram] = js.undefined
  var `3_days`: js.UndefOr[Histogram] = js.undefined
  var `5_years`: js.UndefOr[Histogram] = js.undefined
  var `6_months`: js.UndefOr[Histogram] = js.undefined
}

object PartialRecord3days1week1m {
  @scala.inline
  def apply(
    `1_month`: Histogram = null,
    `1_week`: Histogram = null,
    `1_year`: Histogram = null,
    `3_days`: Histogram = null,
    `5_years`: Histogram = null,
    `6_months`: Histogram = null
  ): PartialRecord3days1week1m = {
    val __obj = js.Dynamic.literal()
    if (`1_month` != null) __obj.updateDynamic("1_month")(`1_month`.asInstanceOf[js.Any])
    if (`1_week` != null) __obj.updateDynamic("1_week")(`1_week`.asInstanceOf[js.Any])
    if (`1_year` != null) __obj.updateDynamic("1_year")(`1_year`.asInstanceOf[js.Any])
    if (`3_days` != null) __obj.updateDynamic("3_days")(`3_days`.asInstanceOf[js.Any])
    if (`5_years` != null) __obj.updateDynamic("5_years")(`5_years`.asInstanceOf[js.Any])
    if (`6_months` != null) __obj.updateDynamic("6_months")(`6_months`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecord3days1week1m]
  }
}

