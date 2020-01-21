package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncode extends js.Object {
  var encode: js.UndefOr[Boolean] = js.undefined
  var ignoreDisabled: js.UndefOr[Boolean] = js.undefined
}

object AnonEncode {
  @scala.inline
  def apply(encode: js.UndefOr[Boolean] = js.undefined, ignoreDisabled: js.UndefOr[Boolean] = js.undefined): AnonEncode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDisabled)) __obj.updateDynamic("ignoreDisabled")(ignoreDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncode]
  }
}

