package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentCopyOptions extends js.Object {
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object DocumentCopyOptions {
  @scala.inline
  def apply(overwrite: js.UndefOr[Boolean] = js.undefined): DocumentCopyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCopyOptions]
  }
}

