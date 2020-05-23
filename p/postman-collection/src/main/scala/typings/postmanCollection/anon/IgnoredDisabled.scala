package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoredDisabled extends js.Object {
  var encode: js.UndefOr[Boolean] = js.undefined
  var ignoredDisabled: js.UndefOr[Boolean] = js.undefined
}

object IgnoredDisabled {
  @scala.inline
  def apply(encode: js.UndefOr[Boolean] = js.undefined, ignoredDisabled: js.UndefOr[Boolean] = js.undefined): IgnoredDisabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoredDisabled)) __obj.updateDynamic("ignoredDisabled")(ignoredDisabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoredDisabled]
  }
}

