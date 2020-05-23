package typings.mjml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MJMLMinifyOptions extends js.Object {
  var collapseWhitespace: js.UndefOr[Boolean] = js.undefined
  var minifyCSS: js.UndefOr[Boolean] = js.undefined
  var removeEmptyAttributes: js.UndefOr[Boolean] = js.undefined
}

object MJMLMinifyOptions {
  @scala.inline
  def apply(
    collapseWhitespace: js.UndefOr[Boolean] = js.undefined,
    minifyCSS: js.UndefOr[Boolean] = js.undefined,
    removeEmptyAttributes: js.UndefOr[Boolean] = js.undefined
  ): MJMLMinifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseWhitespace)) __obj.updateDynamic("collapseWhitespace")(collapseWhitespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minifyCSS)) __obj.updateDynamic("minifyCSS")(minifyCSS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeEmptyAttributes)) __obj.updateDynamic("removeEmptyAttributes")(removeEmptyAttributes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MJMLMinifyOptions]
  }
}

