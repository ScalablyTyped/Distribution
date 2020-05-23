package typings.megajs.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkOptions extends js.Object {
  var key: js.UndefOr[String | Buffer] = js.undefined
  var noKey: js.UndefOr[Boolean] = js.undefined
}

object LinkOptions {
  @scala.inline
  def apply(key: String | Buffer = null, noKey: js.UndefOr[Boolean] = js.undefined): LinkOptions = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noKey)) __obj.updateDynamic("noKey")(noKey.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkOptions]
  }
}

