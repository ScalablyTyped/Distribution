package typings.oracleOraclejet.ojvalidationNumberMod.IntlNumberConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Separators extends js.Object {
  var decimal: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
}

object Separators {
  @scala.inline
  def apply(decimal: String = null, group: String = null): Separators = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Separators]
  }
}

