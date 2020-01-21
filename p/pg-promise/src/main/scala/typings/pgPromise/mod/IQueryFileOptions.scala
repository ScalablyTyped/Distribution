package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.after
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryFileOptions extends js.Object {
  var compress: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var minify: js.UndefOr[Boolean | after] = js.undefined
  var noWarnings: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
}

object IQueryFileOptions {
  @scala.inline
  def apply(
    compress: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    minify: Boolean | after = null,
    noWarnings: js.UndefOr[Boolean] = js.undefined,
    params: js.Any = null
  ): IQueryFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (minify != null) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (!js.isUndefined(noWarnings)) __obj.updateDynamic("noWarnings")(noWarnings.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryFileOptions]
  }
}

