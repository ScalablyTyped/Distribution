package typings
package meteorDashAstronomyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cast extends js.Object {
  var cast: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("clone")
  var clone_FAnon_Cast: js.UndefOr[scala.Boolean] = js.undefined
  var merge: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Cast {
  @scala.inline
  def apply(
    cast: js.UndefOr[scala.Boolean] = js.undefined,
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    merge: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Cast = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cast)) __obj.updateDynamic("cast")(cast)
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    __obj.asInstanceOf[Anon_Cast]
  }
}

