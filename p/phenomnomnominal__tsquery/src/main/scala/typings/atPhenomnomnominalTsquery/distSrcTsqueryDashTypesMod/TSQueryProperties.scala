package typings.atPhenomnomnominalTsquery.distSrcTsqueryDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQueryProperties extends js.Object {
  var kindName: String
  var name: js.UndefOr[String] = js.undefined
  var text: String
  var value: js.UndefOr[js.Any] = js.undefined
}

object TSQueryProperties {
  @scala.inline
  def apply(kindName: String, text: String, name: String = null, value: js.Any = null): TSQueryProperties = {
    val __obj = js.Dynamic.literal(kindName = kindName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSQueryProperties]
  }
}

