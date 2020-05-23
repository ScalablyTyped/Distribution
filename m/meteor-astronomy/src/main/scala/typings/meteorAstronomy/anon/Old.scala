package typings.meteorAstronomy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Old extends js.Object {
  var old: js.UndefOr[Boolean] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
}

object Old {
  @scala.inline
  def apply(old: js.UndefOr[Boolean] = js.undefined, raw: js.UndefOr[Boolean] = js.undefined): Old = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(old)) __obj.updateDynamic("old")(old.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Old]
  }
}

