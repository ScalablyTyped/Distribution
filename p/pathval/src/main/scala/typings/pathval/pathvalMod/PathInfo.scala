package typings.pathval.pathvalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathInfo extends js.Object {
  var exists: Boolean
  var name: String
  var parent: js.Object
  var value: js.UndefOr[js.Any] = js.undefined
}

object PathInfo {
  @scala.inline
  def apply(exists: Boolean, name: String, parent: js.Object, value: js.Any = null): PathInfo = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInfo]
  }
}

