package typings.onionoo.anon

import typings.onionoo.mod.Onionoo.Histogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<'3_days' | '1_week' | '1_month' | '6_months' | '1_year' | '5_years', onionoo.onionoo.Onionoo.Histogram>> */
@js.native
trait PartialRecord3days1week1m extends js.Object {
  var `1_month`: js.UndefOr[Histogram] = js.native
  var `1_week`: js.UndefOr[Histogram] = js.native
  var `1_year`: js.UndefOr[Histogram] = js.native
  var `3_days`: js.UndefOr[Histogram] = js.native
  var `5_years`: js.UndefOr[Histogram] = js.native
  var `6_months`: js.UndefOr[Histogram] = js.native
}

object PartialRecord3days1week1m {
  @scala.inline
  def apply(): PartialRecord3days1week1m = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecord3days1week1m]
  }
  @scala.inline
  implicit class PartialRecord3days1week1mOps[Self <: PartialRecord3days1week1m] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set1_month(value: Histogram): Self = this.set("1_month", value.asInstanceOf[js.Any])
    @scala.inline
    def delete1_month: Self = this.set("1_month", js.undefined)
    @scala.inline
    def set1_week(value: Histogram): Self = this.set("1_week", value.asInstanceOf[js.Any])
    @scala.inline
    def delete1_week: Self = this.set("1_week", js.undefined)
    @scala.inline
    def set1_year(value: Histogram): Self = this.set("1_year", value.asInstanceOf[js.Any])
    @scala.inline
    def delete1_year: Self = this.set("1_year", js.undefined)
    @scala.inline
    def set3_days(value: Histogram): Self = this.set("3_days", value.asInstanceOf[js.Any])
    @scala.inline
    def delete3_days: Self = this.set("3_days", js.undefined)
    @scala.inline
    def set5_years(value: Histogram): Self = this.set("5_years", value.asInstanceOf[js.Any])
    @scala.inline
    def delete5_years: Self = this.set("5_years", js.undefined)
    @scala.inline
    def set6_months(value: Histogram): Self = this.set("6_months", value.asInstanceOf[js.Any])
    @scala.inline
    def delete6_months: Self = this.set("6_months", js.undefined)
  }
  
}

