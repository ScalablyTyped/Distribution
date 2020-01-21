package typings.pgMinify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMinifyOptions extends js.Object {
  var compress: js.UndefOr[Boolean] = js.undefined
  var removeAll: js.UndefOr[Boolean] = js.undefined
}

object IMinifyOptions {
  @scala.inline
  def apply(compress: js.UndefOr[Boolean] = js.undefined, removeAll: js.UndefOr[Boolean] = js.undefined): IMinifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (!js.isUndefined(removeAll)) __obj.updateDynamic("removeAll")(removeAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMinifyOptions]
  }
}

