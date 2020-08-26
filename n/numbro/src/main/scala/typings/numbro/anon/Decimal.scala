package typings.numbro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decimal extends js.Object {
  var decimal: String = js.native
  var thousands: String = js.native
  var thousandsSize: js.UndefOr[Double] = js.native
}

object Decimal {
  @scala.inline
  def apply(decimal: String, thousands: String): Decimal = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimal]
  }
  @scala.inline
  implicit class DecimalOps[Self <: Decimal] (val x: Self) extends AnyVal {
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
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def setThousands(value: String): Self = this.set("thousands", value.asInstanceOf[js.Any])
    @scala.inline
    def setThousandsSize(value: Double): Self = this.set("thousandsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousandsSize: Self = this.set("thousandsSize", js.undefined)
  }
  
}

