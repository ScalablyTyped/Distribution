package typings
package mockDashFsLib.mockDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var createCwd: js.UndefOr[scala.Boolean] = js.undefined
  var createTmp: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    createCwd: js.UndefOr[scala.Boolean] = js.undefined,
    createTmp: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(createCwd)) __obj.updateDynamic("createCwd")(createCwd)
    if (!js.isUndefined(createTmp)) __obj.updateDynamic("createTmp")(createTmp)
    __obj.asInstanceOf[Options]
  }
}

