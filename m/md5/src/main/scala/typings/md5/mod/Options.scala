package typings.md5.mod

import typings.md5.md5Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var asBytes: js.UndefOr[Boolean] = js.undefined
  var asString: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[binary | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    asBytes: js.UndefOr[Boolean] = js.undefined,
    asString: js.UndefOr[Boolean] = js.undefined,
    encoding: binary | String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asBytes)) __obj.updateDynamic("asBytes")(asBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

