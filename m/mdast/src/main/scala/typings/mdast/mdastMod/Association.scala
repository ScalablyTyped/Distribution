package typings.mdast.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Association extends js.Object {
  var identifier: String
  var label: js.UndefOr[String] = js.undefined
}

object Association {
  @scala.inline
  def apply(identifier: String, label: String = null): Association = {
    val __obj = js.Dynamic.literal(identifier = identifier)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Association]
  }
}

