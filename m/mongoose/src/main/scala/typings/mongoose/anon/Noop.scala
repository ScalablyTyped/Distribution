package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Noop extends js.Object {
  var noop: js.UndefOr[Boolean] = js.undefined
}

object Noop {
  @scala.inline
  def apply(noop: js.UndefOr[Boolean] = js.undefined): Noop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noop)) __obj.updateDynamic("noop")(noop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Noop]
  }
}

