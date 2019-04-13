package typings
package atPhenomnomnominalTsqueryLib.distSrcTsqueryDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQueryProperties extends js.Object {
  var kindName: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var value: js.UndefOr[js.Any] = js.undefined
}

object TSQueryProperties {
  @scala.inline
  def apply(
    kindName: java.lang.String,
    text: java.lang.String,
    name: java.lang.String = null,
    value: js.Any = null
  ): TSQueryProperties = {
    val __obj = js.Dynamic.literal(kindName = kindName, text = text)
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TSQueryProperties]
  }
}

