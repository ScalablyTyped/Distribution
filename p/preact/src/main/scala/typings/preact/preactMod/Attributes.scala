package typings.preact.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var jsx: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(jsx: js.UndefOr[Boolean] = js.undefined, key: Key = null): Attributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

