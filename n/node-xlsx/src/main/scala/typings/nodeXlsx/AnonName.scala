package typings.nodeXlsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var data: js.Array[js.Array[_]]
  var name: String
  var options: js.UndefOr[js.Object] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(data: js.Array[js.Array[_]], name: String, options: js.Object = null): AnonName = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

