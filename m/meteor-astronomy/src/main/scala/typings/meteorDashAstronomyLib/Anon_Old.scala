package typings
package meteorDashAstronomyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Old extends js.Object {
  var old: js.UndefOr[scala.Boolean] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Old {
  @scala.inline
  def apply(old: js.UndefOr[scala.Boolean] = js.undefined, raw: js.UndefOr[scala.Boolean] = js.undefined): Anon_Old = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(old)) __obj.updateDynamic("old")(old)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Anon_Old]
  }
}

