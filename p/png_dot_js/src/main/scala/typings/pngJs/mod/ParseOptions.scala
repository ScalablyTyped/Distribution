package typings.pngJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var data: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(data: js.UndefOr[Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

