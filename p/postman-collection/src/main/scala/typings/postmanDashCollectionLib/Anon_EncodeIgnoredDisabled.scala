package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodeIgnoredDisabled extends js.Object {
  var encode: js.UndefOr[scala.Boolean] = js.undefined
  var ignoredDisabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EncodeIgnoredDisabled {
  @scala.inline
  def apply(
    encode: js.UndefOr[scala.Boolean] = js.undefined,
    ignoredDisabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EncodeIgnoredDisabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode)
    if (!js.isUndefined(ignoredDisabled)) __obj.updateDynamic("ignoredDisabled")(ignoredDisabled)
    __obj.asInstanceOf[Anon_EncodeIgnoredDisabled]
  }
}

