package typings.onionoo

import typings.onionoo.mod.Onionoo.Histogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<'6_months' | '1_year' | '5_years', onionoo.onionoo.Onionoo.Histogram>> */
trait PartialRecord6months1year extends js.Object {
  var `1_year`: js.UndefOr[Histogram] = js.undefined
  var `5_years`: js.UndefOr[Histogram] = js.undefined
  var `6_months`: js.UndefOr[Histogram] = js.undefined
}

object PartialRecord6months1year {
  @scala.inline
  def apply(`1_year`: Histogram = null, `5_years`: Histogram = null, `6_months`: Histogram = null): PartialRecord6months1year = {
    val __obj = js.Dynamic.literal()
    if (`1_year` != null) __obj.updateDynamic("1_year")(`1_year`.asInstanceOf[js.Any])
    if (`5_years` != null) __obj.updateDynamic("5_years")(`5_years`.asInstanceOf[js.Any])
    if (`6_months` != null) __obj.updateDynamic("6_months")(`6_months`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecord6months1year]
  }
}

