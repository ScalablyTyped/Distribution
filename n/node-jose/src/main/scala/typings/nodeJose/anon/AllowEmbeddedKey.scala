package typings.nodeJose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowEmbeddedKey extends js.Object {
  var allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
}

object AllowEmbeddedKey {
  @scala.inline
  def apply(allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined): AllowEmbeddedKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmbeddedKey)) __obj.updateDynamic("allowEmbeddedKey")(allowEmbeddedKey.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowEmbeddedKey]
  }
}

