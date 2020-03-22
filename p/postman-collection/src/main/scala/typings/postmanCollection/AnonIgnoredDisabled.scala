package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoredDisabled extends js.Object {
  var encode: js.UndefOr[Boolean] = js.undefined
  var ignoredDisabled: js.UndefOr[Boolean] = js.undefined
}

object AnonIgnoredDisabled {
  @scala.inline
  def apply(encode: js.UndefOr[Boolean] = js.undefined, ignoredDisabled: js.UndefOr[Boolean] = js.undefined): AnonIgnoredDisabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoredDisabled)) __obj.updateDynamic("ignoredDisabled")(ignoredDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoredDisabled]
  }
}

