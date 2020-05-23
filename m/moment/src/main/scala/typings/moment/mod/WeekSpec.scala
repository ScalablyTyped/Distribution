package typings.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekSpec extends js.Object {
  var dow: Double
  var doy: js.UndefOr[Double] = js.undefined
}

object WeekSpec {
  @scala.inline
  def apply(dow: Double, doy: js.UndefOr[Double] = js.undefined): WeekSpec = {
    val __obj = js.Dynamic.literal(dow = dow.asInstanceOf[js.Any])
    if (!js.isUndefined(doy)) __obj.updateDynamic("doy")(doy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekSpec]
  }
}

