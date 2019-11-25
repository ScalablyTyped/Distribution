package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Noop extends js.Object {
  var noop: js.UndefOr[Boolean] = js.undefined
}

object Anon_Noop {
  @scala.inline
  def apply(noop: js.UndefOr[Boolean] = js.undefined): Anon_Noop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noop)) __obj.updateDynamic("noop")(noop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Noop]
  }
}

