package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Association extends js.Object {
  var identifier: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object Association {
  @scala.inline
  def apply(identifier: java.lang.String, label: java.lang.String = null): Association = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identifier")(identifier)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Association]
  }
}

