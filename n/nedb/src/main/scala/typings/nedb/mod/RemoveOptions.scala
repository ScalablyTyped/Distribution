package typings.nedb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * options only one option for now: multi which allows the removal of multiple documents if set to true. Default is false
  */
trait RemoveOptions extends js.Object {
  var multi: js.UndefOr[Boolean] = js.undefined
}

object RemoveOptions {
  @scala.inline
  def apply(multi: js.UndefOr[Boolean] = js.undefined): RemoveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveOptions]
  }
}

