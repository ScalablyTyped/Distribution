package typings
package merge2Lib.merge2Mod.merge2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var end: js.UndefOr[scala.Boolean] = js.undefined
  var objectMode: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    end: js.UndefOr[scala.Boolean] = js.undefined,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    __obj.asInstanceOf[Options]
  }
}

