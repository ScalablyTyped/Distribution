package typings.onionoo.anon

import typings.onionoo.mod.Onionoo.Histogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<'6_months' | '1_year' | '5_years', onionoo.onionoo.Onionoo.Histogram>> */
@js.native
trait PartialRecord6months1year extends js.Object {
  var `1_year`: js.UndefOr[Histogram] = js.native
  var `5_years`: js.UndefOr[Histogram] = js.native
  var `6_months`: js.UndefOr[Histogram] = js.native
}

object PartialRecord6months1year {
  @scala.inline
  def apply(): PartialRecord6months1year = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecord6months1year]
  }
  @scala.inline
  implicit class PartialRecord6months1yearOps[Self <: PartialRecord6months1year] (val x: Self) extends AnyVal {
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
    def set1_year(value: Histogram): Self = this.set("1_year", value.asInstanceOf[js.Any])
    @scala.inline
    def delete1_year: Self = this.set("1_year", js.undefined)
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

