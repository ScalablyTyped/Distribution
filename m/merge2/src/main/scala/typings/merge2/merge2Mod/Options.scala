package typings.merge2.merge2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var end: js.UndefOr[Boolean] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(end: js.UndefOr[Boolean] = js.undefined, objectMode: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

