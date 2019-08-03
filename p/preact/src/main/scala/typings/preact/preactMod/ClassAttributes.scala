package typings.preact.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassAttributes[T] extends Attributes {
  var ref: js.UndefOr[Ref[T]] = js.undefined
}

object ClassAttributes {
  @scala.inline
  def apply[T](jsx: js.UndefOr[Boolean] = js.undefined, key: Key = null, ref: Ref[T] = null): ClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassAttributes[T]]
  }
}

