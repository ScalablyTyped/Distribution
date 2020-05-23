package typings.meteorAstronomy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cast extends js.Object {
  var cast: js.UndefOr[Boolean] = js.undefined
  @JSName("clone")
  var clone_FCast: js.UndefOr[Boolean] = js.undefined
  var merge: js.UndefOr[Boolean] = js.undefined
}

object Cast {
  @scala.inline
  def apply(
    cast: js.UndefOr[Boolean] = js.undefined,
    clone: js.UndefOr[Boolean] = js.undefined,
    merge: js.UndefOr[Boolean] = js.undefined
  ): Cast = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cast)) __obj.updateDynamic("cast")(cast.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cast]
  }
}

