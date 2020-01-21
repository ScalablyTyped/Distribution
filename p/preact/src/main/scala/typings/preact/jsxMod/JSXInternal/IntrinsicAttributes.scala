package typings.preact.jsxMod.JSXInternal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrinsicAttributes extends js.Object {
  var key: js.UndefOr[js.Any] = js.undefined
}

object IntrinsicAttributes {
  @scala.inline
  def apply(key: js.Any = null): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicAttributes]
  }
}

