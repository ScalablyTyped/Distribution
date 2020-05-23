package typings.nodeXlsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var data: js.Array[js.Array[_]]
  var name: String
  var options: js.UndefOr[js.Object] = js.undefined
}

object Name {
  @scala.inline
  def apply(data: js.Array[js.Array[_]], name: String, options: js.Object = null): Name = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

