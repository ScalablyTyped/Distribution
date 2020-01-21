package typings.nodeJose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowEmbeddedKey extends js.Object {
  var allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
}

object AnonAllowEmbeddedKey {
  @scala.inline
  def apply(allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined): AnonAllowEmbeddedKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmbeddedKey)) __obj.updateDynamic("allowEmbeddedKey")(allowEmbeddedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowEmbeddedKey]
  }
}

