package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fatal extends js.Object {
  var fatal: js.UndefOr[Boolean] = js.undefined
  var ignoreBOM: js.UndefOr[Boolean] = js.undefined
}

object Anon_Fatal {
  @scala.inline
  def apply(fatal: js.UndefOr[Boolean] = js.undefined, ignoreBOM: js.UndefOr[Boolean] = js.undefined): Anon_Fatal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fatal)) __obj.updateDynamic("fatal")(fatal)
    if (!js.isUndefined(ignoreBOM)) __obj.updateDynamic("ignoreBOM")(ignoreBOM)
    __obj.asInstanceOf[Anon_Fatal]
  }
}

