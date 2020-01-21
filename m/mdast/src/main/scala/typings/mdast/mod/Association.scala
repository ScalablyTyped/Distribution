package typings.mdast.mod

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
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Association]
  }
}

