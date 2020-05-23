package typings.minipass.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: js.UndefOr[Boolean] = js.undefined
}

object End {
  @scala.inline
  def apply(end: js.UndefOr[Boolean] = js.undefined): End = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

