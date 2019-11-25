package typings.postmanDashCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodeIgnoredDisabled extends js.Object {
  var encode: js.UndefOr[Boolean] = js.undefined
  var ignoredDisabled: js.UndefOr[Boolean] = js.undefined
}

object Anon_EncodeIgnoredDisabled {
  @scala.inline
  def apply(encode: js.UndefOr[Boolean] = js.undefined, ignoredDisabled: js.UndefOr[Boolean] = js.undefined): Anon_EncodeIgnoredDisabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoredDisabled)) __obj.updateDynamic("ignoredDisabled")(ignoredDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodeIgnoredDisabled]
  }
}

