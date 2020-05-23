package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encode extends js.Object {
  var encode: js.UndefOr[Boolean] = js.undefined
  var ignoreDisabled: js.UndefOr[Boolean] = js.undefined
}

object Encode {
  @scala.inline
  def apply(encode: js.UndefOr[Boolean] = js.undefined, ignoreDisabled: js.UndefOr[Boolean] = js.undefined): Encode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDisabled)) __obj.updateDynamic("ignoreDisabled")(ignoreDisabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encode]
  }
}

