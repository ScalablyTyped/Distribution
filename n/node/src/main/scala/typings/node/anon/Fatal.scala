package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fatal extends js.Object {
  var fatal: js.UndefOr[Boolean] = js.undefined
  var ignoreBOM: js.UndefOr[Boolean] = js.undefined
}

object Fatal {
  @scala.inline
  def apply(fatal: js.UndefOr[Boolean] = js.undefined, ignoreBOM: js.UndefOr[Boolean] = js.undefined): Fatal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fatal)) __obj.updateDynamic("fatal")(fatal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBOM)) __obj.updateDynamic("ignoreBOM")(ignoreBOM.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fatal]
  }
}

