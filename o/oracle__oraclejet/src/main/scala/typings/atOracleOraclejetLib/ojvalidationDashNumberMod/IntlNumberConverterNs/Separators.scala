package typings
package atOracleOraclejetLib.ojvalidationDashNumberMod.IntlNumberConverterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Separators extends js.Object {
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
}

object Separators {
  @scala.inline
  def apply(decimal: java.lang.String = null, group: java.lang.String = null): Separators = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (group != null) __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[Separators]
  }
}

