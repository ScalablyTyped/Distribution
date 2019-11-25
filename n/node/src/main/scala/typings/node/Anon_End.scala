package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: js.UndefOr[Boolean] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(end: js.UndefOr[Boolean] = js.undefined): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

