package typings.natsort.natsortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var desc: js.UndefOr[Boolean] = js.undefined
  var insensitive: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(desc: js.UndefOr[Boolean] = js.undefined, insensitive: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc)
    if (!js.isUndefined(insensitive)) __obj.updateDynamic("insensitive")(insensitive)
    __obj.asInstanceOf[Options]
  }
}

